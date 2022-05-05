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
<h4>Nueva Persona</h4>
<c:if test="${errors.errorCount gt 0}">
	Errors!<br/>
	<c:forEach var="error" items="${errors.allErrors}">
		<span class="error">${error.objectName} ${error.code}</span>
		<br />
	</c:forEach>
</c:if>
<form method="post" action="addPersona.htm">
<label for="nombre">Nombre:</label>
	<input type="text" name="nombre" /><br />
<label for="dni">DNI:</label>
	<input type="text" name="dni" />
<label for="email">Email:</label>
	<input type="text" name="email" />
<br />
<input type="submit" /><input type="reset" /></form>
</body>
</html>
