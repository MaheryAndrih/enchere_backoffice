<%--
  Created by IntelliJ IDEA.
  User: mahery
  Date: 1/20/23
  Time: 4:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <h2>Login Admin</h2>
      <form action="LoginAmdinController" method="post">
        <p>Password: <input type="password" name="password"></p>
        <p><input type="submit" value="Login"></p>
      </form>
    <% if(request.getAttribute("exception")!=null){ %>
      <p style="color: red"><%= request.getAttribute("exception") %></p>
      <% }%>
  </body>
</html>
