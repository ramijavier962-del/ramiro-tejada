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
public class EJEM1 {
    public static void main(String[] args) {
      /*  Creá un arreglo de tipo String llamado mochila con 5 elementos.
Cargalo con los útiles escolares que traés habitualmente a clase.
Mostrá con JOptionPane el tercer útil (posición 2) y el último útil (posición 4).
Luego, recorré todo el arreglo usando un bucle y mostrá cada ítem en una ventana emergente.
*/
      String[]MOCHILA={"cartuchera","pistola","carpeta","lapicera","cuter"};
      JOptionPane.showMessageDialog(null, "el segundo objeto de la mochila es; "); 
      JOptionPane.showMessageDialog(null, MOCHILA[1]);
      
      JOptionPane.showMessageDialog(null, "el cuerto objeto de la mochila es: ");
      JOptionPane.showMessageDialog(null, MOCHILA[3]);
      
      JOptionPane.showMessageDialog(null, "y todos los materiales que hay en la mochila son:");
        for (int i = 0; i < MOCHILA.length; i++) {
            JOptionPane.showMessageDialog(null, MOCHILA[i]);
        }
      
    }
}
