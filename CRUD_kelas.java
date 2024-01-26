
package view;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.DefaultComboBoxModel;
import config.KoneksiDB;
/**
 * @author ILHAM NA
 */
public class CRUD_kelas extends javax.swing.JFrame {
 
    public CRUD_kelas() {
        initComponents();
        tabelKelas();
        txtkelas.setEnabled(false);
        txtkelas.setText("Auto Fill");
        BtnUpdate.setEnabled(false);
    }
    

    Statement st;
    Connection con = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultComboBoxModel modelc;
    DefaultTableModel model;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtnmkelas = new javax.swing.JTextField();
        txtkelas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbJurusan = new javax.swing.JComboBox<>();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbkelas = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KELOLA DATA KELAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtnmkelas.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        txtnmkelas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        txtkelas.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        txtkelas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkelasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("ID Kelas");

        jLabel2.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("Nama Kelas");

        jLabel7.setFont(new java.awt.Font("Open Sans ExtraBold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Tingkat");

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "SD", "SMP", "SMA" }));

        BtnSimpan.setBackground(new java.awt.Color(0, 0, 153));
        BtnSimpan.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(0, 204, 51));
        BtnUpdate.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        BtnUpdate.setText("Ubah");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnHapus.setBackground(new java.awt.Color(255, 0, 51));
        BtnHapus.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnmkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnmkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        cari.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        cari.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel1.setText("Cari Kelas");

        tbkelas.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        tbkelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbkelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbkelasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbkelas);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 153));
        btnBack.setText("KEMBALI");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(cari))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBack)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        tabelKelas();
    }//GEN-LAST:event_cariKeyPressed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        tabelKelas();
    }//GEN-LAST:event_cariKeyReleased

    private void tbkelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbkelasMouseClicked

         int i = tbkelas.getSelectedRow();
        txtkelas.setText(model.getValueAt(i, 0).toString());
        txtnmkelas.setText(model.getValueAt(i, 1).toString());
        cbJurusan.setSelectedItem(model.getValueAt(i, 2));

        //disabled item on klik row table
        BtnSimpan.setEnabled(false);
        txtkelas.setEnabled(false);
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_tbkelasMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuUtama dsb = new MenuUtama();
        dsb.dashAdmin();
        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dsb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        String nama = txtnmkelas.getText();
        String kompetensi = cbJurusan.getSelectedItem().toString();

        try{
            con.createStatement().executeUpdate("insert into kelas value (null, '"+nama+"','"+kompetensi+"')");
            JOptionPane.showMessageDialog(null, "Kelas baru berhasil ditambahkan!");
            resetForm();
        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!");
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        try {
            String nama = txtnmkelas.getText();
            String kompetensi = cbJurusan.getSelectedItem().toString();

            con.createStatement().executeUpdate("update kelas set nama_kelas="
                    + "'"+nama+"', kompetensi_keahlian='"+kompetensi+
                    "' where id_kelas='"+model.getValueAt(tbkelas.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        }catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Data Gagal Di Edit");
        }
        resetForm();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        try {
            con.createStatement().executeUpdate("delete from kelas where id_kelas ="
                    + "'"+model.getValueAt(tbkelas.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(null, "berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        resetForm();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void txtkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkelasActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_kelas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbkelas;
    private javax.swing.JTextField txtkelas;
    private javax.swing.JTextField txtnmkelas;
    // End of variables declaration//GEN-END:variables
 private void tabelKelas() {
        String[] judul = {"ID","Nama Kelas","Tingkat"};
        model = new DefaultTableModel(judul,0);
        tbkelas.setModel(model);
        String sql = "SELECT * FROM kelas where nama_kelas like '%"+cari.getText()+"%' or kompetensi_keahlian like '%"+cari.getText()+"%'";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String id = rs.getString("id_kelas");
               String nama = rs.getString("nama_kelas");
               String jurusan = rs.getString("kompetensi_keahlian");
               
                
               String[] data = {id,nama,jurusan};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }

    public void resetForm(){
        txtkelas.setText("");
        txtnmkelas.setText("");
        cbJurusan.setSelectedItem("");   
        tabelKelas();
        
        BtnSimpan.setEnabled(true);
        txtkelas.setEnabled(false);
        txtkelas.setText("Auto Fill");
    }
}
