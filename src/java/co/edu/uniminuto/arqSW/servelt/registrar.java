/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSW.servelt;

import co.edu.uniminuto.arqSW.DAO.DAO;
import co.edu.uniminuto.arqSW.hibernate.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author clarylinux
 */
@WebServlet(name = "registrar", urlPatterns = {"/registrar"})
public class registrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre=request.getParameter("Nombre");
        String cedula=request.getParameter("Cedula");
        String correo=request.getParameter("correo");
        String pass=request.getParameter("pass");
        
        DAO consulta = new DAO();
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrar</title>");            
            out.println("</head>");
            out.println("<body>");
           // out.println(""++"");
            

<<<<<<< HEAD
               //if(consulta.getExisteUsuario(correo).get(0).getCorreoUsuario().isEmpty()){
                 /*  
=======
               if(consulta.getExisteUsuario(correo).isEmpty()){
                   
>>>>>>> master
                   out.println("<html>\n" +
                           "    <head>\n" +
                           "        <title>TODO supply a title</title>\n" +
                           "        <meta charset=\"UTF-8\">\n" +
                           "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                           "      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
                           "        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n" +
                           "        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
                           "        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n" +
                           "    </head>\n" +
                           "    <body >\n" +
                           "          <form action=\"registrar\" method=\"post\">\n" +
                           "          <div class=\"form-group\">\n" +
                           "            <label for=\"Nombre\">Nombre</label>\n" +
                           "            <input type=\"text\" class=\"form-control\" id=\"Nombre\" name=\"Nombre\" placeholder=\"Ingrese su nombre completo\">\n" +
                           "\n" +
                           "          </div>\n" +
                           "\n" +
                           "        <div class=\"form-group\">\n" +
                           "            <label for=\"Cedula\">Nombre</label>\n" +
                           "            <input type=\"text\" class=\"form-control\" id=\"Cedula\" name=\"Cedula\" placeholder=\"Numero de Cedula\">\n" +
                           "          </div>\n" +
                           "\n" +
                           "        <div class=\"form-group\">\n" +
                           "            <label for=\"correo\">Correo</label>\n" +
                           "            <input type=\"email\" class=\"form-control\" id=\"correo\" name=\"correo\" aria-describedby=\"emailHelp\" placeholder=\"ingrese correo\">\n" +
                           "            <small id=\"emailHelp\" class=\"form-text text-muted\">No es un correo valido</small>\n" +
                           "          </div>\n" +
                           "\n" +
                           "          <div class=\"form-group\">\n" +
                           "            <label for=\"exampleInputPassword1\">Contraseña</label>\n" +
                           "            <input type=\"password\" class=\"form-control\" name=\"pass\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n" +
                           "          </div>\n" +
                           "          <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n" +
                           "<div class=\"alert alert-danger\" role=\"alert\">\n" +
                           "El correo: "+consulta.getExisteUsuario(correo).get(0).getCorreoUsuario()+ "Ya esta registrado"+
                                   "</div>"+
                                   "        </form>\n" +
                                   "    </body>\n" +
                                   "</html>\n" +
                                   "");
<<<<<<< HEAD
                   */
              // }else{
               int aux=Integer.parseInt(cedula);
                   consulta.setUsuario(nombre,aux,correo,pass);
                   response.sendRedirect("login.html" );
             //  }        
=======
                   
               }else{
               int aux=Integer.parseInt(cedula);
                   consulta.setUsuario(nombre,aux,correo,pass);
                   response.sendRedirect("pagina_a_redireccionar.jsp" );
               }          
>>>>>>> master
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
