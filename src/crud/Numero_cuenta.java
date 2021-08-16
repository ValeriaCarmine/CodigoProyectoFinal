/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.Scanner;

/**
 *
 * @author Optiplex 780
 */
public class Numero_cuenta {
      
            
    private float inscritas;
    private float aprobadas;
    private float credsem;
    private float prom;
    private float velocidad;
    private float escolaridad;
    private int num;
    private float creditosAcu;
    
   //Metodo para obtener el numero de cuenta
    int numero_insc(){
        velocidad = (credsem/creditosAcu)*100;
            if(inscritas>0){
                escolaridad = (aprobadas/inscritas)*100;
            }else{
                System.out.println("No puedes tener cero materias");
            }
        num = (int) (prom*velocidad*escolaridad);
        return num;
    }
    
    //Funcion para que el usuario agregue sus datos
    int llenado(){
        //Creamos nuestro objeto de tipo scanner
        Scanner scan = new Scanner(System.in);
        
        //Le pedimos los datos que necesitamos al usuario
        System.out.println("Ingrese su promedio: ");
        prom = scan.nextFloat();
        System.out.println("Ingrese la cantidad de materias aprobadas: ");
        aprobadas = scan.nextFloat();
        System.out.println("Ingrese la cantidad de materias inscritas: ");
        inscritas = scan.nextFloat();
        System.out.println("Ingrese cuantos créditos cursa este semestre: ");
        credsem = scan.nextFloat();
        System.out.println("Ingrese cuantos créditos lleva: ");
        creditosAcu = scan.nextFloat();        
        
        return 0;
    }
    
    //Funcion para ver el numero de inscripcion
    void datos(){
        System.out.println("Numero de inscripcion: " + numero_insc());
         }
    }

    


