<%-- 
    Document   : cerrar
    Created on : 20/03/2019, 05:06:35 PM
    Author     : clarylinux
--%>

<%
session.setAttribute("usr", null);
session.invalidate();
response.sendRedirect("../login.html");
%>

