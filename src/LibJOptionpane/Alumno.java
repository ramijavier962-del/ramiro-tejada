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
public class Alumno {
    String nombre;
    double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    void APROBO(){
        if (nota>6) {
           JOptionPane.showMessageDialog(null,nombre +"  aprovo ");
        JOptionPane.showMessageDialog(null, "abanderado");  
        }else{
            JOptionPane.showMessageDialog(null,nombre +" no aprovo ");
        JOptionPane.showMessageDialog(null, "puto"); 
        }
       
    }
}
