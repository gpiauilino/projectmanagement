/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JOptionPane;
import modelo.Requisitos;
import modelo.DateToString;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Daniel Gomes
 */


public class EditarRequisitoGUI extends javax.swing.JFrame {

    private String getDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }


    
 
    /**
     * Creates new form FormRequisito
     */
    public EditarRequisitoGUI() {
       
        
    /** Problema resolvido, recortar esta parte aqui em baixo.
     * Converter a string para integer, uma vez que ela é inteiro
     */
       
        Requisitos objRequisitos = new Requisitos();
        DateToString data = new DateToString();
        String dataCriacaoConvertida = txtDataCriacao.getText();
        
        
        String idNumber = txtRequisitoId.getText();
        String versaoNumber = txtVersao.getText();
        String esforcoHoraNumber = txtEsforco.getText();
       
        
        
        objRequisitos.setIdRequisito(Integer.getInteger(idNumber));
        objRequisitos.setNomeRequisito(txtNomeRequisito.getText());
        objRequisitos.setModulo(txtModulo.getText());
        objRequisitos.setVersao(Double.parseDouble(versaoNumber));
        objRequisitos.setPrioridade(boxPrioridade.getText());
        objRequisitos.setEstado(boxEstado.getSelectedItem());
        objRequisitos.setFase(txtFase.getText());
        
        
        String dttela = txtDataCriacao.getText();
        Date date1 = null; 
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dttela);
        } catch (ParseException ex) {
            Logger.getLogger(EditarRequisitoGUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro convertendo data: " + dttela);
                    
        }
        objRequisitos.setDataCriacao(date1);
        

        //objRequisitos.setDataUltimaMod();        
        //objRequisitos.setAutor();
        objRequisitos.setFuncionalidades(txtFuncionalidades.getText());
        objRequisitos.setComplexidade(boxComplexidade.getText());
        //objRequisitos.setAutorUltimaMod(txtAutorUltimaMod.getText());
        objRequisitos.setEsforcoHoras(Double.parseDouble(esforcoHoraNumber));
        objRequisitos.setDescricao(txtDescricaoRequisito.getText());
        
        
        // DASTRO DE USUÁRIOSfazendo a valida��o dos dados
        if ((txtNomeRequisito.getText().isEmpty()) || (txtModulo.getText().isEmpty()) || (txtVersao.getText().isEmpty()) || (txtVersao.getText().isEmpty()) || (txtFuncionalidades.getText().isEmpty()) || (boxComplexidade.getText().isEmpty()) || (txtDescricaoRequisito.getText().isEmpty()) ) {
            JOptionPane.showMessageDialog(null, "Informe valores para os campos");
        } else {
            // instanciando a classe ProjetoDAO do pacote dao e criando seu objeto dao
            Utilitarios.projDAO.salvar(objProjeto);
            JOptionPane.showMessageDialog(null, "Usu�rio " + txtNome.getText() + " inserido com sucesso! ");
        }
        
        
        
        

        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        txtDescricaoRequisito = new javax.swing.JTextField();
        txtEsforco = new javax.swing.JTextField();
        txtFuncionalidades = new javax.swing.JTextField();
        ButtonDeletarRequisito = new javax.swing.JButton();
        ButtonSalvarRequisito1 = new javax.swing.JButton();
        ButtonDeletarRequisito1 = new javax.swing.JButton();
        boxPrioridade = new javax.swing.JComboBox<>();
        boxComplexidade = new javax.swing.JComboBox<>();
        boxEstado = new javax.swing.JComboBox<>();
        boxFase = new javax.swing.JComboBox<>();
        LabelCriadoEm = new javax.swing.JLabel();
        LabelUltimaMod = new javax.swing.JLabel();
        LabelNomeAutor = new javax.swing.JLabel();
        LabelDataCriacao = new javax.swing.JLabel();
        LabelDataUltimaMod = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Id");

        jLabelRequisito.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelRequisito.setText("Editar Requisito");

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

        ButtonDeletarRequisito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonDeletarRequisito.setText("Cancelar");
        ButtonDeletarRequisito.setToolTipText("");
        ButtonDeletarRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeletarRequisitoActionPerformed(evt);
            }
        });

        ButtonSalvarRequisito1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonSalvarRequisito1.setText("Salvar");
        ButtonSalvarRequisito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarRequisito1ActionPerformed(evt);
            }
        });

        ButtonDeletarRequisito1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonDeletarRequisito1.setText("Deletar");
        ButtonDeletarRequisito1.setToolTipText("");
        ButtonDeletarRequisito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeletarRequisito1ActionPerformed(evt);
            }
        });

        boxPrioridade.setMaximumRowCount(3);
        boxPrioridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));
        boxPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPrioridadeActionPerformed(evt);
            }
        });

        boxComplexidade.setMaximumRowCount(3);
        boxComplexidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baixa", "Média", "Alta" }));
        boxComplexidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxComplexidadeActionPerformed(evt);
            }
        });

        boxEstado.setMaximumRowCount(3);
        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especificado", "Em andamento", "Finalizado" }));
        boxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoActionPerformed(evt);
            }
        });

        boxFase.setMaximumRowCount(6);
        boxFase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Design", "Desenvolvimento", "Testes", "Aprovação", "Manutenção" }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(530, 530, 530)
                                .addComponent(ButtonDeletarRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonDeletarRequisito1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonSalvarRequisito1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRequisito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelAuthor)
                                    .addComponent(LabelNomeAutor))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCriadoEm)
                                    .addComponent(LabelDataCriacao))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelUltimaMod)
                                    .addComponent(LabelDataUltimaMod)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricaoRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                            .addComponent(boxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(157, 157, 157)))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel16))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel13)
                                    .addComponent(txtFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRequisito)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelAuthor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNomeAutor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelUltimaMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelDataUltimaMod))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCriadoEm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelDataCriacao)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRequisitoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(boxPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(txtEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalvarRequisito1)
                    .addComponent(ButtonDeletarRequisito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonDeletarRequisito1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRequisitoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequisitoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequisitoIdActionPerformed

    private void ButtonSalvarRequisito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarRequisito1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        
    }//GEN-LAST:event_ButtonSalvarRequisito1ActionPerformed

    private void ButtonDeletarRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeletarRequisitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDeletarRequisitoActionPerformed

    private void ButtonDeletarRequisito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeletarRequisito1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDeletarRequisito1ActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarRequisitoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarRequisitoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarRequisitoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarRequisitoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarRequisitoGUI().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton ButtonDeletarRequisito;
    private static javax.swing.JButton ButtonDeletarRequisito1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRequisito;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDescricaoRequisito;
    private javax.swing.JTextField txtEsforco;
    private javax.swing.JTextField txtFuncionalidades;
    private javax.swing.JTextField txtModulo;
    private javax.swing.JTextField txtNomeRequisito;
    private javax.swing.JTextField txtRequisitoId;
    private javax.swing.JTextField txtVersao;
    // End of variables declaration//GEN-END:variables


}