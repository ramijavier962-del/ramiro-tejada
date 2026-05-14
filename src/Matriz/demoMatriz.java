
package Matriz;
import javax.swing.JOptionPane;

public class demoMatriz {
    public static void main(String[] args) {
        String[][] arena=new String[5][5];
        arena[1][3]="ramiro";
        arena[2][1]="agustin";
        arena[3][3]="la chabona";
        //para acceder a esta posicion 
       // String carta=arena[1][3];
      //  System.out.println(carta);
        for (int i = 0; i < arena.length; i++) {
            //columnas
            for (int j = 0; j <arena.length; j++) {
                System.out.println("["+arena[i][j]+"]");
            }
            System.out.println();
        }
    }
   
}
