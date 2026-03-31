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
public class Eje6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        /*
        EJERCICIO 6 - Calculadora básica
Ingresar:
- dos números
- una operación (+, -, *, /)

Usar switch para realizar la operación.
        */
        
       double num1,num2,operator;
       char ope;
        System.out.println("ingrese el primer numero");
        num1=Sc.nextDouble();
        System.out.println("");
        System.out.println("ingrese elsegundo numero");
        num2=Sc.nextDouble();
        System.out.println("");
        System.out.println("ahora ingrse una operacion (+,*,-,/)");
        ope=Sc.next().charAt(0);
        
         switch (ope){
             case'+':
                 System.out.println("realizando operacion...");
                 operator=num1+num2;
                 System.out.println(num1+"+"+num2+"="+operator);
                 break;
                 case'-':
                      System.out.println("realizando operacion...");
                      operator=num1-num2;
                      System.out.println(num1+"-"+num2+"="+operator);
                      break;
                      case'*':
                          System.out.println("realizando operacion...");
                      operator=num1*num2;
                      System.out.println(num1+"x"+num2+"="+operator);
                      break;
                      case'/':
                          System.out.println("realizando operacion...");
                      operator=num1/num2;
                      System.out.println(num1+"/"+num2+"="+operator);
                      break;
                      }
                 
        
    }
}
