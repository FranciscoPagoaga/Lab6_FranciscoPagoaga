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
public class Series {
    private String nombre;
    private int minutos;
    private String categorias;
    private ArrayList actores=new ArrayList();
    private int temporadas;
    private String productora;
    private String idiomaoriginal;
    private String doblaje;
    private String subtitulosalespaniol;

    public Series(String nombre, int minutos, String categorias, int temporadas, String productora, String idiomaoriginal, String doblaje, String subtitulosalespaniol, String actor) {
        this.nombre = nombre;
        this.minutos = minutos;
        this.categorias = categorias;
        this.temporadas = temporadas;
        this.productora = productora;
        this.idiomaoriginal = idiomaoriginal;
        this.doblaje = doblaje;
        this.subtitulosalespaniol = subtitulosalespaniol;
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

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public ArrayList getActores() {
        return actores;
    }

    public void setActores(ArrayList actores) {
        this.actores = actores;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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

    public String getSubtitulosalespaniol() {
        return subtitulosalespaniol;
    }

    public void setSubtitulosalespaniol(String subtitulosalespaniol) {
        this.subtitulosalespaniol = subtitulosalespaniol;
    }
    
    public String metodo(){
        String x="";
        for (int i = 0; i < actores.size(); i++) {
            x+=actores.get(i)+".";
        }
        return x;
    }
}
