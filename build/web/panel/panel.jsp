<%-- 
    Document   : panel
    Created on : 20/03/2019, 04:06:16 PM
    Author     : clarylinux
--%>

<%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
  <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="cerrar.jsp"><span class="glyphicon glyphicon-log-in"></span> cerrar sesion</a></li>
    </ul>
  </div>
</nav>
        <p>Id Usuario: <strong>${usr.idUsuario}</strong></p>
    </body>
</html>
