package parejas


import grails.test.mixin.*
import org.junit.*
import org.junit.Before;
import org.junit.Test;

@TestFor(BusquedasServiceController)
@Mock([BusquedasService,Persona])
class BusquedasServiceControllerUnitTests {

	@Before
	void prepararEscenario(){
		controller.busquedasService.reglas=new parejas.logica.Reglas(10,0.10f)
		new Persona(nombre:'rosa',edad:79,altura:1.78f,sexo:Persona.MUJER).save()
	}
	
	@Test
    void testEncontrar() {
		request.method = 'POST'
		def params = [nombre:'luis',edad:79,altura:1.83f,sexo:Persona.HOMBRE]
		controller.params.putAll(params)
	
		controller.buscar()
		
		assert '/busquedasService/encontrado' == view
		assert flash.msg.startsWith('Enhorabuena')
		assert 'rosa' == model.ideal.nombre
		
    }
	
	@Test
	void testNoEncontrar() {
		request.method = 'POST'
		def params = [nombre:'luis',edad:39,altura:1.83f,sexo:Persona.HOMBRE]
		controller.params.putAll(params)
		
		controller.buscar()
		
		assert '/busquedasService/no_encontrado' == view
		assert flash.msg.startsWith('Lastima')
		assert 1 == model.afines.size()
		
	}
}