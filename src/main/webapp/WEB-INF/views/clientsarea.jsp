<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>

<head>
<mytags:style />
<title>Área Clientes OLDAMA</title>
</head>

<body>

<mytags:barrasuperior />
<mytags:barralateral />

<script>
function solicitarProyecto() {
	document.location.href="addProyecto.htm?id=" + document.getElementById('idCliente').value;
}
</script>

<script>
function solicitarCertificado() {
	document.location.href="certificadoArea.htm?id=" + document.getElementById('idCliente').value;
}
</script>

<DIV id=content>
<br>

<h1 class=r>Bienvenid@ al Área de Clientes de OLDAMA Architecture</h1>

<br>

<h2 class=r>Por favor, seleccione la acción que desea realizar</h2>

<br>

      <h3 class=r; style = "text-indent: 100px">¿Nuevo Cliente?</h3>
        <ul style = "text-indent: 120px">
          <li><A href="addCliente.htm">Darse de alta</A></li>
        </ul>
       
        
        <br>
        
      <h3 style = "text-indent: 100px">Cliente registrado</h3>
       	<label for="cliente">Seleccionar cliente:</label> 
       		<select id="idCliente">
				<option>Seleccione Cliente</option>
				<c:forEach items="${clients}" var="lista">
					<option value="${lista.getIdCliente()}">${lista.getPersona().getNombre()}
					</option>
				</c:forEach>
			</select>
		<ul style = "text-indent: 120px">
          <li><A href="#" onClick="solicitarProyecto()">Dar de alta proyecto</A></li>
        </ul>
        <ul style = "text-indent: 120px">
          <li><A href="#" onClick="solicitarCertificado()">Solicitar un certificado</A></li>
        </ul>
        <ul style = "text-indent: 120px">
          <li><a href="http://www.twitter.com/" target="_blank">Descargar documentos de sus proyectos</a></li>
        </ul>
      


</DIV>

<mytags:piedepagina />

</body>

</html>
