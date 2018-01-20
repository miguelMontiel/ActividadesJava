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
            String pasatiempo = (String)request.getParameter("actividad");
            out.print("Te llamas: " + request.getParameter("nombre") +  " " + request.getParameter("apellido"));
            out.print("<br>");
            
            out.print("Eres del sexo: " + request.getParameter("sexo"));
            out.print("<br>");
            
            out.print("Tu segundo idioma es: " + request.getParameter("idioma"));
            out.print("<br>");
            
            out.print("Tu pasatiempo favorito es: " + pasatiempo);
            out.print("<br>");
            
            out.print("Tu comentario: " + request.getParameter("comentario"));
            out.print("<br>");
        %>
    </body>
</html>
