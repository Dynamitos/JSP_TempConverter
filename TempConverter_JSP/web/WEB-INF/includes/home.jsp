<%-- 
    Document   : home
    Created on : 21.03.2017, 11:38:25
    Author     : Sabrina
--%>

<%@page import="resource.ViewEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <body>
        <form action="${pageContext.request.contextPath}<%=ViewEnum.START.getView()%>" method="GET">
            <input type="submit" value="Home"/>
        </form>
    </body>
</html>
