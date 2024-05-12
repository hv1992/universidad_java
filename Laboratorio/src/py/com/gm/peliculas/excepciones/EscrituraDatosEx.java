package py.com.gm.peliculas.excepciones;

import java.io.IOException;

public class EscrituraDatosEx extends IOException {
    public EscrituraDatosEx (String mensaje) {
        super(mensaje);
    }
}
