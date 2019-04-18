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
public class Compra {
    private Date fecha_ida;
    private Date fechaCompra;
    private int nSilla;
    private String pago;
    
    public Compra(Date fecha_ida,Date fechaCompra,int nSilla, String pago){
        this.fecha_ida = fecha_ida;
        this.fechaCompra = fechaCompra;
        this.nSilla = nSilla;
        this.pago = pago;
    }

    /**
     * @return the fecha_ida
     */
    public Date getFecha_ida() {
        return fecha_ida;
    }

    /**
     * @param fecha_ida the fecha_ida to set
     */
    public void setFecha_ida(Date fecha_ida) {
        this.fecha_ida = fecha_ida;
    }

    /**
     * @return the nSilla
     */
    public int getnSilla() {
        return nSilla;
    }

    /**
     * @param nSilla the nSilla to set
     */
    public void setnSilla(int nSilla) {
        this.nSilla = nSilla;
    }

    /**
     * @return the pago
     */
    public String getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(String pago) {
        this.pago = pago;
    }

    /**
     * @return the fechaCompra
     */
    public Date getFechaCompra() {
        return fechaCompra;
    }

    /**
     * @param fechaCompra the fechaCompra to set
     */
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
