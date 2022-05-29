<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<h3 class=r>Edición de proyectos</h3><br/>
<h3 class=r>Modifique los campos deseados y pulse Confirmar</h3><br/>


		<form class=r method="post" action="addProyecto.htm">
			<input type=hidden value="${idCliente}" /> 

			<input type=hidden name="idCliente" value="${idCliente}" /> 

			<label for="idTipoProyecto">Tipo
				de proyecto</label> 
			<select id="idTipoProyecto" name="idTipoProyecto">
				<option value=0>Seleccione Tipo</option>
				<c:forEach items="${tiposProyecto}" var="lista">
					<option value="${lista.getIdTipoProyecto()}">${lista.getRef()}
					</option>
				</c:forEach>
			</select> </br><br/>
			<label for="idArquitecto">Arquitecto</label> 
			<select id="idArquitecto"  name="idArquitecto">
				<option value=0>Seleccione Arquitecto</option>
				<c:forEach items="${arquitectos}" var="listaArquitectos">
					<option value="${listaArquitectos.getIdArquitecto()}">${listaArquitectos.getPersona().getNombre()}
					</option>
				</c:forEach>
			</select> </br><br/>
			<label for="ref">Descripcion:</label>
			<input type="text" name="ref" /><br/><br/>
			<label for="ref">Fecha Inicio:</label>
			<input type="text" name="fechaInicio" value="01/01/2022"/><br/><br/>
			<label for="ref">Fecha Solicitud:</label>
			<input type="text" name="fechaSolicitud" value="01/01/2022"/><br/><br/>
			<label for="ref">Fecha Entrega:</label>
			<input type="text" name="fechaEntrega" value="01/01/2022"/><br/><br/>
			<label for="ref">Fecha Fin:</label>
			<input type="text" name="fechaFin" value="01/01/2022"/><br/><br/>


			<label for="ref">Duración obra:</label>
			<input type="text" name="duracionObra" value="0"/><br/><br/>
			
			<label for="ref">PresupuestoTotal:</label>
			<input type="text" name="presupuestoTotal" value="0"/><br/><br/>
			
			<label for="ref">Duracion presupuesto:</label>
			<input type="text" name="duracionPresupuesto" value="0"/><br/><br/>
			
			<label for="ref">Dirección:</label>
			<input type="text" name="direccion" /><br/><br/>
			
			<label for="ref">Superficie terreno:</label>
			<input type="text" name="superficieterreno" value="0"/><br/><br/>
			
			<label for="ref">Superficie edificio:</label>
			<input type="text" name="superficieedificio" value="0"/><br/><br/>
			
			<label for="ref">Superficie reforma:</label>
			<input type="text" name="superficieReforma" value="0"/><br/><br/>
			
			<label for="ref">Plantas:</label>
			<input type="text" name="plantas" value="0"/><br/><br/>
			
			<label for="ref">Habitaciones:</label>
			<input type="text" name="habitaciones" value="0"/><br/><br/>
			
			<label for="ref">Banyos:</label>
			<input type="text" name="banyos" value="0"/><br/><br/>
			
			<label for="ref">Finalidad Obra:</label>
			<input type="text" name="finalidadObra" /><br/><br/>
			
			<input type="hidden" name="coste" value="0" />
			 <br /> <br /> <input type="submit" /><input
				type="reset" />
		</form>
</DIV>
<mytags:piedepagina />
</body>
</html>
