package Distancias;

public class Principal {
 
    public static void main(String[] args) {
       Punto p = new Punto();
       p.crearPuntos();
       double resul = p.calcularDistancia();
        System.out.println("La distancia: " + resul);
    }
    
}