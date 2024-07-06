
package com.milagrosa.inventario.logic;

import com.milagrosa.inventario.persistence.ControladoraPersistence;
import java.util.Date;
import java.util.List;
public class Controladora {
    ControladoraPersistence controlPersis;
    public Controladora(){
        controlPersis = new ControladoraPersistence();
    }
    

    public Empleados validarUsuario(String usuario, String contrasena) {
       
        Empleados usr = null;
        List <Empleados> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Empleados usu : listaUsuarios){
            if(usu.getUsuario().equals(usuario)){
                
                if(usu.getContrasena().equals(contrasena)){
                    
                    usr = usu;
                    return usr;
                }else{
                 
                    usr = null;
                    return usr;
                }
            }else{
                
                usr = null;
            }       
        }
        
        return usr;
    }


    public List<Lotes> traerLotes() {
        return controlPersis.traerLotes();
    }

    public List<Productos> traerProductos() {
        
        return controlPersis.traerProductos();
    }

    public List<Empleados> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void crearUsuario(String userName, String userPass, String userMail, String userRol) {
        Empleados usu = new Empleados ();
        usu.setUsuario(userName);
        usu.setContrasena(userPass);
        usu.setCorreo(userMail);
        usu.setRol(userRol);
        
        controlPersis.crearUsuario(usu);
    }

    public void borrarUsuario(String id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
    }

    public void borrarProducto(Integer id_producto) {
        controlPersis.borrarProducto(id_producto);
    }

    public void addLotes(Integer lote, Float monto, String fecha) {
        Lotes lot = new Lotes();
        lot.setnLote(lote);
        lot.setMonto(monto);
        lot.setFecha(fecha);
        
        controlPersis.addLotes(lot);
    }

    public void borrarLote(Integer id_lote) {
        controlPersis.borrarLote(id_lote);
    }

    public void addProduct(String productName, Integer productCant, Float productPrice, String productDesc) {
        Productos prod = new Productos();
        prod.setNombre(productName);
        prod.setCantidad(productCant);
        prod.setPrecio(productPrice);
        prod.setDescripccion(productDesc);
        
        controlPersis.addProduct(prod);
    }

    public Lotes traerLote(Integer id_lote) {
         return controlPersis.traerLote(id_lote);
    }

    public void editLote(Lotes lote, Float monto, String fecha) {
//        Lotes lot = new Lotes();
//        lote.setnLote(lote);
        lote.setMonto(monto);
        lote.setFecha(fecha);
        
        controlPersis.editLote(lote);
    }

    public Productos traerProducto(Integer id_producto) {
        return controlPersis.traerProducto(id_producto);
    }

    public void editProduct(Productos product, String productName, Integer productCant, Float productPrice, String productDesc) {
        product.setNombre(productName);
        product.setCantidad(productCant);
        product.setPrecio(productPrice);
        product.setDescripccion(productDesc);
        
        controlPersis.editproduct(product);
    }

    

}
    

   
    
