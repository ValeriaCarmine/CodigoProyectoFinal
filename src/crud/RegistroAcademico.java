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
public class RegistroAcademico {
     public String numCuenta;
     public String promedio;
     public String numIns;
     public String creAlu;
     public String creIng;// Tabla de creditos x semestre
     public String numApro;
     public int semestre;

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getCreAlu() {
        return creAlu;
    }

    public void setCreAlu(String creAlu) {
        this.creAlu = creAlu;
    }

    public String getCreIng() {
        return creIng;
    }

    public void setCreIng(String creIng) {
        this.creIng = creIng;
    }

    public String getNumApro() {
        return numApro;
    }

    public void setNumApro(String numApro) {
        this.numApro = numApro;
    }

    public String getNumIns() {
        return numIns;
    }

    public void setNumIns(String numIns) {
        this.numIns = numIns;
    }

    public void llenarDatos() {
        
    }

    public void imprimirDatos() {
       
    }
     
    
}
