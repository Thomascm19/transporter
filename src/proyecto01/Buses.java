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
public interface Buses extends Empresa{
    
    public void setPlaca(String placa);
    String getPlaca();
    
    public void setDistribucionSillas(int[][] distribucionSillas);
    int[][] getDistribucionSillas();
    
    
}

/*
public class Buses extends Empresa{
    private String placa;
    private int [][]distribucionSillas;


  
    public String getPlaca() {
        return placa;
    }

   
    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public int[][] getDistribucionSillas() {
        return distribucionSillas;
    }

 
    public void setDistribucionSillas(int[][] distribucionSillas) {
        this.distribucionSillas = distribucionSillas;
    }

   
}


*/