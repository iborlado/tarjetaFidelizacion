<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
  <%@ taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix = "c" %>
  <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ofertas</title>
</head>
<body>
		<p style="font-size:36px;color:blue;">Ofertas actuales de ${nombreLogado}: </p>
     <p>
     <c:forEach items="${ofertas}" var="oferta">
     	<c:out value = "${oferta.id}"/><p>
     	<c:out value = "${oferta.descripcion}"/><p>
     	<c:out value = "${oferta.fechaInicio}"/><p>
     	<p>
     	<p>
     </c:forEach>
      
      
</body>
</html>