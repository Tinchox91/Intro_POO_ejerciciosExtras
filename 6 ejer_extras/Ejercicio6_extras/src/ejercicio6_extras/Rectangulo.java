
package ejercicio6_extras;
/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" }
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" 
con lados de 4 y 6 y imprime el área del rectángulo.*/
public class Rectangulo {
    private int base;
    private int altura;
 public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
 
    public int area(){
        int areaa= base*altura;
        return areaa;
    }

   
    
}
