/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author LABO B 6
 */
public class MAINpersona {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("ingrese su nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));
        Persona e1=new Persona(nombre, edad);
        e1.mayor();
    }
    
}
