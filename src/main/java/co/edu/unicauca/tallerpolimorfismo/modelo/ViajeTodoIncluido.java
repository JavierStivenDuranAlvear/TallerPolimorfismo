package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Luis Arango
 * @author Javier Stiven Duran
 */
public class ViajeTodoIncluido extends Viaje{
    // Constructores
    public ViajeTodoIncluido(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta tu viaje todo incluido";
    }
    //No se sobreescribe cualquierMetodo2()
}
