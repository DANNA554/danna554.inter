/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citamed;

/**
 *
 * @author Del Viento Teran Danna Guadalupe
 *  @author García Romero Angel
 * @author González Navarro Oscar Eduardo
 * @author Montelongo Ramírez Alexia
 */
public class Cita {
    
     
    /*
    Atributos de la clase
    */
    private String especialidadCita = "";
    private String medicoCita = "";
    public byte dia = 0;
    public byte mes = 0;
    public int anio = 0;
    
    //Arreglo para almacenar las citas
    Cita citaAgendad[] = new Cita[20];
    
    
    /*
    Métodos constructores
    */
    public Cita() {
    }
    
    public Cita(String especialidadCita, String medicoCita, byte dia, byte mes, int anio) {
        this.especialidadCita = especialidadCita;
        this.medicoCita = medicoCita;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    
    /*
    Métodos Set,Get y toString
    */

    public String getEspecialidadCita() {
        return especialidadCita;
    }

    public void setEspecialidadCita(String especialidadCita) {
        this.especialidadCita = especialidadCita;
    }

    public String getMedicoCita() {
        return medicoCita;
    }

    public void setMedicoCita(String medicoCita) {
        this.medicoCita = medicoCita;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Cita[] getCitaAgendad() {
        return citaAgendad;
    }

    public void setCitaAgendad(Cita[] citaAgendad) {
        this.citaAgendad = citaAgendad;
    }
    
    /*
    Método para mostrar citas
    */
    public void mostrarCitas(){
        
    }
    
    
}
