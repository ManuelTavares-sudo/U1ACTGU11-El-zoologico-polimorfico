/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstracta;

/**
 *
 * @author tavar
 */
public class Oso extends Animal implements Mascota {

    public Oso(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre+"  esta gruñendo:Grr, Grr, Grr");
    }

    @Override
    public void moverse() {
        System.out.println(nombre+" se esta moviendo");
    }

    @Override
    public void jugar() {
        System.out.println(nombre+" esta jugando con la miel");
    }
    
}
