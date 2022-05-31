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

<h3 class="r">Listado  de Proyectos solicitados OLDAMA Architecture</h3><br/><br/>
<c:choose>
	<c:when test="${fn:length(proyectos) gt 0}">
		<table align ="center" border=1 width="60%" >
			<tr bgcolor="grey">
				<th align="center">Proyecto</th>
				<th>Referencia</th>
				<th>Fecha Inicio</th>
				<th>Acciones</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach var="proyecto" items="${proyectos}">
				
				<tr>
					<td align="center"><c:out value="${proyecto.idProyecto}"/></td>
					<td align="center"><c:out value="${proyecto.ref}"/></td>
					<td align="center"><c:out value="${proyecto.fechaInicio}"/></td>
					<td align="center"><A href="editProyecto.htm?id=${proyecto.idProyecto}">Editar</A></td>
				</tr>
				
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise><h3 class="r">Sin datos</h3></c:otherwise>
</c:choose>
<br/>
<br/>
<h5 class="r">Datos extra�dos de la Base de Datos de OLDAMA Architecture</h5>
<h5 class="r">Todos los datos cumplen con las pol�ticas de privacidad establecidas</h5>
<h5 class="r">Prohibida su difusi�n</h5>
</DIV>
</body>
<mytags:piedepagina />
</html>
