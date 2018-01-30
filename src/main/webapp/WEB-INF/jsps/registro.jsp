<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!--  se  añade libreria con etiquetas concretas de spring, en este caso para formularios con spring -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- se añade libreria con etiquetas concretas spring, ej mensajes internacionalizacion -->
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro</title>
</head>
<body>
	<form:form modelAttribute="cliente" method="POST" >
		<table>
			<tr>
				<td>Nombre:</td>
				<td><form:input path="nombre" /></td>
				<!-- mostrar error de ese campo -->
				<td><form:errors path="nombre" /></td>
			</tr>
			 <tr>
				<td>Nombre de usuario:</td>
				<td><form:input path="login" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td>Apellidos:</td>
				<td><form:input path="apellidos" /></td>
				<!-- mostrar error de ese campo -->
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value="Registrar" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>