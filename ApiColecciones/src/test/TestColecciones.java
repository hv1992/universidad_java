package test;

import java.util.*;

//Aqui esta hablando acerca de las api de colecciones. Esto seria entrando el uso del ArrayList, Map, y otros sistema de colecciones de datos.
public class TestColecciones {

    public static void main(String[] args) {
        //Tanto Set como List heredan de Collection, es por eso que ambos pueden usar "add"


        //Esto es un Array de tipo lista, es necesario especificar el tipo de objecto que va a estar coleccionando con <>.
        //Tiene las mismas caracteristicas de una lista, es decir, se va agregando los elementos "detras del elemento anterior"
        //Aqui se pueden duplicar los elementos.
        List<String> miLista = new ArrayList<String>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
       imprimir(miLista);

        //A diferencia de las listas, el orden de la colocación de los elementos es aleatorio.
        //Es necesario especificar el tipo de objecto que va a estar coleccionando con <>.
        //En un set es mas rapido agregar elementos, ya que no es necesario mantener una orden
        //Aqui no se pueden duplicar los elementos
        Set<String> miSet = new HashSet<String>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
       imprimir(miSet);

       //La clase Map no es hija de la clase Collection.
       //El concepto de Map es que se guarda dos elementos: llave y valor.
        Map<String,Object> miMapa = new HashMap<String,Object>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        String elemento = (String) miMapa.get("valor1");
        //System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet()); //El keySet retorna la lista de las llaves
        imprimir(miMapa.values()); //El values retorna la lista de valores
    }
    
    @SuppressWarnings("unchecked")
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> { //Este es el forEach, y "elemento" seria el resultado de la obtención de un elemento de la lista que esta iterando en ese memento
            System.out.println("elemento = " + elemento);
        });

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}
