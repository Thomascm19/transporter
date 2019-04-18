
package proyecto01;

/**
 *
 * @author Thomas y Felipe
 */
public class Conductor extends Persona{
    
    private int NumeroLicencia;
    private String Experiencia;
    private int CodigoEmpresa;
    
 
    public Conductor(int NumeroLicencia,String Experiencia,int CodigoEmpresa, String cedula, String nombre, String apellido, String telefono, String email) {
        super(cedula,nombre,apellido,telefono,email);
        this.NumeroLicencia = NumeroLicencia;
        this.Experiencia = Experiencia;
        this.CodigoEmpresa = CodigoEmpresa;
    }

    /**
     * @return the NumeroLicencia
     */
    public int getNumeroLicencia() {
        return NumeroLicencia;
    }

    /**
     * @param NumeroLicencia the NumeroLicencia to set
     */
    public void setNumeroLicencia(int NumeroLicencia) {
        this.NumeroLicencia = NumeroLicencia;
    }

    /**
     * @return the Experiencia
     */
    public String getExperiencia() {
        return Experiencia;
    }

    /**
     * @param Experiencia the Experiencia to set
     */
    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }

    /**
     * @return the CodigoEmpresa
     */
    public int getCodigoEmpresa() {
        return CodigoEmpresa;
    }

    /**
     * @param CodigoEmpresa the CodigoEmpresa to set
     */
    public void setCodigoEmpresa(int CodigoEmpresa) {
        this.CodigoEmpresa = CodigoEmpresa;
    }
    
    
    
    
}
