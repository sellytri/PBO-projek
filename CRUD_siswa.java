
package view;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.DefaultComboBoxModel;
import config.KoneksiDB;
public class CRUD_siswa extends javax.swing.JFrame {
     public CRUD_siswa() {
        initComponents();
        setLocationRelativeTo(this);
        tabelSiswa();
        autofillKELAS();
        autofillTAHUN();
        
        BtnUpdate.setEnabled(false);
    }
    
    int _kelas;    
    int _tahun;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnis = new javax.swing.JTextField();
        txtnisn = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbkelas = new javax.swing.JComboBox<>();
        no_telp = new javax.swing.JTextField();
        cbtahun = new javax.swing.JComboBox<>();
        BtnSimpan = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsiswa = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KELOLA DATA SISWA");

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

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("NIS");

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("NISN");

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("NAMA");

        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("ALAMAT");

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("KELAS");

        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Tingkat");

        jLabel9.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("NO_TELP");

        txtnis.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        txtnis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        txtnisn.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        txtnisn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        txtalamat.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        txtalamat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        txtnama.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        txtnama.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        cbkelas.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        cbkelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~pilih kelas", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII" }));
        cbkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkelasActionPerformed(evt);
            }
        });

        no_telp.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        no_telp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        cbtahun.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        cbtahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tingkat", "SD", "SMP", "SMA" }));
        cbtahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtahunActionPerformed(evt);
            }
        });

        BtnSimpan.setBackground(new java.awt.Color(0, 0, 153));
        BtnSimpan.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        BtnSimpan.setText("Simpan");
        BtnSimpan.setPreferredSize(new java.awt.Dimension(85, 29));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(0, 153, 0));
        BtnUpdate.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        BtnUpdate.setText("Ubah");
        BtnUpdate.setMinimumSize(new java.awt.Dimension(85, 29));
        BtnUpdate.setPreferredSize(new java.awt.Dimension(85, 29));
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnHapus.setBackground(new java.awt.Color(204, 0, 0));
        BtnHapus.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        BtnHapus.setText("Hapus");
        BtnHapus.setMinimumSize(new java.awt.Dimension(85, 29));
        BtnHapus.setPreferredSize(new java.awt.Dimension(85, 29));
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
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnisn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtahun, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnisn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbtahun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
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
        jLabel1.setText("Cari NISN/Nama");

        tbsiswa.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        tbsiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tbsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbsiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbsiswa);

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
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void cbkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkelasActionPerformed
        try {
            String comboboxIsi = cbkelas.getSelectedItem().toString();
            rs = con.createStatement().executeQuery("select * from kelas where nama_kelas='"+comboboxIsi+"'");
            while(rs.next()) {
                _kelas = Integer.parseInt(rs.getString("id_kelas"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cbkelasActionPerformed

    private void cbtahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtahunActionPerformed
        try {
            String comboboxIsi = cbtahun.getSelectedItem().toString();
            rs = con.createStatement().executeQuery("select * from spp where tahun='"+comboboxIsi+"'");
            while(rs.next()) {
                _tahun = Integer.parseInt(rs.getString("id_spp"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_cbtahunActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        String nisn = txtnisn.getText();
        String nis = txtnis.getText();
        String nama = txtnama.getText();
        int kelas =  _kelas;
        String alamat = txtalamat.getText();
        String telp = no_telp.getText();
        int tahun =  _tahun;
        
        
        try{ 
           con.createStatement().executeUpdate("insert into siswa value "
                   + "('"+nisn+"','"+nis+"','"+nama+"','"+kelas+"',"
                   + "'"+alamat+"','"+telp+"','"+tahun+"')");
           JOptionPane.showMessageDialog(null, "Data siswa berhasil ditambahkan");
           resetForm();
        }catch (Exception ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Gagal!"); 
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        try {
            String valueKelas = cbkelas.getSelectedItem().toString();
            String valueTahun = cbtahun.getSelectedItem().toString();

            ResultSet rsKelas = con.createStatement().executeQuery("select id_kelas from kelas where nama_kelas='"+valueKelas+"'");
            ResultSet rsTahun = con.createStatement().executeQuery("select id_spp from spp where tahun='"+valueTahun+"'");

            while(rsKelas.next()) {
                _kelas = Integer.parseInt(rsKelas.getString("id_kelas"));
            }
            while(rsTahun.next()) {
                _tahun = Integer.parseInt(rsTahun.getString("id_spp"));
            }
            String nis = txtnis.getText();
            String nama = txtnama.getText();
            String alamat = txtalamat.getText();
            String telp = no_telp.getText();

            con.createStatement().executeUpdate("update siswa set nis='"+nis+"', nama='"+nama+"',id_kelas='"+_kelas+"', alamat='"+alamat+"', no_telp='"+telp+"', id_spp='"+_tahun+"' where nisn='"+model.getValueAt(tbsiswa.getSelectedRow(),0)+"'");
            JOptionPane.showMessageDialog(this, "Data Berhasil Di Edit");
        }catch (Exception e) {
            System.out.println(e);
        }
        resetForm();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        try {
            con.createStatement().executeUpdate("delete from siswa where nisn ='"+txtnisn.getText()+"'");
            JOptionPane.showMessageDialog(null, "berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal");
        }
        resetForm();
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        tabelSiswa();
    }//GEN-LAST:event_cariKeyPressed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        tabelSiswa();
    }//GEN-LAST:event_cariKeyReleased

    private void tbsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbsiswaMouseClicked

        int i = tbsiswa.getSelectedRow();
        txtnisn.setText(model.getValueAt(i, 0).toString());
        txtnis.setText(model.getValueAt(i, 1).toString());
        txtnama.setText(model.getValueAt(i, 2).toString());
        cbkelas.setSelectedItem(model.getValueAt(i, 3));
        txtalamat.setText(model.getValueAt(i, 4).toString());
        no_telp.setText(model.getValueAt(i, 5).toString());
        cbtahun.setSelectedItem(model.getValueAt(i, 6));

        //       disabled item on klik row table
        txtnis.setEnabled(false);
        BtnSimpan.setEnabled(false);
        BtnUpdate.setEnabled(true);
    }//GEN-LAST:event_tbsiswaMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuUtama dsb = new MenuUtama();
        dsb.dashAdmin();
        dsb.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dsb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_siswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox<String> cbkelas;
    private javax.swing.JComboBox<String> cbtahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField no_telp;
    private javax.swing.JTable tbsiswa;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txtnisn;
    // End of variables declaration//GEN-END:variables

private void tabelSiswa() {
        String[] judul = {"NISN","NIS","Nama","Kelas","Alamat","Telepon","Tingkat"};
        model = new DefaultTableModel(judul,0);
        tbsiswa.setModel(model);
        String sql = "SELECT siswa.*, kelas.nama_kelas, spp.tahun from siswa INNER JOIN kelas USING(id_kelas) INNER JOIN spp Using(id_spp) where nisn like '%"+cari.getText()+"%' or nama like '%"+cari.getText()+"%'";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String nisn = rs.getString("nisn");
               String nis = rs.getString("nis");
               String nama = rs.getString("nama");
               String kelas = rs.getString("nama_kelas");
               String alamat = rs.getString("alamat");
               String telp = rs.getString("no_telp");
               String tahun = rs.getString("tahun");
                
               String[] data = {nisn, nis, nama, kelas, alamat, telp, tahun};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    
    }
    
    private void autofillKELAS() {                
       try {
           rs = con.createStatement().executeQuery("select * from kelas");
           while (rs.next()) {
               cbkelas.addItem(rs.getString("nama_kelas"));
           }         
       } catch (Exception e) {
           System.out.println(e);
       }
    }
    
    private void autofillTAHUN() {                
       try {
           rs = con.createStatement().executeQuery("select * from spp");
           while (rs.next()) {
               cbtahun.addItem(rs.getString("tahun"));
           }         
       } catch (Exception e) {
           System.out.println(e);
       }
    }

    public void resetForm(){
        txtnisn.setText("");
        txtnis.setText("");
        txtnama.setText("");
        cbkelas.setSelectedItem("~pilih kelas");
        txtalamat.setText("");
        no_telp.setText("");
        cbtahun.setSelectedItem("~angkatan tahun");
        
        tabelSiswa();
        BtnSimpan.setEnabled(true);
        txtnisn.setEnabled(true);
    }
}

