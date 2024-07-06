
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;
import com.milagrosa.inventario.logic.Lotes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VerLote extends javax.swing.JFrame {
    Controladora control;
    Empleados usr;
    Lotes lote;
    Integer id_lote;
    
    public VerLote(Controladora control, Empleados usr, Integer id_lote) {
        initComponents();
        this.control = control;
        this.usr = usr;
//        this.lote = lote;
        this.id_lote = id_lote;
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
        backBtn = new javax.swing.JButton();
        loteTxt = new javax.swing.JTextField();
        montoTxt = new javax.swing.JTextField();
        dateTxt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ver registro");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/payment-terminal2.png"))); // NOI18N
        titleLabel.setText("Lote");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel14.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

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
        jPanel14.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, 1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jPanel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        userLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(255, 255, 255));
        userLabel2.setText("Fecha:");
        jPanel14.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1-4.png"))); // NOI18N
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        jPanel14.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 110, 40));

        loteTxt.setEditable(false);
        loteTxt.setBackground(new java.awt.Color(0, 153, 153));
        loteTxt.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        loteTxt.setForeground(new java.awt.Color(255, 255, 255));
        loteTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loteTxt.setFocusable(false);
        jPanel14.add(loteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, 30));

        montoTxt.setEditable(false);
        montoTxt.setBackground(new java.awt.Color(0, 153, 153));
        montoTxt.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        montoTxt.setForeground(new java.awt.Color(255, 255, 255));
        montoTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        montoTxt.setFocusable(false);
        jPanel14.add(montoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 220, 30));

        dateTxt1.setEditable(false);
        dateTxt1.setBackground(new java.awt.Color(0, 153, 153));
        dateTxt1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        dateTxt1.setForeground(new java.awt.Color(255, 255, 255));
        dateTxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dateTxt1.setFocusable(false);
        jPanel14.add(dateTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            Punto2 punto2 = new Punto2(control, usr);
            punto2.setVisible(true);
            punto2.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lote = control.traerLote(id_lote);
        
        loteTxt.setText(String.valueOf(lote.getnLote()));
        montoTxt.setText(String.valueOf(lote.getMonto()));
        dateTxt1.setText(lote.getFecha());
        
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTxt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField loteTxt;
    private javax.swing.JTextField montoTxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel2;
    // End of variables declaration//GEN-END:variables
}
