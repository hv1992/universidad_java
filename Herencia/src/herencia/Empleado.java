/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author hugovillagra
 */

//El extends sirve para definir de que clase vamos a heredar
public class Empleado extends Persona{
    
    public Empleado(){
        //El super sirve para acceder a los metodos de la clase padre, como tambien sus atributos.
        super.toString();
    }
    
    public Empleado(String nombre, char genero, int edad, String direccion) {
        //Aqui invoca al constructor de la clase padre
        super(nombre,genero,edad,direccion);
    }
}
