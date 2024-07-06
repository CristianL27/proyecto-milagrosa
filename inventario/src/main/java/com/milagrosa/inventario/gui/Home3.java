
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;

public class Home3 extends javax.swing.JFrame {

    Controladora control;
    Empleados usr;
    public Home3(Controladora control, Empleados usr ) {
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pdvBtn = new javax.swing.JButton();
        regisBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        productBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menú Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(39, 39, 39))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel5)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 380, 440));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Menú Principal");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        pdvBtn.setBackground(new java.awt.Color(0, 153, 153));
        pdvBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        pdvBtn.setForeground(new java.awt.Color(255, 255, 255));
        pdvBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/payment-terminal2.png"))); // NOI18N
        pdvBtn.setText("PUNTO DE VENTA");
        pdvBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pdvBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pdvBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        pdvBtn.setIconTextGap(10);
        pdvBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pdvBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pdvBtnMouseExited(evt);
            }
        });
        pdvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdvBtnActionPerformed(evt);
            }
        });
        jPanel5.add(pdvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 260, 40));

        regisBtn.setBackground(new java.awt.Color(51, 51, 51));
        regisBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        regisBtn.setForeground(new java.awt.Color(153, 153, 153));
        regisBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clipboard2.png"))); // NOI18N
        regisBtn.setText("REGISTRO");
        regisBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        regisBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regisBtn.setEnabled(false);
        regisBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        regisBtn.setIconTextGap(10);
        jPanel5.add(regisBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 260, 40));

        exitBtn.setBackground(new java.awt.Color(0, 153, 153));
        exitBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout2.png"))); // NOI18N
        exitBtn.setText("SALIR");
        exitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        exitBtn.setIconTextGap(10);
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel5.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 260, 40));

        productBtn.setBackground(new java.awt.Color(0, 153, 153));
        productBtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        productBtn.setForeground(new java.awt.Color(255, 255, 255));
        productBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product2.png"))); // NOI18N
        productBtn.setText("PRODUCTOS");
        productBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        productBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        productBtn.setIconTextGap(10);
        productBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productBtnMouseExited(evt);
            }
        });
        productBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productBtnActionPerformed(evt);
            }
        });
        jPanel5.add(productBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 260, 40));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 75, 210, 1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user2.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        userTxt.setEditable(false);
        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setBorder(null);
        jPanel5.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 418, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pdvBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdvBtnMouseEntered
        pdvBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        pdvBtn.setFont(new java.awt.Font("Georgia", 1, 20));
    }//GEN-LAST:event_pdvBtnMouseEntered

    private void pdvBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdvBtnMouseExited
        pdvBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
        pdvBtn.setFont(new java.awt.Font("Georgia", 0, 18));
    }//GEN-LAST:event_pdvBtnMouseExited

    private void pdvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdvBtnActionPerformed
        Punto2 punto = new Punto2(control, usr);
        punto.setVisible(true);
        punto.setLocationRelativeTo(null);
    }//GEN-LAST:event_pdvBtnActionPerformed

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        exitBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        exitBtn.setFont(new java.awt.Font("Georgia", 1, 20));
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        exitBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
        exitBtn.setFont(new java.awt.Font("Georgia", 0, 18));
    }//GEN-LAST:event_exitBtnMouseExited

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void productBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseEntered
        productBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        productBtn.setFont(new java.awt.Font("Georgia", 1, 20));
    }//GEN-LAST:event_productBtnMouseEntered

    private void productBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseExited
        productBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
        productBtn.setFont(new java.awt.Font("Georgia", 0, 18));
    }//GEN-LAST:event_productBtnMouseExited

    private void productBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productBtnActionPerformed
        Products product = new Products(usr, control);
        product.setVisible(true);
        product.setLocationRelativeTo(null);
    }//GEN-LAST:event_productBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.userTxt.setText(usr.getUsuario());
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton pdvBtn;
    private javax.swing.JButton productBtn;
    private javax.swing.JButton regisBtn;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
