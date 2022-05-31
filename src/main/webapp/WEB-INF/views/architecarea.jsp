<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>

<head>
<mytags:style />
<title>AÅrea Clientes OLDAMA</title>
</head>

<body>

<mytags:barrasuperior />
<mytags:barralateral />


<script>
function registrarProyecto() {
	if (document.getElementById('idArquitecto').value=='') {
		alert('Debe seleccionar el arquitecto');
		document.getElementById('idArquitecto').focus;
	}
	else document.location.href="addProyecto.htm?id=" + document.getElementById('idArquitecto').value;
}
function listarProyecto() {
	if (document.getElementById('idArquitecto').value=='') {
		alert('Debe seleccionar el arquitecto');
		document.getElementById('idArquitecto').focus;
	}
	else document.location.href="listProyectos.htm?idArquitecto=" + document.getElementById('idArquitecto').value;
}
</script>


<DIV id=content>
<br>

<h1 class=r>Bienvenid@ al &Aacute;rea de Arquitectos de OLDAMA Architecture</h1>

<br>

<h2 class=r>Por favor, selecione la acciÛn que desea realizar</h2>


   <h3 style = "text-indent: 100px">Seleccione perfil</h3>
   <ul style = "text-indent: 120px">
       	<label for="arquitecto">Seleccionar arquitecto</label> 
       		<select id="arquitecto">
				<option value="">Seleccione Arquitecto</option>
				<c:forEach items="${arquitectos}" var="lista">
					<option value="${lista.getIdArquitecto()}">${lista.getPersona().getNombre()}
					</option>
				</c:forEach>
			</select>
	</ul>
<br>
 
      <h3 class=r; style = "text-indent: 100px">Proyectos</h3>
        <ul style = "text-indent: 120px">
          <li><A href="#" onClick="listarProyecto()">Listado Proyectos</A></li>
        </ul>
        
        <br>
        
      <h3 style = "text-indent: 100px">Certificados</h3>
        <ul style = "text-indent: 120px">
          <li><a href="listCertificados.htm?tipo=HABITABILIDAD">Certificados de Habitabilidad</a></li>
          <li><a href="listCertificados.htm?tipo=ITE">Certificados de InspecciÛn TÈcnica</a></li>
          <li><a href="listCertificados.htm?tipo=EFICIENCIAENERGETICA">Certificados de Eficiencia EnergÈtica</a></li>
          <li><a href="listCertificados.htm?tipo=INFORMESPERICIALES">Informes Periciales</a></li>
           <li><a href="listCertificados.htm?tipo=todos">Listar Todos</a></li>

        </ul>
      </li>
	
	
	

</DIV>

<mytags:piedepagina />

</body>

</html>
