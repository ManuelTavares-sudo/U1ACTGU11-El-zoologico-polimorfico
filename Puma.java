/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracta;

/**
 *
 * @author tavar
 */
public class Puma extends Animal implements Mascota{

    public Puma(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre+"  esta gruñiendo:Grr, Grr, Grr");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" esta corriendo");
    }

    @Override
    public void jugar() {
        System.out.println(nombre+" esta jugando en el campo");
    }
    
    
}
