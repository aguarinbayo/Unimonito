<%-- 
    Document   : panel
    Created on : 20/03/2019, 04:06:16 PM
    Author     : clarylinux
--%>

<%
    if ((session.getAttribute("usr") == null) || (session.getAttribute("usr") == "")) {
        response.sendRedirect("../login.html");
        
    }
%>


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
    <body>
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="http://localhost:8084/unimonito/panel/panel.jsp">Unimonito</a>
    </div>
  <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span>${usr.nombreUsuario}</a></li>
      <li><a href="cerrar.jsp"><span class="glyphicon glyphicon-log-in"></span> cerrar sesion</a></li>
    </ul>
  </div>
</nav>
      <div class="container-fluid">
           <div class="row">
               <div class="col-md-4">
            <div class="panel panel-default">
           <div class="panel-heading">
             <h3 class="panel-title">Deportes</h3>
           </div>
           <div class="panel-body">
               <ul>
                   <li><a href="../deporte">Consultar Deportes</a></li>
                   <li><a href="../crearDeporte">Ingresar Deporte</a></li>
               </ul>
           </div>
                   </div>
               </div>
               <div class="col-md-4">
          <div class="panel panel-default">
           <div class="panel-heading">
             <h3 class="panel-title">Torneo</h3>
           </div>
           <div class="panel-body">
                   <ul>
                   <li><a href="../torneo">Consultar Torneo</a></li>
                   <li><a href="../CrearTorneo">Ingresar Torneo</a></li>
               </ul>
                </div>
                   </div>
               </div> 
               <div class="col-md-4">
              <div class="panel panel-default">
           <div class="panel-heading">
             <h3 class="panel-title">Equipo</h3>
           </div>
           <div class="panel-body">
                  <ul>
                   <li><a href="../equipo">Consultar Torneo</a></li>
                   <li><a href="../CrearTorneo">Ingresar Torneo</a></li>
               </ul>
           </div>
                   </div>              </div> 
               
                         <div class="col-md-4">
              <div class="panel panel-default">
           <div class="panel-heading">
             <h3 class="panel-title">Jugador</h3>
           </div>
           <div class="panel-body">
                  <ul>
                   <li><a href="../torneo">Consultar Jugador</a></li>
                   <li><a href="../CrearTorneo">Ingresar Jugador</a></li>
               </ul>
           </div>
                   </div>              </div>      
          
