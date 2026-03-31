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
public class Eje3 {
    public static void main(String[] args) {
         Scanner Sc = new Scanner (System.in);
        /*
        EJERCICIO 3 - Clasificación de nota
Ingresar una nota (0 a 10):
- 9-10 → "Excelente"
- 7-8 → "Aprobado"
- 4-6 → "Recupera"
- 0-3 → "Desaprobado"
=
        */
        double nota;
        System.out.println("ingrese su nota para evaluarlo");
        nota=Sc.nextInt();
        
         if(nota>=9||nota==10){
            System.out.println("exelente nota");
        }else if(nota>=7||nota==8){
            System.out.println("aprobado ");
            
        }else if(nota>=4||nota==6){
            System.out.println("recupera");
        }else if(nota>=0||nota==3){
             System.out.println("lola, a febrero");
        }
    }
}
