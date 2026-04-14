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
public class Castrol {
    public static void main(String[] args) {
        String marca=JOptionPane.showInputDialog("ingrese el marca del brum");
        String modelo=JOptionPane.showInputDialog("ingrese la marca del carpintero");
        
         Autol autito30=new Autol("fiat", "147");
         autito30.arrancal();
    }
}
