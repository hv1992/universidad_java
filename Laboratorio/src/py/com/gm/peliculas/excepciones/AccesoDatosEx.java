package py.com.gm.peliculas.excepciones;

import java.io.FileNotFoundException;

public class AccesoDatosEx extends FileNotFoundException{

    public AccesoDatosEx(String mensaje) {
        super(mensaje);
    }
}
