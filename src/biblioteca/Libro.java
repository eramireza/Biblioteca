/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author elsar
 */
public class Libro {
    protected int codigo; 
    protected String titulo;
    protected String autor; 
    protected int fechaP; 
    protected int fechaE; 
    protected int estado; 

    public Libro() {
    }

    public Libro(int codigo, String titulo, String autor, int fechaP, int fechaE, int estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaP = fechaP;
        this.fechaE = fechaE;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFechaP() {
        return fechaP;
    }

    public void setFechaP(int fechaP) {
        this.fechaP = fechaP;
    }

    public int getFechaE() {
        return fechaE;
    }

    public void setFechaE(int fechaE) {
        this.fechaE = fechaE;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}      
   
        
        

        

    
    
    


    
    
    
    

