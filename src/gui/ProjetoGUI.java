package gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModelTable;
import modelo.ProjetoModel;

public final class ProjetoGUI extends javax.swing.JFrame {
    
    public ProjetoGUI() {

        initComponents();

        // Impede que a janela seja redimencionada 
        // this.setResizable(false);
        // Trocando cursor para HAND CURSOR(Maozinha)
        // jButtonRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        // Variavel con recebendo a conexao

    }

    // Metodo que faz uma instrucao Query(select)
    // para jogar na JTable atraves do modelo de tabela (ModelTabel.java)
    public void carregarTable(ProjetoModel objProjeto) {
        ArrayList lista_de_projetos;
        
        // se o objPRojeto chegou como 'null' entao eh pra Selecionar todos
        if (objProjeto == null) {
            //
            objProjeto = new ProjetoModel();
            lista_de_projetos = Utilitarios.projDAO.listarTodos();

        } else {
            // senao chama o projDao.buscar passando um obj prpjeto que 'deverá' 
            //conter descricao ou nome preenchido
            lista_de_projetos = Utilitarios.projDAO.buscar(objProjeto);

        }
        
        String[] nome_colunas = objProjeto.getColunas();

        // cria um ModelTable passando a lista de obs projetos e o nome das colunas
        ModelTable modelo = new ModelTable(lista_de_projetos, nome_colunas);
        
        // defini a jtable com esse modelo jah preenchido com lista de projetos 
        // e colunas na mesma sequencia que a lista
        tbListagemProjeto.setModel(modelo);
        
        // para ajustar os tamanhos de largura das colunas
        tbListagemProjeto.getColumnModel().getColumn(0).setPreferredWidth(80);
        tbListagemProjeto.getColumnModel().getColumn(0).setResizable(false);
        tbListagemProjeto.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbListagemProjeto.getColumnModel().getColumn(1).setResizable(false);
        tbListagemProjeto.getColumnModel().getColumn(2).setPreferredWidth(250);
        tbListagemProjeto.getColumnModel().getColumn(2).setResizable(false);
        tbListagemProjeto.getTableHeader().setReorderingAllowed(false);
        //  tbListagemProjeto.setAutoResizeMode(tbListagemProjeto.AUTO_RESIZE_ALL_COLUMNS);
        // tbListagemProjeto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Metodo responsavel por selecionar um registro ao clicar ou seguir com as setas do teclado
    // na JTable, e realizar a vinculacao do mesmo nos TextFields
    public void linhaTableSelecionado() {

        //TODO tinha q ver uma maneira de pegar esses valores
        labelID.setText(tbListagemProjeto.getValueAt(tbListagemProjeto.getSelectedRow(), 0).toString());

        //Object objNome = tbListagemProjeto.getValueAt(tbListagemProjeto.getSelectedRow(), 1);
        txtNome.setText(tbListagemProjeto.getValueAt(tbListagemProjeto.getSelectedRow(), 1).toString());
        txtDescricao.setText(tbListagemProjeto.getValueAt(tbListagemProjeto.getSelectedRow(), 2).toString());
        LabelNomeAutor.setText(tbListagemProjeto.getValueAt(tbListagemProjeto.getSelectedRow(), 3).toString());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListagemProjeto = new javax.swing.JTable();
        labelID = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        LabelAuthor = new javax.swing.JLabel();
        LabelNomeAutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Projetos");

        jLabel2.setText("Nome");

        jLabel3.setText("Descrição");

        tbnLimpar.setText("Limpar");
        tbnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnLimparActionPerformed(evt);
            }
        });

        tbListagemProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListagemProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListagemProjetoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListagemProjeto);

        labelID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelID.setText("ID 9999");
        labelID.setEnabled(false);

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        LabelAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelAuthor.setText("Autor");

        LabelNomeAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelNomeAutor.setForeground(new java.awt.Color(102, 102, 255));
        LabelNomeAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNomeAutor.setText("Gabriel Almeida");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 259, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel3)
                            .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(labelID)))
                        .add(111, 111, 111)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(LabelAuthor)
                            .add(LabelNomeAutor)))
                    .add(layout.createSequentialGroup()
                        .add(txtDescricao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btnBuscar)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(tbnLimpar)
                .add(61, 61, 61)
                .add(btnDeletar)
                .add(0, 0, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jLabel1)
                .add(77, 77, 77)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(labelID))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txtNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3))
                    .add(layout.createSequentialGroup()
                        .add(LabelAuthor)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(LabelNomeAutor)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtDescricao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnBuscar))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tbnLimpar)
                    .add(btnDeletar))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnLimparActionPerformed
        
        limparTela();
        
        carregarTable(null);
        
    }//GEN-LAST:event_tbnLimparActionPerformed

    private void tbListagemProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListagemProjetoMouseClicked
        
        linhaTableSelecionado();
        
    }//GEN-LAST:event_tbListagemProjetoMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
       
        ProjetoModel objProjeto = new ProjetoModel(Long.parseLong(labelID.getText()));

        // somente pode deletar se houver um ID no campo labelID
        if ((labelID.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Selecione um Projeto para deletar");
        } else {
            //usa o utilizarios.projDAO.deletar para deletar um projeto
            Utilitarios.projDAO.deletar(objProjeto);
            
            //TODO, podia testar se realemnte deletou de alguma maneira verificando o retorno do ResultSet
            JOptionPane.showMessageDialog(null, "Projeto removido com Sucesso! (talvez)");
        }

        
        carregarTable(null);

        // apaga os dados preenchidos nos campos de texto
        limparTela();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ProjetoModel objProjeto = new ProjetoModel();
        objProjeto.setNome(txtNome.getText());
        objProjeto.setDescricao(txtDescricao.getText());

        // havendo nome ou descricao preechidos, altera 'buscar' para True 
        if ((!txtNome.getText().isEmpty()) || (!txtDescricao.getText().isEmpty())) {
        
            
            carregarTable(objProjeto);
        
        }else{

            carregarTable(null);
        }

        // apaga os dados preenchidos nos campos de texto
        limparTela();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        carregarTable(null);
        
    }//GEN-LAST:event_formComponentShown

    public void limparTela() {
        labelID.setText("ID 99999");
        txtNome.setText("");
        txtDescricao.setText("");
        LabelNomeAutor.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAuthor;
    private javax.swing.JLabel LabelNomeAutor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JTable tbListagemProjeto;
    private javax.swing.JButton tbnLimpar;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
