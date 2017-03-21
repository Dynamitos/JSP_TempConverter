<%@page import="resource.ServletEnum"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Temperature Converter</title>
    </head>
    <body>
        <h1>Temperature Converter</h1>
        
        <form action="${pageContext.request.contextPath}<%=ServletEnum.CONVERTER.getUrlPattern()%>" method="GET">
            <input type ="text" name="fahrenheit" placeholder="Fahrenheit"/>
            <input type="submit" name="toCel" value="To Celsius"/><br/>
            <input type="text" name="celsius" placeholder="Celsius"/>
            <input type="submit" name="toFah" value="To Fahrenheit"/>
        </form>
    </body>
</html>
