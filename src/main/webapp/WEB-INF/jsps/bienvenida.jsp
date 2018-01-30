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
<title>Bienvenida</title>
</head>
<body>
	Bienvenid@ ${nombreLogado}
	</br>
	</br>
	
	<form:form modelAttribute="login" method="POST" action="bienvenida">
		<tr>
			<td> <input type = "submit" name = "puntos" value=<spring:message code="pagina.bienvenida.puntos"></spring:message> /> </td>
     		<td> <input type = "submit" name = "ofertas" value=<spring:message code="pagina.bienvenida.ofertas"></spring:message> /> </td>
    		<td> <input type = "submit" name = "reservas" value=<spring:message code="pagina.bienvenida.reservas"></spring:message> /> </td>
        <tr>
     </form:form>
	
</body>
</html>