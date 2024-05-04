package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{ //Aca es donde se realiza la operación y se capta si se envió o no una excepción
            resultado = division(10, 0);
        }catch(OperacionExcepcion e){ //Este es la operación de excepción que creamos para la divisición entre cero.
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){ //Este es la clase de excepción generica.
            System.out.println("Ocurrió un error de tipo Exception: ");
            System.out.println(e.getMessage());
        }    
        finally{ //El finally es un bloque en el cual siempre se ejecuta, independiente de que ocurra o no la excepción.
            System.out.println("Se revisó la división entre cero");
        }
        
        System.out.println("resultado = " + resultado);
    }
}
