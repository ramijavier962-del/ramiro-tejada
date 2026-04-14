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
public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    void mayor (){
        if (edad>18) {
            JOptionPane.showMessageDialog(null,nombre+ " vo sos un chango mayor");               
        }else{
            JOptionPane.showMessageDialog(null,nombre+ " sos un chamaco,anda a jugar free fire");
        }
    }
}
