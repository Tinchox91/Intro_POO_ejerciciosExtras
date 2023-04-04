
package pkg5_ejerccioextras;

import java.util.Scanner;

/*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o 
del 5% si tiene menos de 30 años.
*/

public class Emleado {
    private String nombre;
    private int edad;
    private float salario;
public Scanner leer = new Scanner (System.in);
    public Emleado() {
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Emleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public void cargar(){
        System.out.println("ingrese nombre ");
      nombre=leer.next();
        System.out.println("ingrese edad");
        edad= leer.nextInt();
        System.out.println("ingrese salario");
        salario=leer.nextFloat();
    }
    
    public float calcular_aumento(){
        float aumento;
        if (edad< 30){
            aumento = salario*0.05f;
            
        }else{
            aumento = salario*0.10f;
        }
        return aumento;
        
    }
    
      @Override
    public String toString() {
        return "Emleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }  
    
}
