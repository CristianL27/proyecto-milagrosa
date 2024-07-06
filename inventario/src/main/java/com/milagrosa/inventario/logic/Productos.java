
package com.milagrosa.inventario.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Productos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    private Integer id_producto;
    private String nombre;
    private String descripccion;
    private Integer cantidad;
    private Float precio;

    public Productos() {
    }

    public Productos(Integer id_producto, String nombre, String descripccion, Integer cantidad, Float precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripccion = descripccion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    
    
}
