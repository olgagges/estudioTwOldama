<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>
<head>
<<<<<<< HEAD
=======
<mytags:scriptjs />
>>>>>>> ea663d9956e7a99135d6de0d7e404713ac2a76c5
<mytags:style />
<title>OLDAMA ArchiTecTuRe</title>
</head>

<body>
<<<<<<< HEAD
<mytags:jquery />
<mytags:barrasuperior />
<mytags:barralateral />

<DIV id=content>
<br>
<h3 class=r>Rellene el formulario para generar un nuevo cliente</h3><br/>

<c:if test="${errors.errorCount gt 0}">
	Errors!<br/>
	<c:forEach var="error" items="${errors.allErrors}">
		<span class="error">${error.objectName} ${error.code}</span>
		<br />
	</c:forEach>
</c:if>

<form class=r method="post" action="addCliente.htm">
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
=======
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
>>>>>>> ea663d9956e7a99135d6de0d7e404713ac2a76c5
</body>
</html>
