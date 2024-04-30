package test;

import domain.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
        System.out.println(Persona.prueba);
        System.out.println(Persona.prueba);
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("");
        System.out.println(Persona.prueba);
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        
    }
}
