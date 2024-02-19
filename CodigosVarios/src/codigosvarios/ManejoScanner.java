/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigosvarios;

import java.util.Scanner;

/**
 *
 * @author hugovillagra
 */
public class ManejoScanner {
    
    public static void claseScanner() {
        /*
            La clase Scanner sirve para obtener datos desde el teclado
        */
        
        boolean ejecutarScanner = false;
        
        if(ejecutarScanner) {
             System.out.println("Escribe tu nombre:");
            Scanner consola = new Scanner(System.in); 
            var usuario = consola.nextLine();
            System.out.println("usuario = " + usuario);
            System.out.println("Escribe el titulo:");
            var titulo = consola.nextLine();
            System.out.println("Resultado: " + titulo + " " + usuario);
        }
    }
}
