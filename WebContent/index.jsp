<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <title>Hello AWS Web World!</title>
    
</head>
<body>
    <div id="content" class="container">
        <h1>Hello Eduardo!</h1>
        <p><a href="userGetSaludo">Saludo User</a></p>
    </div>
    
    <div>
    	<form:form action="getMessage" method="post" commandName="userBean">
    		<table border = 1 align="center">
    			<tr><td><label>Nombre: </label></td><td><input type="text" name="nombre"/></td></tr>
    			<tr><td><label>Email: </label></td><td><input type="text" name="email"/></td></tr>
    			<tr><td></td><td><input type="submit" value="Enviar!"/></td></tr>
    		</table>
    	</form:form>
    </div>
</body>
</html>