/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigosvarios;

import java.util.Scanner;

/**
 *
 * @author hugovillagra
 */
public class CodigosVarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejoVariables.introduccionVariables();
        
        ManejoScanner.claseScanner();
        
        ManejoVariables.numeroPrimitivosEnteros();
        ManejoVariables.numeroPrimitivosFlotantes();
        ManejoVariables.manejoChar();
        ManejoVariables.conversionDeTipos();
        
        OperacionesJava.operacionesAritmeticas();
        OperacionesJava.operacionesUnarias();
        OperacionesJava.operacionesTernarias();
        
    }
    
}
