/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laudry.in;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class menu extends javax.swing.JFrame {
    
    /**
     * Creates new form menu
     */
    public menu() {
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

        btnkeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnriwayat = new javax.swing.JButton();
        btntransaksi = new javax.swing.JButton();
        btnpesanan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnkeluar.setBackground(new java.awt.Color(252, 90, 90));
        btnkeluar.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAUNDRY.IN");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnriwayat.setText("Riwayat Transaksi");
        btnriwayat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnriwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnriwayatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnriwayatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnriwayatMouseExited(evt);
            }
        });
        btnriwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnriwayatActionPerformed(evt);
            }
        });
        getContentPane().add(btnriwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 30));

        btntransaksi.setText("Transaksi Baru");
        btntransaksi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btntransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntransaksiMouseExited(evt);
            }
        });
        btntransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btntransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 30));

        btnpesanan.setText("Pesanan");
        btnpesanan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnpesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpesananMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpesananMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpesananMouseExited(evt);
            }
        });
        btnpesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesananActionPerformed(evt);
            }
        });
        getContentPane().add(btnpesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, 30));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SELAMAT DATANG");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 360, 40));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HAI !!!");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 170, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uidesain/Untitled (2).png"))); // NOI18N
        jLabel1.setDoubleBuffered(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnriwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnriwayatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnriwayatActionPerformed

    private void btnriwayatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnriwayatMouseEntered
        // TODO add your handling code here:
        btnriwayat.setBackground(new Color(156,195,223));
    }//GEN-LAST:event_btnriwayatMouseEntered

    private void btntransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseEntered
        // TODO add your handling code here:
        btntransaksi.setBackground(new Color(156,195,223));
    }//GEN-LAST:event_btntransaksiMouseEntered

    private void btntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btntransaksiActionPerformed

    private void btnpesananMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesananMouseEntered
        // TODO add your handling code here:
        btnpesanan.setBackground(new Color(156,195,223));
    }//GEN-LAST:event_btnpesananMouseEntered

    private void btnpesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpesananActionPerformed

    private void btntransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseExited
        // TODO add your handling code here:
        btntransaksi.setBackground(new Color(217,217,217));
    }//GEN-LAST:event_btntransaksiMouseExited

    private void btnpesananMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesananMouseExited
        // TODO add your handling code here:
        btnpesanan.setBackground(new Color(217,217,217));
    }//GEN-LAST:event_btnpesananMouseExited

    private void btnriwayatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnriwayatMouseExited
        // TODO add your handling code here:
        btnriwayat.setBackground(new Color(217,217,217));
    }//GEN-LAST:event_btnriwayatMouseExited

    private void btntransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseClicked
        // TODO add your handling code here:
        btntransaksi.setBackground(new Color(156,195,223));
        new transaksibaru().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btntransaksiMouseClicked

    private void btnpesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpesananMouseClicked
        // TODO add your handling code here:
        btnpesanan.setBackground(new Color(156,195,223));
        new pesanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpesananMouseClicked

    private void btnriwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnriwayatMouseClicked
        // TODO add your handling code here:
        btnriwayat.setBackground(new Color(156,195,223));
        new riwayat().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnriwayatMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnpesanan;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btntransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    void setUser(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
