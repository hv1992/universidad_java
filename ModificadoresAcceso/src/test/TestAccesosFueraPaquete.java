/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paquete1.ClaseHija;

/**
 *
 * @author hugovillagra
 */
public class TestAccesosFueraPaquete extends ClaseHija {
    
    public TestAccesosFueraPaquete(int numero) {
        //Aqui se puede acceder porque es un constructor publico
        super(1);
    }
    
    public TestAccesosFueraPaquete(String texto){
        //Aqui se puede acceder al constructor protected, porque forma parte de una clase hija, aunque no este en el mismo paquete
        super(texto);
    }
    
}
