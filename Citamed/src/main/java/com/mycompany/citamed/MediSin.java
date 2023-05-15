/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citamed;

/**
 *
 * @author Del Viento Teran Danna Guadalupe
 * @author García Romero Angel
 * @author González Navarro Oscar Eduardo
 * @author Montelongo Ramírez Alexia
 */
public class MediSin  extends Medicamento {
    
    /*
    Atributos de la clase
    */
    public String sintoma = "";
    public boolean medPrevio = false;
    public boolean alergMed = false;
    
    
    /*
    Métodos constructores de la clase
    */
    public MediSin() {
    }

    public MediSin(String nombre, String dosis, String numUnidades, String caducidad, String sintoma, boolean medPrevio, boolean alergMed) {
        super(nombre, dosis, numUnidades, caducidad);
        this.sintoma = sintoma;
        this.medPrevio = medPrevio;
        this.alergMed = alergMed;
    }
    
    /*
    Métodos Set,Get y toString
    */
    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public boolean isMedPrevio() {
        return medPrevio;
    }

    public void setMedPrevio(boolean medPrevio) {
        this.medPrevio = medPrevio;
    }

    public boolean isAlergMed() {
        return alergMed;
    }

    public void setAlergMed(boolean alergMed) {
        this.alergMed = alergMed;
    }

    @Override
    public String toString() {
        return "MediSin{" + "sintoma=" + sintoma + ", medPrevio=" + medPrevio + ", alergMed=" + alergMed + '}';
    }
    
    
    /*
    Método para mostrar los medicamento utilizando el síntoma(Aún no finalizado)
    */
    @Override
    public void mostrarMedicamentos(){
        
    }
       
}
