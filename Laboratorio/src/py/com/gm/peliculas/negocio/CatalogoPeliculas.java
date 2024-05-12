package py.com.gm.peliculas.negocio;

public interface CatalogoPeliculas {
    public void agregarPelicula(String nombrePelicula,String nombreArchivo);

    public void listarPeliculas(String nombreArchivo);

    public void buscarPeliculas(String nombreArchivo);

    public void iniciarArchivo(String nombreArchivo);
}
