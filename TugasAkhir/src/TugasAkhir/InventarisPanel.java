/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package TugasAkhir;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author salome
 */
public class InventarisPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventarisPanel
     */
    public InventarisPanel(boolean admin) {
        initComponents();
        clearForm();
        loadTableData();
        if(admin == false){
            entribPanel.setVisible(false);
        }
        editbButton.setVisible(false);
        deletebButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        inventarisTable = new javax.swing.JTable();
        entribPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        keadaanComboBox = new javax.swing.JComboBox<>();
        sdanaComboBox = new javax.swing.JComboBox<>();
        jmlbSpinner = new javax.swing.JSpinner();
        nbarangTextField = new javax.swing.JTextField();
        savebButton = new javax.swing.JButton();
        editbButton = new javax.swing.JButton();
        deletebButton = new javax.swing.JButton();
        ebButton = new javax.swing.JButton();
        cbButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1100, 660));
        setPreferredSize(new java.awt.Dimension(1100, 650));
        setLayout(new java.awt.GridLayout(1, 0));

        inventarisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Jumlah", "Keadaan"
            }
        ));
        inventarisTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarisTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventarisTable);

        add(jScrollPane1);

        jLabel1.setText("Nama Barang");

        jLabel2.setText("Jumlah");

        jLabel3.setText("Sumber Dana");

        jLabel4.setText("Keadaan Barang");

        keadaanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Layak Pakai", "Butuh Perbaikan", "Rusak Permanen" }));

        sdanaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "APBN", "Kas UKM", "IMB (sumber dana kurang jelas)" }));

        jmlbSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        savebButton.setText("Simpan");
        savebButton.setMaximumSize(new java.awt.Dimension(166, 24));
        savebButton.setMinimumSize(new java.awt.Dimension(166, 24));
        savebButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebButtonActionPerformed(evt);
            }
        });

        editbButton.setText("Edit");
        editbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbButtonActionPerformed(evt);
            }
        });

        deletebButton.setText("Hapus");
        deletebButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebButtonActionPerformed(evt);
            }
        });

        ebButton.setText("Ekspor Tabel");
        ebButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebButtonActionPerformed(evt);
            }
        });

        cbButton.setText("Clear");
        cbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entribPanelLayout = new javax.swing.GroupLayout(entribPanel);
        entribPanel.setLayout(entribPanelLayout);
        entribPanelLayout.setHorizontalGroup(
            entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entribPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(entribPanelLayout.createSequentialGroup()
                            .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jmlbSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nbarangTextField)
                                .addComponent(sdanaComboBox, 0, 300, Short.MAX_VALUE)
                                .addComponent(keadaanComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(entribPanelLayout.createSequentialGroup()
                            .addComponent(cbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(savebButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(entribPanelLayout.createSequentialGroup()
                                    .addComponent(deletebButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(editbButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))))
                    .addComponent(ebButton))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        entribPanelLayout.setVerticalGroup(
            entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entribPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nbarangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jmlbSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sdanaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(keadaanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(entribPanelLayout.createSequentialGroup()
                        .addComponent(savebButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(entribPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editbButton)
                            .addComponent(deletebButton)))
                    .addComponent(cbButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addComponent(ebButton)
                .addContainerGap())
        );

        add(entribPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void savebButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebButtonActionPerformed
        // TODO add your handling code here:
        try {
            Inventaris invet = new Inventaris();
            invet.setNama(nbarangTextField.getText());
            Integer jml = (Integer) jmlbSpinner.getValue();
            invet.setJumlah(jml);
            invet.setSumber(sdanaComboBox.getSelectedItem().toString());
            invet.setKeadaan(keadaanComboBox.getSelectedItem().toString());
            
            try {
                Database.getInstance().insertBarang(invet);
                clearForm();
                loadTableData();
                JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Gagal Menyimpan");
                ex.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Harap isi form dengan benar");
        }
        
        
        
        
    }//GEN-LAST:event_savebButtonActionPerformed

    private void editbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbButtonActionPerformed
        // TODO add your handling code here:
        int row = inventarisTable.getSelectedRow();
        String id = inventarisTable.getValueAt(row, 0).toString();
        Inventaris invet = new Inventaris();
        
        try {
            invet.setId(id);
            invet.setNama(nbarangTextField.getText());
            Integer jml = (Integer) jmlbSpinner.getValue();
            invet.setJumlah(jml);
            invet.setSumber(sdanaComboBox.getSelectedItem().toString());
            invet.setKeadaan(keadaanComboBox.getSelectedItem().toString());
            Database.getInstance().editBarang(invet, id);
            loadTableData();
            clearForm();
            JOptionPane.showMessageDialog(this, "Sukses Mengubah Data", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mengubah data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editbButtonActionPerformed

    private void deletebButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebButtonActionPerformed
        // TODO add your handling code here:
        int row = inventarisTable.getSelectedRow();
        if (row != -1) {
            String id = inventarisTable.getValueAt(row, 0).toString();
            try {
                Database.getInstance().deleteBarang(id);
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                loadTableData();
                clearForm();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
                }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletebButtonActionPerformed

    private void cbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbButtonActionPerformed
        // TODO add your handling code here:
        clearForm();
        loadTableData();
    }//GEN-LAST:event_cbButtonActionPerformed

    private void inventarisTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarisTableMouseClicked
        // TODO add your handling code here:
        clearForm();
        editbButton.setVisible(true);
        deletebButton.setVisible(true);
        savebButton.setVisible(false);
        PreparedStatement ps;
        ResultSet rs;
        
        int row = inventarisTable.getSelectedRow();
        String sql = "SELECT * FROM inventaris WHERE id = ?";        
        String id = inventarisTable.getValueAt(row, 0).toString();
        if(row!=-1){
            try {
                ps = Config.getConnection().prepareStatement(sql);
                ps.setString(1, id);
                rs = ps.executeQuery();
                if(rs.next()){
                    Inventaris invet = new Inventaris();
                    invet.setId(rs.getString("id"));
                    invet.setNama(rs.getString("nama"));
                    invet.setJumlah(rs.getInt("jumlah"));
                    invet.setSumber(rs.getString("sumber"));
                    invet.setKeadaan(rs.getString("keadaan"));
                    
                    nbarangTextField.setText(invet.getNama());
                    jmlbSpinner.setValue(invet.getJumlah());
                    switch(invet.getSumber()){
                        case "APBN" -> sdanaComboBox.setSelectedIndex(0);
                        case "Kas UKM" -> sdanaComboBox.setSelectedIndex(1);
                        case "IMB (sumber dana kurang jelas)" -> sdanaComboBox.setSelectedIndex(2);
                        default -> sdanaComboBox.setSelectedIndex(0);
                    }
                    switch(invet.getKeadaan()){
                        case "Layak Pakai" -> keadaanComboBox.setSelectedIndex(0);
                        case "Butuh Perbaikan" -> keadaanComboBox.setSelectedIndex(1);
                        case "Rusak Permanen" -> keadaanComboBox.setSelectedIndex(2);
                        default -> keadaanComboBox.setSelectedIndex(0);
                    }
                }
                
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }//GEN-LAST:event_inventarisTableMouseClicked

    private void ebButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebButtonActionPerformed
        // TODO add your handling code here:
        Export exp = new Export();
        try {
            exp.exportBarang("inventaris_XBAR.csv");
            JOptionPane.showMessageDialog(this, "Sukses mengekspor file");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Gagal mengekspor file");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal mengekspor file");
        }
    }//GEN-LAST:event_ebButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbButton;
    private javax.swing.JButton deletebButton;
    private javax.swing.JButton ebButton;
    private javax.swing.JButton editbButton;
    private javax.swing.JPanel entribPanel;
    private javax.swing.JTable inventarisTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jmlbSpinner;
    private javax.swing.JComboBox<String> keadaanComboBox;
    private javax.swing.JTextField nbarangTextField;
    private javax.swing.JButton savebButton;
    private javax.swing.JComboBox<String> sdanaComboBox;
    // End of variables declaration//GEN-END:variables

    private void loadTableData() {
        DefaultTableModel dtm = (DefaultTableModel)
        inventarisTable.getModel();
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        savebButton.setVisible(true);
        deletebButton.setVisible(false);
        editbButton.setVisible(false);
        try {
        //isi tabel
            for(Inventaris invet: Database.getInstance().getListBarang()){
                dtm.addRow(new Object[]{invet.getId(),invet.getNama(),invet.getJumlah(),invet.getKeadaan()});
            
        }
        } catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(this, "Gagal mengambil data", "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        nbarangTextField.setText("");
        jmlbSpinner.setValue(1);
        sdanaComboBox.setSelectedIndex(-1);
        keadaanComboBox.setSelectedIndex(-1);
        
    }
}
