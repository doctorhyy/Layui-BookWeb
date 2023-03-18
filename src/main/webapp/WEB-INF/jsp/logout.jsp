<%--
  Created by IntelliJ IDEA.
  User: TR
  Date: 2021/12/18
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="http://localhost:8080/Bookweb/js/jquery-3.6.0.js"></script>
<body>
<%
    session.setAttribute("state",null);
    response.sendRedirect("http://localhost:8080/Bookweb/index.jsp");
%>

</body>
</html>
