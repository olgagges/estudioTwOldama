<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:scriptjs />
<mytags:style />
<title>OLDAMA ArchiTecTuRe</title>

<script>
$( document ).ready(function() {
 
    var hoy = new Date();
 
    var fechaSolicitud = hoy.getDay()+"-"+(hoy.getMonth()+1)+"-"+hoy.getFullYear();
 
    $("#fechaSolicitud").val(fecha);
});
</script>

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
<table align ="center" border=1 width="60%" >
	<tr bgcolor="grey">
		<th align="center">Cliente</th>
		<th>Edificio</th>
		<th>Dirección</th>
	</tr>
	<tr>
		<td align="center"><c:out value="${cliente.persona.nombre}"/></td>
		<td align="center"><c:out value="${estructura.ref}"/></td>
		<td align="center"><c:out value="${estructura.direccion}"/></td>
	</tr>
</table><br/><br/>
<form class=r method="post" action="addCertificado.htm">

	
	<input type=hidden name="idCliente" value="${idCliente}" />
	<input type=hidden name="idEstructura" value="${idEstructura}" />

	
	<label for="fechaSolicitud">Fecha de Solicitud</label>
	<input name="fechaSolicitud" type="text" value="dd/mm/aaaa"
       min="2018-01-01" max="2030-12-31"><br/><br/>
       
	<input name = "eficiencia" type="hidden" value="X" />
	<input name = "coste" type="hidden" value="0" />
	
	
	<label for="tipo">Tipo de certificado:</label>
		<select name="tipo">

		<option>HABITABILIDAD</option>

		<option value="ITE">INSPECCIÓN TÉCNICA</option>

		<option value="EFICIENCIAENERGETICA">EFICIENCIA ENERGÉTICA</option>
		
		<option value="INFORMEPERICIAL">INFORME PERICIAL</option>

		</select><br/>
		
<br/><br/>

<h3 class=r>Al enviar el formulario, confirma la solicitud de un nuevo Certificado</h3>
<h3 class=r>Esta operación no se puede deshacer</h3><br/>
<br/>

<input type="submit" /><input type="reset" />

</form>



</DIV>
<mytags:piedepagina />
</body>
</html>
