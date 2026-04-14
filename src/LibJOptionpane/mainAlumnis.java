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
public class mainAlumnis {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("ingrse el nombre");
        double nota =Double.parseDouble(JOptionPane.showInputDialog("\"ingrese la nota del usuario\""));
        Alumno ulo=new Alumno(nombre, nota);
        
        ulo.APROBO();
        
    }
}
