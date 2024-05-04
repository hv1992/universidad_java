package accesodatos;

//Las interfaces son como las clases abstractas, pero en este caso, todos sus metodos son abstractos
//En mi experiencia, las interfaces se usan principalmente cuando se quiere delegar los procesos, que la clase que se encarga de ejecutar dichos procesos desconoce el contenido del mismo.
public interface IAccesoDatos {
    int MAX_REGISTRO = 10; //Si vos agregas una variable dentro de una interface, el mismo se considera como una constante estática y publica.
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}
