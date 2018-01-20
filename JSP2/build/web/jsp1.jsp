<%@page contentType = "text/html" pageEncoding = "UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset=UTF-8">
        <title>Logination</title>
    </head>
    <body style = "text-align: center">
        <h1>Login</h1>
        
        <form action = "recopilar.jsp" method = "post" >
            Usuario:
            <input type = "text" name = "usuario">
            <br>
            <br>
            Contraseña:
            <input type = "password" name = "contrasena">
            <br>
            <br>
            <input type = "submit" value = "enviar">
        </form>
    </body>
</html>
