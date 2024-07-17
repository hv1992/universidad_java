package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

// No es recomendable usar Servlets para integrar codigo html
@WebServlet("/HolaMundo") //Este es el pad para poder acceder al servlet
public class HolaMundo extends HttpServlet{
    
    @Override //Este es el pad para poder acceder al servlet por medio del get
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Esto es para que muestre un mensaje en el navegador, cuyo mensaje es "Hola Mundo desde Servlets"
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola Mundo desde Servlets");
    }
    
}
