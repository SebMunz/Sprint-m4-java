package clases;

/**
 * Sprint M4
 *
 * Clase Usuario.
 * Clase que implementa la interface IAsesoria. Se declaran los atributos de la clase, junto con un constructor vacío y
 * un constructor que recibe todos los atributos como parámetros. Además de los métodos mutadores, accesadores,
 * mostrarEdad, toString, analizarUsuario, listarUsuario e ingresarUsuarios.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 05-07-2022
 */
public abstract class Usuario implements IAsesoria {
    // Se declaran los atributos.
    private String nombre;
    private String fechaNacimiento;
    private int run;
    private int edadUsuario;

    // Se generan los métodos mutadores y accesadores.
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaNacimiento() { return fechaNacimiento; }

    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public int getRun() { return run; }

    public void setRun(int run) { this.run = run; }

    public int getEdadUsuario() { return edadUsuario;}

    public void setEdadUsuario(int edadUsuario){this.edadUsuario = edadUsuario;}

    // Constructor Vacío.
    public Usuario() {
    }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param nombre
     * @param fechaNacimiento
     * @param run
     * @param edadUsuario
     */
    public Usuario(String nombre, String fechaNacimiento, int run, int edadUsuario) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
        this.edadUsuario = edadUsuario;
    }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los parámetros.
     * @return nombre, fechaNacimiento, run y edadUsuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                ", edadUsuario=" + edadUsuario +
                '}';
    }

    /**
     * Método mostrarEdad.
     * Muestra por pantalla la edad del usuario.
     */
    public void mostrarEdad(){
        System.out.println("El usuario "+nombre+" tiene "+ edadUsuario+" años.");
    }

    /**
     * Método analizarUsuario.
     * Muestra por pantalla el nombre y el run del usuario.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es: " + this.nombre + " y su RUN es "+this.run);
    }

    /**
     * Método listarUsuario.
     * Muestra por pantalla el nombre, la fecha de nacimiento, el run y la edad del usuario.
     */
    @Override
    public void listarUsuario() {
        System.out.println("Usuario ["+ this.nombre+", "+this.fechaNacimiento+", "+
                this.run+", "+edadUsuario+"]");
    }

    /**
     * Método ingresarUsuarios.
     * Solo se declara el método.
     */
    public abstract void ingresarUsuarios();
}
