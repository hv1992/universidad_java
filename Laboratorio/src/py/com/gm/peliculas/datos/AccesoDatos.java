package py.com.gm.peliculas.datos;

import java.util.List;

import py.com.gm.peliculas.domain.Pelicula;

public interface AccesoDatos {

    public Boolean existe(String numberArchivo);

    public List<Pelicula> listar(String nombre);

    public void escribir(Pelicula pelicula,String nombreArchivo,Boolean anexar);

    public String buscar(String nombreArchivo,String buscar);

    public void crear(String nombreArchivo);

    public void borrar(String nombreArchivo);
}
