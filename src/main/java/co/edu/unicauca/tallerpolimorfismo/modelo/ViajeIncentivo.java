package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Luis Arango
 * @author Javier Stiven Duran
 */
public class ViajeIncentivo extends Viaje{
    /**
    * Empresa que patrocina el viaje al empleado
    */
    private String empresa;
    //Constructor, getters and setters
    public ViajeIncentivo(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada, String prmEmpresa) {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        this.empresa = prmEmpresa;
    }
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
