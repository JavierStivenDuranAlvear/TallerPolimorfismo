package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Luis Arango
 * @author Javier Stiven Duran
 */
public abstract class Viaje {
    // <editor-fold desc="Atributos">>
    protected String origen;
    protected String destino;
    protected int costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;
    //</editor-fold>
    // Constructores, getters y setters
    /**
     * Constructor parametrizado de la clase Viaje
     * @param prmOrigen String que describe el lugar de origen del viaje. 
     * @param prmDestino String que describe el lugar de destino del viaje.
     * @param prmCosto Costo del viaje seleccionado de tipo entero.
     * @param prmFechaSalida Date que indica la fecha de inicio del viaje (ida).
     * @param prmFechaLlegada Date que indica la fecha de fin del viaje (vuelta).
     */
    public Viaje(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada) {
        this.origen = prmOrigen;
        this.destino = prmDestino;
        this.costo = prmCosto;
        this.fechaSalida = prmFechaSalida;
        this.fechaLlegada = prmFechaLlegada;
    } 
    public abstract String descripcion();
    
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }
    // <editor-fold desc="Getters">> }
    /**
     * Recupera el origen del viaje.
     * @return String 
     */
    public String getOrigen() {
        return origen;
    }
    /**
     * Recupera el destino del viaje
     * @return String
     */
    public String getDestino() {
        return destino;
    }
    /**
     * Recupera el costo del viaje.
     * @return int
     */
    public int getCosto() {
        return costo;
    }
    /**
     * Recupera la fecha de salida del viaje.
     * @return Date
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }
    /**
     * Recupera la fecha de llegada del viaje.
     * @return Date
     */
    public Date getFechaLlegada() {
        return fechaLlegada;
    }
    //</editor-fold>
    // <editor-fold desc="Setters">>
    /**
     * Modifica el Origen del viaje.
     * @param origen String que actualiza el origen del viaje.
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }  
    /**
     * Modifica el destino del viaje.
     * @param destino String que actualiza el destino del viaje.
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    /**
     * Modifica el costo del viaje.
     * @param costo int que actualiza el valor del costo del viaje.
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
    /**
     * Modifica la fecha de salida del viaje.
     * @param fechaSalida Date que actualiza la fecha de salida del viaje.
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    /**
     * Modifica la fecha de llegada del viaje.
     * @param fechaLlegada Date que actualiza la fecha de llegada del viaje.
     */
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
    //</editor-fold>   
}
