package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Luis Arango
 * @author Javier Stiven Duran
 */
public class ViajeIndividual extends Viaje{
    // Constructor
    public ViajeIndividual(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje individual";
    }
}
