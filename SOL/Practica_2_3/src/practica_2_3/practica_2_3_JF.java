/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica_2_3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class practica_2_3_JF extends javax.swing.JFrame {

    private final ArrayList<String> modulosCurso = new ArrayList();

    public void rellernarArrayList() {
        modulosCurso.add("Programacion");
        modulosCurso.add("Bases de Datos");
        modulosCurso.add("Sistemas de Gestion Empresarial");
        modulosCurso.add("Acceso a Datos");
        modulosCurso.add("Lenguaje de Marcas");

    }

    public practica_2_3_JF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboElemento = new javax.swing.JComboBox<>();
        Texto1 = new javax.swing.JLabel();
        textoEntrada = new javax.swing.JTextField();
        botonAñadir = new javax.swing.JButton();
        botonAñadirTodo = new javax.swing.JButton();
        botonBorrarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Elementos Combobox");
        setResizable(false);

        Texto1.setText("Añade el nombre de los modulos de los que estés matriculado ");

        textoEntrada.setForeground(new java.awt.Color(102, 102, 102));
        textoEntrada.setText("Añada un modulo.");
        textoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEntradaActionPerformed(evt);
            }
        });
        textoEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoEntradaKeyPressed(evt);
            }
        });

        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        botonAñadirTodo.setText("Añadir Todos");
        botonAñadirTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirTodoActionPerformed(evt);
            }
        });

        botonBorrarTodo.setText("Borrar Todos");
        botonBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Texto1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAñadir)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botonBorrarTodo)
                                .addComponent(botonAñadirTodo)))
                        .addGap(135, 135, 135))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Texto1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboElemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAñadir)
                    .addComponent(botonAñadirTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonBorrarTodo)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEntradaActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        String modulo = textoEntrada.getText();
        String moduloPredet = "Añada un modulo.";

        if (modulo.equalsIgnoreCase(moduloPredet)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Introduce un modulo valido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            textoEntrada.setText(moduloPredet);
            return;
        }

        if (modulo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El modulo no puede estar vacío. Introduzca un modulo.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean existe = false;
        for (int i = 0; i < comboElemento.getItemCount(); i++) {
            if (comboElemento.getItemAt(i).equalsIgnoreCase(modulo)) {
                existe = true;
                break;
            }
        }

        if (existe) {
            JOptionPane.showMessageDialog(this, "El módulo ya existe en la lista.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            // Si no existe, agregarlo al comboBox
            comboElemento.addItem(modulo);
            JOptionPane.showMessageDialog(this, "Módulo añadido correctamente: " + modulo, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Limpiar el campo de texto
            textoEntrada.setText(moduloPredet);
        }

    }//GEN-LAST:event_botonAñadirActionPerformed

    private void botonBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarTodoActionPerformed
        comboElemento.removeAllItems();
        JOptionPane.showMessageDialog(this, "Todos los módulos han sido eliminados.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonBorrarTodoActionPerformed

    private void botonAñadirTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirTodoActionPerformed

        rellernarArrayList();
        
        for (String it : modulosCurso) {
            boolean existe = false;

            // Verificar si el módulo ya está en el comboBox
            for (int i = 0; i < comboElemento.getItemCount(); i++) {
                if (comboElemento.getItemAt(i).equalsIgnoreCase(it)) {
                    existe = true;
                    break;
                }
            }

            // Si no existe, agregarlo al comboBox
            if (!existe) {
                comboElemento.addItem(it.toString());
            }
        }
        JOptionPane.showMessageDialog(this, "Todos los módulos han sido añadidos.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botonAñadirTodoActionPerformed

    private void textoEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoEntradaKeyPressed
        String modulo = textoEntrada.getText();
        String moduloPredet = "Añada un modulo.";

        if (modulo.equalsIgnoreCase(moduloPredet)) {
            textoEntrada.setText("");
        }
    }//GEN-LAST:event_textoEntradaKeyPressed

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
            java.util.logging.Logger.getLogger(practica_2_3_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica_2_3_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica_2_3_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica_2_3_JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica_2_3_JF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto1;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonAñadirTodo;
    private javax.swing.JButton botonBorrarTodo;
    private javax.swing.JComboBox<String> comboElemento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textoEntrada;
    // End of variables declaration//GEN-END:variables
}
