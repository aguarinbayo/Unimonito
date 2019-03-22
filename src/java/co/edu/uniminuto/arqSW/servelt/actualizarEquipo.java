/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSW.servelt;

import co.edu.uniminuto.arqSW.DAO.DAO;
import co.edu.uniminuto.arqSW.hibernate.Deporte;
import co.edu.uniminuto.arqSW.hibernate.Equipo;
import co.edu.uniminuto.arqSW.hibernate.Torneo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Onescreen
 */
@WebServlet(name = "actualizarEquipo", urlPatterns = {"/actualizarEquipo"})
public class actualizarEquipo extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                    String dato=request.getParameter("dato");
        /*String tipo=request.getParameter("tipo");*/
        int aux = (Integer.parseInt(dato));
    
          DAO consulta = new DAO();
            List<Torneo> torneo = new java.util.ArrayList<>();
            Equipo equipo=consulta.getEquipos(aux);
            torneo= consulta.getTorn();
           /* deporte=(List<Deporte>) consulta.getDeporte(aux);
            /* TODO output your page here. You may use following sample code. */
           
            out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <title>actaulizar</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
"        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n" +
"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
"        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n" +
"    </head>\n" +
"    <body>\n" +
"        <nav class=\"navbar navbar-default\">\n" +
"  <div class=\"container-fluid\">\n" +
"    <div class=\"navbar-header\">\n" +
"      <a class=\"navbar-brand\" href=\"#\">Unimonito</a>\n" +
"    </div>\n" +
"  <ul class=\"nav navbar-nav navbar-right\">\n" +

"      <li><a href=\"cerrar.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> cerrar sesion</a></li>\n" +
"    </ul>\n" +
"  </div>\n" +
"</nav>\n" +
"      <div class=\"container\">\n" +
"                   <form action=\"actTorneo\" method=\"post\">\n" +
"          <div class=\"form-group\">\n" +
"            <input type=\"hidden\" class=\"form-control\" id=\"h\" name=\"id\" value=\""+equipo.getIdEquipo()+"\">\n" +
"            <label for=\"Nombre\">Nombre Del Deporte</label>\n" +
"            <input type=\"text\" class=\"form-control\" id=\"Nombre\" name=\"nombre\" value=\""+equipo.getNombreEquipo()+"\">\n" +
"          </div>\n" +

"          <div class=\"form-group\">\n" +
"                <label for=\"select\">Deporte</label>\n" +
"              <select name=\"select\">\n" );
           for(Torneo p:torneo){
                     out.println("<option value=\""+p.getIdTorneo()+"\">"+p.getNombreTorneo()+"</option>\n");
            }
            
            out.println("    </body>\n" +
                    "  </select>\n" +
                    "          </div>             \n" +
                    "          <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n" +
                    "        </form>\n" +
                    "      \n" +
"</html>");
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
