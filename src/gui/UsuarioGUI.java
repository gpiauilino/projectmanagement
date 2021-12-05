package gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModelTable;
import modelo.UsuarioModel;

public final class UsuarioGUI extends javax.swing.JFrame {

    public UsuarioGUI() {

        initComponents();

        //Centralizando a janela
        this.setLocationRelativeTo(null);
        // Impede que a janela seja redimencionada 
        this.setResizable(false);
        // Trocando cursor para HAND CURSOR(Maozinha)
        // jButtonRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }

    // Metodo que realiza conexao com o banco, faz uma instrucao Query(select)
    // para jogar na JTable atraves do modelo de tabela (ModelTabel.java)
    public void carregarTable(UsuarioModel objUsuario) {

        //Filtro de busca da tabela visual UsuarioGUI
        ArrayList lista_de_usuarios;

        // se o objUsuario chegou como 'null' entao eh pra Selecionar todos
        if (objUsuario == null) {
            objUsuario = new UsuarioModel();
            lista_de_usuarios = Utilitarios.usuDAO.listarTodos();
        } else {
            // senao chama o usuDao.buscar passando um obj usuario que 'deverá' 
            //conter descricao ou nome preenchido
            lista_de_usuarios = Utilitarios.usuDAO.buscar(objUsuario);
        }
        String[] colunas = objUsuario.getColunas();

        ModelTable modelo = new ModelTable(lista_de_usuarios, colunas);

        tbListagemUsuario.setModel(modelo);
        tbListagemUsuario.getColumnModel().getColumn(0).setPreferredWidth(80);
        tbListagemUsuario.getColumnModel().getColumn(0).setResizable(false);
        tbListagemUsuario.getColumnModel().getColumn(1).setPreferredWidth(120);
        tbListagemUsuario.getColumnModel().getColumn(1).setResizable(false);
        tbListagemUsuario.getColumnModel().getColumn(2).setPreferredWidth(250);
        tbListagemUsuario.getColumnModel().getColumn(2).setResizable(false);
        tbListagemUsuario.getTableHeader().setReorderingAllowed(false);
        //  tbListagemUsuario.setAutoResizeMode(tbListagemUsuario.AUTO_RESIZE_ALL_COLUMNS);
        // tbListagemUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Metodo responsavel por selecionar um registro ao clicar ou seguir com as setas do teclado
    // na JTable, e realizar a vinculacao do mesmo nos TextFields
    public void linhaTableSelecionado() {

        // valor quando retorna da taela, no caso o valor da celula da linha selecionada 
        // coluna de posicao 0, como se trata de uma ID o objeto calordaCelula eh um Long
        Object valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 0);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelID.setText(valorDaCelula.toString());

        // testar o valor da celula, com 1l pq eh o id do admin e desablitar 
        // ou nao o bt de Deletar e liberar o alterar nivel
        if (valorDaCelula.equals(1l)) {
            btnDeletar.setEnabled(false);
            cbNivel.setEnabled(false);
        } else {
            btnDeletar.setEnabled(true);
            cbNivel.setEnabled(true);
        }

        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 1);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelNome.setText(valorDaCelula.toString());

        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 2);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelCpf.setText(valorDaCelula.toString());
        
        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 3);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelEmail.setText(valorDaCelula.toString());

        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 4);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelTelefone.setText(valorDaCelula.toString());

        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 5);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelDtCri.setText(valorDaCelula.toString());
        
        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 6);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelLogin.setText(valorDaCelula.toString());
        
        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 7);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        labelSenha.setText(valorDaCelula.toString());

        valorDaCelula = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 8);
        if (valorDaCelula == null) {
            valorDaCelula = "";
        }
        cbNivel.setSelectedItem(valorDaCelula);

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
        txtCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tbnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListagemUsuario = new javax.swing.JTable();
        labelID = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tbnSalvar1 = new javax.swing.JButton();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelNome1 = new javax.swing.JLabel();
        labelDtCri = new javax.swing.JLabel();
        labelDtMod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Usuários");

        jLabel2.setText("Nome");

        jLabel3.setText("CPF");

        jLabel4.setText("Telefone");

        jLabel5.setText("Email");

        tbnLimpar.setText("Limpar");
        tbnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnLimparActionPerformed(evt);
            }
        });

        tbListagemUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email", "Telefone", "CPF", "Nivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListagemUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListagemUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListagemUsuario);

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

        jLabel7.setText("Login");

        labelSenha.setText("Senha");

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Gerente", "Funcionário" }));
        cbNivel.setEnabled(false);

        jLabel9.setText("Nivel");

        tbnSalvar1.setText("Adicionar");
        tbnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSalvar1ActionPerformed(evt);
            }
        });

        labelTelefone.setText("99 9999-9999");

        labelEmail.setText("Email");

        labelLogin.setText("Login");

        jLabel10.setText("Senha");

        labelCpf.setText("CPF");

        jLabel11.setText("CPF");

        labelNome.setText("Nome");

        labelNome1.setText("Nome");

        labelDtCri.setText("dt cri");

        labelDtMod.setText("dt mod");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(273, 273, 273)
                                .addComponent(labelDtCri)))
                        .addGap(0, 498, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(tbnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tbnSalvar1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelNome1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelCpf)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnBuscar)
                                                    .addComponent(labelLogin)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelSenha))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelNome)
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelTelefone))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelEmail)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(420, 420, 420)
                    .addComponent(labelDtMod)
                    .addContainerGap(475, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(labelDtCri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelID)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogin)
                    .addComponent(labelNome)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelSenha))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(labelNome1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnLimpar)
                    .addComponent(btnDeletar)
                    .addComponent(tbnSalvar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(labelDtMod)
                    .addContainerGap(320, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnLimparActionPerformed
        limparTela();
        carregarTable(null);
    }//GEN-LAST:event_tbnLimparActionPerformed

    private void tbListagemUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListagemUsuarioMouseClicked
        // ao clicar num item da tabelas
        linhaTableSelecionado();
    }//GEN-LAST:event_tbListagemUsuarioMouseClicked

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        
        if ((labelID.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Selecione um usuar da lista");
        } else {
            if (("1".equals(labelID.getText()))) {
                JOptionPane.showMessageDialog(null, "Proibido apagar o ADMIN");
            } else {
                UsuarioModel objUsuario = new UsuarioModel(Long.parseLong(labelID.getText()));

                // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
                if (Utilitarios.usuDAO.deletar(objUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usurio Removido com Sucesso! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao remover usuario ");
                }
            }
        }

        carregarTable(null);

        // apaga os dados preenchidos nos campos de texto
        limparTela();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        UsuarioModel objUsuario = new UsuarioModel();
        objUsuario.setNome(txtNome.getText());
        objUsuario.setCpf(txtCPF.getText());

        // fazendo a validação dos dados da busca
        if ((!txtNome.getText().isEmpty()) || (!txtCPF.getText().isEmpty())) {
            // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
            carregarTable(objUsuario);
        } else {
            carregarTable(null);
        }

        // apaga os dados preenchidos nos campos de texto
        limparTela();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSalvar1ActionPerformed

        new UsuarioInserirGUI().setVisible(true);

    }//GEN-LAST:event_tbnSalvar1ActionPerformed

    public void limparTela() {
        labelID.setText("ID 99999");
        txtNome.setText("");
        txtCPF.setText("");
        labelNome.setText("");
        labelCpf.setText("");
        labelEmail.setText("");
        labelTelefone.setText("");

        btnDeletar.setEnabled(false);
        cbNivel.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelDtCri;
    private javax.swing.JLabel labelDtMod;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JTable tbListagemUsuario;
    private javax.swing.JButton tbnLimpar;
    private javax.swing.JButton tbnSalvar1;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
