package gui;

import javax.swing.JOptionPane;
import modelo.ProjetoModel;

public class ProjetoCriarGUI extends javax.swing.JFrame {

    public ProjetoCriarGUI() {

        initComponents();

        //Centralizando a janela
        this.setLocationRelativeTo(null);

        btRequisitos.setVisible(false);
        // Impede que a janela seja redimencionada 
        // this.setResizable(false);

        // Trocando cursor para HAND CURSOR(Maozinha)
        // jButtonRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    public ProjetoCriarGUI(Object[] obj_projeto) {
        initComponents();

        labelID.setText(obj_projeto[0].toString());
        txtNome.setText(obj_projeto[1].toString());
        tfDescricao.setText(obj_projeto[2].toString());
        //TODO criar todos os campos e seguir na mesma ordem de declaracao do objeco[]
        // criado em ProjetoDAO.listartodos
        // tipo isso mais ou menos
        //txtDATAcriacao.set(obj_projeto[2].toString());

        // alterar os textos para parecer q a tela agora eh de Editar e nao criar projeto
        tbnSalvar.setText("Alterar");
        jLabel1.setText("Editar Projeto");
        btRequisitos.setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        tbnLimpar = new javax.swing.JButton();
        tbnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricao = new javax.swing.JTextArea();
        labelID = new javax.swing.JLabel();
        btRequisitos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar/Alterar Projeto");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("+ Novo Projeto");

        jLabel2.setText("Nome");

        jLabel3.setText("Descrição");

        tbnLimpar.setText("Limpar");
        tbnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnLimparActionPerformed(evt);
            }
        });

        tbnSalvar.setText("Salvar");
        tbnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSalvarActionPerformed(evt);
            }
        });

        tfDescricao.setColumns(20);
        tfDescricao.setRows(5);
        jScrollPane1.setViewportView(tfDescricao);

        labelID.setText("0");
        labelID.setEnabled(false);
        labelID.setFocusable(false);

        btRequisitos.setText("Requisitos");
        btRequisitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRequisitosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btRequisitos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelID)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(labelID))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnLimpar)
                    .addComponent(tbnSalvar)
                    .addComponent(btRequisitos))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSalvarActionPerformed

        // nao DEVE setar o id pq com isso o sistemas sabe q deve CROAR um registro novo
        ProjetoModel objProjeto = new ProjetoModel();

        // u id do db_username logado sera repassado para cada projetro criado
        objProjeto.setId_usu(Utilitarios.usuarioId);

        objProjeto.setId(Long.parseLong(labelID.getText()));
        objProjeto.setNome(txtNome.getText());
        objProjeto.setDescricao(tfDescricao.getText());

        // verifica se foi preenchido o Nome
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe Nome");
        } else {
            // instanciando a classe ProjetoDAO do pacote dao e criando seu objeto dao
            Utilitarios.projDAO.salvar(objProjeto);
            JOptionPane.showMessageDialog(null, "Projeto '" + txtNome.getText() + "' inserido com sucesso! ");
        }

        // apaga os dados preenchidos nos campos de texto
        limparTela();
    }//GEN-LAST:event_tbnSalvarActionPerformed

    private void tbnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnLimparActionPerformed
        limparTela();
    }//GEN-LAST:event_tbnLimparActionPerformed

    private void btRequisitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRequisitosActionPerformed

        new RequisitoGUI(Long.parseLong(labelID.getText()), txtNome.getText()).setVisible(true);

    }//GEN-LAST:event_btRequisitosActionPerformed

    public void limparTela() {
        txtNome.setText("");
        tfDescricao.setText("");
        labelID.setText("0");
        tbnSalvar.setText("Salvar");

        btRequisitos.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRequisitos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JButton tbnLimpar;
    private javax.swing.JButton tbnSalvar;
    private javax.swing.JTextArea tfDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
