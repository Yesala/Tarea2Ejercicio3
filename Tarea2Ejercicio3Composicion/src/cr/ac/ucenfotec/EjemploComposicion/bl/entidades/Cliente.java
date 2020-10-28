package cr.ac.ucenfotec.EjemploComposicion.bl.entidades;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String genero;
    private LocalDate fechaNacimiento;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String identificacion, String genero, LocalDate fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.genero = genero;
        setFechaNacimiento(fechaNacimiento);
        setEdad(edad);

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", genero='" + genero + '\'' +
                ", fechaNacimiento='" + getFechaNacimiento() + '\'' +
                ", edad='" + getEdad() + '\'' +
                '}';
    }


}
