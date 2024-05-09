package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        //En realidad List es una clase de tipo generico, por lo cual tenemos que definir el tipo de dato que vamos a almacenar en la lista.
        //Lo mismo para Set y Map, y en el caso de Map, nos pide el tipo de dato tanto para la clave como el valor que contiene.

        //Si no pones nada en <>, se toma, para este caso, de tipo Object.
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
        
        //imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos");
        
        String elementoMapa = miMapa.get("valor3");
//        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    //Es necesario definir el tipo de dato que vas a trabajar en la colección, ya que, de esta manera, accedes a los metodos de dicho elemento de la colección
    public static void imprimir(Collection<String> coleccion) {
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

        for(String elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
    }

}
