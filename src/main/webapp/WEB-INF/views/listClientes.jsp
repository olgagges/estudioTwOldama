<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:jquery />
<mytags:style />
</head>
<body>
<mytags:menu/>
<h3>Clientes</h3>
<c:choose>
	<c:when test="${fn:length(clients) gt 0}">
		<table border=1>
			<tr>
				<th>Nombre</th>
				<th>Email</th>
				<th>DNI</th>
			</tr>
			<c:forEach var="client" items="${clients}">
				<tr class="senior"}">
					<td><c:out value="${client.persona.nombre}"/></td>
					<td>${client.persona.email}</td>
					<td>${client.persona.dni}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>Sin datos</c:otherwise>
</c:choose>

</body>
</html>
