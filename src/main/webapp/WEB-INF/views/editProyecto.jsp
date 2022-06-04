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
<h3 class=r>Modifique los campos deseados y pulse Confirmar</h3>

<table align ="center" border=1 width="60%" >
	<tr bgcolor="grey">
		<th align="center">Nº Proyecto</th>
		<th>Tipo Proyecto</th>
		<th>Cliente</th>
		<th>Descripción</th>
		<th>Dirección</th>
		<th>Fecha Solicitud</th>
	</tr>
	<tr>
		<td align="center"><c:out value="${proyecto.idProyecto}"/></td>
		<td align="center"><c:out value="${proyecto.tipo}"/></td>
		<td align="center"><c:out value="${cliente.persona.nombre}"/></td>
		<td align="center"><c:out value="${proyecto.ref}"/></td>
		<td align="center"><c:out value="${proyecto.direccion}"/></td>
		<td align="center"><c:out value="${proyecto.fechaSolicitud}"/></td>
	</tr>
</table>


		<form class=r method="post" action="editProyecto.htm"> 

			<input type=hidden name="idProyecto" value="${proyecto.idProyecto}" /> 
			<input type=hidden name="tipo" value="${proyecto.tipo}" />
			<input type=hidden name="idCliente" value="${cliente.idCliente}" />
			<input type=hidden name="ref" value="${proyecto.ref}" />
			<input type=hidden name="direccion" value="${proyecto.direccion}" />
			<input type=hidden name="fechaSolicitud" value="${proyecto.fechaSolicitud}" />

			
			</select> </br><br/>
			<label for="idArquitecto">Arquitecto</label> 
			<select id="idArquitecto"  name="idArquitecto">
				<option value=0>${proyecto.idArquitecto  eq null ? 'Seleccione Arquitecto': proyecto2.arquitecto.persona.nombre}</option>
				<c:forEach items="${arquitectos}" var="listaArquitectos">
					<option value="${listaArquitectos.getIdArquitecto()}">${listaArquitectos.getPersona().getNombre()}
					</option>
				</c:forEach>
			</select> </br><br/><br/>
			
		
		
		
			<label for="fechaInicio">Fecha Inicio:</label>
			<input type="text" name="fechaInicio" value="${proyecto.fechaInicio  eq null ? 'dd/mm/aaaa': proyecto.fechaInicio}"/>&nbsp;&nbsp;&nbsp;
			<label for="fechaFin">Fecha Fin:</label>
			<input type="text" name="fechaFin" value="${proyecto.fechaFin  eq null ? 'dd/mm/aaaa': proyecto.fechaFin}"/><br/><br/>
		
			<label for="fechaEntrega">Fecha Entrega:</label>
			<input type="text" name="fechaEntrega" value="${proyecto.fechaEntrega  eq null ? 'dd/mm/aaaa': proyecto.fechaEntrega}"/><br/><br/>
			<HR>
			<br/>
			<label for="duracionObra">Duración obra:</label>
			<input type="text" name="duracionObra" value="${proyecto.duracionObra  eq 0 ? '0': proyecto.duracionObra}"/>&nbsp;&nbsp;&nbsp;
			 
			<label for="presupuestoTotal">Presupuesto total(EU):</label>
			<input type="text" name="presupuestoTotal" value="${proyecto.presupuestoTotal  eq 0 ? '0': proyecto.presupuestoTotal}"/><br/><br/>
	
			<label for="duracionPresupuesto">Duracion presupuesto:</label>
			<input type="text" name="duracionPresupuesto" value="${proyecto.duracionPresupuesto  eq 0 ? '0': proyecto.duracionPresupuesto}"/><br/><br/>
			<HR>
			<br/>
			
			<label for="superficeTerreno">Superficie terreno:</label>
			<input type="text" name="superficeTerreno" value="${proyecto.superficeTerreno  eq 0 ? '0': proyecto.superficeTerreno}"/>&nbsp;&nbsp;&nbsp;
			
			<label for="superficeEdificio">Superficie edificio:</label>
			<input type="text" name="superficeEdificio" value="${proyecto.superficeEdificio  eq 0 ? '0': proyecto.superficeEdificio}"/><br/><br/>
			
			<label for="superficeReforma">Superficie reforma:</label>
			<input type="text" name="superficeReforma" value="${proyecto.superficeReforma  eq 0 ? '0': proyecto.superficeReforma}"/><br/><br/>
			<HR>
			<br/>
			
			<label for="plantas">Plantas:</label>
			<input type="text" name="plantas" value="${proyecto.plantas  eq 0 ? '0': proyecto.plantas}"/>&nbsp;&nbsp;&nbsp;
			
			<label for="habitaciones">Habitaciones:</label>
			<input type="text" name="habitaciones" value="${proyecto.habitaciones  eq 0 ? '0': proyecto.habitaciones}"/>&nbsp;&nbsp;&nbsp;
			
			<label for="banyos">Baños:</label>
			<input type="text" name="banyos" value="${proyecto.banyos  eq 0 ? '0': proyecto.banyos}"/><br/><br/>
			<HR>
			<br/>
			
			<label for="finalidadObra">Finalidad Obra:</label>
			<input type="text" name="finalidadObra" value="${proyecto.finalidadObra  eq null ? '': proyecto.finalidadObra}" /><br/><br/>
			
			<label for="coste">Coste Total(EU):</label>
			<input type="text" name="coste" value="${proyecto.coste  eq 0 ? '0': proyecto.coste}"/><br/><br/>
			 <br /> <br /> <input type="submit" value="Modificar" /><input
				type="reset" />
		</form>
</DIV>
<mytags:piedepagina />
</body>
</html>
