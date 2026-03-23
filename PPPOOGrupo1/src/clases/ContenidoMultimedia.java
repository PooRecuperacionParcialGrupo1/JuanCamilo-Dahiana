/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContenidoMultimedia other = (ContenidoMultimedia) obj;
        return Objects.equals(this.titulo, other.titulo);
    }
    
    
    
    
    
}
