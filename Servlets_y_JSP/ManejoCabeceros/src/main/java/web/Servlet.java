package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();//Se obtiene el metodo del HTTP
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br>");
        out.print("Metodo Http:" + metodoHttp);
        
        String uri = request.getRequestURI(); //Aqui obtenemos el path a partir del nombre del proyecto
        out.print("<br>");
        out.print("Uri solicitada:" + uri);
        
        //Imprimimos todos los cabeceros disponibles
        out.print("<br>");
        out.print("<br>");
        Enumeration cabeceros = request.getHeaderNames();
        while(cabeceros.hasMoreElements()){ //Como getHeaderNames retorna mas de un cabecero, por medio de la propiedad de la clase Enumeration, aqui vamos viendo si todavia no se recorrió todos los elementos.
            String nombreCabecero = (String) cabeceros.nextElement(); //Aqui se obtiene los elementos por medio de la propiedad de Enumeration. El mismo retorna un objeto, y tenemos que castear a String.
            out.print("<b>" + nombreCabecero + "</b>:");
            out.print(request.getHeader(nombreCabecero)); //Aqui se obtiene el valor del header de acuerdo al nombre del mismo
            out.print("<br>");
        }
        
        out.print("<body>");
        out.print("</html>");
        out.close();
    }
}
