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

<h3 class="r">Listado completo de Administradores OLDAMA Architecture</h3><br/><br/>
<c:choose>
	<c:when test="${fn:length(admins) gt 0}">
		<table align ="center" border=1 width="60%" >
			<tr bgcolor="grey">
				<th align="center">Nombre</th>
				<th>Email</th>
				<th>DNI</th>
				<th colspan="2">Acciones</th>
			</tr>
			<c:forEach var="admin" items="${admins}">
				<tr>
					<td align="center"><c:out value="${admin.persona.nombre}"/></td>
					<td align="center"><c:out value="${admin.persona.email}"/></td>
					<td align="center"><c:out value="${admin.persona.dni}"/></td>
					<td align="center"><A href="editAdmin.htm?id=${admin.idAdmin}">Editar</A></td>
					<td align="center"><A href="delAdmin.htm?id=${admin.idAdmin}">Borrar</A></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise><h3 class="r">Sin datos</h3></c:otherwise>
</c:choose>
<br/>
<br/>
<h5 class="r">Datos extraídos de la Base de Datos de OLDAMA Architecture</h5>
<h5 class="r">Todos los datos cumplen con las políticas de privacidad establecidas</h5>
<h5 class="r">Prohibida su difusión</h5>
</DIV>
</body>
<mytags:piedepagina />
</html>
