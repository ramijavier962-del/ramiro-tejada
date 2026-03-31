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
public class Eje4 {
    public static void main(String[] args) {
         Scanner Sc = new Scanner (System.in);
        /*
        EJERCICIO 4 - Mayor de tres números
Ingresar tres números distintos.
Mostrar cuál es el mayor.
        */
        int n1,n2,n3;
        System.out.println("ingrese los 3 numeros para comparar");
        System.out.println("");
        System.out.println("ingrese el primer numero");
        n1=Sc.nextInt();
        System.out.println("");
        System.out.println("ingrese el segundo numero");
        n2=Sc.nextInt();
        System.out.println("");
        System.out.println("ingrese el tercer numero");
        n3=Sc.nextInt();
        
        if(n1>n2&n1>n3){
            System.out.println("el numero: "+n1+" es el mayor");
            
        }else if(n2>n1&n2>n3){
            System.out.println("el numero: "+n2+" es el mayor");
            
        }else if(n3>n1&n3>n2){
            System.out.println("el numero: "+n3+" es el mayor");
            
        }else{
            System.out.println("los numeros son iguales");
        }
    }
}
