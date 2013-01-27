<%@ page contentType="text/html;charset=UTF-8" import="parejas.Persona" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>.:Busqueda de Parejas:.</title>
</head>
<body>
	<div class="content">
		<h3 class="fieldcontain" align="center"><g:message code="busquedas.mensaje.bienvenida" default="¡Introduce tus datos y encuentra tu pareja ideal!"/></h3>
		<g:form action="buscar">
			<div class="fieldcontain ${hasErrors(bean:usuario,field:'nombre','errors')}">	
				<label for="nombre"> <g:message	code="persona.nombre.label" default="Nombre" /></label>
				<g:textField name="nombre" value="${usuario?.nombre}"/>
			</div>
			<div class="fieldcontain ${hasErrors(bean:usuario,field:'edad','errors')}">	
				<label for="edad"> <g:message code="persona.edad.label" default="Edad" /></label>
				<g:textField name="edad" value="${usuario?.edad}" />
			</div>
			<div class="fieldcontain ${hasErrors(bean:usuario,field:'altura','errors')}">	
				<label for="altura"> <g:message	code="persona.altura.label" default="Altura" /></label>
				<g:textField name="altura" value="${formatNumber(number:usuario?.altura,format:'0.00',locale:'ES')}" />
			</div>
			<div class="fieldcontain  ${hasErrors(bean:usuario,field:'altura','errors')}">	
				<label for="sexo"> <g:message	code="persona.sexo.label" default="Sexo" /></label>
				<g:message	code="persona.sexo.hombre.label" default="Hombre" /><g:radio name="sexo" value="${Persona.HOMBRE}"  checked="${usuario?.sexo==Persona.HOMBRE}"/>
				<g:message	code="persona.sexo.mujer.label" default="Mujer" /><g:radio name="sexo" value="${Persona.MUJER}"  checked="${usuario?.sexo==Persona.MUJER}"/>
				<g:renderErrors bean="${usuario}"  field="sexo"/>
			</div>
			<br/>
			<div align="right" class="fieldcontain" >
				<fieldset><input type="submit" value="${message(code: 'default.button.buscar.label', default: 'Buscar')}"  class="buttons" /></fieldset>
			</div>
					
		</g:form>
		<div class="${hasErrors(bean:usuario,'errors')}"><g:renderErrors bean="${usuario}" /></div>
	</div>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" import="parejas.Persona" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="main" />
<title>.:Busqueda de Parejas:.</title>
</head>
<body>
	<div class="content">
		<h3 class="fieldcontain" align="center"><g:message code="busquedas.mensaje.bienvenida" default="¡Introduce tus datos y encuentra tu pareja ideal!"/></h3>
		<g:form action="buscar">
			<div class="fieldcontain ${hasErrors(bean:usuario,field:'nombre','errors')}">	
				<label for="nombre"> <g:message	code="persona.nombre.label" default="Nombre" /></label>
				<g:textField name="nombre" value="${usuario?.nombre}"/>
			</div>
			<div class="fieldcontain ${hasErrors(bean:usuario,field:'edad','errors')}">	
				<label for="edad"> <g:message code="persona.edad.label" default="Edad" /></label>
				<g:textField name="edad" value="${usuario?.edad}" />
			</div>
			<div class="fieldcontain ${hasErrors(bean:usuario,field:'altura','errors')}">	
				<label for="altura"> <g:message	code="persona.altura.label" default="Altura" /></label>
				<g:textField name="altura" value="${formatNumber(number:usuario?.altura,format:'0.00',locale:'ES')}" />
			</div>
			<div class="fieldcontain  ${hasErrors(bean:usuario,field:'altura','errors')}">	
				<label for="sexo"> <g:message	code="persona.sexo.label" default="Sexo" /></label>
				<g:message	code="persona.sexo.hombre.label" default="Hombre" /><g:radio name="sexo" value="${Persona.HOMBRE}"  checked="${usuario?.sexo==Persona.HOMBRE}"/>
				<g:message	code="persona.sexo.mujer.label" default="Mujer" /><g:radio name="sexo" value="${Persona.MUJER}"  checked="${usuario?.sexo==Persona.MUJER}"/>
				<g:renderErrors bean="${usuario}"  field="sexo"/>
			</div>
			<br/>
			<div align="right" class="fieldcontain" >
				<fieldset><input type="submit" value="${message(code: 'default.button.buscar.label', default: 'Buscar')}"  class="buttons" /></fieldset>
			</div>
					
		</g:form>
		<div class="${hasErrors(bean:usuario,'errors')}"><g:renderErrors bean="${usuario}" /></div>
	</div>
</body>
</html>
