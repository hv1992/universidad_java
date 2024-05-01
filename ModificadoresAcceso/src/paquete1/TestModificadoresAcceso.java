package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAcceso{
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        Clase1 clase2 = new Clase1(1); //Aqui estoy usando un constructor protegido.
        clase1.setAtributoPrivado("cambio valor atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }
}
