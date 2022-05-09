<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:scriptjs />
<mytags:style />
<title>OLDAMA ArchiTecTuRe</title>
</head>

<body>


<mytags:barrasuperior />
<mytags:barralateral />

<DIV id=content>
<br>
<h3 class=r>Datos del Cliente que se desea borrar</h3><br/>


		<table align ="center" border=1 width="60%" >
			<tr bgcolor="grey">
				<th align="center">Nombre</th>
				<th>Email</th>
				<th>DNI</th>
			</tr>
			<c:forEach var="client" items="${clients}">
				
				
				<c:if test="${param.id == client.persona.idPersona}">
				<tr>
					<td align="center"><c:out value="${client.persona.nombre}"/></td>
					<td align="center"><c:out value="${client.persona.email}"/></td>
					<td align="center"><c:out value="${client.persona.dni}"/></td>
				</tr>
				</c:if>
				
			</c:forEach>
		</table>
	


<br/><br/>

<form method="get" action="/page2">
 <button text-alingn="center" type="submit">Continue
</form>

</DIV>
<mytags:piedepagina />
</body>
</html>
