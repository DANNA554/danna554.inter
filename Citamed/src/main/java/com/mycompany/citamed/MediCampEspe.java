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
public class MediCampEspe extends Medico {
    
      /*
    Atributos de la clase
    */
    public String especialidad = "";
    
    
    /*
    Métodos constructores
    */
    public MediCampEspe() {
    }

    public MediCampEspe(String nombre, byte edad, String genero, String turno, String especialidad) {
        super(nombre, edad, genero, turno);
        this.especialidad = especialidad;
    }
    
    
    /*
    Métodos Set,Get y toString
    */
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "MediCampEspe{" + "especialidad=" + especialidad + '}';
    }
    
    /*
    Método para mostrar médicos por campo de especialización(Aún no finalizado)
    */
    @Override
    public void mostrarMedicos(){
        
    }
    
}
