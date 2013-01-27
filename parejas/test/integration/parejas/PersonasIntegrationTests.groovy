package parejas

import static org.junit.Assert.*
import grails.validation.ValidationException;

import org.junit.*

class PersonasIntegrationTests {

    @Test
    void testGuardarPersonas() {
		def persona=
			new Persona(nombre:'Fernando',edad:79,altura:1.79f,sexo:Persona.HOMBRE)
		def tamInicial=Persona.count
		persona.save()
		assert tamInicial+1 ==Persona.count
		
		def otraPersona=
			new Persona(nombre:'F',edad:9,altura:-1.79f,sexo:Persona.HOMBRE)
	    otraPersona.save()
		assert 3 == otraPersona.errors.errorCount
		
		try {
			otraPersona.save(failOnError:true)
			fail 'aqui no llega'
		} catch (ValidationException e) {
			assert 3 == otraPersona.errors.errorCount
		}
		

    }
}
