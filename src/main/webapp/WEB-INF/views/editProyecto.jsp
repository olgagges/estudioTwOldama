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
<h3 class=r>Edición de proyectos</h3><br/>
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
		<td align="center"><c:out value="${certificado.estructura.ref}"/></td>
		<td align="center"><c:out value="${certificado.estructura.direccion}"/></td>
		<td align="center"><c:out value="${certificado.cliente.persona.nombre}"/></td>
		<td align="center"><c:out value="${certificado.fechaSolicitud}"/></td>
	</tr>
</table><br/><br/>

<form:form method="POST" action="editCertificado.htm" modelAttribute="certificado">
	<table align ="center">
		<tr>
			<td><form:hidden path="idEstructura" /></td>
			<td><form:hidden path="idCliente" /></td>
			<td><form:hidden path="tipo" /></td>
			<td><form:hidden path="fechaSolicitud" /></td>
		</tr>
		<label for="idArquitecto">Arquitecto</label> 
			<select id="idArquitecto"  name="idArquitecto">
				<option value="${certificado.arquitecto  eq null ? '---': certificado.arquitecto.persona.nombre}">Arquitecto</option>
				<c:forEach items="${arquitectos}" var="listaArquitectos">
					<option value="${listaArquitectos.getIdArquitecto()}">${listaArquitectos.getPersona().getNombre()}
					</option>
				</c:forEach>
			</select>
		<tr>
			<td>Nombre :</td>
			<td><form:input path="persona.nombre"  /></td>
		</tr>
		<tr>
			<td>Dni :</td>
			<td><form:input path="persona.dni" /></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><form:input path="persona.email" /></td>
		</tr>
		<tr></tr>
<tr></tr>
<tr></tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Confirmar" /></td>
		</tr>
	</table>
</form:form>
</DIV>
<mytags:piedepagina />
</body>
</html>
