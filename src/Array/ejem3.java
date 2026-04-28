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
public class ejem3 {
    public static void main(String[] args) {
        /*Armá un arreglo llamado canciones con los títulos de tus 5 canciones favoritas.
Mostrá la primera y la última canción usando JOptionPane.
Mostrá todas las canciones con un bucle.*/
        String[]canciones={"444","pretexto","obsecion","traicionera","Bandolero"};
        JOptionPane.showMessageDialog(null, "yo tengo 5 musicas god");
        JOptionPane.showMessageDialog(null,"la 1ra es: " + canciones[0]);
        JOptionPane.showMessageDialog(null, "la ultima es: "+canciones[4]);
        
        JOptionPane.showMessageDialog(null, "y las 5 songs son");
        for (int i = 0; i <canciones.length ; i++) {
            JOptionPane.showMessageDialog(null, canciones[i]);
        }
    }
}
