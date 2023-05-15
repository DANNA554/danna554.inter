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
public class MedicHorario extends Medico {
    
    /*
    Atributos de la clase
    */
    public String horario = "";
    
    
    /*
    Métodos constructores
    */
    public MedicHorario() {
    }

    public MedicHorario(String nombre, byte edad, String genero, String turno, String horario) {
        super(nombre, edad, genero, turno);
        this.horario = horario;
    }
    
    
    /*
    Métodos Set,Get y toString
    */
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "MedicHorario{" + "horario=" + horario + '}';
    }
    
    /*
    Método para mostrar médicos por horario(Aún no finalizado)
    */
    @Override
    public void mostrarMedicos(){
        
    }
    
    
}
