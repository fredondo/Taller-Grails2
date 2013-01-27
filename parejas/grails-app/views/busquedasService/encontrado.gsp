<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="main"/>
<title>.:Busqueda de Parejas:.</title>
</head>
<body>
  <div class="content">
  	<h3 class="fieldcontain" align="center">${flash?.msg}</h3>
  			<div class="fieldcontain">
  				<label for="avatar" ><g:message code="persona.avatar.label" default="Avatar" /></label>
				<g:img name="avatar" dir="images/iconos"  file="${ideal?.avatar}" readonly="readonly" width="128px" />
			</div>
			<div class="fieldcontain">
				<label for="nombre"> <g:message	code="persona.nombre.label" default="Nombre" /></label>
				<g:textField name="nombre" value="${ideal?.nombre}" readonly="readonly" />
			</div>
			<div class="fieldcontain">
				<label for="edad"> <g:message	code="persona.edad.label" default="Edad" /></label>
				<g:textField name="edad" value="${ideal?.edad}" readonly="readonly"  />
			</div>
			<div class="fieldcontain">
				<label for="altura"> <g:message	code="persona.altura.label" default="Altura" /></label>
				<g:textField name="altura" value="${formatNumber(number:ideal?.altura,format:'0.00',locale:'ES')}" readonly="readonly" />
			</div>
			<div class="fieldcontain">
				<label for="sexo"> <g:message	code="persona.sexo.label" default="Sexo" /></label>
				<g:textField name="sexo" value="${ideal?."sexo"}" readonly="readonly" />
			</div>
			<br/>
		<div align="right" class="fieldcontain">
			<fieldset>
				<g:link controller="busquedasService" class="buttons"><g:message code="default.button.volver.label" default="Volver" /></g:link>
			</fieldset>
		</div>
  </div>
</body>
</html>
