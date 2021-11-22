package dao;

import factory.ConnectionFactory;
import modelo.Projeto;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProjetoDAO {

    private final Connection connection;
    Long id;
    String nome;
    String descricao;
    String email;
    String telefone;

    public ProjetoDAO(Connection con) {
        this.connection = con;
    }

    public void salvar(Projeto objProjeto) {
        try {
            String sql;
            if (String.valueOf(objProjeto.getId()).isEmpty()) {
                sql = "INSERT INTO projeto(nome,descricao,email,telefone) VALUES(?,?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objProjeto.getNome());
                stmt.setString(2, objProjeto.getDescricao());
                stmt.setString(3, objProjeto.getEmail());
                stmt.setString(4, objProjeto.getTelefone());
                stmt.execute();
                stmt.close();

            } else {
                sql = "UPDATE projeto SET nome = ?, descricao = ?, email = ?, telefone = ? WHERE projeto.id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(5, objProjeto.getId());
                stmt.setString(1, objProjeto.getNome());
                stmt.setString(2, objProjeto.getDescricao());
                stmt.setString(3, objProjeto.getEmail());
                stmt.setString(4, objProjeto.getTelefone());
                stmt.execute();
                stmt.close();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList buscar(Projeto objProjeto) {
        try {
            String sql = "";
            if (!objProjeto.getNome().isEmpty()) {
                sql = "SELECT * FROM projeto WHERE nome LIKE '%" + objProjeto.getNome() + "%' ";

            } else if (!objProjeto.getDescricao().isEmpty()) {
                sql = "SELECT * FROM projeto WHERE descricao LIKE '%" + objProjeto.getDescricao() + "%' ";
            }
            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("email"),
                    rs.getString("telefone")
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }

    }

    public void deletar(Projeto objProjeto) {
        try {
            String sql;
            if (!String.valueOf(objProjeto.getId()).isEmpty()) {
                sql = "DELETE FROM projeto WHERE projeto.id = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objProjeto.getId());
                stmt.execute();
                stmt.close();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList listarTodos() {
        try {

            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM projeto");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getString("email"),
                    rs.getString("telefone")
                });

            }
            ps.close();
            rs.close();
            connection.close();

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro Exception SQL: " + e.getMessage());
            return null;
        }
    }

    public static void testarConexao() throws SQLException {
        try (Connection objConnection = new ConnectionFactory().getConnection()) {
            JOptionPane.showMessageDialog(null, "Conex�o realizada com sucesso! ");
        }
    }

}
