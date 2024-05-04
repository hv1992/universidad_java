package accesodatos;

//Asi tambien como las clases abstractas, estas obligado a implementar todos los metodos definidos en la interfaz.
public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");

    }

}
