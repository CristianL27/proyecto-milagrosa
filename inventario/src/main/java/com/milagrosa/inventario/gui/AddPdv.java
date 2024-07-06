
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;
import java.text.SimpleDateFormat;

//import java.sql.Date;

public class AddPdv extends javax.swing.JFrame {

    Controladora control;
    Empleados usr;
    public AddPdv(Controladora control, Empleados usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        userLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cleanBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        montoTxt = new javax.swing.JTextField();
        loteTxt = new javax.swing.JTextField();
        dateTxt1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar Nuevo Lote");
        setResizable(false);

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/payment-terminal2.png"))); // NOI18N
        titleLabel.setText("Agregar Nuevo Lote");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel14.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        userLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("N° de Lote:");
        jPanel14.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        passLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Monto:");
        jPanel14.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gross.png"))); // NOI18N
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/receipt.png"))); // NOI18N
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel14.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 275, 1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jPanel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        userLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(255, 255, 255));
        userLabel2.setText("Fecha:");
        jPanel14.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1-4.png"))); // NOI18N
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        jPanel14.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 110, 40));

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
        jPanel14.add(cleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 110, 40));

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
        jPanel14.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 110, 40));

        montoTxt.setBackground(new java.awt.Color(0, 153, 153));
        montoTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        montoTxt.setForeground(new java.awt.Color(255, 255, 255));
        montoTxt.setText("Ingrese monto total");
        montoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        montoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                montoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                montoTxtFocusLost(evt);
            }
        });
        jPanel14.add(montoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, 30));

        loteTxt.setBackground(new java.awt.Color(0, 153, 153));
        loteTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        loteTxt.setForeground(new java.awt.Color(255, 255, 255));
        loteTxt.setText("Ingrese n° de Lote");
        loteTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loteTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loteTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loteTxtFocusLost(evt);
            }
        });
        jPanel14.add(loteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, 30));

        dateTxt1.setBackground(new java.awt.Color(0, 153, 153));
        dateTxt1.setForeground(new java.awt.Color(255, 255, 255));
        dateTxt1.setDateFormatString("yyyy-MM-dd");
        dateTxt1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel14.add(dateTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        saveBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_saveBtnMouseEntered

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        saveBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_saveBtnMouseExited

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

                Integer lote = Integer.parseInt(loteTxt.getText());
                Float monto = Float.parseFloat(montoTxt.getText());
                SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = dformat.format(dateTxt1.getDate());
        
                control.addLotes(lote, monto, fecha );
        
            if(usr != null){
            String rol = usr.getRol();
            if(rol.equals("admin")){
              
               Punto punto = new Punto(control, usr);
               punto.setVisible(true);
               punto.setLocationRelativeTo(null);
                                            
               this.dispose();
            }
            if(rol.equals("encargado")){
              
               Punto2 punto = new Punto2(control, usr);
               punto.setVisible(true);
               punto.setLocationRelativeTo(null);
                                            
               this.dispose();
            }
            
            if(rol.equals("empleado")){
                
               Punto2 punto = new Punto2(control, usr);
               punto.setVisible(true);
               punto.setLocationRelativeTo(null);
               
               this.dispose();
            }
            
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cleanBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseEntered
        cleanBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_cleanBtnMouseEntered

    private void cleanBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseExited
        cleanBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_cleanBtnMouseExited

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        loteTxt.setText("Ingrese n° de Lote");
        montoTxt.setText("Ingrese monto total");
        dateTxt1.setCalendar(null);
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        backBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_backBtnMouseExited

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        if(usr.getRol().equals("admin") || usr.getRol().equals("encargado")){
            Punto punto = new Punto(control, usr);
            punto.setVisible(true);
            punto.setLocationRelativeTo(null);
            this.dispose();
        }
        if(usr.getRol().equals("empleado")){
            Punto2 punto = new Punto2(control, usr);
            punto.setVisible(true);
            punto.setLocationRelativeTo(null);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void montoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoTxtFocusGained
        if(montoTxt.getText().equals("Ingrese monto total")){
            montoTxt.setText("");
        }
    }//GEN-LAST:event_montoTxtFocusGained

    private void montoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoTxtFocusLost
        if(montoTxt.getText().isEmpty()){
            montoTxt.setText("Ingrese monto total");
        }
    }//GEN-LAST:event_montoTxtFocusLost

    private void loteTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loteTxtFocusGained
        if(loteTxt.getText().equals("Ingrese n° de Lote")){
            loteTxt.setText("");
        }
    }//GEN-LAST:event_loteTxtFocusGained

    private void loteTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loteTxtFocusLost
        if(loteTxt.getText().isEmpty()){
            loteTxt.setText("Ingrese n° de Lote");
        }
    }//GEN-LAST:event_loteTxtFocusLost

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cleanBtn;
    private com.toedter.calendar.JDateChooser dateTxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField loteTxt;
    private javax.swing.JTextField montoTxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel2;
    // End of variables declaration//GEN-END:variables
}
