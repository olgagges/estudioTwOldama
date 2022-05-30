<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>

<head>
<mytags:style />
<title>&Aacute;rea Administraci&oacute;n OLDAMA</title>
</head>

<body>

<mytags:barrasuperior />
<mytags:barralateral />

<DIV id=content>
<br>

<h1 class=r>Bienvenid@ al &Aacute;rea de Administrador de OLDAMA Architecture</h1>

<br>

<h2 class=r>Por favor, selecione la acción que desea realizar</h2>

<br>
 <div style="padding: 10px; float: left; width: 45%; text-align: justify;">
      <h3 class=r; style = "text-indent: 100px">Agregación de Personas a la BD</h3>
        <ul style = "text-indent: 120px">
          <li><A href="addCliente.htm">Agregar Clientes</A></li>
          <li><A href="addArquitecto.htm">Agregar Arquitectos</A></li>
          <li><A href="addAdmin.htm">Agregar Administrador</A></li>
        </ul>
        
        <br>
        
      <h3 style = "text-indent: 100px">Listados y Gestión</h3>
        <ul style = "text-indent: 120px">
          <li><a href="listClientes.htm">Lista de Clientes</a></li>
          <li><a href="listArquitectos.htm">Lista de Arquitectos</a></li>
          <li><a href="listAdmins.htm">Lista de Administradores</a></li>
     
        </ul>
      </li>
	</DIV>
	
	<div style="padding: 10px; float: right; width: 45%; text-align: justify;">
      <h3 class=r; style = "text-indent: 100px">Comunicaci&oacute;n con los clientes</h3>
        <ul style = "text-indent: 120px">
          <li><a href="listCertificadosClientes.htm?opt=I">Clientes con vivienda de m&aacute;s de 45 años</a></li>
          <li><a href="listCertificadosClientes.htm?opt=C">Certificados que han cumplido 15 años</a></li>
          
      </DIV>  

</DIV>

<mytags:piedepagina />

</body>

</html>
