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
public class MediEspe extends Medicamento {
    
     
    /*
    Atributos de la clase
    */
    public String viaAdmin = "";
    public String princAct = "";
    
    
    /*
    Métodos constructores de la clase
    */
    public MediEspe() {
    }

    public MediEspe(String nombre, String dosis, String numUnidades, String caducidad, String viaAdmin, String princAct) {
        super(nombre, dosis, numUnidades, caducidad);
        this.viaAdmin = viaAdmin;
        this.princAct = princAct;
    }
    
    
    /*
    Métodos Set,Get y toString
    */
    public String getViaAdmin() {
        return viaAdmin;
    }

    public void setViaAdmin(String viaAdmin) {
        this.viaAdmin = viaAdmin;
    }

    public String getPrincAct() {
        return princAct;
    }

    public void setPrincAct(String princAct) {
        this.princAct = princAct;
    }

    @Override
    public String toString() {
        return "MediEspe{" + "viaAdmin=" + viaAdmin + ", princAct=" + princAct + '}';
    }
    
    
    /*
    Métodos para mostrar medicamentos utilizando distintos parámetros(Aún no finalizado)
    */
    @Override
    public void mostrarMedicamentos(){
        
    }
    
}
