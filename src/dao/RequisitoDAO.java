package dao;

import modelo.RequisitosModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RequisitoDAO {

    private final Connection connection;

    public RequisitoDAO(Connection con) {
        this.connection = con;
    }

    public void salvar(RequisitosModel objRequisito) {

        try {
            String sql;

            // campos do tipo Long, como os IDs devem ser comparados usando long n como String
            if (objRequisito.getId() > 0) {
                //TODO revisar se faltam colunas
                sql = "INSERT INTO requisito("
                        + "nome,"
                        + "descricao,"
                        + "modulo,"
                        + "funcionalidades,"
                        + "versao,"
                        + "esforco_horas,"
                        + "prioridade, "
                        + "estado,"
                        + "fase,"
                        + "complexidade,"
                        + "usuario_id,"
                        + "projeto_id) "
                        + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, objRequisito.getNomeRequisito());
                stmt.setString(2, objRequisito.getDescricao());
                stmt.setString(3, objRequisito.getModulo());
                stmt.setString(4, objRequisito.getFuncionalidades());
                stmt.setDouble(5, objRequisito.getVersao());
                stmt.setDouble(6, objRequisito.getEsforcoHoras());
                stmt.setInt(7, objRequisito.getPrioridade());
                stmt.setInt(8, objRequisito.getEstado());
                stmt.setInt(9, objRequisito.getFase());
                stmt.setInt(10, objRequisito.getComplexidade());
                stmt.setLong(11, objRequisito.getUsuario_id());
                stmt.setLong(12, objRequisito.getProjeto_id());

                stmt.execute();

            } else {
                //TODO pela quantidade visviel faltam colunas
                sql = "UPDATE requisito "
                        + "SET nome = ?, "
                        + "descricao = ?, "
                        + "modulo = ?, "
                        + "funcionalidades = ?, "
                        + "versao = ?, "
                        + "esforco_horas = ?, "
                        + "prioridade = ?, "
                        + "estado = ?, "
                        + "fase = ?, "
                        + "complexidade = ?, "
                        + "usuario_id = ?, "
                        + "projeto_id = ? "
                        + " WHERE requisito.id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, objRequisito.getNomeRequisito());
                stmt.setString(2, objRequisito.getDescricao());
                stmt.setString(3, objRequisito.getModulo());
                stmt.setString(4, objRequisito.getFuncionalidades());
                stmt.setDouble(5, objRequisito.getVersao());
                stmt.setDouble(6, objRequisito.getEsforcoHoras());
                stmt.setInt(7, objRequisito.getPrioridade());
                stmt.setInt(8, objRequisito.getEstado());
                stmt.setInt(9, objRequisito.getFase());
                stmt.setInt(10, objRequisito.getComplexidade());
                stmt.setLong(11, objRequisito.getUsuario_id());
                stmt.setLong(12, objRequisito.getProjeto_id());
                stmt.setLong(13, objRequisito.getId());

                // Execute
                stmt.execute();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public Object[] buscarPorId(long id) {
        try {
            String sql = "SELECT * FROM requisito WHERE id = ?";

           Object[] obj = null;
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                obj = new Object[]{
                    rs.getLong("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("modulo"),
                    rs.getDouble("versao"),
                    rs.getInt("estado"),
                    rs.getInt("fase"),
                    rs.getString("funcionalidades"),
                    rs.getInt("complexidade"),
                    rs.getDouble("esforco_horas"),
                    rs.getInt("prioridade"),
                    rs.getTimestamp("data_criacao"),
                    rs.getTimestamp("data_modificacao"),
                    rs.getLong("usuario_id"),
                    rs.getLong("projeto_id")
                };
            }
            ps.close();
            rs.close();

            return obj;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList: " + e.getMessage());
            return null;
        }

    }

    public ArrayList buscar(RequisitosModel objRequisito) {
        try {
            String sql = "";
            if (!objRequisito.getNomeRequisito().isEmpty()) {
                sql = "SELECT * FROM requisito WHERE nome LIKE '%" + objRequisito.getNomeRequisito() + "%' ";

            } else if (!objRequisito.getDescricao().isEmpty()) {
                sql = "SELECT * FROM requisito WHERE descricao LIKE '%" + objRequisito.getDescricao() + "%' ";
            }
            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                dado.add(new Object[]{
                    rs.getLong("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("modulo"),
                    rs.getDouble("versao"),
                    rs.getInt("estado"),
                    rs.getInt("fase"),
                    rs.getString("funcionalidades"),
                    rs.getInt("complexidade"),
                    rs.getDouble("esforco_horas"),
                    rs.getInt("prioridade"),
                    rs.getTimestamp("data_criacao"),
                    rs.getTimestamp("data_modificacao"),
                    rs.getLong("usuario_id"),
                    rs.getLong("projeto_id")
                });

            }
            ps.close();
            rs.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList: " + e.getMessage());
            return null;
        }

    }

    public void deletar(RequisitosModel objRequisito) {

        long id = objRequisito.getId();

        try {
            String sql;
            if (id > 0) {
                sql = "DELETE FROM requisito WHERE requisito.id = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setLong(1, id);
                stmt.execute();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    
    public ArrayList listarTodos() {
        try {

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM requisito");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dado.add(new Object[]{
                    rs.getLong("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("modulo"),
                    rs.getDouble("versao"),
                    rs.getInt("estado"),
                    rs.getInt("fase"),
                    rs.getString("funcionalidades"),
                    rs.getInt("complexidade"),
                    rs.getDouble("esforco_horas"),
                    rs.getInt("prioridade"),
                    rs.getTimestamp("data_criacao"),
                    rs.getTimestamp("data_modificacao"),
                    rs.getLong("usuario_id"),
                    rs.getLong("projeto_id")
                });

            }
            ps.close();
            rs.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro Exception SQL: " + e.getMessage());
            return null;
        }
    }
    public ArrayList listarTodosDoProjeto(long id_do_projeto) {
        try {

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM requisito WHERE projeto_id = ?");
            ps.setLong(1, id_do_projeto);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dado.add(new Object[]{
                    rs.getLong("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("modulo"),
                    rs.getDouble("versao"),
                    rs.getInt("estado"),
                    rs.getInt("fase"),
                    rs.getString("funcionalidades"),
                    rs.getInt("complexidade"),
                    rs.getDouble("esforco_horas"),
                    rs.getInt("prioridade"),
                    rs.getTimestamp("data_criacao"),
                    rs.getTimestamp("data_modificacao"),
                    rs.getLong("usuario_id"),
                    rs.getLong("projeto_id")
                });

            }
            ps.close();
            rs.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro Exception SQL: " + e.getMessage());
            return null;
        }
    }
}
