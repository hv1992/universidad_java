package paquete1;

import paquete1.Clase1;

//El public puede aplicarse a una clase
//Aqui, como se usa el public, esta clase puede ser accedido por el resto de las clases.
public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        super("Publico");
        //this.atributoPrivado = "Modificacion atributo privado";
        //this.metodoPrivado();
        
    }
    
    //Aqui se usa el constructor protectec, y como estan en el mismo paquete, se puede usar.
    public ClaseHija(int numero) {
        super(numero);
    }
    
    //Aqui tenemos una clase protected, que solamente puede ser accedido dentro del paquete, de las clases hijas, y desde la misma clase.
    protected ClaseHija(String texto) {
        super(texto);
    }
}
