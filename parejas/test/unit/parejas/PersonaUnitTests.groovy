package parejas

import grails.test.mixin.*
import org.junit.*


@TestFor(Persona)
class PersonaUnitTests {

    void testValidaciones() {
      	def persona=
		  new Persona(nombre:'Fernando',edad:79,altura:1.79f,sexo:Persona.HOMBRE)
		assert persona.validate()
		
		def otraPersona=
			new Persona(nombre:'F',edad:12,altura:-1.79f,sexo:Persona.HOMBRE)
		
		assert !otraPersona.validate()
		assert 3 == otraPersona.errors.errorCount
    }
}
