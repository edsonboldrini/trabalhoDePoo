/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author garym
 */
public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form MainUI
     */
    public MainUI() {
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

        jdpMain = new javax.swing.JDesktopPane();
        jbtnModelos = new javax.swing.JButton();
        jbtnRecursos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jdpMain.setOpaque(false);
        jdpMain.setPreferredSize(new java.awt.Dimension(400, 230));

        jbtnModelos.setText("Modelos");
        jbtnModelos.setPreferredSize(new java.awt.Dimension(130, 130));
        jbtnModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModelosActionPerformed(evt);
            }
        });

        jbtnRecursos.setText("Recursos");
        jbtnRecursos.setPreferredSize(new java.awt.Dimension(130, 130));
        jbtnRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRecursosActionPerformed(evt);
            }
        });

        jdpMain.setLayer(jbtnModelos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpMain.setLayer(jbtnRecursos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpMainLayout = new javax.swing.GroupLayout(jdpMain);
        jdpMain.setLayout(jdpMainLayout);
        jdpMainLayout.setHorizontalGroup(
            jdpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpMainLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jbtnModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jbtnRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jdpMainLayout.setVerticalGroup(
            jdpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpMainLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jdpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModelosActionPerformed
        // TODO add your handling code here:
        jfModelos obj = new jfModelos();
        obj.setVisible(true);
    }//GEN-LAST:event_jbtnModelosActionPerformed

    private void jbtnRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRecursosActionPerformed
        // TODO add your handling code here:
        jfRecursos obj = new jfRecursos();
        obj.setVisible(true);
    }//GEN-LAST:event_jbtnRecursosActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnModelos;
    private javax.swing.JButton jbtnRecursos;
    private javax.swing.JDesktopPane jdpMain;
    // End of variables declaration//GEN-END:variables
}
