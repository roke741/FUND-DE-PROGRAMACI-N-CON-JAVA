<%-- 
    Document   : principal
    Created on : 20 dic. 2022, 13:29:46
    Author     : Jhordie
--%>

<%@page import="com.certus.demo.modelos.entidades.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso al sistema </title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            Administrador adm = (Administrador)sesion.getAttribute("elAdministrador");

            if(adm != null){
        %>
        <h1>Bienvenido <%=adm.getNombre() %> </h1>
        <%
            }else{  
        %>
        <h2>Eres tu el usurpador!</h2>
        <%
            }
        %>
    </body>
    
</html>
