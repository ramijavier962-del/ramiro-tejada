/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author LABO B 6
 */
public class Poo {
    // Atributos
    String nombre;
     String edad;

    // Constructor
    public Poo(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    

    // Métodos
    void ladrar() {
        System.out.println(nombre + " "+edad+ " gua guau ");
    }

    void perrero() {
        System.out.println(nombre +" "+edad+ " wazaaaaaaaa ");
    }
    
}
/*
Crear una clase Perro:
Atributos: nombre, raza
Método: ladrar() → "Guau! Guau!"
Crear 2 objetos y ejecutar el método
