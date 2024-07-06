
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;

public class EditUser extends javax.swing.JFrame {
    
    Controladora control;
    Empleados usr;
    String id_usuario;
    public EditUser(Controladora control, Empleados usr, String id_usuario ) {
        initComponents();
        this.control=control;
        this.usr=usr;
        this.id_usuario = id_usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        cleanBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        userLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rolCombo = new javax.swing.JComboBox<>();
        mailTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        userLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        viewBox = new javax.swing.JCheckBox();
        eyeImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Editar Usuario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(0, 153, 153));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document2.png"))); // NOI18N
        titleLabel.setText("Editar Usuario");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        userLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Usuario:");
        jPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setText("Ingrese su usuario");
        userTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        userTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userTxtFocusLost(evt);
            }
        });
        jPanel.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 30));

        passLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Contraseña:");
        jPanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        passTxt.setBackground(new java.awt.Color(0, 153, 153));
        passTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        passTxt.setForeground(new java.awt.Color(255, 255, 255));
        passTxt.setText("Ingrese su contraseña");
        passTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passTxt.setEchoChar('*');
        passTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTxtFocusLost(evt);
            }
        });
        jPanel.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 220, 30));

        cleanBtn.setBackground(new java.awt.Color(0, 153, 153));
        cleanBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cleanBtn.setForeground(new java.awt.Color(255, 255, 255));
        cleanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/broom2.png"))); // NOI18N
        cleanBtn.setText("Limpiar");
        cleanBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cleanBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cleanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cleanBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cleanBtnMouseExited(evt);
            }
        });
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBtnActionPerformed(evt);
            }
        });
        jPanel.add(cleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 110, 40));

        saveBtn.setBackground(new java.awt.Color(0, 153, 153));
        saveBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save2.png"))); // NOI18N
        saveBtn.setText("Guardar");
        saveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveBtnMouseExited(evt);
            }
        });
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 110, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/key2.png"))); // NOI18N
        jPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user2.png"))); // NOI18N
        jPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 210, 1));

        userLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(255, 255, 255));
        userLabel1.setText("Rol:");
        jPanel.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rol2.png"))); // NOI18N
        jPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 40, -1));

        rolCombo.setBackground(new java.awt.Color(0, 153, 153));
        rolCombo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        rolCombo.setForeground(new java.awt.Color(255, 255, 255));
        rolCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "admin", "empleado" }));
        rolCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        rolCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel.add(rolCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 110, -1));

        mailTxt.setBackground(new java.awt.Color(0, 153, 153));
        mailTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        mailTxt.setForeground(new java.awt.Color(255, 255, 255));
        mailTxt.setText("Ingrese su correo");
        mailTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailTxtFocusLost(evt);
            }
        });
        jPanel.add(mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mail2.png"))); // NOI18N
        jPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        userLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(255, 255, 255));
        userLabel2.setText("Correo:");
        jPanel.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1-4.png"))); // NOI18N
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back2.png"))); // NOI18N
        backBtn.setText("Volver");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 110, 40));

        viewBox.setBackground(new java.awt.Color(0, 153, 153));
        viewBox.setBorder(null);
        viewBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBoxActionPerformed(evt);
            }
        });
        jPanel.add(viewBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 216, -1, -1));

        eyeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jPanel.add(eyeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 212, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTxtFocusLost
        if(mailTxt.getText().isEmpty()){
            mailTxt.setText("Ingrese su correo");
        }
    }//GEN-LAST:event_mailTxtFocusLost

    private void mailTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailTxtFocusGained
        if(mailTxt.getText().equals("Ingrese su correo")){
            mailTxt.setText("");
        }
    }//GEN-LAST:event_mailTxtFocusGained

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        String userName = userTxt.getText();
        String userPass = passTxt.getText();
        String userMail = mailTxt.getText();
        String userRol = (String) rolCombo.getSelectedItem();
        
        control.crearUsuario(userName, userPass, userMail, userRol);
        
        Usuarios user = new Usuarios(control, usr);
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        saveBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_saveBtnMouseExited

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        saveBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_saveBtnMouseEntered

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        userTxt.setText("Ingrese su usuario");
        passTxt.setText("Ingrese su contraseña");
        mailTxt.setText("Ingrese su correo");
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void cleanBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseExited
        cleanBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_cleanBtnMouseExited

    private void cleanBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseEntered
        cleanBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_cleanBtnMouseEntered

    private void passTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusLost
        if(passTxt.getText().isEmpty()){
            passTxt.setText("Ingrese su contraseña");
        }
    }//GEN-LAST:event_passTxtFocusLost

    private void passTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusGained
        if(passTxt.getText().equals("Ingrese su contraseña")){
            passTxt.setText("");
        }
    }//GEN-LAST:event_passTxtFocusGained

    private void userTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusLost
        if(userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese su usuario");
        }
    }//GEN-LAST:event_userTxtFocusLost

    private void userTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusGained
        if(userTxt.getText().equals("Ingrese su usuario")){
            userTxt.setText("");
        }
    }//GEN-LAST:event_userTxtFocusGained

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        backBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_backBtnMouseExited

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Usuarios user = new Usuarios(control, usr);
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBoxActionPerformed
        if (viewBox.isSelected()){
            passTxt.setEchoChar((char)0);
            eyeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png")));
        }else{
            passTxt.setEchoChar('*');
            eyeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png")));
        }
    }//GEN-LAST:event_viewBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel eyeImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JComboBox<String> rolCombo;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    private javax.swing.JTextField userTxt;
    private javax.swing.JCheckBox viewBox;
    // End of variables declaration//GEN-END:variables
}
