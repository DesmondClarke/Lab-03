<%-- 
    Document   : agecalculator
    Created on : Sep 23, 2021, 10:46:18 AM
    Author     : 507936
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
        <label>Enter your age:</label>
        <input type="text" name="ageNumber" value=""> 
        <br>
        <input type="submit" value="Age next birthday">
        </form>
        <p>${errormessage}</p>
        <p>${correctmessage}</p>
        <a href="arithmetic">Arithmatic Calculator</a>
    </body>
</html>
