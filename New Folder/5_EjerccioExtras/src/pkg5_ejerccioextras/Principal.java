
package pkg5_ejerccioextras;


public class Principal {

    
    public static void main(String[] args) {
       Emleado emple = new Emleado();
       emple.cargar();
       
       float aumento=emple.calcular_aumento();
        System.out.println("El empleado "+emple.getNombre()+" cobrara $ "+(aumento)+" de aumento");
       
           
    
        
    }
    
}
