/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import static crud.GeneradorDatosPersonales.generar;// Con el operador punto abrimos la clase GeneradorNombres y se jecuta la funcion generarNombresAleatorios
import static crud.GeneradorDatosPersonales.imprimir;// Con el operador punto abrimos la clase GeneradorNombres y se jecuta la funcion imprimir
import static crud.GeneradorNombres.generarNombresAleatorios;
import static crud.GeneradorNombres.imprimir;
import java.io.IOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Optiplex 780
 */
public class CRUD {
 public static void main(String[] args) throws IOException {
        int opc; // opcion
	Scanner scan = new Scanner(System.in); //Objeto de tipo Scanner
	// lista en dónde SE almacenan los alumnos:
        ArrayList<RegistroAcademico> listaRegistroAcademico = new ArrayList<>();

	System.out.println("PROGRAMA DE GESTION ESCOLAR ");
                     
//Menú del CRUD

	System.out.println("Seleccione una opción: ");

	do{
            System.out.println("\n");
            System.out.println("1.- Crear registro de alumno: ");
            System.out.println("2.- Listar registro: ");
            System.out.println("3.- Eliminar registro: ");
            System.out.println("4.- Modificar registro: ");
            System.out.println("5.- Modulo generador de nombres: ");
            System.out.println("6.- Modulo generador de datos personales: ");
            System.out.println("7.- Modulo generador numero de inscripción: ");
            //System.out.println("8. Exportar arcivo .csv ");
            System.out.println("8.- Salir: ");
            System.out.println("\n");

            opc = scan.nextInt(); 
            switch(opc){
				
                    case 1: 
// Creat: crea un Registro Academico
                        RegistroAcademico registro = new RegistroAcademico();
                        System.out.println("\n"+ "Ingrese el numero de cuenta del alumno: ");
                        scan.nextLine(); 
                        registro.setNumCuenta(scan.nextLine());
                       
                  
                        System.out.println("Ingrese el numero de materias inscritas: ");
                        registro.setNumIns(scan.nextLine());
                        
                        System.out.println("Ingrese el numero de materias aprobadas: ");
                        registro.setNumApro(scan.nextLine());
                        
                        System.out.println("Ingrese su promedio: ");
                        registro.setPromedio(scan.nextLine());
                        
                        System.out.println("Ingrese sus creditos actuales: ");
                        registro.setCreAlu(scan.nextLine());
                        
                        System.out.println("< Creditos que deberia llevar, segun el semestre que cursa >");
                        System.out.println("Semestre 1 : 46 "+ "\n" + "Semestre 2 : 86" + "\n" + "Semestre 3 : 130" + "\n" + "Semestre 4: 172"+"\n" + "Semestre 5: 220"+"\n" + "Semestre 6: 268"+"\n" + "Semestre 7: 316"+"\n" + "Semestre 8: 362"+"\n" + "Semestre 9: 406"+"\n" + "Semestre 10: 440");
                        System.out.println( "\n"+ "Ingrese los créditos acumulados que debería tener el alumno de acuerdo a los semestres desde su ingreso ");
                        registro.setCreIng(scan.nextLine());
                        
                        System.out.println( "\n"+ "Ingrese el semestre en el que va");
                        registro.setSemestre(scan.nextInt());

           //Obtiene: Guarda los datos del registro previamente creado

                        listaRegistroAcademico.add(registro);          

                        break;

                    // UPDATE :  Lista los registros previamente creados y guardados en un arreglo de lista 

                    case 2: 
                        
                        for(int i=0; i<listaRegistroAcademico.size();i++){  
                            //Para obtener un elemento de la lista
                            RegistroAcademico listaDatos = listaRegistroAcademico.get(i);
                            
                            System.out.println("Numero de cuenta: " + listaDatos.getNumCuenta()); //GUARDA NUMERO DE CUENTA
                            System.out.println("Numero de materias inscritas: " + listaDatos.getNumIns()); //GUARDA NUMERO DE MATERIAS INSCRITAS
                            System.out.println("Numero de materias aprobadas: " + listaDatos.getNumApro()); //GUARDA NUMERO DE MATERIAS APROBADAS
                            System.out.println("Promedio: " + listaDatos.getPromedio()); //GUARDA EL PROMEDIO DEL ALUMN@
                            System.out.println("Creditos actuales: " + listaDatos.getCreAlu()); //GUARDA EL NUMERO DE CREDITOS ACTUALES
                            System.out.println("Creditos por semestre: " + listaDatos.getCreIng()); //GUARDA EL NUMERO DE CREDITOS DESDE EL INGRESO
                            System.out.println("Semestre actual: " + listaDatos.getSemestre()); //GUARDA EL semestre
                          
                            
                            System.out.println("\n" + "El/La alumn@ fue registrado exitosamente"+ "\n");
                        }
                    break;
                    
                // DELETE: elimamos el o los registros que fueron ingresados, leidos y listados

                    case 3: //Eliminar registro
                        System.out.println("\n" + "\n" + "Ingrese el numero de cuenta de la persona a la cual se eliminara el registro: ");
                        scan.nextLine();
                        String NumCuenta = scan.nextLine();
                        
                        for(int i=0; i<listaRegistroAcademico.size(); i++){
                            RegistroAcademico listaDatos = listaRegistroAcademico.get(i);
                            if(NumCuenta.equals(listaDatos.getNumCuenta())){
                                listaRegistroAcademico.remove(i);
                                System.out.println("Registro eliminado"+ "\n");
                            }else{
                                System.out.println("\n" + "No hay registros en la lista"+"\n");
                                System.out.println(" ");
                            }
                        }
                    break;

                     //CRUD inicia, y permite realizar las acciones previas, estan dentro de la funcion modifcar registro
                    
                    case 4: //Modificar registro
                        System.out.println("\n" +"Este es el registro actual del alumn@"+ "\n");
                        System.out.println("Ingrese el numero de cuenta del registro a modificar: ");
                        scan.nextLine();
                        NumCuenta = scan.nextLine();
                        for(int i = 0; i<listaRegistroAcademico.size(); i++){
                             RegistroAcademico listaDatos = listaRegistroAcademico.get(i);
                             if(NumCuenta.equals(listaDatos.getNumCuenta())){
                                System.out.println("Numero de cuenta: " + listaDatos.getNumCuenta());
                                System.out.println("Numero de materias inscritas: " + listaDatos.getNumIns());
                                System.out.println("Numero de materias aprobadas: " + listaDatos.getNumApro());
                                System.out.println("Promedio: " + listaDatos.getPromedio());
                                System.out.println("Creditos actuales: " + listaDatos.getCreAlu());
                                System.out.println("Creditos por semestre: " + listaDatos.getCreIng());
                                System.out.println("Semestre actual: " + listaDatos.getSemestre());
                                System.out.println("\n");
                             
                            
                                 System.out.println("Ingrese nuevo numero de cuenta:");
                                 String numCuenta = scan.nextLine();
                                 System.out.println("Ingrese nuevo numero de materias inscritas: ");
                                 String numIns = scan.nextLine();
                                 System.out.println("Ingrese nuevo numero de materias aprobadas: ");
                                 String numApro = scan.nextLine();
                                 System.out.println("Ingrese nuevo promedio: ");
                                 String promedio = scan.nextLine();
                                 System.out.println("Ingrese nuevos creditos actuales: ");
                                 String creAlu = scan.nextLine();
                                 System.out.println("Ingrese nuevos creditos por semestre: ");
                                 String creIns = scan.nextLine();
                                 System.out.println("Ingrese nuevo semestre: ");
                                 int semestre = scan.nextInt();
                                 System.out.println("\n");
                                 
                                 listaDatos.setNumCuenta(numCuenta);
                                 listaDatos.setNumIns(numIns);
                                 listaDatos.setNumApro(numApro);
                                 listaDatos.setPromedio(promedio);
                                 listaDatos.setCreAlu(creAlu);
                                 listaDatos.setCreIng(creIns);
                                 listaDatos.setSemestre(semestre);
                             }
                         }
                         System.out.println("El registo fue modificado exitosamente");
                    break;
                    
                   // EMPIEZAN ATRIBUTOS DEL OBJETO REGISTRO

                    case 5: //Modulo registro academico  
                       System.out.println("MODULO GENERADOR DE NOMBRES");//nombres
                       imprimir(generarNombresAleatorios(500)); //ESTO SOLO IMPRIME NOMBRES Y DIRECCIONES, FALTA IMPRIMIR EDADES PARA COMPLETAR MODULO NOMBRES Y DATOS PERSONALES
                    break;
                    
                    case 6:
                        System.out.println("MODULO GENERADO DE DATOS PERSONALES");//nombres
                        
                        archivos_1 a = new archivos_1 ();
                        System.out.println(a.leerTxt("C:\\Users\\Optiplex 780\\Documents\\NetBeansProjects\\txt\\direcciones.txt")); //DIRECCIONES
                      
                        imprimir(generar());
                    break;
                        
                    case 7: 
                    System.out.println("SE OBTIENE NUMERO DE INSCIPCION");
                    
                        System.out.println("Introduca su numero de cuenta: ");
                        int numC  = scan.nextInt();
                        
                        Numero_cuenta numI = new Numero_cuenta();
                        System.out.println("El numero de inscripcion de "+ numC+ " es: ");
                        numI.llenado();
                        numI.datos();
                    break;
/*                   *****LIBRERIA CSVReader***** 
                    case 8:
                        System.out.println(" EXPORTAR ARCHIVO CSV ");
                     
                        private void Exportar()throws IOException{
                        ArrayList<RegistroAcademico> listaRegistroAcademico = new ArrayList<>(); 
                        listaRegistroAcademico.add(new RegistroAcademico(txtIDP.getText))
                        }
                        
                         break;
                         */
                    case 8: 
                        System.out.println("Fin del programa");
                    break;
                    
                    default: //No existe la opcion
                                System.out.println("Opción no válida");
                    
            }              
        }while(opc != 8);       
    }
    
}
