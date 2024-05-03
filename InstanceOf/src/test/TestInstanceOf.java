package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        //Una cosa es el tipo de variable, y otra cosa es el tipo al cual esta apuntando en memoria
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        //Esto se puede hacer porque "Gerente" es hijo de Empleado. Si no era padre e hijo, no se puede hacer
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        //Con el instanceOf vamos a averiguar de que tipo de clase fue creado la instancia (no de que tipo es la variable).
        //Funciona como isKind(of:) de swift
        //Para averiguar cual clase se instanció, la pregunta se parte desde la hijas hacia arriba, hasta en lo posible llegar a la clase object.
        //Basicamente estamos preguntando si la variable empleado está apuntando a un objeto de memoria de tipo gerente.
        if (empleado instanceof Gerente) { // Si el empleado fue instanciado con la Clase "Gerente"
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            //((Gerente) empleado).getDepartamento();
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente)empleado;
            //System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
}
