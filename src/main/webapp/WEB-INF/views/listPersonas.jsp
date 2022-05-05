<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:scriptjs />
<mytags:style />
</head>
<body>
<mytags:menu/>
<h3>Personas</h3>
<c:choose>
	<c:when test="${fn:length(persons) gt 0}">
		<table border=1>
			<tr>
				<th>Nombre</th>
				<th>Email</th>
				<th>DNI</th>
			</tr>
			<c:forEach var="person" items="${persons}">
				<tr class="senior"}">
					<td><c:out value="${person.nombre}"/></td>
					<td>${person.email}</td>
					<td>${person.dni}</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>Sin datos</c:otherwise>
</c:choose>
<mytags:piedepagina />
</body>
</html>
