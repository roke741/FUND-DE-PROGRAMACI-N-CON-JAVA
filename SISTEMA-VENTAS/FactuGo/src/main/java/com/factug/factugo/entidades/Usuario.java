
package com.factug.factugo.entidades;

/**
 *
 * @author Jhordie
 */
public class Usuario {
    private String username;
    private String password;
    private String nombre;
    private String ape_paterno;
    private String ape_materno;

    public Usuario() {
    }

    public Usuario( String username, String password, String nombre, String ape_paterno, String ape_materno) {

        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.ape_paterno = ape_paterno;
        this.ape_materno = ape_materno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getApe_paterno() {
        return ape_paterno;
    }

    public void setApe_paterno(String ape_paterno) {
        this.ape_paterno = ape_paterno;
    }

    public String getApe_materno() {
        return ape_materno;
    }

    public void setApe_materno(String ape_materno) {
        this.ape_materno = ape_materno;
    }

    @Override
    public String toString() {
       return  "Usuario{" + "nombre=" + nombre + " apellidos: "+ape_paterno +""+  ape_materno+ '}';
    }
    
    
    
}
