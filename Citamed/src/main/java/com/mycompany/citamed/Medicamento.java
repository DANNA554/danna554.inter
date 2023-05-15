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
public class Medicamento {
    
        /*
    Atributos de la clase
    */
    public String nombre = "";
    public String dosis = "";
    public String numUnidades = "";
    public String caducidad = "";
    
    //Arreglo para almacenar los medicamentos
    Medicamento almacen[] = new Medicamento[20];

    
    /*
    Métodos constructores de la clase
    */
    public Medicamento() {
    }
    
    public Medicamento(String nombre, String dosis, String numUnidades, String caducidad){
        this.nombre = nombre;
        this.dosis = dosis;
        this.numUnidades = numUnidades;
        this.caducidad = caducidad;
    }
    
    /*
    Métodos Set,Get y toString
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(String numUnidades) {
        this.numUnidades = numUnidades;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public Medicamento[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Medicamento[] almacen) {
        this.almacen = almacen;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", dosis=" + dosis + ", numUnidades=" + numUnidades + ", caducidad=" + caducidad + '}';
    }
    
    
    /*
    Método para mostrar los medicamentos
    */
    public void mostrarMedicamentos(){
        
    }
   
    
}
