/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laudry.in;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.io.File;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author USER
 */
public class riwayat extends javax.swing.JFrame {
public Connection con;
public Statement st;
public ResultSet rs;
public DefaultTableModel model;
    /**
     * Creates new form menu
     */
     

    /**
     * Creates new form menu
     */
    public riwayat() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel)jtabel.getModel();
    }
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnkembali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnriwayat = new javax.swing.JButton();
        btntransaksi = new javax.swing.JButton();
        btnpesanan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabel = new javax.swing.JTable();
        txtbayar = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txtberat = new javax.swing.JTextField();
        txtpencarian = new javax.swing.JTextField();
        btnlaporan = new javax.swing.JButton();
        btncreate = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnshow = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();
        txtjenis = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpelanggan = new javax.swing.JTextField();
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

        btnkembali.setBackground(new java.awt.Color(255, 204, 0));
        btnkembali.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnkembali.setText("Kembali");
        btnkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAUNDRY.IN");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnriwayat.setBackground(new java.awt.Color(156, 195, 223));
        btnriwayat.setText("Riwayat Transaksi");
        btnriwayat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnriwayat.addMouseListener(new java.awt.event.MouseAdapter() {
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

        btntransaksi.setBackground(new java.awt.Color(204, 204, 204));
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

        btnpesanan.setBackground(new java.awt.Color(204, 204, 204));
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("RIWAYAT TRANSAKSI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtabel.setAutoCreateRowSorter(true);
        jtabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transaksi", "Tanggal Transaksi", "Nama Pelanggan", "Jenis Cucian", "Harga", "Berat", "Total Harga", "Bayar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabel);
        jtabel.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 520, 210));
        getContentPane().add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 170, -1));
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 170, -1));

        txtberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtberatActionPerformed(evt);
            }
        });
        txtberat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtberatKeyReleased(evt);
            }
        });
        getContentPane().add(txtberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 90, -1));

        txtpencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpencarianActionPerformed(evt);
            }
        });
        txtpencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpencarianKeyPressed(evt);
            }
        });
        getContentPane().add(txtpencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 170, -1));

        btnlaporan.setBackground(new java.awt.Color(255, 153, 51));
        btnlaporan.setText("Laporan");
        btnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporanActionPerformed(evt);
            }
        });
        getContentPane().add(btnlaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 80, -1));

        btncreate.setBackground(new java.awt.Color(153, 255, 255));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });
        getContentPane().add(btncreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 80, -1));

        btnhapus.setBackground(new java.awt.Color(255, 102, 102));
        btnhapus.setText("Delete");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 80, -1));

        btnupdate.setBackground(new java.awt.Color(153, 255, 153));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 80, -1));

        jLabel4.setText("Pencarian");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 60, 20));

        btnshow.setBackground(new java.awt.Color(255, 204, 102));
        btnshow.setText("Show Data");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });
        getContentPane().add(btnshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 170, -1));

        txtjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilihan", "cuci basah", "cuci kering", "cuci setrika" }));
        txtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjenisActionPerformed(evt);
            }
        });
        getContentPane().add(txtjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 170, -1));

        jLabel5.setText(" Jenis Cucian");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 20));

        jLabel6.setText(" Harga");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 120, 20));

        jLabel7.setText("Kg");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 50, 20));

        jLabel8.setText(" Total Harga");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 120, 20));

        jLabel9.setText(" Bayar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 120, 20));

        jLabel11.setText(" Nama Pelanggan");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 20));

        jLabel10.setText(" Berat");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 90, 20));

        txtpelanggan.setEditable(false);
        txtpelanggan.setBackground(new java.awt.Color(255, 255, 255));
        txtpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpelangganMouseClicked(evt);
            }
        });
        txtpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpelangganActionPerformed(evt);
            }
        });
        getContentPane().add(txtpelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uidesain/Untitled (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void btnkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkembaliActionPerformed
        // TODO add your handling code here:
        new menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnkembaliActionPerformed

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

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String id_transaksi, tanggal_transaksi, nama_pelanggan, jenis_cucian, harga, berat, total_harga, bayar, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";

        int selectedrow = jtabel.getSelectedRow();
            if (selectedrow == -1) {
                JOptionPane.showMessageDialog(this, "Pilih Baris Yang di Pilih !");
                return;
            }

        id_transaksi = jtabel.getValueAt(selectedrow, 0).toString();
        tanggal_transaksi = jtabel.getValueAt(selectedrow, 1).toString();
        nama_pelanggan = jtabel.getValueAt(selectedrow, 2).toString();
        jenis_cucian = String.valueOf(txtjenis.getSelectedItem());
        harga = txtharga.getText();
        berat = txtberat.getText();
        total_harga = txttotal.getText();
        bayar = txtbayar.getText();

        if (nama_pelanggan.isEmpty() || jenis_cucian.isEmpty() || harga.isEmpty() || berat.isEmpty() || total_harga.isEmpty() || bayar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi semua kolom!", "validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        query = "UPDATE transaksi SET tanggal_transaksi=?, jenis_cucian=?, harga=?, berat=?, total_harga=?, bayar=? WHERE id_transaksi=?";
        PreparedStatement st = con.prepareStatement(query);
    
        st.setString(1, tanggal_transaksi);
        st.setString(2, jenis_cucian);
        st.setString(3, harga);
        st.setString(4, berat);
        st.setString(5, total_harga);
        st.setString(6, bayar);
        st.setString(7, id_transaksi);

    int rowupdate = st.executeUpdate();
    if (rowupdate > 0) {
        JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
        
        DefaultTableModel model = (DefaultTableModel) jtabel.getModel();
        model.setValueAt(tanggal_transaksi, selectedrow, 1);
        model.setValueAt(nama_pelanggan, selectedrow, 2);
        model.setValueAt(jenis_cucian, selectedrow, 3);
        model.setValueAt(harga, selectedrow, 4);
        model.setValueAt(berat, selectedrow, 5);
        model.setValueAt(total_harga, selectedrow, 6);
        model.setValueAt(bayar, selectedrow, 7);
    }

    st.close();
    con.close();
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
}

        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtpencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpencarianKeyPressed
        // TODO add your handling code here:
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";
        String pencarian = txtpencarian.getText();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                String sql = "select * from transaksi where id_transaksi LIKE ? OR tanggal_transaksi LIKE ? OR nama_pelanggan LIKE ? OR jenis_cucian LIKE ? OR harga LIKE ? OR berat LIKE ? OR total_harga LIKE ? OR bayar LIKE ? ";
                PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, "%"+ pencarian + "%");
                    st.setString(2, "%"+ pencarian + "%");
                    st.setString(3, "%"+ pencarian + "%");
                    st.setString(4, "%"+ pencarian + "%");
                    st.setString(5, "%"+ pencarian + "%");
                    st.setString(6, "%"+ pencarian + "%");
                    st.setString(7, "%"+ pencarian + "%");
                    st.setString(8, "%"+ pencarian + "%");
                    
                
                ResultSet rs = st.executeQuery();
                DefaultTableModel model = (DefaultTableModel)jtabel.getModel();
                model.setRowCount(0);
                
                while (rs.next()){
                  
                   String id_transaksi = rs.getString("id_transaksi");
                   String tanggal_transaksi = rs.getString("tanggal_transaksi");
                   String nama_pelanggan = rs.getString("nama_pelanggan");
                   String jenis_cucian = rs.getString("jenis_cucian");
                   String harga = rs.getString("harga");
                   String berat = rs.getString("berat");
                   String total_harga = rs.getString("total_harga");
                   String bayar = rs.getString("bayar"); 
                   
                   Object [] rowdata = {id_transaksi,tanggal_transaksi,nama_pelanggan,jenis_cucian,harga,berat,total_harga,bayar};
                   model.addRow(rowdata);
                    
                }             
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terdapat Error");
            }
            
         
            
        
    }//GEN-LAST:event_txtpencarianKeyPressed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        // TODO add your handling code here:
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            String sql = "select * from transaksi";
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()){
                
                String id_transaksi = rs.getString("id_transaksi");
                String tanggal_transaksi = rs.getString("tanggal_transaksi");
                String nama_pelanggan = rs.getString("nama_pelanggan");
                String jenis_cucian = rs.getString("jenis_cucian");
                String harga = rs.getString("harga");
                String berat = rs.getString("berat");
                String total_harga = rs.getString("total_harga");
                String bayar = rs.getString("bayar");
                
                String tabel[] = {id_transaksi,tanggal_transaksi,nama_pelanggan,jenis_cucian,harga,berat,total_harga,bayar};
                    DefaultTableModel model = (DefaultTableModel)jtabel.getModel();
                    model.addRow(tabel);
            }
        }     
        catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }    
    }//GEN-LAST:event_btnshowActionPerformed

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed
        String nama_pelanggan, jenis_cucian, harga, berat, total_harga, bayar, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";

        nama_pelanggan = txtpelanggan.getText();
        jenis_cucian = String.valueOf(txtjenis.getSelectedItem());
        harga = txtharga.getText();
        berat = txtberat.getText();
        total_harga = txttotal.getText();
        bayar = txtbayar.getText();

    if (nama_pelanggan.isEmpty() || jenis_cucian.isEmpty() || harga.isEmpty() || berat.isEmpty() || total_harga.isEmpty() || bayar.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Isi semua kolom!", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        query = "INSERT INTO transaksi(nama_pelanggan, jenis_cucian, harga, berat, total_harga, bayar) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS); 
    
        pst.setString(1, nama_pelanggan);
        pst.setString(2, jenis_cucian);
        pst.setString(3, harga);
        pst.setString(4, berat);
        pst.setString(5, total_harga);
        pst.setString(6, bayar);
    
        pst.executeUpdate();
    
        ResultSet rs = pst.getGeneratedKeys();
        int idTransaksi = 0;
        String tanggalTransaksi = "";
        if (rs.next()) {
            idTransaksi = rs.getInt(1);
    }
    
        Statement st = con.createStatement();
        ResultSet rsTanggal = st.executeQuery("SELECT tanggal_transaksi FROM transaksi WHERE id_transaksi = " + idTransaksi);
        if (rsTanggal.next()) {
            tanggalTransaksi = rsTanggal.getString("tanggal_transaksi");
    }
    
        DefaultTableModel tableModel = (DefaultTableModel) jtabel.getModel();
        tableModel.addRow(new Object[]{idTransaksi, tanggalTransaksi, nama_pelanggan, jenis_cucian, harga, berat, total_harga, bayar});
    
        txtpelanggan.setText("");
        txtjenis.setSelectedIndex(0);
        txtharga.setText("");
        txtberat.setText("");
        txttotal.setText("");
        txtbayar.setText("");
    
        JOptionPane.showMessageDialog(null, "Data Tersimpan");

        rsTanggal.close();
        st.close();
        pst.close();
        con.close();
    
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi Kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btncreateActionPerformed

    private void txtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjenisActionPerformed
        // TODO add your handling code here:
    
        if (txtjenis.getSelectedItem().toString().equalsIgnoreCase("cuci basah")){
            txtharga.setText("3000");
        } else if (txtjenis.getSelectedItem().toString().equalsIgnoreCase("cuci kering")){
            txtharga.setText("4000");
        } else if (txtjenis.getSelectedItem().toString().equalsIgnoreCase("cuci setrika")){
            txtharga.setText("5000");
        } 
    }//GEN-LAST:event_txtjenisActionPerformed

    private void txtberatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtberatKeyReleased
        // TODO add your handling code here:
     try {
        int harga = Integer.parseInt(txtharga.getText());
        int berat = Integer.parseInt(txtberat.getText());
        int totalbayar = harga*berat;
        String total = Integer.toString(totalbayar);
        txttotal.setText(total);
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Input angka tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_txtberatKeyReleased

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";
        
        int selectedrow = jtabel.getSelectedRow();
        if (selectedrow == -1){
            JOptionPane.showMessageDialog(this, "Pilih Baris Yang di Pilih !");
            return;
        }
        int confrim = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus?", "Konfirmasi", WIDTH);
        if (confrim == JOptionPane.YES_OPTION){
            String id = jtabel.getValueAt(selectedrow, 0).toString();
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                String query = "DELETE FROM transaksi WHERE id_transaksi=?";
                PreparedStatement st = con.prepareStatement(query);
              
                st.setString(1, id);
                
                int rowdelete = st.executeUpdate();
                if (rowdelete > 0){
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    DefaultTableModel model = (DefaultTableModel) jtabel.getModel();
                    model.removeRow(selectedrow);
                }
                st.close();
                
            }catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
        }
        

    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtberatActionPerformed

    private void txtpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpelangganActionPerformed

    }//GEN-LAST:event_txtpelangganActionPerformed

    private void txtpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpelangganMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Silahkan ke menu transaksi baru untuk mengganti nama pelanggan!!");
    }//GEN-LAST:event_txtpelangganMouseClicked

    private void txtpencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpencarianActionPerformed

    private void jtabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabelMouseClicked
        // TODO add your handling code here:
        int selectedrow = jtabel.getSelectedRow();

        if (selectedrow != -1){
            String id = jtabel.getValueAt(selectedrow, 0).toString();
            String tanggal = jtabel.getValueAt(selectedrow, 1).toString();
            String nama = jtabel.getValueAt(selectedrow, 2).toString();
            String jenis = jtabel.getValueAt(selectedrow, 3).toString();
            String harga = jtabel.getValueAt(selectedrow, 4).toString();
            String berat = jtabel.getValueAt(selectedrow, 5).toString();
            String total = jtabel.getValueAt(selectedrow, 6).toString();
            String bayar = jtabel.getValueAt(selectedrow, 7).toString();

            txtpelanggan.setText(nama);
            txtjenis.setSelectedItem(jenis);
            txtharga.setText(harga);
            txtberat.setText(berat);
            txttotal.setText(total);
            txtbayar.setText(bayar);
        }
    }//GEN-LAST:event_jtabelMouseClicked

    private void btnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporanActionPerformed
        // TODO add your handling code here:
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/laundry_user";
        SUser = "root";
        SPass = "";
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
             
             File jrxmlFile = new File("C:\\Users\\USER\\OneDrive\\Dokumen\\NetBeansProjects\\laundry\\src\\laporan\\report1.jrxml");
             JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlFile.getPath());
        
             JasperPrint jp = JasperFillManager.fillReport(jasperReport, null, con);
             JasperViewer viewer = new JasperViewer(jp, false);
             viewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             
             viewer.setSize(800, 600);
             viewer.setVisible(true);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
                
    }//GEN-LAST:event_btnlaporanActionPerformed

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
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new riwayat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnlaporan;
    private javax.swing.JButton btnpesanan;
    private javax.swing.JButton btnriwayat;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton btntransaksi;
    private javax.swing.JButton btnupdate;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabel;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtharga;
    private javax.swing.JComboBox<String> txtjenis;
    private javax.swing.JTextField txtpelanggan;
    private javax.swing.JTextField txtpencarian;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

    void setUser(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resetFrom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void resetform() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     }
