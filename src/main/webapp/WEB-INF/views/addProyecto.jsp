<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<h3 class=r>Rellene el formulario para generar un nuevo proyecto</h3>
		<br />

		<c:if test="${errors.errorCount gt 0}">
	Errors!<br />
			<c:forEach var="error" items="${errors.allErrors}">
				<span class="error">${error.objectName} ${error.code}</span>
				<br />
			</c:forEach>
		</c:if>

		<form class=r method="post" action="addProyecto.htm">
			<input type=hidden value="${idCliente}" /> 

			<input type=hidden name="idCliente" value="${idCliente}" /> 

			<label for="tipo">Tipo de proyecto:</label>
		<select name="tipo">

		<option value=0>Seleccione Tipo</option>
		<option value="RESIDENCIAL">RESIDENCIAL</option>

		<option value="NORESIDENCIAL">NO RESIDENCIAL</option>
		
		<option value="REHABILITACION">REHABILITACIÓN</option>

		</select><br/><br/><br/>
		
			<label for="ref">Descripción:</label>
			<input type="text" name="ref"/>&nbsp;&nbsp;&nbsp;
			<label for="fechaSolicitud">Fecha Solicitud:</label>
			<input type="text" name="fechaSolicitud" value="dd/mm/aaaa"/><br/><br/>
			<label for="direccion">Dirección:</label>
			<input type="text" name="direccion"/><br/><br/>
		
			<HR>
			<br/>
			
			<label for="superficeTerreno">Superficie terreno:</label>
			<input type="text" name="superficeTerreno" value="0"/>&nbsp;&nbsp;&nbsp;
			
			<label for="superficeEdificio">Superficie edificio:</label>
			<input type="text" name="superficeEdificio" value="0"/><br/><br/>
			
			<label for="superficeReforma">Superficie reforma:</label>
			<input type="text" name="superficeReforma" value="0"/><br/><br/>
			<HR>
			<br/>
			
			<label for="plantas">Plantas:</label>
			<input type="text" name="plantas" value="0"/>&nbsp;&nbsp;&nbsp;
			
			<label for="habitaciones">Habitaciones:</label>
			<input type="text" name="habitaciones" value="0"/>&nbsp;&nbsp;&nbsp;
			
			<label for="banyos">Baños:</label>
			<input type="text" name="banyos" value="0"/><br/><br/>
			<HR>
			<br/>
			
			<label for="finalidadObra">Finalidad Obra:</label>
			<input type="text" name="finalidadObra" /><br/><br/>
			
			<input type="hidden" name="coste" value="0" />
			  <br /> <input type="submit" value="Solicitar"/><input
				type="reset" />
		</form>

	</DIV>

	<mytags:piedepagina />
</body>
</html>
