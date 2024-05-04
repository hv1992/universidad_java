package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {

        //La razón del porque creamos un constructor vacio es que, cuando van a usar nuestra clase, por defecto van a instanciar el objeto con el constructor vacio, ya que las clases que van a utilizar nuestra clase no van a saber cuantos atributos tiene nuestra clase. Con javaBeans, se crea el objeto con el constructor vacio.

        //Aqui estamos usando el concepto del javaBean, creamos un objeto con el constructor vacio, y modificamos o leemos sus atributos con el setter y el getter.
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre:" + persona.getNombre());
        System.out.println("Persona apellido:" + persona.getApellido());
    }
}
