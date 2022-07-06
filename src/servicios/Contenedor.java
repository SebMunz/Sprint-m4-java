package servicios;

import clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Sprint M4
 *
 * Clase Contenedor
 * Se declaran los atributos de la clase y los métodos almacenarCliente, almacenarProfesional, almacenarAdministrativo,
 * mostrarClienteIngresado, mostrarProfesional, mostrarAdministrativo, agregarTipoUsuario, analizarUsuario,
 * listarUsuario, agregarCapacitacion, listarCapacitacion, eliminarUsuario, visitaTerreno, ingresarRevision,
 * datosVisitaTerreno, datosAccidente y datosRevision.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 05-07-2022
 */
public class Contenedor {

    // Se declaran e inicializan los arrayList.
    List<IAsesoria> listaAsesoria = new ArrayList<>();
    List<Capacitacion> listaCapacitacion = new ArrayList<>();
    List<Cliente> listaClientes = new ArrayList<>();
    List<Profesional> listaProfesionales = new ArrayList<>();
    List<Administrativo> listaAdministrativos = new ArrayList<>();
    List<VisitaEnTerreno> listaVisitaTerreno = new ArrayList<>();
    List<Revision> listaRevisiones = new ArrayList<>();


    /**
     * Método almacenarCliente
     * agrega datos al ArrayList listaClientes.
     * @param a
     */
    public void almacenarCliente(Cliente a){
        listaClientes.add(a);
    }

    /**
     * Método almacenarProfesional
     * agrega datos al ArrayList listaProfesionales.
     * @param p
     */
    public void almacenarProfesional(Profesional p){
        listaProfesionales.add(p);
    }

    /**
     * Método almacenarAdministrativo.
     * agrega datos al ArrayList listaAdministrativos.
     * @param a
     */
    public void almacenarAdministrativo(Administrativo a){
        listaAdministrativos.add(a);
    }

    /**
     * Método mostrarClienteIngresado
     * muestra los datos ingresados en el ArrayList listaClientes.
     */
    public void mostrarClienteIngresado(){
        for (Cliente a: listaClientes) {
            System.out.println(a);
        }
    }

    /**
     * Método mostrarProfesional
     * muestra los datos ingresados en el ArrayList listaProfesionales.
     */
    public void mostrarProfesional(){
        for (Profesional a: listaProfesionales) {
            System.out.println(a);
        }
    }

    /**
     * Método mostrarAdministrativo
     * muestra los datos ingresados en el ArrayList listaAdministrativos.
     */
    public void mostrarAdministrativo(){
        for (Administrativo a: listaAdministrativos) {
            System.out.println(a);
        }
    }

    /**
     * Método agregarTipoUsuario
     * agrega datos al ArrayList listaAsesoria
     * @param a
     */
    public void agregarTipoUsuario(IAsesoria a){
        listaAsesoria.add(a);
    }

    /**
     * Método analizarUsuario
     * Sin parámetros
     */
    public void analizarUsuario(){
        for (IAsesoria a:listaAsesoria) {
            a.analizarUsuario();
        }
    }

    /**
     * Método listarUsuario
     * Sin parámetros
     */
    public void listarUsuario(){
        for (IAsesoria a: listaAsesoria) {
            a.listarUsuario();
        }
    }

    /**
     * Método agregarCapacitacion
     * agrega datos al ArrayList listaCapacitacion
     * @param a
     */
    public void agregarCapacitacion(Capacitacion a){
        listaCapacitacion.add(a);
    }

    /**
     * Método listarCapacitacion
     * muestra los datos ingresados en el ArrayList listaCapacitacion.
     */
    public void listarCapacitacion(){
        for (Capacitacion a: listaCapacitacion) {
            System.out.println(a);
        }
    }

    /**
     * Método eliminarUsuario
     * Elimina a los usuarios del ArrayList listaAsesoria
     * @param runUsuario
     */
    public void eliminarUsuario(int runUsuario){
        boolean encontrado = false;
        for (int i = 0; i < listaAsesoria.size(); i++) {
            Usuario u = (Usuario) listaAsesoria.get(i);
            if(u.getRun() == runUsuario){
                encontrado = true;
                System.out.println(encontrado);
                listaAsesoria.remove(u);
                break;
            }
        }
    }

    /**
     * Método visitaTerreno
     * Solo se declara el método.
     */
    public void visitaTerreno(){

    }
    /**
     * Método ingresarRevision.
     * Solo se declara el método.
     */
    public void ingresarRevision(){

    }

    /**
     * Método datosVisitaTerreno
     * Permite manipular los datos de la clase VisitaEnTerreno, y validar sus variables.
     */
    public void datosVisitaTerreno(){

        Scanner vt = new Scanner(System.in);
        VisitaEnTerreno vt1 = new VisitaEnTerreno();
        System.out.println("Ingrese el rut din DV, del cliente de la visita");
        vt1.setRutCliente(vt.nextInt());
        //Bucle While que permite validar que la variable RutCliente sea un número entre 0 y 99999999.
        while (vt1.getRutCliente() > 99999999 || vt1.getRutCliente() < 0){
            System.out.println("Debe ingresar un rut menor a 99999999");
            vt1.setRutCliente(vt.nextInt());
        }

        System.out.println("Ingrese fecha de la visita en formato dd/mm/aaaa ");
        vt1.setDiaVisita(vt.nextLine());

        System.out.println("Ingrese hora de visita en formato hh:mm");
        vt1.setHoraVisita(vt.nextLine());

        System.out.println("Ingrese lugar de la visita");
        vt1.setLugarVisita(vt.nextLine());

        // Bucle While que permite validar que la variable LugarVisita contenga entre 10 y 50 caracteres.
        while (vt1.getLugarVisita().length() < 10 ||vt1.getLugarVisita().length() > 50 ){
            System.out.println("Lugar debe tener entre 10 y 50 caracteres");
            vt1.setLugarVisita(vt.nextLine());
        }

        System.out.println("Ingrese comentarios de la visita");
        vt1.setComentario(vt.nextLine());
        //Bucle While que permite validar que la variable Comentario tenga un largo entre 10 y 50 caracteres.
        while (vt1.getComentario().length() < 10 ||vt1.getComentario().length() > 50 ){
            System.out.println("Lugar debe tener entre 10 y 50 caracteres");
            vt1.setLugarVisita(vt.nextLine());
        }
    }

    /**
     * Método datosAccidente
     * Permite manipular los datos de la clase Accidente, y validar sus variables.
     */
    public void datosAccidente(){
        Scanner da = new Scanner(System.in);
        Accidente a = new Accidente();

        System.out.println("Ingrese el rut del cliente que desea ingresar el accidente");
        a.setRutCliente(da.nextInt());
        //Bucle While que permite validar que la variable RutCliente sea un número entre 0 y 99999999.
        while (a.getRutCliente() > 99999999 || a.getRutCliente() < 0){
            System.out.println("Debe ingresar un rut menor a 99999999");
            a.setRutCliente(da.nextInt());
        }

        System.out.println("Ingrese fecha del accidente en formato dd/mm/aaaa");
        a.setDiaAccidente(da.nextLine());

        System.out.println("Ingrese hora de accidente en formato hh:mm");
        a.setHoraAccidente(da.nextLine());

        System.out.println("Ingrese lugar del accidente");
        a.setLugarAccidente(da.nextLine());
        // Bucle While que permite validar que la variable LugarAccidente contenga entre 10 y 50 caracteres.
        while (a.getLugarAccidente().length() < 10 ||a.getLugarAccidente().length() > 50 ){
            System.out.println("Lugar debe tener entre 10 y 50 caracteres");
            a.setLugarAccidente(da.nextLine());
        }

        System.out.println("Ingrese origen del accidente");
        a.setOrigenAccidente(da.nextLine());
        // Bucle While que permite validar que el largo de la variable OrigenAccidente, no sea más de 100 caracteres.
        while (a.getOrigenAccidente().length() >= 100 ){
            System.out.println("Origen debe tener 100 o menos caracteres");
            a.setOrigenAccidente(da.nextLine());
        }

        System.out.println("Ingrese consecuencias del accidente");
        a.setConsecuencias(da.nextLine());
        // Bucle While que permite validar que el largo de la variable Consecuencias, no sea más de 100 caracteres.
        while (a.getConsecuencias().length() >= 100 ){
            System.out.println("Origen debe tener 100 o menos caracteres");
            a.setConsecuencias(da.nextLine());
        }

    }

    /**
     * Método datosRevision
     * Permite manipular los datos de la clase Revision, y validar sus variables.
     */
    public void datosRevision(){
        Scanner dr = new Scanner(System.in);
        Revision r = new Revision();

        System.out.println("Ingrese nombre alusivo a la revisión");
        r.setNombreRevision(dr.nextLine());
        // Bucle While que permite validar que la variable NombreRevision tenga un largo de entre 10 y 50 caracteres.
        while (r.getNombreRevision().length() < 10 || r.getNombreRevision().length() > 50 ){
            System.out.println("Origen debe tener 100 o menos caracteres");
            r.setNombreRevision(dr.nextLine());
        }

        System.out.println("Ingrese detalle de revisión");
        r.setDetalleParaRevisar(dr.nextLine());
    // Bucle While que permite validar que el largo de la variable DetalleParaRevisar no sea superior a 100 caracteres.
        while (r.getDetalleParaRevisar().length() > 100){
            System.out.println("Detalle debe tener 100 o menos caracteres");
            r.setDetalleParaRevisar(dr.nextLine());
        }

        System.out.println("Ingrese número de estado de la revision:" +
                "\n1 Sin problemas, \n2 Con observaciones y \n3 No aprueba");
        int estadoNum = dr.nextInt();
        // Sentencia de control if que permite elegir una de las 3 opciones de estado de la revisión.
        if(estadoNum == 1){
            r.setEstado("Sin problemas");
        } else if (estadoNum == 2) {
            r.setEstado("Con observaciones");
        } else if (estadoNum == 3) {
            r.setEstado("No aprueba");
        }
        // Bucle While que permite validar que se ingrese una de las 3 opciones válidas.
        while (estadoNum > 3 || estadoNum < 1){
            System.out.println("Debe ingresar una opción válida");
            estadoNum = dr.nextInt();
            // Sentencia de control if que permite elegir una de las 3 opciones de estado de la revisión.
            if(estadoNum == 1){
                r.setEstado("Sin problemas");
            } else if (estadoNum == 2) {
                r.setEstado("Con observaciones");
            } else if (estadoNum == 3) {
                r.setEstado("No aprueba");
            }
        }
    }
}
