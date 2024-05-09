package genericos;

/**
 * Convención para nombrar a los genéricos:
    E – Element (usado bastante por Java Collections Framework)
    K – Key (Llave, usado en mapas)
    N – Number (para números)
    T – Type (Representa un tipo, es decir, una clase)
    V – Value (representa el valor, también se usa en mapas)
    S,U,V etc. – usado para representar otros tipos.
 */

public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T objecto){
        this.objeto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
