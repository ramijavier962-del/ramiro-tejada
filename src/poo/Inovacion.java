/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author LABO B 6
 */
public class Inovacion {
     // Atributos
    String nombre;
    String materia;
    double altura;
     int edad;
     

    // Constructor

    public Inovacion(String nombre,int edad, double altura, String materia) {
        this.nombre = nombre;
        this.materia = materia;
        this.altura = altura;
        this.edad = edad;
    }
    
    // Métodos
    void cool() {
        System.out.println(nombre + " "+edad+" "+altura+" "+materia+" profe goood");
    }

    void badd() {
        System.out.println(nombre + " "+edad+" "+altura+" "+materia+" profe estrictooo");
    }
    

}
