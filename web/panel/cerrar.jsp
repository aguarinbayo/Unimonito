<%-- 
    Document   : cerrar
    Created on : 20/03/2019, 05:06:35 PM
    Author     : clarylinux
--%>

<%
if(session==null) session.invalidate();
response.sendRedirect("../login.html");
%>

