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
public class MosColaCitas extends Cita{
    
     /*
    Atributos de la clase
    */
    public String colaCitas = "";
    
    
    /*
    Métodos constructores
    */
    public MosColaCitas() {
    }

    public MosColaCitas(String especialidadCita, String medicoCita, byte dia, byte mes, int anio, String colaCitas) {
        super(especialidadCita, medicoCita, dia, mes, anio);
        this.colaCitas = colaCitas;
    }
    
    
    /*
    Métodos Set,Get y toString
    */
    public String getColaCitas() {
        return colaCitas;
    }

    public void setColaCitas(String colaCitas) {
        this.colaCitas = colaCitas;
    }

    @Override
    public String toString() {
        return "MosColaCitas{" + "colaCitas=" + colaCitas + '}';
    }
    
    /*
    Método para mostrar cola de citas(Aún no finalizado)
    */
    @Override
    public void mostrarCitas(){
        
    }
}
