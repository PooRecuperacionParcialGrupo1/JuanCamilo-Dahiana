/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author koomi
 */
public class Pelicula extends ContenidoMultimedia {
    String director;

    public Pelicula(String director, String titulo, int duracionMinutos, int anioLanzamiento) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.director= director;
    }
    @Override
    public void iniciarReproduccion(){
        System.out.println("Cargabdo video y ajustando subtitulos para la pelicula...");
    }
    
    
    
}
