package py.com.gm.peliculas.datos;

import java.io.*;
import java.util.List;

import py.com.gm.peliculas.domain.Pelicula;
import py.com.gm.peliculas.excepciones.AccesoDatosEx;
import py.com.gm.peliculas.excepciones.EscrituraDatosEx;
import py.com.gm.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImp implements AccesoDatos{

    @Override
    public Boolean existe(String numberArchivo) {
        File archivo = new File(numberArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) {
        try {
            
        } catch (AccesoDatosEx ex) {

        } catch (LecturaDatosEx ex2) {

        }
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) {
        try {
            File archivo = new File(nombreArchivo);
            if (!this.existe(nombreArchivo)) {
                throw new AccesoDatosEx("No existe el archivo");
            }
            if(!archivo.canWrite()) {
                throw new EscrituraDatosEx("No puede escribirse el archivo");
            }
            if (anexar) {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
                salida.println(pelicula.getNombre());
                salida.close();
                System.out.println("Se ha anexado informacion al archivo");
            } else {
                PrintWriter salida = new PrintWriter(archivo);
                salida.println(pelicula.getNombre());
                salida.close();
                System.out.println("Se ha escrito al archivo");
            }
        } catch (AccesoDatosEx ex) {
            System.out.println();
            ex.getMessage();
        } catch (EscrituraDatosEx ex3){
            System.out.println(ex3.getMessage());
        } catch (IOException ex2) {
            ex2.printStackTrace(System.out);
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) {
        try {
            String resultado = "";
            File archivo = new File(nombreArchivo);
            if (!this.existe(nombreArchivo)) {
                throw new AccesoDatosEx("No existe el archivo");
            }
            if(!archivo.canRead()) {
                throw new LecturaDatosEx("No puede leerse el archivo");
            }
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura != null && resultado.isEmpty()){
                System.out.println("lectura = " + lectura);
                if (lectura.contains(buscar)){
                    resultado = lectura;
                    break;
                }
                lectura = entrada.readLine();
            }
            return resultado;
        } catch (AccesoDatosEx ex) {
            System.out.println(ex.getMessage());
            return "";
        } catch (LecturaDatosEx ex2) {
            System.out.println(ex2.getMessage());
            return "";
        } catch (FileNotFoundException ex3) {
            ex3.printStackTrace();
            return "";
        } catch (IOException ex4) {
            ex4.printStackTrace();
            return "";
        }

    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void borrar(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (!this.existe(nombreArchivo)) {
                throw new AccesoDatosEx("No existe el archivo");
            }
            archivo.delete();
            System.out.println("Archivo borrado correctamente");
        } catch (AccesoDatosEx ex) {
            System.out.println(ex.getMessage());
        }
    }

}
