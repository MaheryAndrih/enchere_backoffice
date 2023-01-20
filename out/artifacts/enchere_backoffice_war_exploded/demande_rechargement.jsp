<%--
  Created by IntelliJ IDEA.
  User: mahery
  Date: 1/20/23
  Time: 5:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="Model.Demande_rechargement"%>
<%
    Demande_rechargement[] listeDemande = (Demande_rechargement[]) request.getAttribute("listeDemande");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="DemandeRechargementController">
        <p><select name="type">
            <option value="1">Accepter</option>
            <option value="2">Refuser</option>
        </select></p>
        <table border="1">
            <tr></tr>
            <tr>Id</tr>
            <tr>Nom Client</tr>
            <tr>Email</tr>
            <tr>Montant</tr>
            <tr></tr>
            <% if(listeDemande!=null){
                for(int i=0;i<listeDemande.length;i++){ %>
                    <tr>
                        <td><input type="checkbox" name="demande" value="<%= listeDemande[i].getId() %>"></td>
                        <td><%= listeDemande[i].getId() %></td>
                        <td><%= listeDemande[i].getClient().getUsername() %></td>
                        <td><%= listeDemande[i].getClient().getEmail() %></td>
                        <td><%= listeDemande[i].getMontant() %></td>
                    </tr>
                <% }
            }%>
        </table>
    </form>
</body>
</html>
