<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:style />
<title>OLDAMA ArchiTecTuRe</title>
</head>

<body>

<mytags:barrasuperior />
<mytags:barralateral />

<DIV id=content>
<br>

<h3 class="r">Listado completo de Arquitectos OLDAMA Architecture</h3><br/><br/>
<c:choose>
	<c:when test="${fn:length(arquitectos) gt 0}">
		<table align ="center" border=1 width="50%" >
			<tr bgcolor="grey">
				<th>Nombre</th>
				<th>DNI</th>
				<th>Tel?fono</th>
				<th>Email</th>
				<th colspan="2">Acciones</th>
			</tr>
			<c:forEach var="arquitecto" items="${arquitectos}">
				<tr>
					<td align="center"><c:out value="${arquitecto.persona.nombre}"/></td>
					<td align="center">${arquitecto.persona.dni}</td>
					<td align="center">${arquitecto.persona.telefono}</td>
					<td align="center">${arquitecto.persona.email}</td>
					
					<td align="center"><A href="editArquitecto.htm?id=${arquitecto.idArquitecto}">Editar</A></td>
					<td align="center"><A href="delArquitecto.htm?id=${arquitecto.idArquitecto}">Borrar</A></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise><h3 class="r">Sin datos</h3></c:otherwise>
</c:choose>
<br/>
<br/>
<h5 class="r">Datos extra?dos de la Base de Datos de OLDAMA Architecture</h5>
<h5 class="r">Todos los datos cumplen con las pol?ticas de privacidad establecidas</h5>
<h5 class="r">Prohibida su difusi?n</h5>
</DIV>
</body>
<mytags:piedepagina />
</html>
