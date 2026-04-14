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
public class MAINtiendobich {
   String nombre;
   double Precio;

    public MAINtiendobich(String nombre, double Precio) {
        this.nombre = nombre;
        this.Precio = Precio;
    }
   
   void escarero(){
       if (Precio>10000) {
           JOptionPane.showMessageDialog(null, "viejo careroooo");
           JOptionPane.showMessageDialog(null, "te wa denunciaa");
       }else{
           JOptionPane.showMessageDialog(null,"ta barato omg");
       }
   }
}
