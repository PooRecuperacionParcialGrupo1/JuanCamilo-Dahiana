/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author koomi
 */
public class Podcast extends ContenidoMultimedia {
    public String anfitrion;

    public Podcast(String anfitrion, String titulo, int duracionMinutos, int anioLanzamiento) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.anfitrion = anfitrion;
    }
    @Override
    public void iniciarReproduccion(){
        System.out.println("Conectando al servidor de audio y preparando el episodio del podcast...");
    }
    
}
