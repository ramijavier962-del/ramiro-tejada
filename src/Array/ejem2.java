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
public class ejem2 {
    public static void main(String[] args) {
        /*
        Creá un arreglo llamado comidasFavoritas con tus 5 platos preferidos.
Mostrá en una ventana emergente tu segundo plato favorito.
Recorre el arreglo completo y mostrales a tus compañeros tus gustos.
        */
        String[]comidasFavoritas={"milanesa con pure","milanesa napolitana con pure","pastel de papas","hamburguesas","mondongoo"};
        JOptionPane.showMessageDialog(null, "yo tengo 5 platos preferidos:");
        
        JOptionPane.showMessageDialog(null, "y mi favorita es el segundo plato:");
        JOptionPane.showMessageDialog(null, comidasFavoritas[1]);
        
      JOptionPane.showMessageDialog(null,"mis comidas preferidas son:");
      
        for (int i = 0; i < comidasFavoritas.length; i++) {
            JOptionPane.showMessageDialog(null, comidasFavoritas[i]); 
        }  
    }
}
