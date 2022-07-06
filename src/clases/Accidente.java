package clases;

/**
 * Sprint M4
 *
 * @author El Piero tiene sueño
 * Se declaran los atributos de la clase, junto con un constructor vacío y un constructor que recibe todos los atributos
 * como parámetros. Además de los métodos mutadores, accesadores,toString, generaIdentificador.
 * @version 0.0.1
 * @since 05-07-2022
 */
public class Accidente {
    // Se declaran los atributos.
    private int identificadorAccidente;
    private int rutCliente;
    private String diaAccidente;
    private String horaAccidente;
    private String lugarAccidente;
    private String origenAccidente;
    private String consecuencias;

    // Se generan los métodos mutadores y accesadores.
    public int getIdentificadorAccidente() {
        return identificadorAccidente;
    }

    public void setIdentificadorAccidente(int identificadorAccidente) {
        this.identificadorAccidente = identificadorAccidente;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDiaAccidente() {
        return diaAccidente;
    }

    public void setDiaAccidente(String diaAccidente) {
        this.diaAccidente = diaAccidente;
    }

    public String getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(String horaAccidente) {
        this.horaAccidente = horaAccidente;
    }

    public String getLugarAccidente() {
        return lugarAccidente;
    }

    public void setLugarAccidente(String lugarAccidente) {
        this.lugarAccidente = lugarAccidente;
    }

    public String getOrigenAccidente() {
        return origenAccidente;
    }

    public void setOrigenAccidente(String origenAccidente) {
        this.origenAccidente = origenAccidente;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
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
    public Accidente(){
        this.identificadorAccidente = generaIdentificador();
    }

    /**
     * Constructor que recibe los atributos de la clase como parámetros.
     * @param rutCliente
     * @param diaAccidente
     * @param horaAccidente
     * @param lugarAccidente
     * @param origenAccidente
     * @param consecuencias
     */
    public Accidente(int rutCliente, String diaAccidente, String horaAccidente, String lugarAccidente, String origenAccidente, String consecuencias) {
        this.rutCliente = rutCliente;
        this.diaAccidente = diaAccidente;
        this.horaAccidente = horaAccidente;
        this.lugarAccidente = lugarAccidente;
        this.origenAccidente = origenAccidente;
        this.consecuencias = consecuencias;
    }

    /**
     * Método toString.
     * Muestra por pantalla texto concatenado con los atributos de la clase.
     * @return identificadorAccidente, rutCliente, diaAccidente, horaAccidente, lugarAccidente, origenAccidente y
     * consecuencias
     */
    @Override
    public String toString() {
        return "Accidente{" +
                "identificadorAccidente=" + identificadorAccidente +
                ", rutCliente='" + rutCliente + '\'' +
                ", diaAccidente='" + diaAccidente + '\'' +
                ", horaAccidente='" + horaAccidente + '\'' +
                ", lugarAccidente='" + lugarAccidente + '\'' +
                ", origenAccidente='" + origenAccidente + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }

}
