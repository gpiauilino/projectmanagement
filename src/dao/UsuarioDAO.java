package dao;

import modelo.UsuarioModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private final Connection connection;

    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String senha;
    int nivel;
    String login;

    public UsuarioDAO(Connection con) {
        connection = con;
    }

    public void salvar(UsuarioModel objUsuario) {
        try {
            String sql;
            if (objUsuario.getId() == 0l) {
                sql = "INSERT INTO usuario(nome,cpf,email,telefone,nivel,senha,login) VALUES(?,?,?,?,?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objUsuario.getNome().trim());
                stmt.setString(2, objUsuario.getCpf().trim());
                stmt.setString(3, objUsuario.getEmail().trim());
                stmt.setString(4, objUsuario.getTelefone().trim());
                stmt.setInt(5, objUsuario.getNivel());
                stmt.setString(6, objUsuario.getSenha().trim());
                stmt.setString(7, objUsuario.getLogin().trim());

                stmt.execute();

            } else {
                sql = "UPDATE usuario SET nome = ?, cpf = ?, email = ?, telefone = ?, nivel = ?, senha = ?, login = ? WHERE id = ?";

                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, objUsuario.getNome().trim());
                stmt.setString(2, objUsuario.getCpf().trim());
                stmt.setString(3, objUsuario.getEmail().trim());
                stmt.setString(4, objUsuario.getTelefone().trim());
                stmt.setInt(5, objUsuario.getNivel());
                stmt.setString(6, objUsuario.getSenha().trim());
                stmt.setString(7, objUsuario.getLogin().trim());
                stmt.setLong(8, objUsuario.getId());

                stmt.execute();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public long testarLogin(String login, String senha) {
        long retorno = 0l;
        try {
            try (PreparedStatement st = connection.prepareStatement(
                    "SELECT id, login, senha FROM usuario WHERE usuario.login=? and usuario.senha=?")) {

                st.setString(1, login);
                st.setString(2, senha);
                try (ResultSet rs = st.executeQuery()) {
                    if (rs.next()) {
                        System.out.println("achou usuario");
                        retorno = rs.getLong("id");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar:" + e.getMessage());
        }
        return retorno;
    }

    public ArrayList buscar(UsuarioModel objUsuario) {
        try {
            String sql = "";
            if (!objUsuario.getNome().isEmpty()) {
                sql = "SELECT * FROM usuario WHERE nome LIKE '%" + objUsuario.getNome() + "%' ";

            } else if (!objUsuario.getCpf().isEmpty()) {
                sql = "SELECT * FROM usuario WHERE cpf LIKE '%" + objUsuario.getCpf() + "%' ";
            }
            ArrayList dado = new ArrayList();

            ResultSet rs;
            try (PreparedStatement ps = connection.prepareStatement(sql)) {
                rs = ps.executeQuery();
                while (rs.next()) {

                    String nivelnome;
                    int n = rs.getInt("nivel");
                    switch (n) {
                        case 0:
                            nivelnome = "Admin";
                            break;
                        case 1:
                            nivelnome = "Gerente";
                            break;
                        case 2:
                            nivelnome = "Funcionário";
                            break;
                        default:
                            nivelnome = "indef";
                    }

                    dado.add(new Object[]{
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("data_criacao"),
                        rs.getString("senha"),
                        rs.getString("login"),
                        nivelnome
                    });
                }
            }
            rs.close();

            return dado;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar:" + e.getMessage());
            return null;
        }
    }

    public boolean deletar(UsuarioModel objUsuario) {
        try {
            String sql;
            if (objUsuario.getId() > 0l) {
                if (objUsuario.getId() != 1l) {
                    sql = "DELETE FROM usuario WHERE usuario.id = ?";
                    PreparedStatement stmt = connection.prepareStatement(sql);

                    stmt.setLong(1, objUsuario.getId());
                    stmt.execute();

                    //TODO acho q tinha q repassar esse esquema de retornar 
                    // confirmacao se deletou ou nao pras outras DAO
                    return true;
                }
            }
            return false;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList listarTodos() {
        try {

            ArrayList lista_de_usuarios = new ArrayList();

            ResultSet rs;
            try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM usuario")) {
                rs = ps.executeQuery();
                while (rs.next()) {

                    String nivelnome;
                    int n = rs.getInt("nivel");
                    switch (n) {
                        case 0:
                            nivelnome = "Admin";
                            break;
                        case 1:
                            nivelnome = "Gerente";
                            break;
                        case 2:
                            nivelnome = "Funcionário";
                            break;
                        default:
                            nivelnome = "indef";
                    }

                    lista_de_usuarios.add(new Object[]{
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("cpf"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("data_criacao"),
                        rs.getString("senha"),
                        rs.getString("login"),
                        nivelnome
                    });

                }
            }
            rs.close();

            return lista_de_usuarios;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha grave ao listar todos os usuários: " + e.getMessage());
            return null;
        }
    }
}
