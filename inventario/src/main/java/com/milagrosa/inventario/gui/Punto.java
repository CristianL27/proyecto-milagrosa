
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;
import com.milagrosa.inventario.logic.Lotes;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Punto extends javax.swing.JFrame {

    Controladora control;
    Empleados usr;
    public Punto(Controladora control, Empleados usr) {
        initComponents();
        this.usr = usr;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        puntoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        backBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        userTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        verBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Punto de venta");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        puntoTable.setBackground(new java.awt.Color(255, 255, 255));
        puntoTable.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        puntoTable.setForeground(new java.awt.Color(0, 153, 153));
        puntoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        puntoTable.setGridColor(new java.awt.Color(0, 153, 153));
        puntoTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        puntoTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        puntoTable.setShowGrid(true);
        jScrollPane1.setViewportView(puntoTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 620, 250));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Punto de venta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        searchTxt.setBackground(new java.awt.Color(0, 153, 153));
        searchTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        searchTxt.setForeground(new java.awt.Color(255, 255, 255));
        searchTxt.setText("ingrese su búsqueda");
        searchTxt.setBorder(null);
        searchTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTxtFocusLost(evt);
            }
        });
        jPanel1.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 150, 30));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 180, 1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1-4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/payment-terminal2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 25, 30, 30));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 55, 240, 1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        backBtn.setText("Volver");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
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
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 90, 30));

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 0, 0));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        addBtn.setText("Agregar");
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 90, 30));

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editing.png"))); // NOI18N
        editBtn.setText("Editar  ");
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnMouseExited(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 90, 30));

        userTxt.setEditable(false);
        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setBorder(null);
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 418, 150, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        deleteBtn.setText("Borrar");
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBtnBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnBtnMouseExited(evt);
            }
        });
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 90, 30));

        verBtn.setBackground(new java.awt.Color(255, 255, 255));
        verBtn.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        verBtn.setForeground(new java.awt.Color(0, 0, 0));
        verBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/see.png"))); // NOI18N
        verBtn.setText("Ver");
        verBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        verBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        verBtn.setIconTextGap(10);
        verBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verBtnMouseExited(evt);
            }
        });
        verBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verBtnActionPerformed(evt);
            }
        });
        jPanel1.add(verBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTxtFocusGained
        if(searchTxt.getText().equals("ingrese su búsqueda")){
            searchTxt.setText("");
        }
    }//GEN-LAST:event_searchTxtFocusGained

    private void searchTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTxtFocusLost
        if(searchTxt.getText().isEmpty()){
            searchTxt.setText("ingrese su búsqueda");
        }
    }//GEN-LAST:event_searchTxtFocusLost

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered

        backBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back2.png")));
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtn.setBackground(new java.awt.Color(255, 255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png")));
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }//GEN-LAST:event_backBtnMouseExited

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        addBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add2.png")));
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        addBtn.setBackground(new java.awt.Color(255, 255, 255, 255));
        addBtn.setForeground(new java.awt.Color(0, 0, 0));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png")));
        addBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }//GEN-LAST:event_addBtnMouseExited

    private void editBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseEntered
        editBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editing2.png")));
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    }//GEN-LAST:event_editBtnMouseEntered

    private void editBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseExited
        editBtn.setBackground(new java.awt.Color(255, 255, 255, 255));
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editing.png")));
        editBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }//GEN-LAST:event_editBtnMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         this.userTxt.setText(usr.getUsuario());
         
         cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // validar que existan elementos
       if (puntoTable.getRowCount()>0){
           
           //controlar seleccion de fila
           if(puntoTable.getSelectedRow() != -1){
               
               //obtener id de objeto a eliminar
               Integer id_lote = Integer.parseInt( String.valueOf( puntoTable.getValueAt(puntoTable.getSelectedRow(),0))) ;
               
               //llamar ventana editar
               EditPdv editPdv = new EditPdv(control, usr, id_lote);
               editPdv.setVisible(true);
               editPdv.setLocationRelativeTo(null);
               this.dispose();
               
           }
            else {
                mostrarMensaje ("No selecciono ningún registro", "Error", "Error al editar");
            }
           
       }
        else {
            mostrarMensaje ("La tabla está vacía", "Error", "Error al editar");
        }
        
        
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddPdv addPdv = new AddPdv(control, usr);
        addPdv.setVisible(true);
        addPdv.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnBtnMouseEntered
        deleteBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete2.png")));
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    }//GEN-LAST:event_deleteBtnBtnMouseEntered

    private void deleteBtnBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnBtnMouseExited
        deleteBtn.setBackground(new java.awt.Color(255, 255, 255, 255));
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png")));
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }//GEN-LAST:event_deleteBtnBtnMouseExited

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // validar que existan elementos
        if (puntoTable.getRowCount()>0){

            //controlar seleccion de fila
            if(puntoTable.getSelectedRow() != -1){

                //obtener id de objeto a eliminar
                Integer id_lote = Integer.parseInt( String.valueOf( puntoTable.getValueAt(puntoTable.getSelectedRow(),0))) ;

                //llamar metodo borrar
                control.borrarLote(id_lote);

                //avisar todo ok

                mostrarMensaje ("Se borró el lote correctamente", "Info", "Eliminación Correcta");

                cargarTabla();

            }
            else {
                mostrarMensaje ("No selecciono ningún registro", "Error", "Error al borrar");
            }

        }
        else {
            mostrarMensaje ("La tabla está vacía", "Error", "Error al borrar");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void verBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verBtnMouseEntered
        verBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        verBtn.setForeground(new java.awt.Color(255, 255, 255));
        verBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/see2.png")));
        verBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    }//GEN-LAST:event_verBtnMouseEntered

    private void verBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verBtnMouseExited
        verBtn.setBackground(new java.awt.Color(255, 255, 255, 255));
        verBtn.setForeground(new java.awt.Color(0, 0, 0));
        verBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/see.png")));
        verBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }//GEN-LAST:event_verBtnMouseExited

    private void verBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verBtnActionPerformed
        // validar que existan elementos
        if (puntoTable.getRowCount()>0){

            //controlar seleccion de fila
            if(puntoTable.getSelectedRow() != -1){

                //obtener id de objeto a eliminar
                Integer id_producto = Integer.parseInt( String.valueOf( puntoTable.getValueAt(puntoTable.getSelectedRow(),0))) ;

                //llamar ventana visualizar
                VerLote verLote = new VerLote(control, usr, id_producto);
                verLote.setVisible(true);
                verLote.setLocationRelativeTo(null);
                this.dispose();

            }
            else {
                mostrarMensaje ("No selecciono ningún registro", "Error", "Error al visualizar");
            }

        }
        else {
            mostrarMensaje ("La tabla está vacía", "Error", "Error al visualizar");
        }
    }//GEN-LAST:event_verBtnActionPerformed

    public void mostrarMensaje (String mensaje, String tipo, String titulo) {
       JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
   
   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable puntoTable;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField userTxt;
    private javax.swing.JButton verBtn;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        // definir modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            //que filas y columnas no son editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
            
        };
        
        //definimos nombres de columnas
        String titulos[] = {"N° lote","Monto", "Fecha"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer de la bd las filas
        List <Lotes> listaLotes = control.traerLotes();
        
        if(listaLotes != null){
            //recorrer lista
            for(Lotes lot : listaLotes){
                Object[] objeto = {lot.getnLote(), lot.getMonto(), lot.getFecha()};
                
                modeloTabla.addRow(objeto);
            }
        }
        
        puntoTable.setModel(modeloTabla);
    }
}
