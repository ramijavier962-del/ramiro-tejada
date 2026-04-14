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
public class TiendA {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("ingrese el nombre del producto");
        double precio =Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del producto"));
        
        MAINtiendobich a1=new MAINtiendobich(nombre, precio);
        a1.escarero();
    }
}
