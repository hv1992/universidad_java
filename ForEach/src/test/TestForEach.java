package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        //Una forma de crear arrays de objetos de forma directa
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        
        //Esta es la sintaxis forEach en java
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
}
