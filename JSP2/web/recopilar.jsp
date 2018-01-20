<%-- 
    Document   : recopilar
    Created on : Feb 1, 2017, 4:41:43 PM
    Author     : Informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos del Formulario</title>
    </head>
    <body>
        <% 
            /*Se puede leer los datos requeridos (Request) desde una variable*/ 
            out.print("Usuario: " + request.getParameter("usuario"));
            out.print("<br>");
            
            out.print("Contraseña: " + request.getParameter("contrasena"));
            out.print("<br>");
        %>
    </body>
</html>
