package clases;

/**
 * Sprint M4
 *
 * Clase Administrativo
 * Clase que extiende a la superclase Usuario. Se declaran los atributos de la clase, junto con un constructor vacío,
 * un constructor que recibe todos los atributos como parámetros y un constructor que recibe tanto los atributos propios
 * de la clase asi como los atributos de la superclase como parámetros. Además de los métodos mutadores, accesadores,
 * toString, analizarUsuario e ingresarUsuarios.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 05-07-2022
 */
public class Administrativo extends Usuario{

    // Se declaran los atributos.
    private String area;
    private String experienciaPrevia;

    // Se generan los métodos mutadores y accesadores.
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    // Constructor Vacío.
    public Administrativo() {
    }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param area
     * @param experienciaPrevia
     */
    public Administrativo(String area, String experienciaPrevia) {
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * Constructor que recibe los atributos propios y de la superclase como parámetros.
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param edadUsuario
     * @param area
     * @param experienciaPrevia
     */
    public Administrativo(String nombre, String fechaNacimiento, int run, int edadUsuario, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run, edadUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los parámetros.
     * @return area, experienciaPrevia y toString de la superclase.
     */
    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia=" + experienciaPrevia +
                "} " + super.toString();
    }

    /**
     * Método analizarUsuario.
     * Muestra por pantalla el nombre y el run del usuario y el área y experiencia previa del administrativo.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Datos Administrativos");
        System.out.println("----------------------");
        System.out.println("La información de la super clase Usuario es " + getNombre()+" "+getRun());
        System.out.println("El área a la que pertenece el administrativo es "+this.area+" y su experiencia es "
                +this.experienciaPrevia+".");
    }

    /**
     * Método ingresarUsuarios.
     * Sólo se declara el método.
     */
    @Override
    public void ingresarUsuarios(){

    }
}
