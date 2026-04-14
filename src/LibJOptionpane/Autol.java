/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibJOptionpane;
import javax.swing.JOptionPane;

/**
 *
 * @author LABO B 6
 */
public class Autol {
   String marca;
    String modelo;

    public Autol(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    void arrancal(){
        JOptionPane.showMessageDialog(null, "ese auto parece carpintero");
        JOptionPane.showMessageDialog(null, "porque hace rum,porque hace rum");
    }
}
