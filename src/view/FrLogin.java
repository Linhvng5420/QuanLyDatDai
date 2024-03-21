/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import control.UserControl;
import java.awt.event.KeyEvent;

/**
 *
 * @author NGUYỄN VĂN LINH 22211TT0127
 */
public class FrLogin extends javax.swing.JFrame {

    // #1
    UserControl user = new UserControl();

    public FrLogin() {
        initComponents();
        //
        jtextfieldID.setText("");
        jTextFieldPASS.setText("");
        //
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonSUBMIT = new javax.swing.JButton();
        jtextfieldID = new javax.swing.JTextField();
        jButtonSUBMIT1 = new javax.swing.JButton();
        jTextFieldPASS = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PASSWORD");

        jButtonSUBMIT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonSUBMIT.setForeground(new java.awt.Color(0, 204, 51));
        jButtonSUBMIT.setText("SUBMIT");
        jButtonSUBMIT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSUBMIT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUBMITActionPerformed(evt);
            }
        });

        jButtonSUBMIT1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonSUBMIT1.setForeground(new java.awt.Color(255, 51, 51));
        jButtonSUBMIT1.setText("SIGN UP");
        jButtonSUBMIT1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSUBMIT1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSUBMIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUBMIT1ActionPerformed(evt);
            }
        });

        jTextFieldPASS.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jtextfieldID)
                            .addComponent(jTextFieldPASS)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButtonSUBMIT, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSUBMIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextfieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jTextFieldPASS))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSUBMIT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSUBMIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // #2
    private void jButtonSUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUBMITActionPerformed
        //Yêu Cầu Nhập Đầy Đủ Thông Tin
        if ("".equals(jtextfieldID.getText()) || "".equals(jTextFieldPASS.getText())) {
            JOptionPane.showConfirmDialog(this, "Yêu Cầu Nhập Đầy Đủ Thông Tin.!", "", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            return;
        }

        //LOGIN
        int id = Integer.parseInt(jtextfieldID.getText());
        String pass = jTextFieldPASS.getText();

        if (user.login(id, pass) == true) {
            this.setVisible(false);
            new FrHome().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showConfirmDialog(this, "Tài khoản hoặc mật khẩu sai!", "Error", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSUBMITActionPerformed

    private void jButtonSUBMIT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUBMIT1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new FrSignUp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSUBMIT1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSUBMIT;
    private javax.swing.JButton jButtonSUBMIT1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jTextFieldPASS;
    private javax.swing.JTextField jtextfieldID;
    // End of variables declaration//GEN-END:variables
}
