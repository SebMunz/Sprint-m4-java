package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Sprint M4
 *
 * Clase Profesional.
 * Clase que extiende a la superclase Usuario. Se declaran los atributos de la clase, junto con un constructor vacío,
 * un constructor que recibe todos los atributos como parámetros y un constructor que recibe tanto los atributos propios
 * de la clase asi como los atributos de la superclase como parámetros. Además de los métodos mutadores, accesadores,
 * toString, analizarUsuario e ingresarUsuarios.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 05-07-2022
 */
public class Profesional extends Usuario{

    // Se declaran los atributos.
    private String titulo;
    private String fechaDeIngreso;

    // Se generan los métodos mutadores y accesadores.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    // Constructor Vacío.
    public Profesional() {
    }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param titulo
     * @param fechaDeIngreso
     */
    public Profesional(String titulo, String fechaDeIngreso) {
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

/**
 * Constructor que recibe los atributos propios y de la superclase como parámetros.
 * @param nombre
 * @param fechaNacimiento
 * @param run
 * @param edadUsuario
 * @param titulo
 * @param fechaDeIngreso
 */
    public Profesional(String nombre, String fechaNacimiento, int run, int edadUsuario, String titulo, String fechaDeIngreso) {
        super(nombre, fechaNacimiento, run, edadUsuario);
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los parámetros.
     * @return titulo, fechaDeIngreso y toString de la superclase.
     */
    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeIngreso='" + fechaDeIngreso + '\'' +
                "} " + super.toString();
    }

    /**
     * Método analizarUsuario.
     * Muestra por pantalla el nombre y el run del usuario y el título y la fecha de ingreso del profesional.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Datos Profesional");
        System.out.println("--------------");
        System.out.println("La información de la super clase es " + getNombre()+" "+getRun());
        System.out.println("El titulo del profesional es "+this.titulo+" y su fecha de ingreso fue el: "+this.fechaDeIngreso);
    }

    /**
     * Método ingresarUsuarios.
     * Sólo se declara el método.
     */
    @Override
    public void ingresarUsuarios(){
    }

}
