<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>.:Busqueda de Parejas:.</title>
</head>
<body>
	<div class="content">
		<h3 class="fieldcontain" align="center">${flash?.msg}</h3>
		<p align="center">Sin embargo, estas son personas afines a ti, que	mantenemos en nuestro sistema</p>
		<br />
		<table border="0" class="albumsTable">
			<tr>
				<th>Avatar</th>
				<th>Nombre</th>
				<th>Edad</th>
				<th>Altura</th>
			</tr>
			<g:each var="afin" in="${afines}">
				<tr>
					<td><g:img name="avatar" dir="images/iconos"  file="${afin?.avatar}" readonly="readonly" width="64px" /></td>
					<td>${afin.nombre}</td>
					<td>${afin.edad}</td>
					<td>${afin.altura}</td>
				</tr>
			</g:each>
		</table>
		<div align="right" class="fieldcontain">
			<fieldset>
				<g:link controller="busquedasService" class="buttons">
					<g:message code="default.button.volver.label" default="Volver" />
				</g:link>
			</fieldset>
		</div>
	</div>
</body>
</html>
