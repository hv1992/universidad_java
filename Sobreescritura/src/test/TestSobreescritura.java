package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles()); //Al ser un objeto instanciado por la clase Gerente, va a ejecutar el metodo sobreescrito, y no el metodo original que esta en empleado.
    }
}
