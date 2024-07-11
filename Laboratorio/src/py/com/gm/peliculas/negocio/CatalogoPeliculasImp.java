package py.com.gm.peliculas.negocio;

import py.com.gm.peliculas.datos.AccesoDatosImp;
import py.com.gm.peliculas.domain.Pelicula;

public class CatalogoPeliculasImp implements CatalogoPeliculas{
    private static AccesoDatosImp datos = new AccesoDatosImp();

    public CatalogoPeliculasImp() {

    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        AccesoDatosImp gestorDatos = new AccesoDatosImp();
        gestorDatos.escribir(pelicula, nombreArchivo, true);
        gestorDatos = null;
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        
    }

    @Override
    public void buscarPeliculas(String nombreArchivo) {
        AccesoDatosImp gestorDatos = new AccesoDatosImp();
        gestorDatos.buscar(nombreArchivo, nombreArchivo)
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        AccesoDatosImp gestorDatos = new AccesoDatosImp();
        gestorDatos.crear(nombreArchivo);
        gestorDatos = null;
    }


}
