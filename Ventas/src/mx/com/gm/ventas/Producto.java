package mx.com.gm.ventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //Primera vez que veo que un constructor puede ser privado
    private Producto(){
        //La mejor practica es escribir la clase, seguido de su atributo.
        //Por lo que entiendo, el primero hace la suma y luego lo guarda en "Producto.contadorProductos"
        //Esto se puede hacer porque "contadorProducto" es un atributo estático
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this(); //Invoca al constructor privado
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
