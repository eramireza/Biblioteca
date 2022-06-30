/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author elsar
 */
public class Registro extends Libro {

    Libro [] Libros;

    public Registro() {
    }

    public Registro(Libro[] Libros) {
        this.Libros = Libros;
    }

    public Registro(Libro[] Libros, int codigo, String titulo, String autor, int fechaP, int fechaE, int estado) {
        super(codigo, titulo, autor, fechaP, fechaE, estado);
        this.Libros = Libros;
    }
    
    
   
    
    public Registro (int cantLibros) {
      
        Libros=new Libro[cantLibros]; 
    }    
    public void registrarLibro(Libro l) {
      
        for (int i = 0; i < Libros.length; i++){
            if (Libros [i]==null) {
                Libros [i]=l; 
                break;
            }
        }
    }
            
}
    
        
        
     
           
    
    
    

