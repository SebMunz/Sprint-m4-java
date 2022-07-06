package clases;

/**
 * Sprint M4
 *
 * Clase Capacitación.
 * Se declaran los atributos de la clase, junto con un constructor vacío y un constructor que recibe todos
 * los atributos como parámetros. Además de los métodos mutadores, accesadores, generaIdentificador, mostrarDetalle y
 *  toString.
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 05-07-2022
 */
public class Capacitacion {
    // Se declaran los atributos.
        private int identificador;
        private int rutClientes;
        private String dia;
        private String hora;
        private String lugar;
        private String duracion;
        private int cantidadAsistentes;

        // Se generan los métodos mutadores y accesadores.
        public int getIdentificador() { return identificador; }

        public int getRutClientes() { return rutClientes; }

        public void setRutClientes(int rutClientes) { this.rutClientes = rutClientes; }

        public String getDia() { return dia; }

        public void setDia(String dia) { this.dia = dia; }

        public String gethora() { return hora; }

        public void sethora (String hora) { this.hora = hora; }

        public String getLugar() { return lugar; }

        public void setLugar(String lugar) { this.lugar = lugar; }

        public String getDuracion() { return duracion; }

        public void setDuracion(String duracion) { this.duracion = duracion; }

        public int getCantidadAsistentes() { return cantidadAsistentes; }

        public void setCantidadAsistentes(int cantidadAsistentes) { this.cantidadAsistentes = cantidadAsistentes; }

    /**
     * Método genera Identificador.
     * Crea el número identificador de la clase Capacitación.
      * @return Número entero aleatorio.
     */
    private int generaIdentificador(){
            return (int)(Math.random()*100);
        }

        // Constructor vacío.
        public Capacitacion(){
            this.identificador = generaIdentificador();
        }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param rutClientes
     * @param dia
     * @param hora
     * @param lugar
     * @param duracion
     * @param cantidadAsistentes
     */
        public Capacitacion(int rutClientes, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
            this.identificador = generaIdentificador();
            this.rutClientes = rutClientes;
            this.dia = dia;
            this.hora = hora;
            this.lugar = lugar;
            this.duracion = duracion;
            this.cantidadAsistentes = cantidadAsistentes;
        }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los atributos de la clase.
     * @return identificador, rutclientes, dia, hora, lugar, duracion, cantidadAsistente.
     */
    @Override
    public String toString() {
        return  "Capacitacion{" +
                "identificador=" + identificador +
                ", rutClientes=" + rutClientes +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion + " horas" +
                ", cantidadAsistentes=" + cantidadAsistentes + " personas" +
                '}';
    }

    /**
     * Método mostrarDetalle.
     * Muestra por pantalla un mensaje especificando el lugar, la hora, el día y la duración de la Capacitación.
     */
    public void mostrarDetalle(){
            System.out.println("La capacitación será en "+lugar+ " a las "+hora+"hrs. del día "+dia
                    +" y durará "+duracion);
        }

    }
