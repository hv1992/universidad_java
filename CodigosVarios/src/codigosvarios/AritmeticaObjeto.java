/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigosvarios;

/**
 *
 * @author hugovillagra
 */
public class AritmeticaObjeto {
    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    public AritmeticaObjeto() {
        
    }
    
    //Constructor con argumentos de entrada (sobrecarga de constructores)
    public AritmeticaObjeto(int a,int b) {
        this.a = a;
        this.b = b;
    }
    
    //Metodo
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }
    
    public void cargarDatos(int a,int b) {
        this.a = a;
        this.b = b;
    }
}
