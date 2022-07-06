package clases;

/**
 * Sprint M4
 *
 * Clase Cliente.
 * Clase que extiende a la superclase Usuario. Se declaran los atributos de la clase, junto con un constructor vacío,
 * un constructor que recibe todos los atributos como parámetros y un constructor que recibe tanto los atributos propios
 * de la clase asi como los atributos de la superclase como parámetros. Además de los métodos mutadores, accesadores,
 * obtenerNombre, obtenerSistemaSalud, toString, analizarUsuario e ingresarUsuarios.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 05-07-2022
 */
public class Cliente extends Usuario{
    // Se declaran los atributos.
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private String sistemaSalud;
    private String direccion;
    private String comuna;

    private int edad;

    // Se generan los métodos mutadores y accesadores.
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Constructor Vacío.
    public Cliente() {
    }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param rut
     * @param nombres
     * @param apellidos
     * @param telefono
     * @param afp
     * @param sistemaSalud
     * @param direccion
     * @param comuna
     * @param edad
     */
    public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, String sistemaSalud,
                   String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
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
     */
    public Cliente(String nombre, String fechaNacimiento, int run, int edadUsuario, int rut, String nombres,
                   String apellidos, String telefono, String afp, String sistemaSalud, String direccion, String comuna,
                   int edad) {
        super(nombre, fechaNacimiento, run, edadUsuario);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los parámetros.
     * @return rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna y edad y toString de la superclase.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud='" + sistemaSalud + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                "} " + super.toString();
    }

    /**
     * Método obtenerNombre.
     * Muestra por pantalla los nombres y apellidos del cliente.
     */
    public void obtenerNombre(){
        System.out.println(nombres+" "+apellidos);
    }
    /**
     * Método obtenerSistemaSalud.
     * Muestra por pantalla el sistema de salud del cliente.
     */
    public void obtenerSistemaSalud(){
        System.out.println("Su sistema de salud es: "+sistemaSalud);
    }

    /**
     * Método analizarUsuario.
     * Muestra por pantalla el nombre y el run del usuario y la dirección y comuna del cliente.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Datos cliente");
        System.out.println("--------------");
        System.out.println("La información de la super clase Usuario es " + getNombre()+" "+getRun());
        System.out.println("La dirección del Cliente es " +this.direccion+ " y su comuna es "+this.comuna);
    }

    /**
     * Método ingresarUsuarios.
     * Muestra por pantalla texto.
     */
    @Override
    public void ingresarUsuarios(){
        System.out.println("Crear cliente");

    }

}
