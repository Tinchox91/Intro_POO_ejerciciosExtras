
package Cancion;

import java.util.ArrayList;
import java.util.Scanner;

/*Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como
parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
*/
public class Cancion {
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    ArrayList<Cancion> lista = new ArrayList<Cancion>();

    public void crearCancion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe el titulo ");
        titulo = leer.next();
        System.out.println("Escribe el autor");
        autor = leer.next();
        Cancion can = new Cancion(titulo,autor);
        lista.add(can);

    }
    public void mostrarCancion(){
         for (Cancion can : lista) {//muestro la lista con el bucle for each
        System.out.println(can.toString());// muestro los atributos de los objetos a travez de toString
        System.out.println("----------------");
    }
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo:  " + titulo + ", autor:  " + autor + '}';
    }
    

    
}
