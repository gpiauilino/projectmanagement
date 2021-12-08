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
        tbnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListagemUsuario = new javax.swing.JTable();
        labelID = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        tbnSalvar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox<>();
        labelTelefone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelDtCri = new javax.swing.JLabel();
        labelDtMod = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelNome1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Usuários");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Usuários");

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

        tbnSalvar1.setText("Adicionar");
        tbnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSalvar1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        labelNome.setText("Nome");

        jLabel5.setText("Email:");

        labelEmail.setText("Email");

        jLabel3.setText("CPF");

        labelCpf.setText("CPF");

        jLabel7.setText("Login");

        labelLogin.setText("Login");

        jLabel10.setText("Senha");

        labelSenha.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(labelSenha)))
        );

        jLabel9.setText("Nivel");

        jLabel6.setText("Criação:");

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Gerente", "Funcionário" }));
        cbNivel.setEnabled(false);

        labelTelefone.setText("99 9999-9999");

        jLabel4.setText("Telefone");

        labelDtCri.setText("dt cri");

        labelDtMod.setText("dt mod");

        jLabel8.setText("Mod.:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(labelDtCri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDtMod)
                            .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTelefone))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelDtCri))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDtMod)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNome1.setText("Nome");

        jLabel11.setText("CPF");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(btnBuscar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelID)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbnSalvar1))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnLimpar)
                    .addComponent(btnDeletar)
                    .addComponent(tbnSalvar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
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
            JOptionPane.showMessageDialog(null, "Selecione um usuário da lista");
        } else {
            if (("1".equals(labelID.getText()))) {
                JOptionPane.showMessageDialog(null, "Proibido apagar o ADMIN");
            } else {
                UsuarioModel objUsuario = new UsuarioModel(Long.parseLong(labelID.getText()));

                // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto dao
                if (Utilitarios.usuDAO.deletar(objUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuário Removido com Sucesso! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao remover usuário ");
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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        carregarTable(null);
        
    }//GEN-LAST:event_formComponentShown

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
