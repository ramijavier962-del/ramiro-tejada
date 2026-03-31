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
public class Eje2 {
    public static void main(String[] args) {
         Scanner Sc = new Scanner (System.in);
        /*
EJERCICIO 2 - Número positivo o negativo
Solicitar un número al usuario.
- Si es mayor a 0 → "Número positivo"
- Si es menor a 0 → "Número negativo"
- Si es 0 → "Número neutro"
*/

int numero;
        System.out.println("Ingrese su numero");
        numero=Sc.nextInt();
        
        if(numero>0){
            System.out.println("el numero ingresado es positivo");
        }else if(numero==0){
            System.out.println("el numero ingresado es 0 ");
            
        }else{
            System.out.println("el numero ingresado es negativo");
        }
    }
 
}
