package excepciones;

//Todas las excepciones que son hijos de la clase "Exception" necesitan ejecutarse dentro de un try catch.
//Todas las excepciones que heredan de RuntimeException no nos va a pedir try catch, pero va a lanzar la excepción durante la ejecución del programa.
//Hoy en dia, se recomienda mas usa excepciones de tipo RuntimeException
/**
 * Existen dos tipos de excepciones: las verificadas (Checked Exceptions) y las no verificadas (Unchecked Exceptions):
 * - Verificadas
 *      # 
 */
public class OperacionExcepcion extends RuntimeException{

    //Aca lo que hacer es ayudarnos a crear una objeto de excepción de ejecución.
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
