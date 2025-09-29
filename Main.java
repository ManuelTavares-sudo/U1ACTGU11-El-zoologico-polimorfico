/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstracta;

/**
 *
 * @author tavar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Animal oso = new Oso("Winnieh Poo", 7);
        Animal loro = new Loro("Coco", 3);
        Animal puma = new Puma("Felix", 5);

        // Usando los métodos abstractos
        oso.hacerSonido();
        oso.moverse();

        loro.hacerSonido();
        loro.moverse();

        puma.hacerSonido();
        puma.moverse();
        
        ((Mascota)loro).jugar();
        ((Mascota)oso).jugar();
        ((Mascota)puma).jugar();
    }
    
}
