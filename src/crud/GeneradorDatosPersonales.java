/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Random;

/**
 *
 * @author Optiplex 780
 */
public class GeneradorDatosPersonales {
    
    public static int[] generar() {
  

   
    int[] randomNum = new int[501];
    int min_val = 18;
    int max_val = 27;
    int j=1;
    
    Random rand = new Random();
    for (int i = 1; i <= 500; i++) {
    randomNum[i] = min_val + rand.nextInt((max_val - min_val) + 1);
        j=j+1;  
    }
        return randomNum;
    }
public static void imprimir(int[] randomNumero) {
    
    for (int j = 1; j <= 500; j++) {
    System.out.println( "Edad del alumno " +j+ ":  " +randomNumero[j]);
    
    }
}

public static void main() {
    imprimir(generar());
        
}	
    
}
 
        


