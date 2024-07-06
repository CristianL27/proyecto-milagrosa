package com.milagrosa.inventario.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empleados implements Serializable {
    
    @Id
    private String usuario;
    private String contrasena;
    private String rol;
    private String correo;
    public Empleados() {
    }

    public Empleados(String usuario, String contrasena, String rol, String correo) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
