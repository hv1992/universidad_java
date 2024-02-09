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
public class ManejoVariables {
    
    public static void introduccionVariables() {
        //Esto es la definicion de una variable, pero desde el ya definimos el tipo de valor que va a contener
        int numeroEntero = 10;
        numeroEntero = 5;
        System.out.println(numeroEntero);
        
        //Al colocar el var, es el compilador quien verifica que tipo de dato el que estamos asignando.
        var valorDesconocido = "Perro";
        
        System.out.println(valorDesconocido);
    }
    
    public static void numeroPrimitivosEnteros() {
        /*
            tipos primitivos enteros: byte, short, int, long
         */
        byte numeroByte = (byte) 129; //Esto supera el rango, y aunque hagamos la conversion forzada, igual falla. Al haber conversion, hay perdidas de bits
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);

        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L; //La L al final significa que es un literable de tipo long.
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo long:" + Long.MAX_VALUE);
    }
    
    public static void numeroPrimitivosFlotantes() {
        /*
            tipos primitivos de tipo flotante: float y double
        */
        
        float numeroFloat = (float)3.4028235E38D; //El D es para definir que el literal es de tipo double. El E38 significa exponencial a la 38.
        float numeroFloat2 = (float)3.14;//Por defecto, todos los literales con decimal son de tipo double, por eso se tiene que hacer la conversion
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
        
    }
    
    public static void manejoChar() {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021'; //Codigo unicode 
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; //Valor decimal del unicode
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //Desde aqui es con manejo con el var
        
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int variableEnteraSimbolo = '!'; //Aqui obtenemos el valor decimal del texto unicode
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'A'; //Aqui obtenemos el valor decimal del texto unicode
        System.out.println("letra = " + letra);
    }
    
    public static void conversionDeTipos() {
         //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor 
//        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad = Integer.parseInt( consola.nextLine() );
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1); //Obrener el caracter de una cadena, indicando la posicion de la misma.
        System.out.println("caracter = " + caracter);
        
        boolean utilizarScanner = false;
        
        if (utilizarScanner) {
            var consola2 = new Scanner(System.in);
            System.out.println("Proporciona un caracter:");
            caracter = consola2.nextLine().charAt(0);
            System.out.println("caracter = " + caracter);
        }
        
    }
}
