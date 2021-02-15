package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Luis Arango
 * @author Javier Stiven Duran
 */
public class ViajeFamiliar extends Viaje{
    // <editor-fold desc="Atributos">>
    /**
    * Cantidad de integrantes de la familia
    */
    private int familia;
    //</editor-fold>
    //Constructor getters and setters
    public ViajeFamiliar(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada, int prmFamilia) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        this.familia = prmFamilia;
    }
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
    // <editor-fold desc="Getters">
    public int getFamilia() {
        return familia;
    }
    //</editor-fold>
    // <editor-fold desc="Setters">>
    public void setFamilia(int familia) {
        this.familia = familia;
    }
    //</editor-fold>
}
