package cpjlaboratoriofinal;

import java.util.Scanner;

import py.com.gm.peliculas.negocio.CatalogoPeliculasImp;

public class CPJLaboratorioFinal {

    private static Scanner scanner = new Scanner(System.in);
    private static int opcion;
    private static String nombreArchivo;
    private static CatalogoPeliculasImp catalogoPeliculas = new CatalogoPeliculasImp();

    public static void main(String[] args) {
        String mostrarContenido = """
            1.-Iniciar catalogo películas
            2.-Agregar película
            3.-Listar Películas
            4.-Buscar Película
            0.-Salir                        
        """;

        do {
            System.out.println(mostrarContenido);

            System.out.print("Ingrese la opcion: ");

            CPJLaboratorioFinal.opcion = CPJLaboratorioFinal.scanner.nextInt();

            switch (CPJLaboratorioFinal.opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del archivo del catálogo");
                    CPJLaboratorioFinal.nombreArchivo = CPJLaboratorioFinal.scanner.nextLine();
                    CPJLaboratorioFinal.catalogoPeliculas.iniciarArchivo(CPJLaboratorioFinal.nombreArchivo);
                    break;
                case 2:
                    System.out.println("Ingrese la pelicula a agregar");
                    CPJLaboratorioFinal.catalogoPeliculas.agregarPelicula(CPJLaboratorioFinal.scanner.nextLine(), CPJLaboratorioFinal.nombreArchivo);
                    break;
                case 3:
                    CPJLaboratorioFinal.catalogoPeliculas.listarPeliculas(CPJLaboratorioFinal.nombreArchivo);
                    break;
                case 4:
                    CPJLaboratorioFinal.catalogoPeliculas.buscarPeliculas(CPJLaboratorioFinal.nombreArchivo);
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while(CPJLaboratorioFinal.opcion != 0);
        CPJLaboratorioFinal.scanner.close();
    }
}
