<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="serlvet.ConverterBean"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Temperature Converter</h1>
        <b>Converted from </b> ${ConverterBean.convertText} <br/>
        <b>Before: </b> ${ConverterBean.tempBefore} ${ConverterBean.einheitBefore}<br/>
        <b>After: </b> ${ConverterBean.tempResult} ${ConverterBean.einheitAfter}
    </body>
</html>
