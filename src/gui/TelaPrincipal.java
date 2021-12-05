/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ProjetoDAO;
import dao.UsuarioDAO;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author celio_ukd8
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private static Utilitarios utilz;

    public TelaPrincipal(Utilitarios utils) {
        utilz = utils;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelNoProjeto = new javax.swing.JLabel();
        areaTilesProjetos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btCriarProjeto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        labelNoProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNoProjeto.setText("Nenhum Projeto");

        areaTilesProjetos.setLayout(new javax.swing.BoxLayout(areaTilesProjetos, javax.swing.BoxLayout.Y_AXIS));

        jLabel2.setText("Lista Projetos");
        areaTilesProjetos.add(jLabel2);

        btCriarProjeto.setText("Criar");
        btCriarProjeto.setToolTipText("Adicionar um projeto");
        btCriarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarProjetoActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labelNoProjeto, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(areaTilesProjetos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 317, Short.MAX_VALUE)
                        .add(btCriarProjeto)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(areaTilesProjetos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(labelNoProjeto, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .add(9, 9, 9)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btCriarProjeto)
                    .add(jButton2))
                .addContainerGap())
        );

        fileMenu.setMnemonic('a');
        fileMenu.setText("Arquivo");

        openMenuItem.setMnemonic('u');
        openMenuItem.setText("Usuários");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('p');
        saveMenuItem.setText("Projetos");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown


    }//GEN-LAST:event_jPanel1ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        while (!utilz.inicializarDB()) {

            ConfigurarDB dialog = new ConfigurarDB(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);

        }

        Utilitarios.usuDAO = new UsuarioDAO(utilz.getConnection());
        Utilitarios.projDAO = new ProjetoDAO(utilz.getConnection());

        Login telaLogin = new Login(this, true);
        telaLogin.setLocationRelativeTo(null);

        // cuidar do evento de Fecar a jaela para encerrar toda a aplicacao
        telaLogin.addWindowListener(new java.awt.event.WindowAdapter() {
            
            // windowClosed eh chamada quando rola um dispose no Dialog
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                // se nao cancelou o Login entao nao setou UsuarioID, e encerra APP
                if (Utilitarios.usuarioId == null || Utilitarios.usuarioId == 0l) {
                    System.exit(0);
                } else {
                    ArrayList projs_lista = Utilitarios.projDAO.listarTodos();
                    if (!projs_lista.isEmpty()) {

                        // remove msg de Sem Projeto da tela
                        jPanel1.remove(labelNoProjeto);

                        for (Object projeto : projs_lista) {
                            //TODO repassar o objeto projeto pra dentro dessa 
                            // panel pra ela usar e mostrar os valores
                            ProjetoTilePanel tile = new ProjetoTilePanel();
                            areaTilesProjetos.add(tile);
                        }
                        
                        //esse pack compacta a tela e ajusta o tamanho, vai precisar 
                        //rever isso q com muitos projetos nao ficam legal
                        pack();
                    }
                }
            }

            // este windowsClosinh eh chamado quando se clica no X da janela
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println("windwClosing");
                System.exit(0);
            }
        });

        // add a component listener
        telaLogin.addComponentListener(new ComponentListener() {
            public void componentHidden(ComponentEvent e) {
                System.out.println("dialog hidden");
            }

            public void componentMoved(ComponentEvent e) {
                System.out.println("dialog moved");
            }

            public void componentResized(ComponentEvent e) {
                System.out.println("dialog resized");
            }

            public void componentShown(ComponentEvent e) {
                System.out.println("dialog shown");
            }
        });

        telaLogin.setVisible(true);
        //telaLogin.dispose();

    }//GEN-LAST:event_formComponentShown

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed

        new UsuarioGUI().setVisible(true);

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed

        new ProjetoGUI().setVisible(true);

    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void btCriarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarProjetoActionPerformed

        new ProjetoCriarGUI().setVisible(true);

    }//GEN-LAST:event_btCriarProjetoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // remove msg de Sem Projeto da tela
        jPanel1.remove(labelNoProjeto);

        ProjetoTilePanel tile = new ProjetoTilePanel();
        areaTilesProjetos.add(tile);
        this.pack();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void atualizarProjetosLista() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JPanel areaTilesProjetos;
    private javax.swing.JButton btCriarProjeto;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNoProjeto;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
