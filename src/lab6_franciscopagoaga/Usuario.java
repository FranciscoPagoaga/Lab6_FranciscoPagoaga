/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_franciscopagoaga;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Francisco Pagoaga
 */
public class Usuario {
    File archivo=null;

    public Usuario() {
    }
    
    public Usuario(String path) {
        archivo=new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public boolean login(String x, String y, String z){
        Boolean permiso=true;
        Scanner sc=null;
        try {
            if (archivo.exists()) {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    if (x.equals(sc.next())&&y.equals(sc.nextInt())&&z.equals(sc.next())) {
                        permiso=true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return permiso;
    }
    @Override
    public String toString() {
        return "Usuario{" + "archivo=" + archivo + '}';
    }
    
}
