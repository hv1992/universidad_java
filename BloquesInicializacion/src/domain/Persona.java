package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    public static int prueba = 1;
    
    //Este bloque de codigo sirve para ejecutar la instrucción cuando la clase se lee por primera vez, ya sea cuando se va a usar un atributo o funcionalidad, o cuando se va a instanciar.
    //Se ejecuta antes que el constructor, y se ejecuta cuando se lee la clase (no necesita que este instanciada)
    //Esto seria un bloque de codigo estatico
    //Solamente se puede acceder a las variables estaticas
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10;
    }
    
    //Esto se conoce bloque de codigo no estático, y se ejecuta cuando no se hace operaciones estáticas, pero se ejecuta antes que el constructor.
    //Se ejecuta antes de instanciar un objeto por ejemplo.
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
