package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {

        //Para mayor protección o seguridad de codigo, es necesario de que se agregue entre <> el tipo de datos que vamos a trabajar cuando se crea el objeto. Entre <> definimos el tipo de datos que vamos a trabajar, ya que la clase es de tipo generico.
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<Integer>(15);
        objetoInt.obtenerTipo();
        

        ClaseGenerica<String> objectoString = new ClaseGenerica<String>("Juan");
        objectoString.obtenerTipo();
    }
}
