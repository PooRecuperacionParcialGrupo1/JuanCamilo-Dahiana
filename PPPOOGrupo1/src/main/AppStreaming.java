/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import clases.Pelicula;
import clases.Podcast;
import java.util.ArrayList;
/**
 *
 * @author koomi
 */
public class AppStreaming {
    
    public static void main(String[] args) {
        ArrayList<Pelicula>peliculas=new ArrayList<>();
        ArrayList<Podcast>podcast=new ArrayList<>();
        
        Pelicula p1=new Pelicula("Pepito Perez", "La mancha", 90, 2000);
        if(!peliculas.contains(p1)){
            peliculas.add(p1);
        }
        Pelicula p2=new Pelicula("Maria Jose Salazar", "Ruleta", 120, 2004);
        if(!peliculas.contains(p2)){
            peliculas.add(p2);
        }
        Pelicula p3=new Pelicula("Trinidad Velez", "Aun asi", 60, 2010);
        if(!peliculas.contains(p3)){
            peliculas.add(p3);
        }
        Pelicula p4=new Pelicula("Juan Duque", "Run",100 , 1999);
        if(!peliculas.contains(p4)){
            peliculas.add(p4);
        }
        Podcast po1=new Podcast("Martina Calvache", "Lo que las mujeres callamos", 30, 2025);
        if(!podcast.contains(po1)){
            podcast.add(po1);
        }
        Podcast po2=new Podcast("Maria Lopez", "Experiencias paranormales", 60, 2026);
        if(!podcast.contains(po2)){
            podcast.add(po2);
        }
        Podcast po3=new Podcast("Sara Torres", "El feminismo: luchamos por nuestros derechos", 70, 2023);
        if(!podcast.contains(po3)){
            podcast.add(po3);
        }
        Podcast po4=new Podcast("Sol Loaiza", "No son ellos, eres tu", 40, 2022);
        if(!podcast.contains(po4)){
            podcast.add(po4);
        }
        System.out.println("\nRESUMEN Y REPRODUCCION...\n");
        for(Pelicula p : peliculas){
            System.out.println(p.obtenerResumen());
            p.iniciarReproduccion();
            System.out.println();
        }
        for(Podcast d : podcast){
            System.out.println(d.obtenerResumen());
            d.iniciarReproduccion();
            System.out.println();
        }
        System.out.println("\nCONFIGURACION DE PELICULAS...\n");
        for(Pelicula p : peliculas){
            System.out.println("Pelicula "+p.titulo);
            p.configurarVisualizacion();
            p.configurarVisualizacion("4k");
            p.configurarVisualizacion("1080p", "ingles");
            
            System.out.println();
        }

    }
}
