/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import javax.swing.JOptionPane;
/**
 *
 * @author LABO B 6
 */
public class ejem4 {
    public static void main(String[] args) {
        String[]edadFamilias={"42","39","16","12"};
        JOptionPane.showMessageDialog(null,"en mi familia somos 5");
        JOptionPane.showMessageDialog(null,"papa, mama, hermano, hermana");
        
        JOptionPane.showMessageDialog(null,"mi ama tiene: " + edadFamilias[1]+" años");
        JOptionPane.showMessageDialog(null,"y las edades de mis familiares son: ");
        for (int i = 0; i < edadFamilias.length; i++) {
            JOptionPane.showMessageDialog(null, edadFamilias[i]);
        }
        
    }
  
}
