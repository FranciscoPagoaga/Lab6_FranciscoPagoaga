/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_franciscopagoaga;

import java.util.ArrayList;

/**
 *
 * @author Francisco Pagoaga
 */
public class Peliculas {
    private String nombre;
    private int minutos;
    private String categoria;
    private ArrayList actores= new ArrayList();
    private String director;
    private String productora;
    private String idiomaoriginal;
    private String doblaje;
    private String subtitulos;

    public Peliculas(String nombre, int minutos, String categoria, String director, String productora, String idiomaoriginal, String doblaje, String subtitulos,String actor) {
        this.nombre = nombre;
        this.minutos = minutos;
        this.categoria = categoria;
        this.director = director;
        this.productora = productora;
        this.idiomaoriginal = idiomaoriginal;
        this.doblaje = doblaje;
        this.subtitulos = subtitulos;
        this.actores.add(actor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList getActores() {
        return actores;
    }

    public void setActores(ArrayList actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdiomaoriginal() {
        return idiomaoriginal;
    }

    public void setIdiomaoriginal(String idiomaoriginal) {
        this.idiomaoriginal = idiomaoriginal;
    }

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }
    
    public String metodo(){
        String x="";
        for (int i = 0; i < actores.size(); i++) {
            x+=actores.get(i)+".";
        }
        return x;
    }
            
}