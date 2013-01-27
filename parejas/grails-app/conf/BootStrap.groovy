import grails.util.Environment
import parejas.Persona

class BootStrap {


    def init = { servletContext ->
		switch (Environment.current) {
			case Environment.DEVELOPMENT:
					
						def personas=[new Persona(nombre:'Andres',edad:89,altura:1.79f,sexo:Persona.HOMBRE,avatar:'Gomez.png'),
							new Persona(nombre:'Paco',edad:79,altura:1.63f,sexo:Persona.HOMBRE,avatar:'Freddie.png'),
							new Persona(nombre:'Angel',edad:59,altura:1.63f,sexo:Persona.HOMBRE,avatar:'Jason.png'),
							new Persona(nombre:'Pepe',edad:49,altura:1.63f,sexo:Persona.HOMBRE,avatar:'Annibal.png'),
							new Persona(nombre:'Ana',edad:73,altura:1.69f,sexo:Persona.MUJER,avatar:'Witch.png'),
							new Persona(nombre:'Luisa',edad:43,altura:1.69f,sexo:Persona.MUJER,avatar:'Devil.png'),
							new Persona(nombre:'Tere',edad:23,altura:1.69f,sexo:Persona.MUJER,avatar:'Bat.png'),
							new Persona(nombre:'Rosa',edad:89,altura:1.78f,sexo:Persona.MUJER,avatar:'Doll.png')]
					
						personas.each{it.save()	}
			}
		
    }
    def destroy = {
    }
}
