<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 23, 2021, 1:52:23 PM
    Author     : 507936
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
        <label>First:</label>
        <input type="text" name="firstNum" value="${firstNumInt}"> 
        <br>
        <label>Second:</label>
        <input type="text" name="secondNum" value="${secondNumInt}"> 
        <br>
        <input name="sub" type="submit" value="+">
        <input name="sub" type="submit" value="-">
        <input name="sub" type="submit" value="*">
        <input name="sub" type="submit" value="%">
        </form>
        <p>${message}</p>
        <a href="age">Next Age Calculator</a>
    </body>
</html>
