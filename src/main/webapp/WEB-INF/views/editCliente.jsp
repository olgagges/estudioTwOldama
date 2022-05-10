<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<h3 class=r>Edición de datos personales</h3><br/>
<h3 class=r>Modifique los campos deseados y pulse Confirmar</h3><br/>

<form:form method="POST" action="editCliente.htm"
	modelAttribute="cliente">
	<table align ="center">
		<tr>
			<td></td>
			<td><form:hidden path="idCliente" /></td>
		</tr>
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
