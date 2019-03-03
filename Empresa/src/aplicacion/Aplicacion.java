/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import empleado.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author DavidGD
 */
public class Aplicacion {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();
        Empleado empleado4 = new Empleado();
        Empleado empleado5 = new Empleado();
        Empleado opcion = new Empleado();
        
        //Enter data
        /*JOptionPane.showMessageDialog(null, "Empleado No 1.");
        empleado1.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        empleado1.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite su edad")));
        empleado1.setDireccion(JOptionPane.showInputDialog("Digite su direccion"));
        empleado1.setNumero(Integer.parseInt("Digite su numero"));
        
        JOptionPane.showMessageDialog(null, "Empleado No 2.");
        empleado2.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        empleado2.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite su edad")));
        empleado2.setDireccion(JOptionPane.showInputDialog("Digite su direccion"));
        empleado2.setNumero(Integer.parseInt("Digite su numero"));
        
        JOptionPane.showMessageDialog(null, "Empleado No 3.");
        empleado3.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        empleado3.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite su edad")));
        empleado3.setDireccion(JOptionPane.showInputDialog("Digite su direccion"));
        empleado3.setNumero(Integer.parseInt("Digite su numero"));
        
        JOptionPane.showMessageDialog(null, "Empleado No 4.");
        empleado4.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        empleado4.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite su edad")));
        empleado4.setDireccion(JOptionPane.showInputDialog("Digite su direccion"));
        empleado4.setNumero(Integer.parseInt("Digite su numero"));
        
        JOptionPane.showMessageDialog(null, "Empleado No 5.");
        empleado5.setNombre(JOptionPane.showInputDialog("Digite su nombre"));
        empleado5.setEdad(Short.parseShort(JOptionPane.showInputDialog("Digite su edad")));
        empleado5.setDireccion(JOptionPane.showInputDialog("Digite su direccion"));
        empleado5.setNumero(Integer.parseInt("Digite su numero"));*/
        
        //Data already entered
        empleado1.setNombre("David Parrado");
        empleado1.setEdad(18);
        empleado1.setDireccion("Cra13A#15A-32");
        empleado1.setNumero(8939949);
        
        empleado2.setNombre("Karen Velasco");
        empleado2.setEdad(18);
        empleado2.setDireccion("Cra10C#20A-31");
        empleado2.setNumero(8939949);
        
        empleado3.setNombre("Cristiano Ronaldo");
        empleado3.setEdad(35);
        empleado3.setDireccion("Cl31C#22B-13");
        empleado3.setNumero(8561478);
        
        empleado4.setNombre("Alfredo Parrado");
        empleado4.setEdad(31);
        empleado4.setDireccion("Cra5D#19A-10");
        empleado4.setNumero(8312698);
        
        empleado5.setNombre("Mariela Real");
        empleado5.setEdad(18);
        empleado5.setDireccion("Cl43B#12A-5");
        empleado5.setNumero(8934821);
        
        
        opcion.setOpc(Short.parseShort(JOptionPane.showInputDialog("Digite el numero del empleado a ver.")));
        
        switch (opcion.getOpc()) {
            case 1: 
                JOptionPane.showMessageDialog(null, "Empleado 1:\nNombre: " +  empleado1.getNombre());
                JOptionPane.showMessageDialog(null, "Edad: " + empleado1.getEdad());
                JOptionPane.showMessageDialog(null, "Direccion: " + empleado1.getDireccion());
                JOptionPane.showMessageDialog(null, "Telefono: " + empleado1.getNumero());
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Empleado 2:\nNombre: " +  empleado2.getNombre());
                JOptionPane.showMessageDialog(null, "Edad: " + empleado2.getEdad());
                JOptionPane.showMessageDialog(null, "Direccion: " + empleado2.getDireccion());
                JOptionPane.showMessageDialog(null, "Telefono: " + empleado2.getNumero());
            break;
            case 3: 
                JOptionPane.showMessageDialog(null, "Empleado 3:\nNombre: " +  empleado3.getNombre());
                JOptionPane.showMessageDialog(null, "Edad: " + empleado3.getEdad());
                JOptionPane.showMessageDialog(null, "Direccion: " + empleado3.getDireccion());
                JOptionPane.showMessageDialog(null, "Telefono: " + empleado3.getNumero());
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "Empleado 4:\nNombre: " +  empleado4.getNombre());
                JOptionPane.showMessageDialog(null, "Edad: " + empleado4.getEdad());
                JOptionPane.showMessageDialog(null, "Direccion: " + empleado4.getDireccion());
                JOptionPane.showMessageDialog(null, "Telefono: " + empleado4.getNumero());
            break;
            case 5: 
                JOptionPane.showMessageDialog(null, "Empleado 5:\nNombre: " +  empleado5.getNombre());
                JOptionPane.showMessageDialog(null, "Edad: " + empleado5.getEdad());
                JOptionPane.showMessageDialog(null, "Direccion: " + empleado5.getDireccion());
                JOptionPane.showMessageDialog(null, "Telefono: " + empleado5.getNumero());
            break;
            default: 
                JOptionPane.showMessageDialog(null, "Error, empleado no identificado.");
            break;
        }
        
    }
    
}
