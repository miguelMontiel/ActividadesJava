<%-- 
    Document   : jsp1
    Created on : 30/01/2017, 04:42:25 PM
    Author     : Informatica
--%>

<%@page contentType = "text/html" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSP1 en NetBeans!</h1>
        Formulario:
        
        <form action = "recopilar.jsp" method = "post">
            Captura tu nombre:
            <input type = "text" name = "nombre">
            <br>
            <br>
            Apellidos:
            <input type = "text" name = "apellido">
            <br>
            <br>
            Sexo: <br>
            Femenino: <input type = "radio" name = "sexo" value = "femenino" /><br>
            Masculino: <input type = "radio" name = "sexo" value = "masculino" /><br>
            Otro: <input type = "radio" name = "sexo" value = "otro" /><br>
            <br>
            <br>
            Profesional: <br>
            ICA: <input type = "checkbox" name = "prof" value = "ICA" /><br>
            LDG: <input type = "checkbox" name = "prof" valu e ="LDG" /><br>
            IMC: <input type = "checkbox" name = "prof" value = "IMC" /><br>
            Idiomas: <br>
            <input type = "checkbox" name = "idioma" value = "ingles" /> Ingles <br>
            <input type = "checkbox" name = "idioma" value = "frances" /> Frances <br>
            <input type = "checkbox" name = "idioma" value = "italiano" /> Italiano <br>
            <br>
            <br>
            Pasatiempo: <br>
            <select name = "actividad">
                <option value = "correr">Correr</option>
                <option value = "leer">Leer</option>
                <option value = "videojuegos">Videojuegos</option>
            </select>
            <br>
            Comentario:
            <br>
            <textarea name = "comentario" rows = "4" cols = "20" placeholder = "Escribe tu comentario"></textarea>
            <br>
            Pulsar boton:
            <br>
            <input type = "submit" value = "enviar">
        </form>
    </body>
</html>
