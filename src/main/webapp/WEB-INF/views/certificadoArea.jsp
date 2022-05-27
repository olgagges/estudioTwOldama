<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>

<head>
<mytags:style />
<title>OLDAMA Architecture</title>
</head>

<body>

<mytags:barrasuperior />
<mytags:barralateral />

<script>
function addEstructura() {
	document.location.href="addEstructura.htm?id=" + ${idCliente};
}
</script>

<script>
function addCertificado() {
	var estructura;
	
	if (document.getElementById('idEstructura').value=='') {
		alert('Debe seleccionar un edificio');
		document.getElementById('idEstructura').focus;
	}
	else {
		estructura=document.getElementById('idEstructura').value;
		document.location.href="addCertificado.htm?id=" + ${idCliente} + "&idestr=" + estructura;
	}
}
</script>


<DIV id=content>
<br>

<h1 class=r>Solicitud de Certificados</h1>

<br>

<h2 class=r>Por favor, siga los pasos que se indican para solicitar un nuevo certificado</h2>

<br>

      <h3 class=r; style = "text-indent: 100px">Seleccione el edificio si éste ya se encuentra en nuestra base de datos</h3>
       
        
        <br>
        <ul style = "text-indent: 120px">
       	<label for="estructura">Edificio:</label> 
				<select id="idEstructura">
				<option>Seleccione Edificio</option>
				<c:forEach items="${estructuras}" var="listaEstructuras">
					<option value="${listaEstructuras.getIdEstructura()}">${listaEstructuras.getRef()}
					</option>
				</c:forEach>
			</select>
		</ul>
        <br>
        
        <form style = "text-indent: 210px">
    		<a href="#" onClick="addCertificado()">
        	<input type="button" value="Seleccionar">
    		</a>
   		 </form>
		
        <br>
        <br>
        <h3 class=r; style = "text-indent: 100px">Si no se encuentra en la BD, dé de alta su edificio</h3>
        
       <ul style = "text-indent: 120px">
          <li><A href="#" onClick="addEstructura()">Dar de alta edificio</A></li>
        </ul>
        
        <br>
        


</DIV>

<mytags:piedepagina />

</body>

</html>
