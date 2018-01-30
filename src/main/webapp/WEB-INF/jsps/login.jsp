<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!--  se  a�ade libreria con etiquetas concretas de spring, en este caso para formularios con spring -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- se a�ade libreria con etiquetas concretas spring, ej mensajes internacionalizacion -->
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
<!--  se puede quitar el action pq esta definido get en el formcontrolador -->
<!-- asegurarse persona exista la primera vez q se cargue el formulario -->
	<form:form modelAttribute="login" method="POST">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><form:input path="nombre" /></td>
				<!-- mostrar error de ese campo -->
								<td><form:errors path="nombre" /></td>
				
			</tr>
			 
			<tr>
				<td>Password:</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value="Entrar" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>