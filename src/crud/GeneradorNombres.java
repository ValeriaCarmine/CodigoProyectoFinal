/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

/**
 *
 * @author Optiplex 780
 */
public class GeneradorNombres  {
     /**
     *  @param cantidad Cantidad de nombres que se quieren generar.
     *  @return Un arreglo de String con los nombres y apellidos generados. El
     *   formato de salida es: Nombre Apellidos
     */
public static String[] generarNombresAleatorios(int cantidad) {
  
    int j=1;
    String[] nombresAleatorios = new String[cantidad];

    String[] nombres = { "Karina ", "Michael ", "Ioana ", "Brenda", "Iluminada ", "Dylan", "Mariana", "Alejandro",
			"Roberto", "Fernando", "Carlos", "Daniela", "Jorge", "Ricardo", "Margarita", "Antonio", "Carla",
			"Veronica", "Leticia", "Scarlett", "Emiliano", "Valeria", "Alberto", "Alan", "Norma", "Teodoro",
                        "Viridiana", "Hugo", "Alicia", "Dana", "Meritxell ","Edgar ", "Maria", "Namjoon","Seokjin","Yoongi","Hoseok",
                        "Jimin","Taehyung","Jungkook","Rezzaryah","Aurora","Soobin","Yeontan","Lucifer","Gabriel","Jesucristo","Aurea","Nalan","Dominic"};
    String[] apellido1 = { "Montesinos", "Antolin", "Machado", "Patiño", "Herrera", "Medina", "Castro", "Vargas",
			"Guzman", "Velazquez", "Hernández", "de la Cruz", "Contreras", "Salazar", "Luna", "Ortega", "Santiago",
			"Guerrero", "Estrada", "Bautista", "Cortes", "Rubio", "Alvarado", "Espinoza", "Lara", "Avila",
                        "Rios", "Cervantes", "Silva", "Leon", "Monge", "Marques","Carmine","Cole","Baird","Finix","Osorno","Kim",
                        "Min","Jeon","Park","Viechhi","del Rey","Maleki","Vaca","Van Gogh","Tesla","Newton","Rafgani","Nova","Gutiérrez"};
    String[] apellido2 = { "Aranda", "Garcia", "Ramos", "Lopez", "Gonzales", "Perez", "Rodriguez", "Sanchez",
			"Ramirez", "Cruz", "Flores", "Gomez", "Morales", "Vazquez", "Reyes", "Jimenez", "Torres",
			"Diaz", "Pineda", "Ruiz", "Mendoza", "Aguilar","Ortiz", "Moreno", "Castillo", "Romero",
                        "Alvarez", "Mendez", "Chavez", "Rivera", "Duarte","Gallego","Paniagua","Mesa","Vidal","Colomer","Ros",
                        "Choi","Kang","Borja","Vidal","Viera","Ponce","Marin","Barrios","Amador","Ferrero","Chacon","Sanchez","Porras"};

    
    for (int i = 0; i < cantidad; i++) {
	nombresAleatorios[i] = "Nombre del alumno "+ j + ":  " + nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
	+ apellido1[(int) (Math.floor(Math.random() * ((apellido1.length - 1) - 0 + 1) + 0))]  + " "
	+ apellido2[(int) (Math.floor(Math.random() * ((apellido2.length - 1) - 0 + 1) + 0))];
        j=j+1;	
    }
	
	return nombresAleatorios;
        
}


public static void imprimir(String[] nombresGenerados) {
    for (int i = 0; i < nombresGenerados.length; i++) {
    System.out.println(nombresGenerados[i]);}
 
}

public static void main(String[] args) {
    imprimir(generarNombresAleatorios(500));
        
}	
}
 

