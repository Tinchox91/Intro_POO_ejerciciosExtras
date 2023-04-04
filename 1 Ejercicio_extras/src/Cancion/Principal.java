
package Cancion;

import java.util.Scanner;

public class Principal {

  
    public static void main(String[] args) {
     Cancion can = new Cancion();
       Scanner sc = new Scanner(System.in);
       
        int var;
        boolean val = true;
        while (val) {
        System.out.println("1.Cargar Cancion..:");
        System.out.println("2.mostrar canciones");
        System.out.println("3.Salir");
        
var=sc.nextInt();
        
            switch (var) {
                case 1: can.crearCancion();
                    break;
                case 2:can.mostrarCancion();
                    break;
                case 3:val=false;
                    break;
                                default:
                    throw new AssertionError();
            }

        }
    }
    
}
