
package proyecto01;


public class Buses extends Empresa{
    private String placa;
    private String tipoBus;
    private int distribucionSillas;


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
     * @return the tipoBus
     */
    public String getTipoBus() {
        return tipoBus;
    }

    /**
     * @param tipoBus the tipoBus to set
     */
    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    /**
     * @return the distribucionSillas
     */
    public int getDistribucionSillas() {
        return distribucionSillas;
    }

    /**
     * @param distribucionSillas the distribucionSillas to set
     */
    public void setDistribucionSillas(int distribucionSillas) {
        this.distribucionSillas = distribucionSillas;
    }
}
