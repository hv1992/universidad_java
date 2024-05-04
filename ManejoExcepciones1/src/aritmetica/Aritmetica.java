package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        
        //Aca lo que hacer es averiguar si en divisor es cero, si el mismo es cero, lanza la excepción
         //Como la excepción de OperaciónExcepcion hereda de RuntimeException, no es necesario utilizar el throws para decir que excepciones puede lanzar. En cambio, si OperacionesExcepción heredaba de Exception, hay si necesitabas poner las excepciones que iba a lanzar esta función, por medio de la palabra "throws"
        if( denominador == 0){
            throw new OperacionExcepcion("Division entre cero"); //Excepción lanzada, que sera captado por un try catch
        }
        
        return numerador / denominador;
    }
}
