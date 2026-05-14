
package Matriz;

public class eje2 {
    public static void main(String[] args) {
          String[][] mundial=new String[9][2];
       mundial[0][0]="[Seleccion";
       mundial[0][1]="[goles";
       mundial[1][0]="[Argentina";
       mundial[1][1]="[2";
       mundial[2][0]="[Brazil";
       mundial[2][1]= "   [1";
       mundial[3][0]="[Espana";
       mundial[3][1]="   [3";
       mundial[4][0]="[Mexico";
       mundial[4][1]="   [0";
       mundial[5][0]="[francia";
       mundial[5][1]="  [4";
       mundial[6][0]="[Alemania";
       mundial[6][1]=" [2";
       mundial[7][0]="[Japon";
       mundial[7][1]="    [1";
       mundial[8][0]="[Portugal";
       mundial[8][1]=" [5";
        
         for (int i = 0; i < mundial.length; i++) {
            //columnas
            for (int j = 0; j <mundial[i].length; j++) {
                
                System.out.print("  "+mundial[i][j]+"]  ");
              
            }
            System.out.println();
        }
    }
    
}
