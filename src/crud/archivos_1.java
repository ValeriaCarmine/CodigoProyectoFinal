/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Optiplex 780
 */
class archivos_1 {
    
    public String leerTxt(String direccion){//direccion del archivo
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader (new FileReader (direccion));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                //haz el ciclo, mientras bfRead tiene datos
                temp= temp+ "\n"+bfRead; //guardado el texto del archivo
            }
            texto =temp;
            
        }catch(IOException e){
            System.err.println ("No se encontro el archivo");
        }
        return texto;
}
    
}

