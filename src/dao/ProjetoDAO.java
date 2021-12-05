package dao;

import modelo.ProjetoModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProjetoDAO {

    private final Connection connection;

    public ProjetoDAO(Connection con) {
        this.connection = con;
    }

    public void salvar(ProjetoModel objProjeto) {
        System.out.println("Salvar Projeto");
        try {
            String sql;
            if (objProjeto.getId() == 0l) {
                sql = "INSERT INTO projeto(nome,descricao, usuario_id) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objProjeto.getNome());
                stmt.setString(2, objProjeto.getDescricao());
                stmt.setLong(3, objProjeto.getId_usu());
                stmt.execute();

            } else {
                sql = "UPDATE projeto SET nome = ?, descricao = ?, usuario_id WHERE projeto.id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);
                stmt.setString(1, objProjeto.getNome());
                stmt.setString(2, objProjeto.getDescricao());
                stmt.setLong(3, objProjeto.getId_usu());
                stmt.setLong(4, objProjeto.getId());
                
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
            ArrayList lista_de_projetos = new ArrayList();

            ResultSet rs;
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                rs = ps.executeQuery();
                while (rs.next()) {
                    lista_de_projetos.add(new Object[]{
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getString("data_criacao"),
                        rs.getString("data_modificacao"),
                        rs.getLong("usuario_id")
                    });
                }
            }
            rs.close();

            return lista_de_projetos;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar lista de projetos: " + e.getMessage());
            return null;
        }
    }

    public void deletar(ProjetoModel objProjeto) {

        long idProjeto = objProjeto.getId();

        try {
            String sql;
            if (idProjeto > 0) {
                sql = "DELETE FROM projeto WHERE projeto.id = ?";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setLong(1, idProjeto);
                stmt.execute();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList listarTodos() {
        try {

            ArrayList lista_de_projetos = new ArrayList();

            ResultSet rs;
            try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM projeto")) {
                rs = ps.executeQuery();
                while (rs.next()) {

                    lista_de_projetos.add(new Object[]{
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        rs.getString("data_criacao"),
                        rs.getString("data_modificacao"),
                        rs.getLong("usuario_id")
                    });

                }
            }
            rs.close();

            return lista_de_projetos;
        } catch (SQLException e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro Exception SQL: " + e.getMessage());
            return null;
        }
    }
}
