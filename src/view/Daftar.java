/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author verdy
 */
public class Daftar extends javax.swing.JPanel {

    /**
     * Creates new form Daftar
     */
    public Daftar() {
        initComponents();
    }

    public JButton Daftar() {
        return btnDaftar;
    }

    public String getNama() {
        return tfNamaReg.getText();
    }

    public String getPassword() {
        return tfPwdReg.getText();
    }

    public String getEmail() {
        return tfEmailReg.getText();
    }

    public int getLevel() {
        int level = 0;
        if (rbPengusaha.isSelected()) {
            level = 2;
        } else if (rbPetani.isSelected()) {
            level = 1;
        }
        return level;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNamaReg = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfEmailReg = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        tfPwdReg = new javax.swing.JPasswordField();
        rbPetani = new javax.swing.JRadioButton();
        rbPengusaha = new javax.swing.JRadioButton();
        btnDaftar = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        regPanel.setBackground(new java.awt.Color(32, 69, 78));
        regPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Google Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pendaftaran");
        regPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, 30));

        jLabel7.setFont(new java.awt.Font("Google Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");
        regPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8-customer-96-white.png"))); // NOI18N
        regPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 20, 20));

        tfNamaReg.setBackground(new java.awt.Color(32, 69, 78));
        tfNamaReg.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        tfNamaReg.setForeground(new java.awt.Color(255, 255, 255));
        tfNamaReg.setText("Masukkan Nama");
        tfNamaReg.setBorder(null);
        tfNamaReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfNamaReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNamaRegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNamaRegFocusLost(evt);
            }
        });
        tfNamaReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaRegActionPerformed(evt);
            }
        });
        regPanel.add(tfNamaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 300, -1));
        regPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 350, 10));

        jLabel9.setFont(new java.awt.Font("Google Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        regPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 90, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_email_48px.png"))); // NOI18N
        regPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 20, 20));

        tfEmailReg.setBackground(new java.awt.Color(32, 69, 78));
        tfEmailReg.setFont(new java.awt.Font("Google Sans", 0, 15)); // NOI18N
        tfEmailReg.setForeground(new java.awt.Color(255, 255, 255));
        tfEmailReg.setText("masukkan email");
        tfEmailReg.setBorder(null);
        tfEmailReg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfEmailReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfEmailRegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfEmailRegFocusLost(evt);
            }
        });
        tfEmailReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailRegActionPerformed(evt);
            }
        });
        regPanel.add(tfEmailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 300, -1));
        regPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 10));

        jLabel15.setFont(new java.awt.Font("Google Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Password");
        regPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 90, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8_unlock_2_filled_50px.png"))); // NOI18N
        regPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 20, 20));
        regPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 350, 10));

        tfPwdReg.setBackground(new java.awt.Color(32, 69, 78));
        tfPwdReg.setFont(new java.awt.Font("Google Sans", 0, 10)); // NOI18N
        tfPwdReg.setForeground(new java.awt.Color(255, 255, 255));
        tfPwdReg.setText("password");
        tfPwdReg.setBorder(null);
        tfPwdReg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPwdRegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPwdRegFocusLost(evt);
            }
        });
        regPanel.add(tfPwdReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 300, 20));

        rbPetani.setText("jRadioButton1");
        rbPetani.setToolTipText("Pilih status menjadi Petani");
        rbPetani.setContentAreaFilled(false);
        rbPetani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rbPetaniKebun.png"))); // NOI18N
        rbPetani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPetaniActionPerformed(evt);
            }
        });
        regPanel.add(rbPetani, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, 30));

        rbPengusaha.setText("jRadioButton1");
        rbPengusaha.setToolTipText("Pilih status menjadi Pengusaha");
        rbPengusaha.setContentAreaFilled(false);
        rbPengusaha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rbPengusaha.png"))); // NOI18N
        rbPengusaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPengusahaActionPerformed(evt);
            }
        });
        regPanel.add(rbPengusaha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 110, 30));

        btnDaftar.setBackground(new java.awt.Color(32, 69, 78));
        btnDaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Daftar.png"))); // NOI18N
        btnDaftar.setBorderPainted(false);
        btnDaftar.setContentAreaFilled(false);
        btnDaftar.setFocusPainted(false);
        btnDaftar.setIconTextGap(0);
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        regPanel.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 220, 40));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/icons8-multiply-26-white.png"))); // NOI18N
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        regPanel.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password minimal 6 dan maksimal 16 karakter");
        regPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(regPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaRegActionPerformed

    private void tfEmailRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailRegActionPerformed

    private void rbPetaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPetaniActionPerformed
        // TODO add your handling code here:
        rbPetani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rbPetaniClicked.png")));
        rbPengusaha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rbPengusaha.png")));
    }//GEN-LAST:event_rbPetaniActionPerformed

    private void rbPengusahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPengusahaActionPerformed
        // TODO add your handling code here:
        rbPetani.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rbPetaniKebun.png")));
        rbPengusaha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rbPengusahaClicked.png")));
    }//GEN-LAST:event_rbPengusahaActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tfNamaRegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNamaRegFocusGained
        if (tfNamaReg.getText().trim().toLowerCase().equals("masukkan nama")) {
            tfNamaReg.setText("");
            tfNamaReg.setForeground(Color.YELLOW);
        }
    }//GEN-LAST:event_tfNamaRegFocusGained

    private void tfNamaRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNamaRegFocusLost
        if (tfNamaReg.getText().trim().equals("") || tfNamaReg.getText().trim().toLowerCase().equals("masukkan nama")) {
            tfNamaReg.setText("masukkan nama");
            tfNamaReg.setForeground(new Color(236, 240, 241));
        }
    }//GEN-LAST:event_tfNamaRegFocusLost

    private void tfEmailRegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailRegFocusGained
        if (tfEmailReg.getText().trim().toLowerCase().equals("masukkan email")) {
            tfEmailReg.setText("");
            tfEmailReg.setForeground(Color.YELLOW);
        }
    }//GEN-LAST:event_tfEmailRegFocusGained

    private void tfEmailRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfEmailRegFocusLost
        if (tfEmailReg.getText().trim().equals("") || tfEmailReg.getText().trim().toLowerCase().equals("masukkan email")) {
            tfEmailReg.setText("masukkan email");
            tfEmailReg.setForeground(new Color(236, 240, 241));
        }
    }//GEN-LAST:event_tfEmailRegFocusLost

    private void tfPwdRegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPwdRegFocusGained
        if (tfPwdReg.getText().trim().toLowerCase().equals("password")) {
            tfPwdReg.setText("");
            tfPwdReg.setForeground(Color.YELLOW);
        }
    }//GEN-LAST:event_tfPwdRegFocusGained

    private void tfPwdRegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPwdRegFocusLost
        if (tfPwdReg.getText().trim().equals("") || tfEmailReg.getText().trim().toLowerCase().equals("password")) {
            tfPwdReg.setText("password");
            tfPwdReg.setForeground(new Color(236, 240, 241));
        }
    }//GEN-LAST:event_tfPwdRegFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JRadioButton rbPengusaha;
    private javax.swing.JRadioButton rbPetani;
    private javax.swing.JPanel regPanel;
    private javax.swing.JTextField tfEmailReg;
    private javax.swing.JTextField tfNamaReg;
    private javax.swing.JPasswordField tfPwdReg;
    // End of variables declaration//GEN-END:variables
}