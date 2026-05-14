
package Matriz;

 class eje1 {
     public static void main(String[] args) {
         
         String[][] arena=new String[3][3];
        arena[0][0]="pekka";
        arena[0][1]="negreo de waza";
        arena[0][2]="barbaro";
        arena[1][0]="barbaro de elite";
        arena[1][1]="sabueso de lava";
        arena[1][2]="barbarril";
        arena[2][0]="mini pekka";
        arena[2][1]="pandilla de duendes";
        arena[2][2]="canion";
        
        for (int i = 0; i < arena.length; i++) {
            //columnas
            for (int j = 0; j <arena.length; j++) {
                
                System.out.print("["+arena[i][j]+"]  ");
              
            }
            System.out.println();
        }
     }
    
}
