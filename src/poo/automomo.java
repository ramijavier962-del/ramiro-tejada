/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author LABO B 6
 */
public class automomo {
    String marca;
    String modelo;
     int velocidad;

    public automomo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 20;
    }
   void aceleroo() {
       velocidad+=100;
       System.out.println("el auto se puso furioso: velocidad actual: "+velocidad+"km/h");
       // System.out.println(nombre + " "+"edad:"+edad+" "+"altura:"+altura+" "+"materia:"+materia+" profe goood");
   }
   
   void disminuir() {
       velocidad-=20;
       if(velocidad <20){
           System.out.println("el auto se cago de miedo: velocidad actual: "+velocidad+"km/h");
           
       }
          
    //    System.out.println(nombre + " "+"edad:"+edad+" "+"altura:"+altura+" "+"materia:"+materia+" profe goood");
   }
}
