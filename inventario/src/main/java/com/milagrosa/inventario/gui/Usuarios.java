
package com.milagrosa.inventario.gui;

import com.milagrosa.inventario.logic.Controladora;
import com.milagrosa.inventario.logic.Empleados;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JFrame {
    Controladora control;
    Empleados usr;
    public Usuarios(Controladora control, Empleados usr) {
        initComponents();
        this.usr = usr;
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usrTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        backBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        userTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usrTable.setBackground(new java.awt.Color(255, 255, 255));
        usrTable.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        usrTable.setForeground(new java.awt.Color(0, 153, 153));
        usrTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        usrTable.setGridColor(new java.awt.Color(0, 153, 153));
        usrTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        usrTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        usrTable.setShowGrid(true);
        jScrollPane1.setViewportView(usrTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 620, 250));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empleados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

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
        jPanel1.add(searchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 150, 30));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 180, 1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/logo1-4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document2.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 30, 30));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 60, 170, 1));

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
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 90, 30));

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
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 90, 30));

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
                deleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBtnMouseExited(evt);
            }
        });
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 90, 30));

        userTxt.setEditable(false);
        userTxt.setBackground(new java.awt.Color(0, 153, 153));
        userTxt.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setBorder(null);
        jPanel1.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 418, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        searchBtn.setBackground(new java.awt.Color(0, 153, 153));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search2.png"))); // NOI18N
        searchBtn.setBorder(null);
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 94, -1, -1));

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

    private void deleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseEntered
        deleteBtn.setBackground(new java.awt.Color(0, 102, 102, 255));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete2.png")));
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
    }//GEN-LAST:event_deleteBtnMouseEntered

    private void deleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseExited
        deleteBtn.setBackground(new java.awt.Color(255, 255, 255, 255));
        deleteBtn.setForeground(new java.awt.Color(0, 0, 0));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png")));
        deleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }//GEN-LAST:event_deleteBtnMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.userTxt.setText(usr.getUsuario());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddUser addUser = new AddUser(control, usr);
        addUser.setVisible(true);
        addUser.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       // validar que existan elementos
       if (usrTable.getRowCount()>0){
           
           //controlar seleccion de fila
           if(usrTable.getSelectedRow() != -1){
               
               //obtener id de objeto a eliminar
               String id_usuario = String.valueOf( usrTable.getValueAt(usrTable.getSelectedRow(),0)) ;
               
               //llamar metodo borrar
               control.borrarUsuario(id_usuario);
               
               //avisar todo ok
               
               mostrarMensaje ("Se borró el usuario correctamente", "Info", "Eliminación Correcta");
               
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

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // validar que existan elementos
       if (usrTable.getRowCount()>0){
           
           //controlar seleccion de fila
           if(usrTable.getSelectedRow() != -1){
               
               //obtener id de objeto a editar
               String id_usuario = String.valueOf( usrTable.getValueAt(usrTable.getSelectedRow(),0)) ;
               
               //llamar ventana de editar
               
                EditUser editUser = new EditUser(control, usr, id_usuario);
                editUser.setVisible(true);
                editUser.setLocationRelativeTo(null);
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

    private void searchTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTxtFocusLost
        if(searchTxt.getText().isEmpty()){
            searchTxt.setText("ingrese su búsqueda");
        }
    }//GEN-LAST:event_searchTxtFocusLost

    private void searchTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTxtFocusGained
         if(searchTxt.getText().equals("ingrese su búsqueda")){
            searchTxt.setText("");
        }
    }//GEN-LAST:event_searchTxtFocusGained

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JTextField userTxt;
    private javax.swing.JTable usrTable;
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
        String titulos[] = {"Usuario","Contraseña", "Rol", "Correo"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer de la bd las filas
        List <Empleados> listaUsuarios = control.traerUsuarios();
        
        if(listaUsuarios != null){
            //recorrer lista
            for(Empleados user : listaUsuarios){
                Object[] objeto = {user.getUsuario(), user.getContrasena(), user.getRol(), user.getCorreo()};
                
                modeloTabla.addRow(objeto);
            }
        }
        
        usrTable.setModel(modeloTabla);
    }
}
