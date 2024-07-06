
package com.milagrosa.inventario.persistence;

import com.milagrosa.inventario.logic.Empleados;
import com.milagrosa.inventario.logic.Lotes;
import com.milagrosa.inventario.logic.Productos;
import com.milagrosa.inventario.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistence {
    
    EmpleadosJpaController usuJpa = new EmpleadosJpaController();
    LotesJpaController lotesJpa = new LotesJpaController();
    ProductosJpaController prodJpa = new ProductosJpaController();
    
    public List<Empleados> traerUsuarios() {
        List<Empleados> listaUsuarios = usuJpa.findlogEntities();
        return listaUsuarios;
    }
    
    public List<Lotes> traerLotes() {
        List<Lotes> listaLotes = lotesJpa.findLotesEntities();
        return listaLotes;
    }

    public List<Productos> traerProductos() {
        List<Productos> listaProductos = prodJpa.findProductosEntities();
        return listaProductos;
    }

    public void crearUsuario(Empleados usu) {
        try {
            usuJpa.create(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarUsuario(String id_usuario) {
        try {
            usuJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarProducto(Integer id_producto) {
        try {
            prodJpa.destroy(id_producto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addLotes(Lotes lot) {
        try {
            lotesJpa.create(lot);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarLote(Integer id_lote) {
        try {
            lotesJpa.destroy(id_lote);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addProduct(Productos prod) {
        prodJpa.create(prod);
    }

    public Lotes traerLote(Integer id_lote) {
         return lotesJpa.findLotes(id_lote);
    }

    public void editLote(Lotes lote) {
        try {
            lotesJpa.edit(lote);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Productos traerProducto(Integer id_producto) {
        return prodJpa.findProductos(id_producto);
    }

    public void editproduct(Productos product) {
        try {
            prodJpa.edit(product);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    


    
    
}
