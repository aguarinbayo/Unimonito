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
import co.edu.uniminuto.arqSW.hibernate.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import static javassist.CtMethod.ConstParameter.string;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Onescreen
 */
@WebServlet(name = "equipo", urlPatterns = {"/equipo"})
public class equipo extends HttpServlet {

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
            
            DAO consulta = new DAO();
            List<Equipo> equipo = new ArrayList<>();
            equipo=consulta.getEquipo();
            Deporte depor;
            Torneo torneo;
            HttpSession session = request.getSession();
           if(session.getAttribute("usr")==null){
           response.sendRedirect("http://localhost:8084/unimonito/login.html");
           }
            

            out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"        <title>PANEL</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
"        <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n" +
"        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n" +
"        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n" +
"    </head>\n" +
"    \n" +
"        <nav class=\"navbar navbar-default\">\n" +
"  <div class=\"container-fluid\">\n" +
"    <div class=\"navbar-header\">\n" +
"      <a class=\"navbar-brand\" href=\"http://localhost:8084/unimonito/panel/panel.jsp\">Unimonito</a>\n" +
"    </div>\n" +
"  <ul class=\"nav navbar-nav navbar-right\">\n" +
        "      <li><a href=\"http://localhost:8084/unimonito/panel/cerrar.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> cerrar sesion</a></li>\n" +
"    </ul>\n" +
"  </div>\n" +
"</nav>\n" +
"      \n" +
"      <div class=\"container\">\n" +
"          <div class=\"row\">\n" +
"              <table>\n" +
"                  <tr>\n" +
"                      <td>ID</td>\n" +
"                      <td>Nombre Equipo</td>\n" +
"                      <td>Torneo</td>\n" +
"                      <td></td>\n" +
"                      <td></td>\n" + 
"                        <td></td>\n" + 
"                    <td></td>\n" +
"                  </tr>");
            for(Equipo p:equipo){
               
                    torneo= p.getTorneo();
                 
                
            out.println("<tr><td>\n"+
                    p.getIdEquipo()
                    +"</td><td>\n"+
                    p.getNombreEquipo()+
                    "</td><td>\n"+
                     torneo.getNombreTorneo()+     
                    "</td><td>\n"+
                    
                    "</td><td>\n"+
                   // depor.getNombreDeporte()+
                    "</td><td>\n"+
                    "</td><td><a href=\"http://localhost:8084/unimonito/actualizarEquipo"
                            + ""
                            + "?dato="+p.getIdEquipo()+"&tipo=Equipo \">Actualizar</a></td></tr>");
            }
        }
    }
//<a href=\"http://localhost:8084/unimonito/eliminar?dato="+p.getIdDeporte()+"&tipo=Deporte \">Eliminar</a>
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
