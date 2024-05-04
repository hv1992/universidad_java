package domain;

//El serializable tiene la funcion principal de, al agregar "implements Serializable", todo lo demas va a implementar el servidor de java.
/**
    En Java, la interfaz Serializable es una interfaz marcadora que se utiliza para indicar que una clase puede ser serializada. La serialización es el proceso de convertir un objeto en un flujo de bytes, que luego puede ser almacenado en disco, transmitido a través de la red o guardado en una base de datos.

    Cuando una clase implementa la interfaz Serializable, está indicando que sus objetos pueden ser convertidos en una secuencia de bytes y luego restaurados de nuevo en objetos en la memoria del programa. Esto es útil en situaciones como guardar y cargar objetos complejos en archivos, enviar objetos a través de la red, o almacenar objetos en una base de datos.
 * 
 */
import java.io.Serializable;

/*
Para que una clase se considere JavaBean, tiene que cumplir, por ejemplo:
- Un constructor vacio
- Cada atributo definido tiene que ser privado.
- Cada atributo privado tiene que tener un metodo get y set.
- Tiene que implementar una interfaz Serializable
Los JavaBeans son comúnmente utilizados en el desarrollo de aplicaciones Java, especialmente en el desarrollo de interfaces de usuario donde se necesitan componentes reutilizables y fácilmente configurables.
*/
public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    
    public Persona(){
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
