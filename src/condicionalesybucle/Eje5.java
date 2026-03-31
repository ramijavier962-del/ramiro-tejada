/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionalesybucle;

import java.util.Scanner;

/**
 *
 * @author LABO B 6
 */
public class Eje5 {
    public static void main(String[] args) {
         Scanner Sc = new Scanner (System.in);
         /*
         EJERCICIO 5 - Menú de opciones
Mostrar un menú:
1. Ver perfil
2. Editar datos
3. Cerrar sesión

         */
         int num;
         System.out.println("opciones:");
         System.out.println("1=ingresar Perfil");
         System.out.println("");
         System.out.println("2=editar datos");
         System.out.println("");
         System.out.println("3=cerrar sesion");
         
         System.out.println("que elijes?");
         num=Sc.nextInt();
          if(num==1){
            System.out.println("elejiste ver perfil");
            
              System.out.println("ingresando....");
            
        }else if(num==2){
            System.out.println("elejiste editar perfil");
              System.out.println("ingresando...");
            
        }else if(num==3){
            System.out.println("elejiste cerrar sesion");
              System.out.println("cerrando sesion...");
            
        }else{
            System.out.println("opcion no valida");
        }
    }
}
