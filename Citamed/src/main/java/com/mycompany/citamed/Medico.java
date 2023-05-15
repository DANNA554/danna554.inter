/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.citamed;

/**
 *
 * @author Delvi
 * @author García Romero Angel
 * @author González Navarro Oscar Eduardo
 * @author Montelongo Ramírez Alexia
 */
public class Medico {
    
    /*
    Atributos de la clase
    */
    public String nombre = "";
    public byte edad = 0;
    public String genero = "";
    public String turno = "";
    
    
    /*
    Métodos constructores
    */
    public Medico() {
    }
    
    public Medico(String nombre, byte edad, String genero, String turno) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.turno = turno;
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

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Medico{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", turno=" + turno + '}';
    }
    
    /*
    Método para mostrar a los Médicos
    */
    public void mostrarMedicos(){
        
    }
    
}
