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

/**
 *
 * @author Francisco Pagoaga
 */
public class administrarseries {

    private File archivo = null;
    private ArrayList<Series> series = new ArrayList();

    public administrarseries(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Series> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Series> series) {
        this.series = series;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < series.size(); i++) {
                bw.write(series.get(i).getNombre() + ";" + series.get(i).metodo() + ";" + series.get(i).getMinutos() + ";" + series.get(i).getCategorias() + ";" + series.get(i).getTemporadas()+ ";" +series.get(i).getProductora() + ";" + series.get(i).getIdiomaoriginal() + ";" + series.get(i).getDoblaje() + ";" + series.get(i).getSubtitulosalespaniol()+ ";");
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        Scanner sa=null;
        series = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String t=sc.next();
                    sa=new Scanner(sc.next());
                    sa.useDelimiter(".");
                    series.add(new Series(t,sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sa.next()));
                    
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
