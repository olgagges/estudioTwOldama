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

<script type="text/javascript">
Function cortarFecha(fecha){
	var fechacortada;
	fechacortada = fecha.substring(0,9);
	return fechacortada;
}
</script>


<DIV id=content>
<br>

<h3 class="r">Listado  de Certificados solicitados OLDAMA Architecture</h3><br/><br/>
<c:choose>
	<c:when test="${fn:length(certificados) gt 0}">
		<table align ="center" border=1 width="90%" >
			<tr bgcolor="grey">
				<th align="center">Edificio</th>
				<th>Direcci�n</th>
				<th>Cliente</th>
				<th>Tipo Cert</th>
				<th>F. Solicitud</th>
				<th>Arquitecto</th>
				<th>F. Visita</th>
				<th>F. Emisi�n</th>
				<th>F. Entrega</th>
				
				<th>Eficiencia</th>
				<th>Coste(EU)</th>
				<th>Acciones</th>
			</tr>
			<c:forEach var="certificado" items="${certificados}">
				
				<tr>
					<td align="center"><c:out value="${certificado.estructura.ref}"/></td>
					<td align="center"><c:out value="${certificado.estructura.direccion}"/></td>
					<td align="center"><c:out value="${certificado.cliente.persona.nombre}"/></td>
					<td align="center"><c:out value="${certificado.tipo}"/></td>
					<td align="center"><c:out value= "${certificado.fechaSolicitud}" /></td>
					<td align="center"><c:out value="${certificado.arquitecto  eq null ? '---': certificado.arquitecto.persona.nombre}"/></td>
					<td align="center"><c:out value="${certificado.fechaVisita  eq null ? '---': certificado.fechaVisita}"/></td>
					<td align="center"><c:out value="${certificado.fechaEmision  eq null ? '---': certificado.fechaEmision}"/></td>
					<td align="center"><c:out value="${certificado.fechaEntrega  eq null ? '---': certificado.fechaEntrega}"/></td>
					<td align="center"><c:out value="${certificado.eficiencia  eq null ? '---': certificado.eficiencia}"/></td>
					<td align="center"><c:out value="${certificado.coste  eq 0 ? '0': certificado.coste}"/></td>
					<td align="center"><A href="editCertificado.htm?id=${certificado.idCertificado}">Editar</A></td>
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
