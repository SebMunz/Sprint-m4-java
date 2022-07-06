
import servicios.Contenedor;
import java.util.Scanner;
import clases.*;

/**
 * Sprint M4
 *
 * Clase Main.
 * Contiene el método principal.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 05-07-2022
 */

public class Main {
    /**
     * Método main
     * Permite el ingreso de datos por teclado, muestra los datos ingresados por pantalla y aplica restricciones a los
     * atributos de las distintas clases.
     * @param args parámetros de entrada no utilizados.
     */
    public static void main(String[] args) {
        // Se crea el Scanner dato, los ArrayList y los atributos como tipo de datos String o int.
        Scanner dato = new Scanner(System.in);
        String nombreUsuario, fechaNacimiento, nombreCliente, apellidosCliente,telefono,afp,sistemaSalud,
                direccion, comuna, titulo, fechaIngreso,area, anosExperiencia, dia, hora, lugar, duracion;
        int runUsuario, rutCliente, edadUsuario, edadCliente, cantidadAsistentes;
        Contenedor contenedor1 = new Contenedor();

        int numeroAleatorio = (int)(Math.random()*100);
        System.out.println(numeroAleatorio);

        int seleccionMenu;
        do{
            // Se crea el menú principal que muestra las 9 opciones a realizar por pantalla.
            System.out.println("Menú Sistema Administración de Información");
            System.out.println("===========================================");
            System.out.println("1 Crear Cliente");
            System.out.println("2 Crear Profesional");
            System.out.println("3 Crear Administrativo");
            System.out.println("4 Ingresar Capacitación");
            System.out.println("5 Eliminar Usuario");
            System.out.println("6 Mostrar todos los Usuario");
            System.out.println("7 Mostrar Usuarios por tipo");
            System.out.println("8 Mostrar Capacitaciones");
            System.out.println("9 Salir");
            System.out.println("============================================");

            // Bucle While que permite ingresar una de las opciones del menú.
            System.out.println("Ingrese el número del menú");
            seleccionMenu = dato.nextInt();
            while (seleccionMenu <= 0 || seleccionMenu >9){
                System.out.println("Debe ingresar un numero del menú");
                seleccionMenu = dato.nextInt();
            }

            // Sentencia de control if que permite elegir la opción Crear Cliente con restricciones para sus atributos.
            if(seleccionMenu == 1){
                System.out.println("Ingreso de Clientes, siga las instrucciones a continuación:");
                boolean otroUsuario = true;
                do {
                    System.out.println("Ingrese Nombre de Usuario");
                    dato.nextLine();
                    nombreUsuario = dato.nextLine();
                    // Bucle While que valida el ingreso entre 10 y 50 caracteres para la variable nombreUsuario.
                    while (nombreUsuario.length() < 10 || nombreUsuario.length() > 50){
                        System.out.println("Debe ingresar un nombre de usuario de entre 10 y 50 caracteres");
                        nombreUsuario = dato.nextLine();
                    }
                    System.out.println("Ingrese Fecha Nacimiento del Usuario (dd/mm/aaaa)");
                    fechaNacimiento = dato.next();
                    // Bucle While que valida el ingreso de la fecha de nacimiento del Usuario en el formato señalado.
                    while (fechaNacimiento.equals("")){
                        System.out.println("Debe ingresar fecha de nacimiento en formato dd/mm/aaaa");
                        fechaNacimiento = dato.next();
                    }
                    System.out.println("Ingrese run Usuario sin digito verificador (ej:20777555)");
                    runUsuario = dato.nextInt();
                    // Bucle while que valida el ingreso del runUsuario entre los números 0 y 99999999.
                    while (runUsuario > 99999999 || runUsuario <= 0){
                        System.out.println("Run usuario debe ser mayor a 0 y menor a 99999999");
                    }
                    System.out.println("Ingrese edad del Usuario");
                    edadUsuario = dato.nextInt();

                    System.out.println("Ingrese Rut Cliente din DV (ej:20777555)");
                     rutCliente = dato.nextInt();
                    // Bucle while que valida el ingreso del rutCliente entre los números 0 y 99999999.
                     while (rutCliente > 99999999 || rutCliente <= 0){
                        System.out.println("Rut Cliente debe ser mayor a 0 y menor a 99999999");
                        rutCliente = dato.nextInt();
                    }

                    System.out.println("Ingrese nombres del Cliente");
                    dato.nextLine();
                    nombreCliente = dato.nextLine();
                    // Bucle While que valida el ingreso entre 10 y 50 caracteres para la variable nombreCliente.
                    while (nombreCliente.length()<5 || nombreCliente.length() > 30){
                        System.out.println("Los nombres del cliente deben tener entre 5 y 30 caracteres");
                        nombreCliente = dato.nextLine();
                    }

                    System.out.println("Ingrese apellidos del cliente");
                    apellidosCliente = dato.nextLine();
                    // Bucle While que valida el ingreso entre 5 y 30 caracteres para la variable apellidoCliente.
                    while (apellidosCliente.length()<5 || apellidosCliente.length() > 30){
                        System.out.println("Apellidos del cliente debe tener entre 5 y 30 caracteres.");
                        apellidosCliente = dato.nextLine();
                    }
                    System.out.println("Ingrese teléfono del cliente");
                    telefono = dato.nextLine();
                    // Bucle While que valida el ingreso del teléfono del Cliente.
                    while (telefono.equals("")){
                        System.out.println("Debe ingresar un teléfono para el cliente");
                        telefono = dato.nextLine();
                    }
                    System.out.println("Ingrese AFP del Cliente");
                    afp = dato.next();
                    // Bucle While que valida el ingreso entre 4 y 30 caracteres para la variable afp.
                    while (afp.length()<4 || afp.length()>30){
                        System.out.println("AFP debe tener entre 4 y 30 caracteres");
                        afp = dato.next();
                    }
                    System.out.println("Ingrese número de Sistema de salud del Cliente (1 Fonasa, 2 Isapre)");
                    int salud = dato.nextInt();
                    // Bucle While que valida el ingreso de la opción 1 o 2 de la variable salud.
                    while (salud < 1 || salud >2){
                        System.out.println("Debe ingresar el numero correcto del sistema de salud");
                        salud = dato.nextInt();
                    }
                    // Sentencia de control if que muestra la opción 1 como Fonasa y la opción 2 como Isapre.
                    if (salud == 1){
                        sistemaSalud = "Fonasa";
                    }else {
                        sistemaSalud = "Isapre";
                    }
                    System.out.println("Ingrese dirección del Cliente");
                    dato.nextLine();
                    direccion = dato.nextLine();
                    //Bucle While que permite validar que la variable dirección tenga como máximo 70 caracteres.
                    while (direccion.length()>70){
                        System.out.println("La dirección debe tener 70 o menos caracteres");
                        direccion = dato.nextLine();
                    }
                    System.out.println("Ingrese Comuna en la que vive el Cliente");
                    comuna = dato.nextLine();
                    //Bucle While que permite validar que la variable comuna tenga como máximo 50 caracteres.
                    while (comuna.length() > 50){
                        System.out.println("Comuna debe tener 50 o menos caracteres");
                        comuna = dato.nextLine();
                    }
                    System.out.println("Ingrese edad del cliente");
                    edadCliente = dato.nextInt();
                    //Bucle While que permite validar que la variable edadCliente sea un número entre 0 a 150 años.
                    while (edadCliente < 0 || edadCliente >150){
                        System.out.println("Edad de cliente debe ser mayor a 0 y menor a 150 años");
                        edadCliente = dato.nextInt();
                    }

                    contenedor1.agregarTipoUsuario(new Cliente(nombreUsuario,fechaNacimiento,runUsuario,edadUsuario,
                    rutCliente,nombreCliente,apellidosCliente,telefono,afp,sistemaSalud,direccion,comuna,edadCliente));
                    contenedor1.almacenarCliente(new Cliente(nombreUsuario,fechaNacimiento,runUsuario,edadUsuario,
                    rutCliente,nombreCliente,apellidosCliente,telefono,afp,sistemaSalud,direccion,comuna,edadCliente));

                    System.out.println("Desea agregar otro Cliente (Si o No)?");
                    String respuesta = dato.next();
                    // Sentencia de control if que permite elegir entre la opción Si o No para agregar un nuevo Cliente.
                    if(respuesta.equals("Si")){
                        otroUsuario = true;
                    }else {
                        otroUsuario = false;
                    }
                }while (otroUsuario == true);

                System.out.println("Cliente(s) ingresado(s) con éxito");
                System.out.println("----------------------------------");
                contenedor1.mostrarClienteIngresado();

    // Sentencia de control if que permite elegir la opción Crear Profesional con restricciones para sus atributos.
            } else if (seleccionMenu == 2) {
                System.out.println("Ingreso de profesionales, siga las intrucciones:");
                boolean otroUsuario = true;
                do {
                    System.out.println("Ingrese Nombre de Usuario");
                    dato.nextLine();
                    nombreUsuario = dato.nextLine();
                    // Bucle While que valida el ingreso entre 10 y 50 caracteres para la variable nombreUsuario.
                    while (nombreUsuario.length() < 10 || nombreUsuario.length() > 50){
                        System.out.println("Debe ingresar un nombre de usuario de entre 10 y 50 caracteres");
                        nombreUsuario = dato.nextLine();
                    }
                    System.out.println("Ingrese Fecha Nacimiento del Usuario (dd/mm/aaaa)");
                    fechaNacimiento = dato.next();
                    // Bucle While que valida el ingreso de la fecha de nacimiento del Usuario en el formato señalado.
                    while (fechaNacimiento.equals("")){
                        System.out.println("Debe ingresar fecha de nacimiento en formato dd/mm/aaaa");
                        fechaNacimiento = dato.next();
                    }
                    System.out.println("Ingrese run Usuario sin digito verificador (ej:20777555)");
                    runUsuario = dato.nextInt();
                    // Bucle while que valida el ingreso del runUsuario entre los números 0 y 99999999.
                    while (runUsuario > 99999999 || runUsuario <= 0){
                        System.out.println("Run usuario debe ser mayor a 0 y menor a 99999999");
                    }
                    System.out.println("Ingrese edad del Usuario");
                    edadUsuario = dato.nextInt();

                    System.out.println("Ingrese titulo del Profesional");
                    dato.nextLine();
                    titulo = dato.nextLine();
                    // Bucle While que permite validar el título del profesional con un largo entre 10 y 50 caracteres.
                    while (titulo.length()<10 || titulo.length()>50){
                        System.out.println("Título debe tener entre 10 y 50 caracteres");
                        titulo = dato.nextLine();
                    }
                    System.out.println("Ingrese fecha ingreso del Profesional en formato dd/mm/aaaa");
                    fechaIngreso = dato.next();
                    System.out.println("Desea agregar otro Profesional (Si o No)?");
                    String respuesta = dato.next();

                    contenedor1.agregarTipoUsuario(new Profesional(nombreUsuario,fechaNacimiento,
                            runUsuario,edadUsuario,titulo,fechaIngreso));
                    contenedor1.almacenarProfesional(new Profesional(nombreUsuario,fechaNacimiento,
                            runUsuario,edadUsuario,titulo,fechaIngreso));

                // Sentencia de control if que permite elegir entre la opción Si o No para agregar un nuevo Profesional.
                    if(respuesta.equals("Si")){
                        otroUsuario = true;
                    }else {
                        otroUsuario = false;
                    }
                }while (otroUsuario == true);

                System.out.println("Profesionales ingresados con éxito");
                System.out.println("------------------------------------");
                contenedor1.mostrarProfesional();

    // Sentencia de control if que permite elegir la opción Crear Administrativo con restricciones para sus atributos.
            } else if (seleccionMenu == 3) {
                System.out.println("Ingreso de Administrativos, siga las instrucciones a continuación:");
                boolean otroUsuario = true;
                do {
                    System.out.println("Ingrese Nombre de Usuario");
                    dato.nextLine();
                    nombreUsuario = dato.nextLine();
                    // Bucle While que valida el ingreso entre 10 y 50 caracteres para la variable nombreUsuario.
                    while (nombreUsuario.length() < 10 || nombreUsuario.length() > 50){
                        System.out.println("Debe ingresar un nombre de usuario de entre 10 y 50 caracteres");
                        nombreUsuario = dato.nextLine();
                    }
                    System.out.println("Ingrese Fecha Nacimiento del Usuario (dd/mm/aaaa)");
                    fechaNacimiento = dato.next();
                    // Bucle While que valida el ingreso de la fecha de nacimiento del Usuario en el formato señalado.
                    while (fechaNacimiento.equals("")){
                        System.out.println("Debe ingresar fecha de nacimiento en formato dd/mm/aaaa");
                        fechaNacimiento = dato.next();
                    }
                    System.out.println("Ingrese run Usuario sin digito verificador (ej:20777555)");
                    runUsuario = dato.nextInt();
                    // Bucle while que valida el ingreso del runUsuario entre los números 0 y 99999999.
                    while (runUsuario > 99999999 || runUsuario <= 0){
                        System.out.println("Run usuario debe ser mayor a 0 y menor a 99999999");
                    }
                    System.out.println("Ingrese edad del Usuario");
                    edadUsuario = dato.nextInt();

                    System.out.println("Ingrese area");
                    area = dato.next();
                    // Bucle While que permite validar el largo de la variable area, entre 5 y 20 caracteres.
                    while (area.length()<5 || area.length()>20){
                        System.out.println("Área debe tener entre 5 y 20 caracteres");
                        area = dato.next();
                    }
                    System.out.println("Ingrese años de experiencia del Administrador");
                    dato.nextLine();
                    anosExperiencia = dato.nextLine();
                    // Bucle While que permite validar que la variable anosExperiencia no sea mayor a 100 caracteres.
                    while (anosExperiencia.length()>100){
                        System.out.println("Experiencia debe ser igual o menor a 100 caracteres");
                        anosExperiencia = dato.nextLine();
                    }

                contenedor1.agregarTipoUsuario(new Administrativo(nombreUsuario,fechaNacimiento,runUsuario,edadUsuario,
                        area,anosExperiencia));
                contenedor1.almacenarAdministrativo(new Administrativo(nombreUsuario,fechaNacimiento,runUsuario,edadUsuario,area,
                        anosExperiencia));

                    System.out.println("Desea agregar otro Administrador (Si o No)?");
                    String respuesta = dato.next();
            // Sentencia de control if que permite elegir entre la opción Si o No para agregar un nuevo Administrador.
                    if(respuesta.equals("Si")){
                        otroUsuario = true;
                    }else {
                        otroUsuario = false;
                    }
                }while (otroUsuario == true);

                System.out.println("---------------------------------------");
                System.out.println("Administrativos ingresados con éxito");
                contenedor1.mostrarAdministrativo();
                System.out.println("-------------------------------------------------------------------------------");

    // Sentencia de control if que permite elegir la opción Ingresar Capacitación con restricciones para sus atributos.
            } else if (seleccionMenu == 4) {
                System.out.println("Ingreso de Capacitación, siga las instrucciones a continuación:");
                boolean otroUsuario = true;
                do {
                    System.out.println("Ingrese el rut del cliente que tomará la Capacitación (sin dígito verificador)");
                    rutCliente = dato.nextInt();
                    // Bucle while que valida el ingreso del runCliente entre los números 0 y 99999999.
                    while (rutCliente > 99999999 || rutCliente <= 0) {
                        System.out.println("Rut Cliente debe ser mayor a 0 y menor a 99999999");
                        rutCliente = dato.nextInt();
                    }

                    System.out.println("Ingrese el número del día en que se realizará la Capacitación: "
                            + " \n1 Lunes \n2 Martes \n3 Miércoles \n4 Jueves \n5 Viernes \n6 Sábado \n7 Domingo ");
                    int opcion = dato.nextInt();
                    dia = "";

                    // Bucle While que permite elegir entre la opción 1 a la 7 los días de la semana.
                    while (opcion < 1 || opcion > 7) {
                        System.out.println("Debe ingresar número entre 1 y 7");
                        opcion = dato.nextInt();
                    }
                    // Sentencia de control Switch que permite enlazar el número con el respectivo día de la semana.
                    switch (opcion) {
                        case 1: dia = "lunes"; break;
                        case 2: dia = "martes"; break;
                        case 3: dia = "miércoles"; break;
                        case 4: dia = "jueves"; break;
                        case 5: dia = "viernes"; break;
                        case 6: dia = "sábado"; break;
                        case 7: dia = "domingo"; break;
                    }
                    System.out.println("Día seleccionado: " + dia);

                    System.out.println("Ingrese la hora en que se realizará la Capacitación (en formato HH:MM)");
                    hora = dato.next();

                    System.out.println("Ingrese el lugar en donde se realizará la Capacitación");
                    dato.nextLine();
                    lugar = dato.nextLine();
                    // Bucle While que permite validar que el largo de la variable lugar este entre 10 y 50 caracteres.
                    while (lugar.length() < 10 || lugar.length() > 50){
                        System.out.println("Debe ingresar un lugar entre 10 y 50 caracteres");
                        lugar = dato.nextLine();
                    }

                    System.out.println("Ingrese la duración en minutos de la Capacitación");
                    duracion = dato.nextLine();

                    //Bucle While que permite validar que la variable duración no tenga un largo mayor a 70 caracteres.
                    while (duracion.length()>70){
                        System.out.println(" La duración debe ser igual o menor a 70 caracteres");
                        duracion = dato.nextLine();
                    }

                    System.out.println("Ingrese la cantidad de asistentes a la Capacitación");
                    cantidadAsistentes = dato.nextInt();
                    //Bucle While que permite validar que la variable cantidadAsistentes no sea superior a 1000.
                    while (cantidadAsistentes >999){
                        System.out.println("Debe ingresar menos de 1000 asistentes");
                        cantidadAsistentes = dato.nextInt();
                    }

                    contenedor1.agregarCapacitacion(new Capacitacion(rutCliente, dia, hora, lugar, duracion,
                            cantidadAsistentes));

                    System.out.println("Desea agregar otra Capacitación (Si o No)?");
                    String respuesta = dato.next();
            // Sentencia de control if que permite elegir entre la opción Si o No para agregar una nueva Capacitación.
                    if(respuesta.equals("Si")){
                        otroUsuario = true;
                    }else {
                        otroUsuario = false;
                    }
                }while (otroUsuario == true);

                System.out.println("---------------------------------------");
                System.out.println("Capacitación/es ingresada/as con éxito");
                contenedor1.listarCapacitacion();
                System.out.println("-------------------------------------------------------------------------------");

            // Sentencia de control if que permite elegir la opción Eliminar Usuario.
            } else if (seleccionMenu == 5) {
                System.out.println("Ingrese el run del Usuario que desea eliminar");
                runUsuario = dato.nextInt();
                contenedor1.eliminarUsuario(runUsuario);

            // Sentencia de control if que permite elegir la opción Mostrar todos los Usuarios.
            } else if (seleccionMenu == 6) {
                contenedor1.listarUsuario();

            // Sentencia de control if que permite elegir la opción Mostrar Usuarios por tipo.
            } else if (seleccionMenu == 7) {
                System.out.println("Ingrese el número del Tipo de Usuario que desea ver");
                System.out.println("1 Cliente, 2 Profesional o 3 Administrativo");
                int tipoUsuario = dato.nextInt();
                // Sentencia de control if que entrega 3 opciones de tipos de usuario a visualizar.
                if (tipoUsuario == 1){
                    contenedor1.mostrarClienteIngresado();

                } else if (tipoUsuario == 2) {
                   contenedor1.mostrarProfesional();
                }else{
                    contenedor1.mostrarAdministrativo();
                }
                // Bucle While que permite validar que se ingrese una de las 3 opciones válidas.
                while (tipoUsuario < 1 && tipoUsuario >3){
                    System.out.println("Debe ingresar un número válido");
                    System.out.println("1 Cliente, 2 Profesional o 3 Administrativo");
                    tipoUsuario = dato.nextInt();
                    // Sentencia de control if que entrega 3 opciones de tipos de usuario a visualizar.
                    if (tipoUsuario == 1){
                        contenedor1.mostrarClienteIngresado();
                    } else if (tipoUsuario == 2) {
                        contenedor1.mostrarProfesional();
                    }else{
                        contenedor1.mostrarAdministrativo();
                    }
                }

            // Sentencia de control if que permite elegir la opción Mostrar Capacitaciones.
            } else if (seleccionMenu == 8) {
                 contenedor1.listarCapacitacion();

            } else {
                seleccionMenu = 9;
            }

        // Bucle While que permite Salir del Programa.
        } while (seleccionMenu != 9);

        System.out.println("Programa finalizado");

    }
}