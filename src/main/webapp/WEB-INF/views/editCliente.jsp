<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Cliente</h1>
<form:form method="POST" action="editCliente.htm"
	modelAttribute="cliente">
	<table>
		<tr>
			<td></td>
			<td><form:hidden path="idCliente" /></td>
		</tr>
		<tr>
			<td>Nombre :</td>
			<td><form:input path="persona.nombre" /></td>
		</tr>
		<tr>
			<td>dni :</td>
			<td><form:input path="persona.dni" /></td>
		</tr>
		<tr>
			<td>email :</td>
			<td><form:input path="persona.email" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="guardar cambios" /></td>
		</tr>
	</table>
</form:form>
