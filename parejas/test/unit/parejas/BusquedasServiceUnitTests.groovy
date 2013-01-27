package parejas



import grails.test.mixin.*
import org.junit.*


@TestFor(BusquedasService)
@Mock(Persona)
class BusquedasServiceUnitTests {

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
		defineBeans{
			reglas(parejas.logica.Reglas){
				limiteEdad=10
				limiteAltura=0.10
			}
		}
		
        def usuario=new Persona(nombre:'luis',edad:77,altura:1.83f,sexo:Persona.HOMBRE)
		def ideal=service.encontrarIdeal(usuario)
		assert ideal!=null
		assert 'rosa' == ideal.nombre
		def afines=service.encontrarAfines(usuario)
		assert 2 == afines.size()
    }
}