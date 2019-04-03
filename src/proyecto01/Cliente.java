
package proyecto01;


public class Cliente extends Persona{
       private int cantidadEquipaje;
       private String tipoCliente;

    /**
     * @return the cantidadEquipaje
     */
    public int getCantidadEquipaje() {
        return cantidadEquipaje;
    }

    /**
     * @param cantidadEquipaje the cantidadEquipaje to set
     */
    public void setCantidadEquipaje(int cantidadEquipaje) {
        this.cantidadEquipaje = cantidadEquipaje;
    }

    /**
     * @return the tipoCliente
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    }
