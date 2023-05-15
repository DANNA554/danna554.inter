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
public class SoliCitaMed  extends Cita{
    
     /*
    Atributos de la clase
    */
    public String horario = "";
    
    
    /*
    Métodos constructores de la clase
    */
    public SoliCitaMed (){
    }

    public SoliCitaMed(String especialidadCita, String medicoCita, byte dia, byte mes, int anio, String horario) {
        super(especialidadCita, medicoCita, dia, mes, anio);
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
        return "SolCitaMed{" + "horario=" + horario + '}';
    }
    
    /*
    Método para solicitar citas(Aún no finalizado)
    */
    public void SolicitarCita(){
        
    }
    
}
