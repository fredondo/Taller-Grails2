package parejas

import static org.junit.Assert.*
import org.junit.*

class BusquedasServiceIntegrationTests {

	def busquedasService
	
	@Before
	void prepararEscenario(){
		def personas=[new Persona(nombre:'fer',edad:89,altura:1.79f,sexo:Persona.HOMBRE),
			new Persona(nombre:'paco',edad:79,altura:1.63f,sexo:Persona.HOMBRE),
			new Persona(nombre:'ana',edad:73,altura:1.69f,sexo:Persona.MUJER),
			new Persona(nombre:'rosa',edad:79,altura:1.78f,sexo:Persona.MUJER)]
		
		personas.each{it.save()}
	
	}

    @Test
	void testEncontrarIdealyAfines() {
		def usuario=new Persona(nombre:'luis',edad:79,altura:1.83f,sexo:Persona.HOMBRE)
		def ideal=busquedasService.encontrarIdeal(usuario)
		assert ideal!=null
		assert 'rosa' == ideal.nombre
		def afines=busquedasService.encontrarAfines(usuario)
		assert 2 == afines.size()
    }
}
