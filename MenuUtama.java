
package view;
import java.io.File;
import javax.swing.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import config.KoneksiDB;
import config.UserSession;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class MenuUtama extends javax.swing.JFrame {

    Connection con = KoneksiDB.getConnection();
    ResultSet rs;
    DefaultTableModel model;
    
    //get user data session
    String id = UserSession.get_id();
    String username = UserSession.get_username();
    String nama = UserSession.get_nama();
    String level = UserSession.get_level();
    String nisn = UserSession.get_nisn();
    String nama_siswa = UserSession.get_nama_siswa();
    
    public MenuUtama() {
        initComponents();
    }
    
//  admin previleges
    public void dashAdmin() { 
        tabelSpp();    
        tabelTrans();
        jumlahDataMaster();
         
    }
    
//  petugas previleges
    public void dashPetugas() {    
        tabelSpp();    
        tabelTrans();
        jumlahDataMaster();
           
        
        //block akses
        mnDataMaster.setVisible(false);
        mnLaporan.setVisible(false);
    }
        //  siswa
    public void dashSiswa() {           
        tabelSpp();    
        tabelTrans();
        jumlahDataMaster();
        
        
        //block akses
        mnDataMaster.setVisible(false);
        mnLaporan.setVisible(false);
        mnPembayaran.setVisible(false);
        btnTransaksi.setVisible(false);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtabelSpp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jml_siswa = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jml_petugas = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jml_kelas = new javax.swing.JLabel();
        cariTransaksi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTransaksi = new javax.swing.JTable();
        btnTransaksi = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnAkun = new javax.swing.JMenu();
        smLogout = new javax.swing.JMenuItem();
        mnDataMaster = new javax.swing.JMenu();
        smData_siswa = new javax.swing.JMenuItem();
        smData_petugas = new javax.swing.JMenuItem();
        smData_kelas = new javax.swing.JMenuItem();
        smData_spp = new javax.swing.JMenuItem();
        mnPembayaran = new javax.swing.JMenu();
        smTambah_trans = new javax.swing.JMenuItem();
        mnLaporan = new javax.swing.JMenu();
        smGenerate_laporan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APLIKASI PEMBAYARAN SPP");

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JtabelSpp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        JtabelSpp.setColumnSelectionAllowed(true);
        JtabelSpp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JtabelSpp.setEnabled(false);
        jScrollPane2.setViewportView(JtabelSpp);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("DATA Tingkatan ");

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SISWA");

        jml_siswa.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jml_siswa.setForeground(new java.awt.Color(255, 255, 255));
        jml_siswa.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jml_siswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jml_siswa)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tata Usaha");

        jml_petugas.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jml_petugas.setForeground(new java.awt.Color(255, 255, 255));
        jml_petugas.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jml_petugas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jml_petugas)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 255));

        jLabel12.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("KELAS");

        jml_kelas.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jml_kelas.setForeground(new java.awt.Color(255, 255, 255));
        jml_kelas.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jml_kelas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jml_kelas)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        cariTransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariTransaksiKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cariTransaksiKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cari Transaksi");

        tableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableTransaksi.setEnabled(false);
        jScrollPane1.setViewportView(tableTransaksi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cariTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cariTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        btnTransaksi.setBackground(new java.awt.Color(255, 255, 255));
        btnTransaksi.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnTransaksi.setForeground(new java.awt.Color(0, 0, 204));
        btnTransaksi.setText("+ TRANSAKSI BARU");
        btnTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mnAkun.setText("Akun");

        smLogout.setText("Logout");
        smLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smLogoutActionPerformed(evt);
            }
        });
        mnAkun.add(smLogout);

        jMenuBar1.add(mnAkun);

        mnDataMaster.setText("Data Master");

        smData_siswa.setText("Data Siswa");
        smData_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_siswaActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_siswa);

        smData_petugas.setText("Data Tata Usaha");
        smData_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_petugasActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_petugas);

        smData_kelas.setText("Data Kelas");
        smData_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_kelasActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_kelas);

        smData_spp.setText("Data SPP");
        smData_spp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smData_sppActionPerformed(evt);
            }
        });
        mnDataMaster.add(smData_spp);

        jMenuBar1.add(mnDataMaster);

        mnPembayaran.setText("Pembayaran");

        smTambah_trans.setText("Tambah Transaksi");
        smTambah_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smTambah_transActionPerformed(evt);
            }
        });
        mnPembayaran.add(smTambah_trans);

        jMenuBar1.add(mnPembayaran);

        mnLaporan.setText("Laporan");

        smGenerate_laporan.setText("Generate Laporan");
        smGenerate_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smGenerate_laporanActionPerformed(evt);
            }
        });
        mnLaporan.add(smGenerate_laporan);

        jMenuBar1.add(mnLaporan);

        setJMenuBar(jMenuBar1);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smLogoutActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_smLogoutActionPerformed

    private void smData_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smData_siswaActionPerformed
        CRUD_siswa view = new CRUD_siswa();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_smData_siswaActionPerformed

    private void smData_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smData_petugasActionPerformed
        CRUD_petugas view = new CRUD_petugas();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_smData_petugasActionPerformed

    private void smData_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smData_kelasActionPerformed
        CRUD_kelas view = new CRUD_kelas();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_smData_kelasActionPerformed

    private void smData_sppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smData_sppActionPerformed
        CRUD_SPP view = new CRUD_SPP();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_smData_sppActionPerformed

    private void smTambah_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smTambah_transActionPerformed
        new FormTransaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_smTambah_transActionPerformed

    private void smGenerate_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smGenerate_laporanActionPerformed
        try {
            KoneksiDB.getConnection();
            try {
                Map<String, Object> parameter = new HashMap<String, Object>();

                File rpt = new File("src/laporan/Lap_Trans.jrxml");
                JasperDesign jasDesign = JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jasReport = JasperCompileManager.compileReport(jasDesign);
                JasperPrint jasPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(jasReport,
                    parameter, KoneksiDB.getConnection());
                JasperViewer.viewReport(jasPrint, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Laporan tidak ditemukan" + e);
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }//GEN-LAST:event_smGenerate_laporanActionPerformed

    private void cariTransaksiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariTransaksiKeyReleased
        tabelTrans();
    }//GEN-LAST:event_cariTransaksiKeyReleased

    private void cariTransaksiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariTransaksiKeyTyped
        tabelTrans();
    }//GEN-LAST:event_cariTransaksiKeyTyped

    private void btnTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiActionPerformed
        new FormTransaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }
     public void tabelTrans() {
        String[] judul = {"Tanggal","No. Transaksi","NISN","Nama Siswa","Bulan Dibayar","Tingkat","Jumlah Bayar","Tata Usaha"};
        model = new DefaultTableModel(judul,0);
        tableTransaksi.setModel(model);
        String sql = "SELECT *,petugas.*, siswa.* from pembayaran INNER JOIN petugas USING(id_petugas) INNER JOIN siswa USING(nisn) where id_pembayaran like '%"+cariTransaksi.getText()+"%' or nisn like '%"+cariTransaksi.getText()+"%' ";
       
        try {
            rs = con.createStatement().executeQuery(sql);
           
            while(rs.next()) {
               String tanggal = rs.getString("tgl_bayar");
               String no_transaksi = rs.getString("id_pembayaran");
               String nisn = rs.getString("nisn");              
               String nama = rs.getString("nama");              
               String bulan = rs.getString("bulan_dibayar");               
               String tahun = rs.getString("tahun_dibayar");
               String jumlah = rs.getString("jumlah_bayar");
               String petugas = rs.getString("nama_petugas");
               
               String[] data = {tanggal,no_transaksi,nisn,nama,bulan,tahun, jumlah,petugas};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }
    
    private void tabelSpp() {
        String[] judul = {"Tingkat","Nominal"};
        model = new DefaultTableModel(judul,0);
        JtabelSpp.setModel(model);
        String sql = "SELECT tahun, nominal from spp";
       
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String tahun = rs.getString("tahun");
               String nominal = rs.getString("nominal");
                
               String[] data = {tahun,nominal};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    }
    
    private void jumlahDataMaster() {                
       try {
           ResultSet rowPetugas = con.createStatement().executeQuery("select * from petugas");
           ResultSet rowKelas = con.createStatement().executeQuery("select * from kelas");
           ResultSet rowSiswa = con.createStatement().executeQuery("select * from siswa");
           rowPetugas.next();
           rowSiswa.next();
           rowKelas.next();
           
           if (rowPetugas.last()) {
              int total=rowPetugas.getRow();
              rowPetugas.beforeFirst();
              jml_petugas.setText(Integer.toString(total));
           }
           
           if(rowSiswa.last()){
              int total=rowSiswa.getRow();
              rowSiswa.beforeFirst();
              jml_siswa.setText(Integer.toString(total));
           }
           
           if(rowKelas.last()){
              int total=rowKelas.getRow();
              rowKelas.beforeFirst();
              jml_kelas.setText(Integer.toString(total));
           }
       } catch (Exception e) {
           System.out.println(e);
       }
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtabelSpp;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JTextField cariTransaksi;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jml_kelas;
    private javax.swing.JLabel jml_petugas;
    private javax.swing.JLabel jml_siswa;
    private javax.swing.JMenu mnAkun;
    private javax.swing.JMenu mnDataMaster;
    private javax.swing.JMenu mnLaporan;
    private javax.swing.JMenu mnPembayaran;
    private javax.swing.JMenuItem smData_kelas;
    private javax.swing.JMenuItem smData_petugas;
    private javax.swing.JMenuItem smData_siswa;
    private javax.swing.JMenuItem smData_spp;
    private javax.swing.JMenuItem smGenerate_laporan;
    private javax.swing.JMenuItem smLogout;
    private javax.swing.JMenuItem smTambah_trans;
    private javax.swing.JTable tableTransaksi;
    // End of variables declaration//GEN-END:variables
}
