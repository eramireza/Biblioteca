

package biblioteca;

import java.util.Scanner;

/**
 *
 * @author elsar
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in); 
       
       System.out.println("Ingrese cantidad de libros: "); 
       int cantLibros=sc.nextInt();
       
       Registro registrar=new Registro(cantLibros);
       
       
       System.out.println("-----------");
       System.out.println("ingrese titulo del libro: ");
       String titLibro=sc.next();
       System.out.println("ingrese estado 1-disponible 2-no disponible");
       int est=sc.nextInt();
       
       System.out.println("Ingrese codigo de libro: ");
       int codigo=sc.nextInt();
       System.out.println("Ingrese numero de socio: ");
       int numS=sc.nextInt();
       System.out.println("Ingrese fecha de prestamo: "); 
       int fechap=sc.nextInt(); 
       
       Prestamo prestamo=new Prestamo(codigo,numS,fechap);
        
        
        
        
    
       
      
    }
    
}
