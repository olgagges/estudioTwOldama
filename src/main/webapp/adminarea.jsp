<%@ taglib tagdir="/WEB-INF/tags" prefix="mytags"%>
<html>

<head>
<mytags:style />
<title>Área Clientes OLDAMA</title>
</head>

<body>

<mytags:barrasuperior />
<mytags:barralateral />

<DIV id=content>
<br>

<h1 class=r>Bienvenid@ al Área de Administrador de OLDAMA Architecture</h1>

<br>

<h2 class=r>Por favor, selecione la acción que desea realizar</h2>

<br>

      <h3 class=r; style = "text-indent: 100px">Agregación de Personas a la BD</h3>
        <ul style = "text-indent: 120px">
          <li><A href="addCliente.htm">Agregar Clientes</A></li>
          <li><A href="addArquitecto.htm">Agregar Arquitectos</A></li>
          <li><A href="addAdmin.htm">Agregar Administrador</A></li>
          
        </ul>
        
        <br>
        
      <h3 style = "text-indent: 100px">Listados</h3>
        <ul style = "text-indent: 120px">
          <li><a href="listClientes.htm">Lista de clientes</a></li>
          <li><a href="listArquitectos.htm">Lista de Arquitectos</a></li>
          <li><a href="listAdmins.htm">Lista de Administradores</a></li>
        </ul>
      </li>


</DIV>

<mytags:piedepagina />

</body>

</html>
