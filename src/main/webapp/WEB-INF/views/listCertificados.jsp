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

<h3 class="r">Listado  de Certificados solicitados OLDAMA Architecture</h3><br/><br/>
<c:choose>
	<c:when test="${fn:length(certificados) gt 0}">
		<table align ="center" border=1 width="60%" >
			<tr bgcolor="grey">
				<th align="center">Edificio</th>
				<th>Dirección</th>
				<th>Cliente</th>
				<th>Tipo Cert</th>
				<th>Solicitud</th>
				<th>Arquitecto</th>
				<th>F. Emisión</th>
				<th>F. Entrega</th>
				<th>F. Inspección</th>
				<th>F. Renovación</th>
				<th>F. Visita</th>
				<th>F. ITE</th>
				<th>Eficiencia</th>
				<th>Coste</th>
			</tr>
			<c:forEach var="certificado" items="${certificados}">
				
				<tr>
					<td align="center"><c:out value="${certificado.idEstructura}"/></td>
					<td align="center"><c:out value="${certificado.idestructura}"/></td>
					<td align="center"><c:out value="${certificado.idCliente}"/></td>
					<td align="center"><c:out value="${certificado.tipo}"/></td>
					<td align="center"><c:out value="${certificado.fechaSolucitud}"/></td>
					<td align="center"><c:out value="${certificado.idArquitecto}"/></td>
					<td align="center"><c:out value="${certificado.fechaEmision}"/></td>
					<td align="center"><c:out value="${certificado.fechaEntrega}"/></td>
					<td align="center"><c:out value="${certificado.fechaInspeccion}"/></td>
					<td align="center"><c:out value="${certificado.fechaRenovacion}"/></td>
					<td align="center"><c:out value="${certificado.fechaVisita}"/></td>
					<td align="center"><c:out value="${certificado.fechaITE}"/></td>
					<td align="center"><c:out value="${certificado.eficiencia}"/></td>
					<td align="center"><c:out value="${certificado.coste}"/></td>
					<td align="center"><A href="editCertificado.htm?id=${certificado.idCertificado}">Editar</A></td>
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
