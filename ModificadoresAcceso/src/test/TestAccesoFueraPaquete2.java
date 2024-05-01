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
public class TestAccesoFueraPaquete2 {
    public static void main(String[] args) {
        
        ClaseHija hija = new ClaseHija(1); //Este constructor puedo usar porque usa un constructor publico.
        ClaseHija hija2 = new ClaseHija(); //Este constructor puedo usar porque usa un constructor publico.
        ClaseHija hija3 = new ClaseHija("hopla"); //Este constructor no se puede usar porque el constructor tiene que acceso protected
    }
}
