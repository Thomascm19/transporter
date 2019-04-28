/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto01;

/**
 *
 * @author thoma
 */
public class Bus {
    
    private String placa;
    private int[][] distribucionSillas;   
    
    public Bus(String placa, int[][] distribucionSillas){
        this.placa = placa;
        this.distribucionSillas = distribucionSillas;        
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the distribucionSillas
     */
    public int[][] getDistribucionSillas() {
        return distribucionSillas;
    }

    /**
     * @param distribucionSillas the distribucionSillas to set
     */
    public void setDistribucionSillas(int[][] distribucionSillas) {
        this.distribucionSillas = distribucionSillas;
    }
    
}
