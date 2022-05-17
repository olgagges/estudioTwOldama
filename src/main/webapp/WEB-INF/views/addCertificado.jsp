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
<h3 class=r>Rellene el formulario para generar un nuevo Certificado</h3><br/>

<c:if test="${errors.errorCount gt 0}">
	Errors!<br/>
	<c:forEach var="error" items="${errors.allErrors}">
		<span class="error">${error.objectName} ${error.code}</span>
		<br />
	</c:forEach>
</c:if>

<form class=r method="post" action="addCertificado.htm">
	<input name = "idCliente" type=hidden value="${idCliente}" />
	<input name = "idEstructura" type=hidden value="${idEstructura}" />
	<input name = "idArquitecto" type=hidden value="0" />
	
	<label for="tipo">Tipo de certificado:</label>
		<select name="tipo">

		<option>Habitabilidad</option>

		<option>Inspección Técnica</option>

		<option>Eficiencia Energética</option>
		
		<option>Informe Pericial</option>

		</select><br/><br/>
		
<label for="fechaSolicitud">Fecha de Solicitud</label>
	<input name="fechaSolicitud" type="Date" id="fecha" value="<?php echo date("m/d/Y"); ?>"><br/><br/>

<br/><br/>

<input type="submit" /><input type="reset" /></form>

</DIV>
<mytags:piedepagina />
</body>
</html>
