/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracta;
/**
 *
 * @author tavar
 */
public class Loro extends Animal implements Mascota{

    public Loro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre+" esta parloteando: Pla,Pla,Pla,Pla");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" esta volando");
    }

    @Override
    public void jugar() {
        System.out.println(nombre+" esta jugando en la jaula");
    }
    
    
}
