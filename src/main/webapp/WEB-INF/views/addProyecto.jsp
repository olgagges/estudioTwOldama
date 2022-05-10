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
			<input type=hidden value="${idCliente}" /> <label for="tipo">Tipo
				de proyecto</label> <select id="idTipoProyecto">
				<option>Seleccione Tipo</option>
				<c:forEach items="${tiposProyecto}" var="lista">
					<option value="${lista.getIdTipoProyecto()}">${lista.getRef()}
					</option>
				</c:forEach>
			</select> <br /> <br /> <br /> <br /> <input type="submit" /><input
				type="reset" />
		</form>

	</DIV>
	<mytags:piedepagina />
</body>
</html>
