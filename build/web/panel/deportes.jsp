<%-- 
    Document   : deportes
    Created on : 20/03/2019, 10:24:54 PM
    Author     : Onescreen
--%>


<%@page import="co.edu.uniminuto.arqSW.hibernate.Deporte"%>
<%@page import="java.util.List"%>
<%
    if ((session.getAttribute("usr") == null) || (session.getAttribute("usr") == "")) {
        response.sendRedirect("../login.html");
        
    }
%>
<% List<> Datos=request.getParameter("dato"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>PANEL</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Unimonito</a>
    </div>
  <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span>${usr.nombreUsuario}</a></li>
      <li><a href="cerrar.jsp"><span class="glyphicon glyphicon-log-in"></span> cerrar sesion</a></li>
    </ul>
  </div>
</nav>
      
      <div class="container">
          <div class="row">
              <table>
                  <tr>
                      <td>ID</td>
                      <td>Nombre Deporte</td>
                      <td></td>
                      <td></td>
                  </tr>
              </table>
          </div>
      </div>
      
    
</html>
