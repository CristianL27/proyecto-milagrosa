package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;
import com.milagrosa.inventario.logic.Productos;

public class VerProduct extends javax.swing.JFrame {

    Controladora control;
    Empleados usr;
    Integer id_producto;
    Productos product;
    public VerProduct(Controladora control, Empleados usr, Integer id_producto) {
        initComponents();
        this.control=control;
        this.usr=usr;
        this.id_producto=id_producto;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
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
        titleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product2.png"))); // NOI18N
        titleLabel.setText("Producto");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel14.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        userLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("Nombre:");
        jPanel14.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        nameTxt.setEditable(false);
        nameTxt.setBackground(new java.awt.Color(0, 153, 153));
        nameTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(255, 255, 255));
        nameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nameTxt.setFocusable(false);
        jPanel14.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 230, 30));

        passLabel.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Cantidad:");
        jPanel14.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/package2.png"))); // NOI18N
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/name2.png"))); // NOI18N
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel14.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, 1));

        userLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(255, 255, 255));
        userLabel1.setText("Descripción:");
        jPanel14.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/description2.png"))); // NOI18N
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        priceTxt.setEditable(false);
        priceTxt.setBackground(new java.awt.Color(0, 153, 153));
        priceTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        priceTxt.setForeground(new java.awt.Color(255, 255, 255));
        priceTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        priceTxt.setFocusable(false);
        jPanel14.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 230, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/price2.png"))); // NOI18N
        jPanel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        userLabel2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(255, 255, 255));
        userLabel2.setText("Precio:");
        jPanel14.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1-4.png"))); // NOI18N
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cantTxt.setEditable(false);
        cantTxt.setBackground(new java.awt.Color(0, 153, 153));
        cantTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cantTxt.setForeground(new java.awt.Color(255, 255, 255));
        cantTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cantTxt.setFocusable(false);
        jPanel14.add(cantTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 230, 30));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descArea.setEditable(false);
        descArea.setBackground(new java.awt.Color(0, 153, 153));
        descArea.setColumns(19);
        descArea.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        descArea.setForeground(new java.awt.Color(255, 255, 255));
        descArea.setLineWrap(true);
        descArea.setRows(5);
        descArea.setWrapStyleWord(true);
        descArea.setBorder(null);
        descArea.setFocusable(false);
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
        jPanel14.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        product = control.traerProducto(id_producto);
        
        nameTxt.setText(product.getNombre());
        cantTxt.setText(String.valueOf( product.getCantidad()));
        priceTxt.setText(String.valueOf(product.getPrecio()));
        descArea.setText(product.getDescripccion());
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cantTxt;
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
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    // End of variables declaration//GEN-END:variables
}
