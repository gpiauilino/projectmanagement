package gui;

import javax.swing.JOptionPane;
import modelo.RequisitosModel;

/**
 *
 * @author Daniel Gomes
 */
public class RequisitoCriarGUI extends javax.swing.JFrame {

    public RequisitoCriarGUI(RequisitosModel objRequisitos) {

        initComponents();

        // esse objeto eh recebido da janela parente
        //RequisitosModel objRequisitos = new RequisitosModel();
        //apenas se ele nao for null que sera usado para mostrar na tela
        // com isso essa tela passa a ser uma tela de UPDATE e nao de INSERT
        if (objRequisitos != null) {
            String idNumber = txtRequisitoId.getText();
            String versaoNumber = txtVersao.getText();
            String esforcoHoraNumber = txtEsforco.getText();

            objRequisitos.setIdRequisito(Integer.getInteger(idNumber));
            objRequisitos.setNomeRequisito(txtNomeRequisito.getText());
            objRequisitos.setModulo(txtModulo.getText());
            objRequisitos.setVersao(Double.parseDouble(versaoNumber));
            objRequisitos.setPrioridade((int) boxPrioridade.getSelectedItem());
            objRequisitos.setEstado((int) boxEstado.getSelectedItem());
            objRequisitos.setFase((int) boxFase.getSelectedItem());
            objRequisitos.setFuncionalidades(tfFuncionalidades.getText());
            objRequisitos.setComplexidade((int) boxComplexidade.getSelectedItem());
            objRequisitos.setEsforcoHoras(Double.parseDouble(esforcoHoraNumber));
            objRequisitos.setDescricao(tfDescricaoRequisito.getText());

            // DASTRO DE USUÁRIOSfazendo a valida��o dos dados
            if ((txtNomeRequisito.getText().isEmpty()) || (txtModulo.getText().isEmpty()) || (tfFuncionalidades.getText().isEmpty()) || (tfDescricaoRequisito.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Informe valores para os campos: Nome, Módulo, Funcionalidades e Descrição.");
            } else {
                // instanciando a classe ProjetoDAO do pacote dao e criando seu objeto dao
                //Utilitarios.projDAO.salvar(objProjeto);
                //JOptionPane.showMessageDialog(null, "Usu�rio " + txtNome.getText() + " inserido com sucesso! ");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabelRequisito = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LabelAuthor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRequisitoId = new javax.swing.JTextField();
        txtNomeRequisito = new javax.swing.JTextField();
        txtModulo = new javax.swing.JTextField();
        txtVersao = new javax.swing.JTextField();
        txtEsforco = new javax.swing.JTextField();
        ButtonCancelarRequisito = new javax.swing.JButton();
        ButtonSalvarRequisito1 = new javax.swing.JButton();
        ButtonLimparRequisito1 = new javax.swing.JButton();
        boxPrioridade = new javax.swing.JComboBox<>();
        boxComplexidade = new javax.swing.JComboBox<>();
        boxEstado = new javax.swing.JComboBox<>();
        boxFase = new javax.swing.JComboBox<>();
        LabelCriadoEm = new javax.swing.JLabel();
        LabelUltimaMod = new javax.swing.JLabel();
        LabelNomeAutor = new javax.swing.JLabel();
        LabelDataCriacao = new javax.swing.JLabel();
        LabelDataUltimaMod = new javax.swing.JLabel();
        ButtonDeletarRequisito = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfFuncionalidades = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescricaoRequisito = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 580));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Id");

        jLabelRequisito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRequisito.setText("+Novo Requisito");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Módulo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Versão");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Prioridade");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Fase");

        LabelAuthor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelAuthor.setText("Autor");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Complexidade");

        jLabel13.setText("Funcionalidades");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Esforço (Hrs)");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Descrição");

        txtRequisitoId.setEditable(false);
        txtRequisitoId.setText("0001");
        txtRequisitoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequisitoIdActionPerformed(evt);
            }
        });

        ButtonCancelarRequisito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonCancelarRequisito.setText("Cancelar");
        ButtonCancelarRequisito.setToolTipText("");
        ButtonCancelarRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarRequisitoActionPerformed(evt);
            }
        });

        ButtonSalvarRequisito1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSalvarRequisito1.setText("Salvar");
        ButtonSalvarRequisito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarRequisito1ActionPerformed(evt);
            }
        });

        ButtonLimparRequisito1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonLimparRequisito1.setText("Limpar");
        ButtonLimparRequisito1.setToolTipText("");
        ButtonLimparRequisito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparRequisito1ActionPerformed(evt);
            }
        });

        boxPrioridade.setMaximumRowCount(4);
        boxPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Baixa", "Média", "Alta" }));
        boxPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPrioridadeActionPerformed(evt);
            }
        });

        boxComplexidade.setMaximumRowCount(4);
        boxComplexidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Baixa", "Média", "Alta" }));
        boxComplexidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxComplexidadeActionPerformed(evt);
            }
        });

        boxEstado.setMaximumRowCount(4);
        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Especificado", "Em andamento", "Finalizado" }));
        boxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoActionPerformed(evt);
            }
        });

        boxFase.setMaximumRowCount(7);
        boxFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Design", "Desenvolvimento", "Testes", "Aprovação", "Manutenção" }));
        boxFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxFaseActionPerformed(evt);
            }
        });

        LabelCriadoEm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelCriadoEm.setText("Criado em");

        LabelUltimaMod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelUltimaMod.setText("Última Modificação");

        LabelNomeAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelNomeAutor.setForeground(new java.awt.Color(102, 102, 255));
        LabelNomeAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNomeAutor.setText("Gabriel Almeida");

        LabelDataCriacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelDataCriacao.setForeground(new java.awt.Color(102, 102, 255));
        LabelDataCriacao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelDataCriacao.setText("23/11/2021 15:45");

        LabelDataUltimaMod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelDataUltimaMod.setForeground(new java.awt.Color(102, 102, 255));
        LabelDataUltimaMod.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelDataUltimaMod.setText("24/11/2021 20:50");

        ButtonDeletarRequisito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonDeletarRequisito.setText("Deletar");
        ButtonDeletarRequisito.setToolTipText("");
        ButtonDeletarRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeletarRequisitoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Projeto de \"Exemplo\"");

        tfFuncionalidades.setColumns(20);
        tfFuncionalidades.setRows(5);
        jScrollPane2.setViewportView(tfFuncionalidades);

        tfDescricaoRequisito.setColumns(20);
        tfDescricaoRequisito.setRows(5);
        jScrollPane1.setViewportView(tfDescricaoRequisito);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNomeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRequisitoId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(boxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonDeletarRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCancelarRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonLimparRequisito1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonSalvarRequisito1))
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel16))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane2))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRequisito)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAuthor)
                    .addComponent(LabelNomeAutor))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCriadoEm)
                    .addComponent(LabelDataCriacao))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUltimaMod)
                    .addComponent(LabelDataUltimaMod))
                .addGap(54, 54, 54))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ButtonCancelarRequisito, ButtonDeletarRequisito, ButtonLimparRequisito1, ButtonSalvarRequisito1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabelRequisito))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelAuthor)
                                .addGap(18, 18, 18)
                                .addComponent(LabelNomeAutor))
                            .addComponent(LabelUltimaMod)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelCriadoEm)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelDataUltimaMod))))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtRequisitoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNomeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(boxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(170, 170, 170))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(boxComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(boxFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 79, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ButtonSalvarRequisito1)
                                    .addComponent(ButtonCancelarRequisito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonDeletarRequisito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonLimparRequisito1))))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRequisitoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequisitoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequisitoIdActionPerformed

    private void ButtonSalvarRequisito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarRequisito1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_ButtonSalvarRequisito1ActionPerformed

    private void ButtonCancelarRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarRequisitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCancelarRequisitoActionPerformed

    private void ButtonLimparRequisito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparRequisito1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_ButtonLimparRequisito1ActionPerformed

    private void boxFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxFaseActionPerformed
        // Ação

        // Pegar valor do ComboBox
        String selectedValueBoxFase = boxFase.getSelectedItem().toString();

        // Mandar esse valor para o banco de dados

    }//GEN-LAST:event_boxFaseActionPerformed

    private void boxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadoActionPerformed

        // Ação
        // Pegar valor do ComboBox
        String selectedValueBoxEstado = boxEstado.getSelectedItem().toString();

        // Mandar esse valor para o banco de dados

    }//GEN-LAST:event_boxEstadoActionPerformed

    private void boxComplexidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxComplexidadeActionPerformed
        // Ação

        // Pegar valor do ComboBox
        String selectedValueBoxComplexidade = boxComplexidade.getSelectedItem().toString();

        // Mandar esse valor para o banco de dados

    }//GEN-LAST:event_boxComplexidadeActionPerformed

    private void boxPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPrioridadeActionPerformed
        // Ação

        // Pegar valor do ComboBox
        String selectedValueBoxPrioridade = boxPrioridade.getSelectedItem().toString();

        // Mandar esse valor para o banco de dados

    }//GEN-LAST:event_boxPrioridadeActionPerformed

    private void ButtonDeletarRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeletarRequisitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDeletarRequisitoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton ButtonCancelarRequisito;
    private static javax.swing.JButton ButtonDeletarRequisito;
    private static javax.swing.JButton ButtonLimparRequisito1;
    private static javax.swing.JButton ButtonSalvarRequisito1;
    private javax.swing.JLabel LabelAuthor;
    private javax.swing.JLabel LabelCriadoEm;
    private javax.swing.JLabel LabelDataCriacao;
    private javax.swing.JLabel LabelDataUltimaMod;
    private javax.swing.JLabel LabelNomeAutor;
    private javax.swing.JLabel LabelUltimaMod;
    private javax.swing.JComboBox<String> boxComplexidade;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxFase;
    private javax.swing.JComboBox<String> boxPrioridade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRequisito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea tfDescricaoRequisito;
    private javax.swing.JTextArea tfFuncionalidades;
    private javax.swing.JTextField txtEsforco;
    private javax.swing.JTextField txtModulo;
    private javax.swing.JTextField txtNomeRequisito;
    private javax.swing.JTextField txtRequisitoId;
    private javax.swing.JTextField txtVersao;
    // End of variables declaration//GEN-END:variables

}
