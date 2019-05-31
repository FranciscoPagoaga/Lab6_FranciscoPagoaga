/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_franciscopagoaga;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Pagoaga
 */
public class administrarpeliculas {
    private File archivo=null;
    private ArrayList<Peliculas> peliculas=new ArrayList();

    public administrarpeliculas(String path) {
        archivo=new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Peliculas> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    
    public void escribirArchivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(archivo,true);
            bw=new BufferedWriter(fw);
                for (int i = 0; i < peliculas.size(); i++) {
                    bw.write(peliculas.get(i).getNombre()+";"+peliculas.get(i).metodo()+";"+peliculas.get(i).getMinutos()+";"+peliculas.get(i).getCategoria()+";"+peliculas.get(i).getDirector()+";"+peliculas.get(i).getProductora()+";"+peliculas.get(i).getIdiomaoriginal()+";"+peliculas.get(i).getDoblaje()+";"+peliculas.get(i).getSubtitulos()+";");
                    bw.write("\n");
                }
            bw.flush();
        } catch (Exception e){
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        Scanner sa=null;
        peliculas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String t=sc.next();
                    while (sc.hasNext()) {
                        sa=new Scanner(sc.next());
                        sa.useDelimiter(".");
                        peliculas.add(new Peliculas(t,sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sa.next()));
                    }
                }
            } catch (Exception e) {

            }
            sc.close();
        }
    }
}
