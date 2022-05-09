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
<h3 class=r>Rellene el formulario para generar un nuevo Arquitecto</h3><br/>

<c:if test="${errors.errorCount gt 0}">
	Errors!<br/>
	<c:forEach var="error" items="${errors.allErrors}">
		<span class="error">${error.objectName} ${error.code}</span>
		<br />
	</c:forEach>
</c:if>

<form class=r method="post" action="addArquitecto.htm">
<label for="nombre">Nombre:</label>
	<input type="text" name="nombre" /><br/><br/>
<label for="dni">DNI:</label>
	<input type="text" name="dni" /><br/><br/>
<label for="email">Email:</label>
	<input type="text" name="email" />
<br/><br/>

<input type="submit" /><input type="reset" /></form>

</DIV>
<mytags:piedepagina />
</body>
</html>
