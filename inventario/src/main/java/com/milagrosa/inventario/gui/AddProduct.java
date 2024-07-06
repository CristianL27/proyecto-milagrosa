
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;

public class AddProduct extends javax.swing.JFrame {

    Controladora control;
    Empleados usr;
    public AddProduct(Controladora control, Empleados usr) {
        initComponents();
        this.control=control;
        this.usr=usr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        cleanBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        userLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        userLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cantTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Agregar Nuevo Producto");
        setResizable(false);

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product2.png"))); // NOI18N
        titleLabel.setText("Agregar Nuevo Producto");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel14.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        userLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Nombre:");
        jPanel14.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        nameTxt.setBackground(new java.awt.Color(0, 153, 153));
        nameTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(255, 255, 255));
        nameTxt.setText("Nombre del producto");
        nameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nameTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTxtFocusLost(evt);
            }
        });
        jPanel14.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 230, 30));

        passLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Cantidad:");
        jPanel14.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

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
        jPanel14.add(cleanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 110, 40));

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
        jPanel14.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 110, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/package2.png"))); // NOI18N
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/name2.png"))); // NOI18N
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel14.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 285, 1));

        userLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(255, 255, 255));
        userLabel1.setText("Descripción:");
        jPanel14.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/description2.png"))); // NOI18N
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        priceTxt.setBackground(new java.awt.Color(0, 153, 153));
        priceTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        priceTxt.setForeground(new java.awt.Color(255, 255, 255));
        priceTxt.setText("Precio del producto");
        priceTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        priceTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceTxtFocusLost(evt);
            }
        });
        jPanel14.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 230, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/price2.png"))); // NOI18N
        jPanel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        userLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(255, 255, 255));
        userLabel2.setText("Precio:");
        jPanel14.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1-4.png"))); // NOI18N
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cantTxt.setBackground(new java.awt.Color(0, 153, 153));
        cantTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cantTxt.setForeground(new java.awt.Color(255, 255, 255));
        cantTxt.setText("Cantidad del producto");
        cantTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cantTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantTxtFocusLost(evt);
            }
        });
        jPanel14.add(cantTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 30));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descArea.setBackground(new java.awt.Color(0, 153, 153));
        descArea.setColumns(19);
        descArea.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        descArea.setForeground(new java.awt.Color(255, 255, 255));
        descArea.setLineWrap(true);
        descArea.setRows(5);
        descArea.setText("Descipción del producto");
        descArea.setWrapStyleWord(true);
        descArea.setBorder(null);
        descArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descAreaFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(descArea);

        jPanel14.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

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
        jPanel14.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusGained
        if(nameTxt.getText().equals("Nombre del producto")){
            nameTxt.setText("");
        }
    }//GEN-LAST:event_nameTxtFocusGained

    private void nameTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTxtFocusLost
        if(nameTxt.getText().isEmpty()){
            nameTxt.setText("Nombre del producto");
        }
    }//GEN-LAST:event_nameTxtFocusLost

    private void cleanBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseEntered
        cleanBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_cleanBtnMouseEntered

    private void cleanBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBtnMouseExited
        cleanBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_cleanBtnMouseExited

    private void cleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBtnActionPerformed
        nameTxt.setText("Nombre del producto");
        cantTxt.setText("Cantidad del producto");
        priceTxt.setText("Precio del producto");
        descArea.setText("Descipción del producto");
    }//GEN-LAST:event_cleanBtnActionPerformed

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        saveBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_saveBtnMouseEntered

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        saveBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_saveBtnMouseExited

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        String productName = nameTxt.getText();
        Integer productCant = Integer.parseInt(cantTxt.getText());
        Float productPrice = Float.parseFloat(priceTxt.getText());
        String productDesc = descArea.getText();

        control.addProduct(productName, productCant, productPrice, productDesc);
        
        if(usr != null){
            String rol = usr.getRol();
            if(rol.equals("admin")){
              
               Products prod = new Products(usr,control);
               prod.setVisible(true);
               prod.setLocationRelativeTo(null);
                                            
               this.dispose();
            }
            if(rol.equals("encargado")){
              
               Products prod = new Products(usr,control);
               prod.setVisible(true);
               prod.setLocationRelativeTo(null);
                                            
               this.dispose();
            }
            
            if(rol.equals("empleado")){
                
               Products2 prod = new Products2(usr, control);
               prod.setVisible(true);
               prod.setLocationRelativeTo(null);
               
               this.dispose();
            }
            
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void priceTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTxtFocusGained
        if(priceTxt.getText().equals("Precio del producto")){
            priceTxt.setText("");
        }
    }//GEN-LAST:event_priceTxtFocusGained

    private void priceTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTxtFocusLost
        if(priceTxt.getText().isEmpty()){
            priceTxt.setText("Precio del producto");
        }
    }//GEN-LAST:event_priceTxtFocusLost

    private void cantTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantTxtFocusGained
        if(cantTxt.getText().equals("Cantidad del producto")){
            cantTxt.setText("");
        }
    }//GEN-LAST:event_cantTxtFocusGained

    private void cantTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantTxtFocusLost
        if(cantTxt.getText().isEmpty()){
            cantTxt.setText("Cantidad del producto");
        }
    }//GEN-LAST:event_cantTxtFocusLost

    private void descAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descAreaFocusGained
        if(descArea.getText().equals("Descipción del producto")){
            descArea.setText("");
        }
    }//GEN-LAST:event_descAreaFocusGained

    private void descAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descAreaFocusLost
        if(descArea.getText().isEmpty()){
            descArea.setText("Descipción del producto");
        }
    }//GEN-LAST:event_descAreaFocusLost

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        backBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtn.setBackground(new java.awt.Color(0, 153, 153, 255));
    }//GEN-LAST:event_backBtnMouseExited

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        if(usr.getRol().equals("admin") || usr.getRol().equals("encargado")){
            Products product = new Products(usr, control);
            product.setVisible(true);
            product.setLocationRelativeTo(null);
            this.dispose();
        }
        if(usr.getRol().equals("empleado")){
            Products2 product = new Products2(usr, control);
            product.setVisible(true);
            product.setLocationRelativeTo(null);
            this.dispose();
        }
        
    }//GEN-LAST:event_backBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cantTxt;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JTextArea descArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    // End of variables declaration//GEN-END:variables
}
