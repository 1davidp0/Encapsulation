/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author DavidGD
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String direccion;
    private long numero;
    private short opc;
    
    public Empleado(String nombre, int edad, String direccion, long numero, short opc) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numero = numero;
        this.opc = opc;
    }

    //Encapsulated
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * @return the opc
     */
    public short getOpc() {
        return opc;
    }

    /**
     * @param opc the opc to set
     */
    public void setOpc(short opc) {
        this.opc = opc;
    }
    
    
}
