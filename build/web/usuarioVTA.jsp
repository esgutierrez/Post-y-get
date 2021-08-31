<%-- 
    Document   : usuarioVTA
    Created on : 21/08/2021, 06:18:29 PM
    Author     : USER
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.dto.usuarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Usuarios</h1>
        <table>
            <thead>
                <tr>
                    <th>Id:</th>
                    <th>Nombre:</th>
                    <th>Correo:</th>
                    <th>Rol:</th>
                </tr>
            </thead>
            <tbody>
                <% Object lista = request.getAttribute("lista"); 
                if(lista!=null){
                List<Object> listObj = (List) lista;
                for (Object i: listObj) {
                        
                usuarioDTO usu = (usuarioDTO) i;
                    
                %>
                <tr>
                    <td><%=usu.getId() %></td>
                    <td><%=usu.getNombre() %></td>
                    <td><%=usu.getCorreo() %></td>
                    <td><%=usu.getRol() %></td>
                </tr>
                <% }
        }else{ %>
            <h2>No hay datos</h2>
            <% }%>
            </tbody>
        </table>
    </body>
</html>
