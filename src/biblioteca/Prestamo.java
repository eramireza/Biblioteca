/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author elsar
 */
public class Prestamo {
 
    private int codigoL; 
    private int numeroSocio; 
    private int fechaP; 

    public Prestamo() {
    }

    public Prestamo(int codigoL, int numeroSocio, int fechaP) {
        this.codigoL = codigoL;
        this.numeroSocio = numeroSocio;
        this.fechaP = fechaP;
    }

    public int getCodigoL() {
        return codigoL;
    }

    public void setCodigoL(int codigoL) {
        this.codigoL = codigoL;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public int getFechaP() {
        return fechaP;
    }

    public void setFechaP(int fechaP) {
        this.fechaP = fechaP;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoL=" + codigoL + ", numeroSocio=" + numeroSocio + ", fechaP=" + fechaP + '}';
    }
    
     
        
    
    
    
}
