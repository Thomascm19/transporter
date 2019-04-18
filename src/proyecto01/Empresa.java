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
public interface Empresa {

    public void setNit(String nit);
    String getNit();
    
    public void setNombre(String nombre);
    String getNombre();
    
    public void setDireccion(String direccion);
    String getDireccion();
    
    public void setTelefono(String telefono);
    String getTelefono();
    
}