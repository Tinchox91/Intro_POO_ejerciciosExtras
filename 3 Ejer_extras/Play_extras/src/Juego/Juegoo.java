
package Juego;

import java.util.Scanner;


public class Juegoo {
    
    public int numero1;
    public int numero2;
    
    public void iniciar_juego() {
        Scanner leer = new Scanner (System.in);
        System.out.println("JUGADOR 1: Ingrese el número a adivinar");
        numero1 = leer.nextInt();
        boolean val = true;
        
        System.out.println("JUGADOR 2: Tiene 3 intentos para adivinar el número");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el número");
            numero2 = leer.nextInt();
            
            if (numero2 == numero1) {
                System.out.println("Usted ha adivinado el número");
                val = false;
                break;
            } else if (numero2 < numero1) {
                System.out.println("El número a adivinar es más alto");
            } else if (numero2 > numero1) {
                System.out.println("El número a adivinar es más bajo");
            }
            
        }
        
        if (true == val) {
            System.out.println("Usted ha agotado los intentos");
        }
    }
}
    

