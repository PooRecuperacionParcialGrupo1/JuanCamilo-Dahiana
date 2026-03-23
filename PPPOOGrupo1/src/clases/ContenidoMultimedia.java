/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author camil
 */
public abstract class ContenidoMultimedia {
    public String titulo;
    public int duracionMinutos;
    public int anioLanzamiento;
    
    public abstract void iniciarReproduccion();
    
    public String obtenerResumen(){
        return "ContenidoMultimedia{" + "titulo=" + titulo + ", anioLanzamiento=" + anioLanzamiento + '}';

    }

    public ContenidoMultimedia(String titulo, int duracionMinutos, int anioLanzamiento) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    
}
