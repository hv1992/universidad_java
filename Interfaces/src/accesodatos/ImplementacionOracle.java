package accesodatos;

//Asi tambien como las clases abstractas, estas obligado a implementar todos los metodos definidos en la interfaz.
public class ImplementacionOracle implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");
    }

}
