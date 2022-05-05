<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<mytags:scriptjs />
<mytags:style />
</head>
<body>
	<mytags:menu />
	<div class="container">
		<h4>Nuevo Cliente</h4>
		<c:if test="${errors.errorCount gt 0}">
	Errors!<br />
			<c:forEach var="error" items="${errors.allErrors}">
				<span class="error">${error.objectName} ${error.code}</span>
				<br />
			</c:forEach>
		</c:if>

		<form method="post" action="addCliente.htm">
			<div class="form-group">
				<label for="nombre" class="control-label">Nombre:</label>
				<input type="text" name="nombre" class="form-control" />
				<label for="dni" class="control-label">DNI:</label>
				<input type="text" name="dni"  class="form-control" />
				<label for="email" class="control-label">Email:</label>
				<input type="text" name="email" class="form-control"/> <br />
			</div>
			<input type="submit" class="btn btn-primary"/>
			<input type="reset" class="btn  btn-primary"/>
		</form>
	</div>
</body>
</html>
