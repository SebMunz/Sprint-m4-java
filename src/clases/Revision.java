package clases;

/**
 * Sprint M4
 *
 * Clase que extiende a la superclase VisitaEnTerreno. Se declaran los atributos de la clase, junto con un constructor
 * vacío, un constructor que recibe todos los atributos como parámetros y un constructor que recibe tanto los atributos
 * propios de la clase asi como los atributos de la superclase como parámetros. Además de los métodos mutadores,
 * accesadores, toString y generaIdentificador.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 04-07-2022
 */
public class Revision extends VisitaEnTerreno {
    // Se declaran los atributos.
    private int identificadorRevision;
    private int identificadorVisita;
    private String nombreRevision;
    private String detalleParaRevisar;
    private String estado;

    // Se generan los métodos mutadores y accesadores.
    public int getIdentificadorRevision() {
        return identificadorRevision;
    }

    public void setIdentificadorRevision(int identificadorRevision) {
        this.identificadorRevision = identificadorRevision;
    }

    //Se sobreescribe el método accesador.
    @Override
    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    //Se sobreescribe el método mutador.
    @Override
    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    // Se generan los métodos mutadores y accesadores.
    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    public String getDetalleParaRevisar() {
        return detalleParaRevisar;
    }

    public void setDetalleParaRevisar(String detalleParaRevisar) {
        this.detalleParaRevisar = detalleParaRevisar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    public Revision(){
        this.identificadorRevision = generaIdentificador();
        this.identificadorVisita = getIdentificadorVisita();
    }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param nombreRevision
     * @param detalleParaRevisar
     * @param estado
     */
    public Revision(String nombreRevision, String detalleParaRevisar, String estado) {
        this.identificadorRevision = generaIdentificador();
        this.identificadorVisita = getIdentificadorVisita();
        this.nombreRevision = nombreRevision;
        this.detalleParaRevisar = detalleParaRevisar;
        this.estado = estado;
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
     * @param identificadorRevision
     * @param identificadorVisita1
     * @param nombreRevision
     * @param detalleParaRevisar
     * @param estado
     */
    public Revision(String nombre, String fechaNacimiento, int run, int edadUsuario, int rut, String nombres,
                    String apellidos, String telefono, String afp, String sistemaSalud, String direccion, String comuna,
                    int edad, int identificadorVisita, int rutCliente, String diaVisita, String horaVisita,
                    String lugarVisita, String comentario, int identificadorRevision, int identificadorVisita1,
                    String nombreRevision, String detalleParaRevisar, String estado) {
        super(nombre, fechaNacimiento, run, edadUsuario, rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion,
                comuna, edad, identificadorVisita, rutCliente, diaVisita, horaVisita, lugarVisita, comentario);
        this.identificadorRevision = identificadorRevision;
        this.identificadorVisita = identificadorVisita1;
        this.nombreRevision = nombreRevision;
        this.detalleParaRevisar = detalleParaRevisar;
        this.estado = estado;
    }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los atributos de la clase.
     * @return identificadorRevision, identificadorVisita, nombreRevision, detalleParaRevisar, estado y toString de la
     * superclase.
     */
    @Override
    public String toString() {
        return "Revision{" +
                "identificadorRevision=" + identificadorRevision +
                ", identificadorVisita=" + identificadorVisita +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalleParaRevisar='" + detalleParaRevisar + '\'' +
                ", estado='" + estado + '\'' +
                "} " + super.toString();
    }
}
