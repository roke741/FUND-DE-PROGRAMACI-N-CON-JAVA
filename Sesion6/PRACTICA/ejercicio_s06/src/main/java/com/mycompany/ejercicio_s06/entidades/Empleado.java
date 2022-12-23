package com.mycompany.ejercicio_s06.entidades;

import static com.mycompany.ejercicio_s06.util.Util.GERENCIA;
import static com.mycompany.ejercicio_s06.util.Util.GERENTE;
import static com.mycompany.ejercicio_s06.util.Util.JUNIOR;
import static com.mycompany.ejercicio_s06.util.Util.MARKETING;
import static com.mycompany.ejercicio_s06.util.Util.OPERARIO;
import static com.mycompany.ejercicio_s06.util.Util.PLANTA;
import static com.mycompany.ejercicio_s06.util.Util.PRACTICANTE;
import static com.mycompany.ejercicio_s06.util.Util.RRHH;
import static com.mycompany.ejercicio_s06.util.Util.SENIOR;
import static com.mycompany.ejercicio_s06.util.Util.VENTAS;

/**
 *
 * @author Jhordie
 */
public class Empleado {
    private String id;
    private String nombre;
    private String correo;
    private int categoria;
    private int area;
    private double sueldo;

    // constructores

    public Empleado(String id, String nombre, String correo, int categoria, int area) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.categoria = categoria;
        this.area = area;
    }
    
    //metodos de acceso

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getSueldo() {
        //return sueldo;
        double sbase;
        switch (this.categoria) {
            case 0:
                sbase = JUNIOR;
                break;
            case 1:
                sbase = SENIOR;
                break;
            case 2:
                sbase = PRACTICANTE;
                break;
            case 3:
                sbase = GERENTE;
                break;
            case 4:
                sbase = OPERARIO;
                break;    
            default:
                sbase = 0;
        }
        double sneto;
        switch (this.area) {
            case 0:
                sneto = sbase*(1 + MARKETING);
                break;
            case 1:
                sneto = sbase+ sbase* RRHH;
                break;
            case 2:
                sneto = sbase +sbase* PLANTA;
                break;
            case 3:
                sneto = sbase +sbase* VENTAS;
                break;
            case 4:
                sneto = sbase +sbase* GERENCIA;
                break;
            default:
                sneto =0;
        }
        this.sueldo = sneto;
        return sueldo;
    }
    /*
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    */
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", categoria=" + categoria + ", area=" + area + ", sueldo=" + sueldo + '}';
    }
    
    
    
}



