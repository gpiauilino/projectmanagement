package dao;

import factory.ConnectionFactory;
import modelo.ProjetoModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProjetoDAO {

    private final Connection connection;
    private long id;
    private long id_usu;
    private String nome;
    private String descricao;
    private String data_criacao;
    private String data_modificacao;
    private String autor;

    
    public ProjetoDAO(Connection con) {
        this.connection = con;
    }

    public void salvar(ProjetoModel objProjeto) {
        
        //String strGetIdProjeto = String.valueOf(objProjeto.getId());
        
        try {
            String sql;
            if (String.valueOf(objProjeto.getId()).isEmpty()) {
                sql = "INSERT INTO projeto(nome,descricao, id_usuario) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objProjeto.getNome());
                stmt.setString(2, objProjeto.getDescricao());
                stmt.setLong(3, objProjeto.getId_usu());
                //stmt.setString(4, objProjeto.getTelefone());
                stmt.execute();
                

            } else {
                sql = "UPDATE projeto "
                        + "SET nome = ?, descricao = ? WHERE projeto.id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.setString(1, objProjeto.getNome());
                stmt.setString(2, objProjeto.getDescricao());
                
                //TODO demais campos faltam aqui
                stmt.setLong(3, objProjeto.getId());
                stmt.execute();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList buscar(ProjetoModel objProjeto) {
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
                    rs.getLong("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                });

            }
            ps.close();
            rs.close();
            //connection.close()

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro preencher o ArrayList");
            return null;
        }

    }

    public void deletar(ProjetoModel objProjeto) {
        
    String strGetIdProjeto = String.valueOf(objProjeto.getId());
    
        try {
            String sql;
            if (!String.valueOf(strGetIdProjeto).isEmpty()) {
                sql = "DELETE FROM projeto WHERE projeto.id = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, strGetIdProjeto);
                stmt.execute();
                

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
                    rs.getLong("id"),
                    rs.getString("nome"),
                    rs.getString("descricao")
                });

            }
            ps.close();
            rs.close();
            //connection.close()

            return dado;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro Exception SQL: " + e.getMessage());
            return null;
        }
    }
}
