package clases;

import org.w3c.dom.Text;

import java.util.Scanner;

/**
 * Sprint M4
 *
 * Clase que extiende a la superclase Cliente. Se declaran los atributos de la clase, junto con un constructor vacío,
 * un constructor que recibe todos los atributos como parámetros y un constructor que recibe tanto los atributos propios
 * de la clase asi como los atributos de la superclase como parámetros. Además de los métodos mutadores, accesadores,
 * toString y generaIdentificador.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 04-07-2022
 */
public class VisitaEnTerreno extends Cliente {

    // Se declaran los atributos.
    private int identificadorVisita;
    private int rutCliente;
    private String diaVisita;
    private String horaVisita;
    private String lugarVisita;
    private String comentario;

    // Se generan los métodos mutadores y accesadores.
    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaVisita() {
        return diaVisita;
    }

    public void setDiaVisita(String diaVisita) {
        this.diaVisita = diaVisita;
    }

    public String getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(String horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getLugarVisita() {
        return lugarVisita;
    }

    public void setLugarVisita(String lugarVisita) {
        this.lugarVisita = lugarVisita;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Método genera Identificador.
     * Crea el número identificador de la clase Revisión.
     * @return Número entero aleatorio.
     */
    private int generaIdentificador(){
        return (int)(Math.random()*100);
    }

    // Constructor vacío.
    public VisitaEnTerreno(){

        this.identificadorVisita = generaIdentificador();
        this.rutCliente = getRutCliente();
    }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param diaVisita
     * @param horaVisita
     * @param lugarVisita
     * @param comentario
     */
    public VisitaEnTerreno(String diaVisita, String horaVisita, String lugarVisita, String comentario) {
        this.identificadorVisita = generaIdentificador();
        this.diaVisita = diaVisita;
        this.horaVisita = horaVisita;
        this.lugarVisita = lugarVisita;
        this.comentario = comentario;
    }


    /**
     * Constructor que recibe los atributos propios y de la superclase como parámetros.
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param edadUsuario
     * @param rut
     * @param nombres
     * @param apellidos
     * @param telefono
     * @param afp
     * @param sistemaSalud
     * @param direccion
     * @param comuna
     * @param edad
     * @param identificadorVisita
     * @param rutCliente
     * @param diaVisita
     * @param horaVisita
     * @param lugarVisita
     * @param comentario
     */
    public VisitaEnTerreno(String nombre, String fechaNacimiento, int run, int edadUsuario, int rut, String nombres,
                           String apellidos, String telefono, String afp, String sistemaSalud, String direccion,
                           String comuna, int edad, int identificadorVisita, int rutCliente, String diaVisita,
                           String horaVisita, String lugarVisita, String comentario) {
        super(nombre, fechaNacimiento, run, edadUsuario, rut, nombres, apellidos, telefono, afp, sistemaSalud,
                direccion, comuna, edad);
        this.identificadorVisita = identificadorVisita;
        this.rutCliente = rutCliente;
        this.diaVisita = diaVisita;
        this.horaVisita = horaVisita;
        this.lugarVisita = lugarVisita;
        this.comentario = comentario;
    }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los atributos de la clase.
     * @return identificadorRevision, rutCliente, diaVisita, horaVisita, lugarVisita, comentario y toString de la
     * superclase.
     */
    @Override
    public String toString() {
        return "VisitaEnTerreno{" +
                "identificadorVisita=" + identificadorVisita +
                ", rutCliente='" + rutCliente + '\'' +
                ", diaVisita='" + diaVisita + '\'' +
                ", horaVisita='" + horaVisita + '\'' +
                ", lugarVisita='" + lugarVisita + '\'' +
                ", comentario='" + comentario + '\'' +
                "} " + super.toString();
    }
}
