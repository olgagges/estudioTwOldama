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

<h3 class="r">Listado  de Certificados <c:out value="${opt  eq 'C' ? ' para Renovar':' Inspeccion Tecnica'}"/> llamar a los clientes</h3><br/><br/>
<c:choose>
	<c:when test="${fn:length(certificados) gt 0}">
		<table align ="center" border=1 width="90%" >
			<tr bgcolor="grey">
				<th align="center">Edificio</th>
				<th>Dirección</th>
				<th>Cliente</th>
				<th>Tipo Cert</th>
				<th>F. Solicitud</th>
				<th>Arquitecto</th>
				<th>F. Emisión</th>
				<th>F. Entrega</th>
				<th>F. Inspección</th>
				<th>F. Renovación</th>
				<th>F. Visita</th>
				<th>F. ITE</th>
				<th>Eficiencia</th>
				<th>Coste(EU)</th>
			</tr>
			<c:forEach var="certificado" items="${certificados}">
				
				<tr>
					<td align="center"><c:out value="${certificado.estructura.ref}"/></td>
					<td align="center"><c:out value="${certificado.estructura.direccion}"/></td>
					<td align="center"><c:out value="${certificado.cliente.persona.nombre}"/></td>
					<td align="center"><c:out value="${certificado.tipo}"/></td>
					<td align="center"><c:out value="${certificado.fechaSolicitud}"/></td>
					<td align="center"><c:out value="${certificado.arquitecto  eq null ? '---': certificado.arquitecto.persona.nombre}"/></td>
					<td align="center"><c:out value="${certificado.fechaEmision  eq null ? '---': certificado.fechaEmision}"/></td>
					<td align="center"><c:out value="${certificado.fechaEntrega  eq null ? '---': certificado.fechaEntrega}"/></td>
					<td align="center"><c:out value="${certificado.fechaInspeccion  eq null ? '---': certificado.fechaInspeccion}"/></td>
					<td align="center"><c:out value="${certificado.fechaRenovacion  eq null ? '---': certificado.fechaRenovacion}"/></td>
					<td align="center"><c:out value="${certificado.fechaVisita  eq null ? '---': certificado.fechaVisita}"/></td>
					<td align="center"><c:out value="${certificado.fechaITE  eq null ? '---': certificado.fechaITE}"/></td>
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
