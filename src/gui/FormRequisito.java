/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JOptionPane;
import modelo.Requisitos;
import modelo.DateToString;
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
<<<<<<< HEAD
=======
=======
import modelo.ModelTable;
       

>>>>>>> 6f10f99e96f9e3fad77f31c2806aa4765e84ced3
=======
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
>>>>>>> parent of 6f10f99 (Update)
=======
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
>>>>>>> parent of 6f10f99 (Update)
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91


/**
 *
 * @author Daniel Gomes
 */


public class FormRequisito extends javax.swing.JFrame {

    private String getDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }


    
 
    /**
     * Creates new form FormRequisito
     */
    public FormRequisito() {
       
        
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
        objRequisitos.setPrioridade(txtPrioridade.getText());
        objRequisitos.setEstado(txtEstado.getText());
        objRequisitos.setFase(txtFase.getText());
        
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
        
        String dttela = txtDataCriacao.getText();
        Date date1 = null; 
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dttela);
        } catch (ParseException ex) {
            Logger.getLogger(FormRequisito.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erro convertendo data: " + dttela);
                    
        }
        objRequisitos.setDataCriacao(date1);
        

//objRequisitos.setDataUltimaMod();        
<<<<<<< HEAD
=======
=======
        // Não consegui fazer esse set de data, apanhei demais kkkk
        
        //objRequisitos.setDataCriacao(dataCriacaoConvertida);
=======
        objRequisitos.setDataCriacao(dataCriacaoConvertida);
>>>>>>> parent of 6f10f99 (Update)
=======
        objRequisitos.setDataCriacao(dataCriacaoConvertida);
>>>>>>> parent of 6f10f99 (Update)
        //objRequisitos.setDataUltimaMod(); 
        
>>>>>>> 6f10f99e96f9e3fad77f31c2806aa4765e84ced3
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
        objRequisitos.setAutor(txtAutor.getText());
        objRequisitos.setFuncionalidades(txtFuncionalidades.getText());
        objRequisitos.setComplexidade(txtComplexidade.getText());
        objRequisitos.setAutorUltimaMod(txtAutorUltimaMod.getText());
        objRequisitos.setEsforcoHoras(Double.parseDouble(esforcoHoraNumber));
        objRequisitos.setDescricao(txtDescricaoRequisito.getText());
        
        
        // DASTRO DE USUÁRIOSfazendo a valida��o dos dados
<<<<<<< HEAD
        if ((txtNomeRequisito.getText().isEmpty()) || (txtModulo.getText().isEmpty()) || (txtVersao.getText().isEmpty()) || (txtVersao.getText().isEmpty()) || (txtFuncionalidades.getText().isEmpty()) || (txtComplexidade.getText().isEmpty()) || (txtDescricaoRequisito.getText().isEmpty()) ) {
            JOptionPane.showMessageDialog(null, "Informe valores para os campos");
=======
        if ((txtNomeRequisito.getText().isEmpty()) || (txtModulo.getText().isEmpty()) || (txtFuncionalidades.getText().isEmpty()) || (txtDescricaoRequisito.getText().isEmpty()) ) {
            JOptionPane.showMessageDialog(null, "Informe valores para os campos de: Nome do Requisito, Módulo, Funcionalidade e Descriação.");
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
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
        jLabelDescricaoProjeto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtRequisitoId = new javax.swing.JTextField();
        txtNomeRequisito = new javax.swing.JTextField();
        txtModulo = new javax.swing.JTextField();
        txtVersao = new javax.swing.JTextField();
        txtPrioridade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtFase = new javax.swing.JTextField();
        txtDescricaoRequisito = new javax.swing.JTextField();
        txtDataCriacao = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtComplexidade = new javax.swing.JTextField();
        txtDataUltimaMod = new javax.swing.JTextField();
        txtAutorUltimaMod = new javax.swing.JTextField();
        txtEsforco = new javax.swing.JTextField();
        txtFuncionalidades = new javax.swing.JTextField();
        ButtonCancelarRequisito = new javax.swing.JButton();
        ButtonSalvarRequisito1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Id");

        jLabelRequisito.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelRequisito.setText("Adicionar Requisito");

        jLabelDescricaoProjeto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescricaoProjeto.setText("Nome do Projeto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Módulo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Versão");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Prioridade");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fase");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Data de Criação");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Autor");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Complexidade");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Funcionalidades");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Data da última modificação");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Autor da última modificação");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Esforço estimado em horas");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Descrição");

        txtRequisitoId.setEditable(false);
        txtRequisitoId.setText("0001");
        txtRequisitoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequisitoIdActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
        txtDataUltimaMod.setToolTipText("DD/MM/AAAA");

=======
>>>>>>> parent of 6f10f99 (Update)
=======
>>>>>>> parent of 6f10f99 (Update)
        ButtonCancelarRequisito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonCancelarRequisito.setText("Cancelar");
        ButtonCancelarRequisito.setToolTipText("");
        ButtonCancelarRequisito.addActionListener(new java.awt.event.ActionListener() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
        ButtonDeletarRequisito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonDeletarRequisito.setText("Deletar");
        ButtonDeletarRequisito.setToolTipText("");
        ButtonDeletarRequisito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeletarRequisitoActionPerformed(evt);
            }
        });

        ButtonLimparRequisito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonLimparRequisito.setText("Limpar");
        ButtonLimparRequisito.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 6f10f99e96f9e3fad77f31c2806aa4765e84ced3
=======
>>>>>>> parent of 6f10f99 (Update)
=======
>>>>>>> parent of 6f10f99 (Update)
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabelRequisito)
                            .addComponent(jLabelDescricaoProjeto)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(75, 75, 75)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDataCriacao, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtComplexidade, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDataUltimaMod, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                            .addComponent(txtAutorUltimaMod)
                                            .addComponent(txtEsforco)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFuncionalidades))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(49, 49, 49)
                                .addComponent(txtFase, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(598, 598, 598))
=======
                                            .addComponent(txtFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ButtonCancelarRequisito)
                                            .addGap(18, 18, 18)
                                            .addComponent(ButtonSalvarRequisito1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(47, 47, 47)
                                                    .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel6))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12))
                                                    .addGap(28, 28, 28)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtAutor)
                                                        .addComponent(txtComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGap(46, 46, 46)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel16))
                                            .addGap(28, 28, 28)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtAutorUltimaMod)
                                                .addComponent(txtDataUltimaMod)
                                                .addComponent(txtEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(37, Short.MAX_VALUE))
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(10, 10, 10)
                        .addComponent(txtDescricaoRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCancelarRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSalvarRequisito1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRequisito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescricaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(txtRequisitoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataCriacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addComponent(txtNomeRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComplexidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDataUltimaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAutorUltimaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                            .addComponent(jLabel16)
                            .addComponent(txtEsforco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel13)
                            .addComponent(txtFuncionalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonSalvarRequisito1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonCancelarRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtDescricaoRequisito))
=======
                            .addComponent(ButtonSalvarRequisito1)
                            .addComponent(ButtonCancelarRequisito))))
>>>>>>> c4ab4e403127bd967cb3d97caf250a872dad1c91
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

    private void ButtonCancelarRequisitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarRequisitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCancelarRequisitoActionPerformed

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
            java.util.logging.Logger.getLogger(FormRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRequisito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRequisito().setVisible(true);
            }
        });
    }

    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton ButtonCancelarRequisito;
    private static javax.swing.JButton ButtonSalvarRequisito1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDescricaoProjeto;
    private javax.swing.JLabel jLabelRequisito;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAutorUltimaMod;
    private javax.swing.JTextField txtComplexidade;
    private javax.swing.JTextField txtDataCriacao;
    private javax.swing.JTextField txtDataUltimaMod;
    private javax.swing.JTextField txtDescricaoRequisito;
    private javax.swing.JTextField txtEsforco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFase;
    private javax.swing.JTextField txtFuncionalidades;
    private javax.swing.JTextField txtModulo;
    private javax.swing.JTextField txtNomeRequisito;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtRequisitoId;
    private javax.swing.JTextField txtVersao;
    // End of variables declaration//GEN-END:variables


}
