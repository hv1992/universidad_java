package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
       
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
        
        //Aqui el obtener empleado, como esta almacenado en una variable de tipo Empleado, ejecuta el obtenerDetalles desde la clase Empleado.
        System.out.println(empleado.obtenerDetalles());
        
        //downcasting
        //((Escritor)empleado).getTipoEscritura();
        //Aqui se hace una conversión a Escritor, y cuando ejecutas obtenerDetalles, lo ejecutas de la clase Escritor.
        Escritor escritor = (Escritor) empleado;
        escritor.obtenerDetalles();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado.obtenerDetalles());
    }
}
