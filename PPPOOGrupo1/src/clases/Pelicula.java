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
    public String director;
    public String artCalidad;
    public String idiomaSubtitulos;

    public Pelicula(String director, String titulo, int duracionMinutos, int anioLanzamiento) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.director= director;
    }
    @Override
    public void iniciarReproduccion(){
        System.out.println("Cargando video y ajustando subtitulos para la pelicula...");
    }
    
    public void configurarVisualizacion(){
        System.out.println("Reproduciendo en calidad Automatica, idioma original.");
    }
    public void configurarVisualizacion(String artCalidad){
        System.out.println("Reproduciendo en calidad"+artCalidad);
    }
    public void configurarVisualizacion(String artCalidad, String idiomaSubtitulos){
        System.out.println("Reproduciendo en calidad: "+artCalidad+"con subtitulos en: "+idiomaSubtitulos);
    }
    
}
