
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Controladora control;
    public Login() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        cleanBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        viewBox = new javax.swing.JCheckBox();
        eyeImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setNextFocusableComponent(loginBtn);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 380, 430));

        titleLabel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Inicio de Sesión");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        userLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Usuario:");
        jPanel1.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setText("Ingrese su usuario");
        userTxt.setBorder(null);
        userTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userTxtFocusLost(evt);
            }
        });
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 270, 30));

        passLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Contraseña:");
        jPanel1.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 300, 1));

        passTxt.setBackground(new java.awt.Color(0, 153, 153));
        passTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        passTxt.setForeground(new java.awt.Color(255, 255, 255));
        passTxt.setText("contraseña");
        passTxt.setBorder(null);
        passTxt.setEchoChar('*');
        passTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passTxtFocusLost(evt);
            }
        });
        jPanel1.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 220, 30));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 300, 1));

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
        jPanel1.add(cleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 110, 40));

        loginBtn.setBackground(new java.awt.Color(0, 153, 153));
        loginBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login2.png"))); // NOI18N
        loginBtn.setText("Ingresar");
        loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 110, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/key2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 253, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 187, 1));

        viewBox.setBackground(new java.awt.Color(0, 153, 153));
        viewBox.setBorder(null);
        viewBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBoxActionPerformed(evt);
            }
        });
        jPanel1.add(viewBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 255, -1, -1));

        eyeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        jPanel1.add(eyeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusGained
        if(userTxt.getText().equals("Ingrese su usuario")){
            userTxt.setText("");
        }

    }//GEN-LAST:event_userTxtFocusGained

    private void userTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userTxtFocusLost
        if(userTxt.getText().isEmpty()){
            userTxt.setText("Ingrese su usuario");
        }
    }//GEN-LAST:event_userTxtFocusLost

    private void passTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusGained
        if(String.valueOf(passTxt.getPassword()).equals("contraseña")){
            passTxt.setText("");
        }

    }//GEN-LAST:event_passTxtFocusGained

    private void passTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passTxtFocusLost
        if(String.valueOf(passTxt.getPassword()).isEmpty()){
            passTxt.setText("contraseña");
        }
    }//GEN-LAST:event_passTxtFocusLost

    private void cleanBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseEntered

        cleanBtn.setBackground(new java.awt.Color(0, 102, 102, 255));

    }//GEN-LAST:event_cleanBtnMouseEntered

    private void cleanBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseExited
        cleanBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_cleanBtnMouseExited

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        userTxt.setText("Ingrese su usuario");
        passTxt.setText("contraseña");
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        String usuario = userTxt.getText();
        String contrasena = passTxt.getText();
        
       Empleados usr = control.validarUsuario(usuario, contrasena);
        
        if(usr != null){
            String rol = usr.getRol();
            if(rol.equals("admin")){
              
               Home home = new Home(control, usr);
               home.setVisible(true);
               home.setLocationRelativeTo(null);
                                            
               this.dispose();
            }
            if(rol.equals("encargado")){
              
               Home3 home = new Home3(control, usr);
               home.setVisible(true);
               home.setLocationRelativeTo(null);
                                            
               this.dispose();
            }
            
            if(rol.equals("empleado")){
                
               Home2 home = new Home2(control, usr);
               home.setVisible(true);
               home.setLocationRelativeTo(null);
               
               this.dispose();
            }
            
        }else{
            JOptionPane optionPane = new JOptionPane("Contraseña o Usuario Incorrectos");
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error en Inicio de Sesión");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            
            userTxt.setText("Ingrese su usuario");
            passTxt.setText("contraseña");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void viewBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBoxActionPerformed
        if (viewBox.isSelected()){
            passTxt.setEchoChar((char)0);
            eyeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png")));
        }else{
            passTxt.setEchoChar('*');
            eyeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png")));
        }
    }//GEN-LAST:event_viewBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanBtn;
    private javax.swing.JLabel eyeImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxt;
    private javax.swing.JCheckBox viewBox;
    // End of variables declaration//GEN-END:variables
}
