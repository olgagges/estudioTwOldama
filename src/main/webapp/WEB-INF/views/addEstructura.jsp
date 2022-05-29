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
<h3 class=r>Rellene el formulario para generar un nuevo Edificio</h3><br/>

<c:if test="${errors.errorCount gt 0}">
	Errors!<br/>
	<c:forEach var="error" items="${errors.allErrors}">
		<span class="error">${error.objectName} ${error.code}</span>
		<br />
	</c:forEach>
</c:if>

<form class=r method="post" action="addEstructura.htm">
<label for="tipo">Tipo de edificio:</label>
	<select name="tipo">

		<option>Vivienda particular</option>

		<option>Edificio comunitario</option>

		<option>Otros edificios</option>

		</select><br/><br/>
		
<label for="direccion">Dirección completa</label>
	<input type="text" name="direccion" /><br/><br/>
<label for="ref">Referencia catastral</label>
	<input type="text" name="ref" />
<br/><br/>
<label for="fechaConstruccion">Fecha Construcción</label>
	<input type="text" name="fechaConstruccion" value="dd/mm/aaaa" /><br/><br/>

<input type="submit" /><input type="reset" /></form>

</DIV>
<mytags:piedepagina />
</body>
</html>
