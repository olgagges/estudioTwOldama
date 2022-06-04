<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<h3 class=r>Edición de certificados</h3><br/>
<h3 class=r>Modifique los campos deseados y pulse Confirmar</h3><br/>

<table align ="center" border=1 width="60%" >
	<tr bgcolor="grey">
		<th align="center">Tipo de Certificado</th>
		<th>Edificio</th>
		<th>Dirección</th>
		<th>Cliente</th>
		<th>Fecha Solicitud</th>
	</tr>
	<tr>
		<td align="center"><c:out value="${certificado.tipo}"/></td>
		<td align="center"><c:out value="${estructura.ref}"/></td>
		<td align="center"><c:out value="${estructura.direccion}"/></td>
		<td align="center"><c:out value="${cliente.persona.nombre}"/></td>
		<td align="center"><c:out value="${certificado.fechaSolicitud}"/></td>
	</tr>
</table><br/><br/>

<form class=r method="post" action="editCertificado.htm" >
			<input type=hidden name="idCertificado" value="${certificado.idCertificado}" />
			<input type=hidden name="tipo" value="${certificado.tipo}" />
			<input type=hidden name="idEstructura" value="${estructura.idEstructura}" />
			<input type=hidden name="idCliente" value="${cliente.idCliente}" /> 
			<input type=hidden name="idCertificado" value="${idCertificado}" />
			<input type=hidden name="fechaSolicitud" value="${certificado.fechaSolicitud}" />
			

			<label for="arquitecto">Arquitecto</label> 
			<select id="arquitecto"  name="idArquitecto">
				<c:forEach items="${arquitectos}" var="listaArquitectos">
					<option value="${listaArquitectos.getIdArquitecto()}" ${listaArquitectos.getIdArquitecto() == proyecto.idArquitecto ? 'selected="selected"' : ''}>
					${listaArquitectos.getPersona().getNombre()}
					</option>
				</c:forEach>
			</select> <br/><br/>
			<label for="fechaVisita">Fecha de Visita</label>
			<input type="text" name="fechaVisita" value="${certificado.fechaVisita  eq null ? 'dd/mm/aaaa': certificado.fechaVisita}"/><br/><br/>
			<label for="fechaVisita">Fecha de Emisión</label>
			<input type="text" name="fechaEmision" value="${certificado.fechaEmision  eq null ? 'dd/mm/aaaa': certificado.fechaEmision}"/><br/><br/>
			<label for="fechaVisita">Fecha de Entrega</label>
			<input type="text" name="fechaEntrega" value="${certificado.fechaEntrega  eq null ? 'dd/mm/aaaa': certificado.fechaEntrega}"/><br/><br/>
			<label for="eficiencia">Categoría Eficiencia (A-G) </label>
			<input type="text" name="eficiencia" value="${certificado.eficiencia  eq null ? 'X': certificado.eficiencia}" /><br/><br/>
			<label for="coste">Coste (EU)</label>
			<input type="text" name="coste" value="${certificado.coste  eq 0 ? '0': certificado.coste}" />
			 <br /> <br /> <input type="submit" /><input
				type="reset" />
		</form>
</DIV>
<mytags:piedepagina />
</body>
</html>
