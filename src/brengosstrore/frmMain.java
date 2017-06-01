/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brengosstrore;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmMain extends javax.swing.JFrame {
    private String id_barang = "";

    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btMn1 = new javax.swing.JButton();
        btMn2 = new javax.swing.JButton();
        pnlMasuk = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tbTipe = new javax.swing.JTextField();
        tbMerk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbWarna = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tbHarga = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMasuk = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btJual = new javax.swing.JButton();
        lblBarang = new javax.swing.JLabel();
        pnlJual = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbJual = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Brengos Store");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(21, 101, 192));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BRENGOS STORE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 0, 530, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 60);

        jPanel2.setBackground(new java.awt.Color(25, 118, 210));
        jPanel2.setLayout(null);

        btMn1.setText("Barang Masuk");
        btMn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btMn1);
        btMn1.setBounds(130, 10, 143, 32);

        btMn2.setText("Terjual");
        btMn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btMn2);
        btMn2.setBounds(280, 10, 143, 32);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 560, 50);

        pnlMasuk.setBackground(new java.awt.Color(227, 242, 253));
        pnlMasuk.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(25, 118, 210));
        jPanel4.setLayout(null);

        jLabel2.setText("Tipe");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 60, 100, 16);
        jPanel4.add(tbTipe);
        tbTipe.setBounds(10, 80, 140, 24);
        jPanel4.add(tbMerk);
        tbMerk.setBounds(10, 30, 140, 24);

        jLabel3.setText("Merk");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 10, 110, 16);

        jLabel4.setText("Warna");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 110, 100, 16);
        jPanel4.add(tbWarna);
        tbWarna.setBounds(10, 130, 140, 24);

        jLabel5.setText("Harga");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 160, 100, 16);
        jPanel4.add(tbHarga);
        tbHarga.setBounds(10, 180, 140, 24);

        btSubmit.setText("Masukin");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel4.add(btSubmit);
        btSubmit.setBounds(10, 290, 140, 32);

        pnlMasuk.add(jPanel4);
        jPanel4.setBounds(10, 10, 160, 330);

        tbMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Merk", "Tipe", "Harga", "Tanggal Masuk"
            }
        ));
        tbMasuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMasukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMasuk);

        pnlMasuk.add(jScrollPane1);
        jScrollPane1.setBounds(180, 10, 370, 270);

        jPanel6.setBackground(new java.awt.Color(25, 118, 210));
        jPanel6.setLayout(null);

        btJual.setText("Terjual");
        btJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJualActionPerformed(evt);
            }
        });
        jPanel6.add(btJual);
        btJual.setBounds(290, 10, 69, 32);

        lblBarang.setText("Silahkan pilih barang");
        jPanel6.add(lblBarang);
        lblBarang.setBounds(10, 10, 200, 30);

        pnlMasuk.add(jPanel6);
        jPanel6.setBounds(180, 290, 370, 50);

        getContentPane().add(pnlMasuk);
        pnlMasuk.setBounds(0, 110, 560, 350);

        pnlJual.setBackground(new java.awt.Color(227, 242, 253));
        pnlJual.setLayout(null);

        tbJual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Merk", "Tipe", "Harga", "Tanggal Masuk"
            }
        ));
        jScrollPane2.setViewportView(tbJual);

        pnlJual.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 540, 330);

        getContentPane().add(pnlJual);
        pnlJual.setBounds(0, 110, 560, 350);

        setSize(new java.awt.Dimension(576, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMn1ActionPerformed
        // TODO add your handling code here:
        asek();
        pnlMasuk.setVisible(true);
        pnlJual.setVisible(false);
    }//GEN-LAST:event_btMn1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        asek();
        pnlMasuk.setVisible(true);
        pnlJual.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btMn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMn2ActionPerformed
        // TODO add your handling code here:
        dasm();
        pnlMasuk.setVisible(false);
        pnlJual.setVisible(true);
    }//GEN-LAST:event_btMn2ActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        // TODO add your handling code here:

        Date date = new Date();
        String tanggal = new SimpleDateFormat("yyyy-MM-dd").format(date);

        String SQL = "INSERT INTO barang (id,tipe,merk,warna,harga,tgl_masuk,tgl_keluar) "
        + "VALUES(NULL,'"+tbTipe.getText()+"','"+tbMerk.getText()+"',"
        + "'"+tbWarna.getText()+"','"+tbHarga.getText()+"','"+tanggal+"',NULL)";
        System.out.println(SQL);
        int status = DBConn.execute(SQL);
        if(status == 1){
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            tbTipe.setText("");
            tbMerk.setText("");
            tbWarna.setText("");
            tbHarga.setText("");

            asek();
        }else{
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJualActionPerformed
        // TODO add your handling code here:
        if(lblBarang.getText() == "Silahkan pilih barang"){
            JOptionPane.showMessageDialog(this, "Anda belum meilih barang", "Perngatan", JOptionPane.WARNING_MESSAGE);
        }else{
            Date date = new Date();
            String tgl = new SimpleDateFormat("yyyy-MM-dd").format(date);
            
            String SQL = "UPDATE barang SET tgl_keluar='"+tgl+"' WHERE id="+id_barang;
            int status = DBConn.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan","Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal disimpan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }

            asek();
        }
    }//GEN-LAST:event_btJualActionPerformed

    private void tbMasukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMasukMouseClicked
        // TODO add your handling code here:
        int baris = tbMasuk.getSelectedRow();
        if(baris != -1){
            String hm = tbMasuk.getValueAt(baris,0).toString() + ". " + tbMasuk.getValueAt(baris,1).toString();
            lblBarang.setText(hm);
        }   
        String hm = tbMasuk.getValueAt(baris,1).toString()
                + " " + tbMasuk.getValueAt(baris,2).toString() + " " + tbMasuk.getValueAt(baris,3).toString();
        lblBarang.setText(hm);
        id_barang = tbMasuk.getValueAt(baris,0).toString();
    }//GEN-LAST:event_tbMasukMouseClicked
    
    private void asek() {
       String kolom[] = {"No","Merk","Tipe","Warna","Harga","Tgl Masuk"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT id,merk,tipe,warna,harga,tgl_masuk FROM barang WHERE tgl_keluar IS NULL";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String id = rs.getString(1);
               String merk = rs.getString(2);
               String tipe = rs.getString(3);
               String warna = rs.getString(4);
               String harga = rs.getString(5);
               String tgl_masuk = rs.getString(6);
               String data [] = {id,merk,tipe,warna,harga,tgl_masuk};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       tbMasuk.setModel(dtm);
    }
    
    private void dasm(){
        String kolom[] = {"No","Merk","Tipe","Warna","Harga","Tgl Masuk","Tgl Keluar"};
       DefaultTableModel dtm = new DefaultTableModel(null, kolom);
       String SQL = "SELECT id,merk,tipe,warna,harga,tgl_masuk,tgl_keluar FROM barang WHERE tgl_keluar IS NOT NULL";
       ResultSet rs = DBConn.executeQuery(SQL);
       try{
           while(rs.next()){
               String id = rs.getString(1);
               String merk = rs.getString(2);
               String tipe = rs.getString(3);
               String warna = rs.getString(4);
               String harga = rs.getString(5);
               String tgl_masuk = rs.getString(6);
               String tgl_keluar = rs.getString(7);
               String data [] = {id,merk,tipe,warna,harga,tgl_masuk,tgl_keluar};
               dtm.addRow(data);
           }   
        }catch(SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       tbJual.setModel(dtm);
    }
    
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJual;
    private javax.swing.JButton btMn1;
    private javax.swing.JButton btMn2;
    private javax.swing.JButton btSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBarang;
    private javax.swing.JPanel pnlJual;
    private javax.swing.JPanel pnlMasuk;
    private javax.swing.JTextField tbHarga;
    private javax.swing.JTable tbJual;
    private javax.swing.JTable tbMasuk;
    private javax.swing.JTextField tbMerk;
    private javax.swing.JTextField tbTipe;
    private javax.swing.JTextField tbWarna;
    // End of variables declaration//GEN-END:variables

}
