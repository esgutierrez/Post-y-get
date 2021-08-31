<%-- 
    Document   : contactoVTA
    Created on : 21/08/2021, 03:58:41 PM
    Author     : USER
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Pagina unó</title>
    </head>
    <body>
        <form method="post" action="contactoCTO?accion=crear">
            <legend> Formulario de contacto </legend>
            <fieldset>
                <label> Nombre </label>
                <input type="text" name="txtNombre" required>
                <label> Correo </label>
                <input type="text" name="txtCorreo" required>
                <label> Asunto </label>
                <input type="text" name="txtAsunto" required>
                <label> Descripcion </label>
                <textarea type="text" name="txtDesc" required></textarea>
                <input type="submit" value="Enviar comentario">
                <input type="reset" value="Limpiar">
            </fieldset>
        </form>
    </body>
</html>