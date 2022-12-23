
package com.factug.ejercicio_s11.modelo.entidades;

/**
 *
 * @author Jhordie
 */
public class Administrador {
    private String id;
    private String user;
    private String password;
    private String nombre;
    private String apellido;

    public Administrador() {
    }

    public Administrador(String id, String user, String password, String nombre, String apellido) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}