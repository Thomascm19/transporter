/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01;

import java.util.Date;

/**
 *
 * @author thoma
 */
public class Reserva extends Compra{
    private Date fechaReserva;
    private String cedula;
    
    public Reserva(Date fechaReserva, Date fecha_ida, Date fechaCompra, int nSilla, String pago, String cedula){
        super(fecha_ida,fechaCompra, nSilla, pago);
        this.fechaReserva = fechaReserva;
        this.cedula = cedula;
    }

    /**
     * @return the fechaReserva
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * @param fechaReserva the fechaReserva to set
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
