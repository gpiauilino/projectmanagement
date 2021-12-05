package dao;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import factory.ConnectionFactory;
import modelo.RequisitosModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RequisitoDAO {

    private final Connection connection;
    private long idRequisito;
    private long usuario_id;
    private long projeto_id;
    private String nomeRequisito;
    private String nomeProjeto;
    private String modulo;
    private String autor;
    private String funcionalidades; 
    private String autorUltimaMod;
    private String descricao;
    private Double versao;
    private Double esforcoHoras;
    private int prioridade;
    private int estado;
    private int fase;
    private int complexidade;
    private java.util.Date dataCriacao;
    private java.util.Date dataUltimaMod;
    
    public RequisitoDAO(Connection con) {
        this.connection = con;
    }

    public void salvar(RequisitosModel objRequisito) {
        
        //String strGetIdProjeto = String.valueOf(objRequisito.getId());
        
        try {
            String sql;
            if (String.valueOf(objRequisito.getIdRequisito()).isEmpty()) {
                sql = "INSERT INTO requisito(nome,descricao, usuario_id, projeto_id, modulo, funcionalidades, versao, esforcoHoras, prioridade, estado, fase, complexidade, dataCriacao, dataUltimamod) VALUES(?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setLong(1, objRequisito.getIdRequisito());
                stmt.setLong(2, objRequisito.getUsuario_id());
                stmt.setLong(3, objRequisito.getProjeto_id());
                stmt.setString(4, objRequisito.getNomeRequisito());
                stmt.setString(5, objRequisito.getModulo());
                stmt.setString(6, objRequisito.getFuncionalidades());
                stmt.setString(7, objRequisito.getDescricao());
                stmt.setDouble(8, objRequisito.getVersao());
                stmt.setDouble(9, objRequisito.getEsforcoHoras());
                stmt.setInt(10, objRequisito.getPrioridade());
                stmt.setInt(11, objRequisito.getEstado());
                stmt.setInt(12, objRequisito.getFase());
                stmt.setInt(13, objRequisito.getComplexidade());
                stmt.setDate(14, (Date) objRequisito.getDataCriacao());
                stmt.setDate(15, (Date) objRequisito.getDataUltimaMod());
                
                             
                
            
                
             
                //stmt.setString(4, objRequisito.getTelefone());
                stmt.execute();
                

            } else {
                sql = "UPDATE requisito "
                        + "SET nome = ?, descricao = ?, modulo = ?, funcionalidades = ?, versao = ?, esforco = ?, prioridade = ?, estado = ?, fase = ?, complexidade = ?, data criacao = ?, data ultima modificacao = ?, WHERE requisito.id = ?";
                
               

                PreparedStatement stmt = connection.prepareStatement(sql);
      stmt.setString(1, objRequisito.getNomeRequisito());
                stmt.setString(2, objRequisito.getDescricao());
                
                //TODO demais campos faltam aqui
                               
                stmt.setLong(3, objRequisito.getIdRequisito());
                stmt.setLong(4, objRequisito.getUsuario_id());
                stmt.setLong(5, objRequisito.getProjeto_id());
                stmt.setString(6, objRequisito.getNomeRequisito());
                stmt.setString(7, objRequisito.getModulo());
                stmt.setString(8, objRequisito.getFuncionalidades());
                stmt.setString(9, objRequisito.getDescricao());
                stmt.setDouble(10, objRequisito.getVersao());
                stmt.setDouble(11, objRequisito.getEsforcoHoras());
                stmt.setInt(12, objRequisito.getPrioridade());
                stmt.setInt(13, objRequisito.getEstado());
                stmt.setInt(14, objRequisito.getFase());
                stmt.setInt(15, objRequisito.getComplexidade());
                stmt.setDate(16, (Date) objRequisito.getDataCriacao());
                stmt.setDate(17, (Date) objRequisito.getDataUltimaMod());
                           
                                
                // Execute
                stmt.execute();

            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList buscar(RequisitosModel objRequisito) {
        try {
            String sql = "";
            if (!objRequisito.getNomeRequisito().isEmpty()) {
                sql = "SELECT * FROM requisito WHERE nome LIKE '%" + objRequisito.getNomeRequisito()+ "%' ";

            } else if (!objRequisito.getDescricao().isEmpty()) {
                sql = "SELECT * FROM requisito WHERE descricao LIKE '%" + objRequisito.getDescricao() + "%' ";
            }
            ArrayList dado = new ArrayList();

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                dado.add(new Object[]{
                    rs.getLong("id"),
                    rs.getLong("usuario"),
                    rs.getLong("projeto"),                    
                    rs.getString("nome"),
                    rs.getString("modulo"),
                    rs.getString("funcionalidades"),
                    rs.getString("descricao"),
                    rs.getDouble("versao"),
                    rs.getDouble("esforco"),
                    rs.getInt("prioridade"),
                    rs.getInt("prioridade"),
                    rs.getInt("estado"),
                    rs.getInt("fase"),
                    rs.getInt("complexidade"),
                    rs.getTimestamp("Data criacao"),
                    rs.getTimestamp("Data Ultima Modificacao"),         
                
                    
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

    public void deletar(RequisitosModel objRequisito) {
        
    String strGetIdProjeto = String.valueOf(objRequisito.getIdRequisito());
    
        try {
            String sql;
            if (!String.valueOf(strGetIdProjeto).isEmpty()) {
                sql = "DELETE FROM requisito WHERE requisito.id = ?";
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

            PreparedStatement ps = connection.prepareStatement("SELECT * FROM requisito");
            ResultSet rs = ps.executeQuery();

           
            while (rs.next()) {
                
                dado.add(new Object[]{
                    rs.getLong("id"),
                    rs.getLong("usuario"),
                    rs.getLong("projeto"),                    
                    rs.getString("nome"),
                    rs.getString("modulo"),
                    rs.getString("funcionalidades"),
                    rs.getString("descricao"),
                    rs.getDouble("versao"),
                    rs.getDouble("esforco"),
                    rs.getInt("prioridade"),
                    rs.getInt("prioridade"),
                    rs.getInt("estado"),
                    rs.getInt("fase"),
                    rs.getInt("complexidade"),
                    rs.getTimestamp("Data criacao"),
                    rs.getTimestamp("Data Ultima Modificacao"),
                  
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
