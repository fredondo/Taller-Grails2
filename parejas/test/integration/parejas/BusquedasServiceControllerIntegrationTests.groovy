package parejas

import static org.junit.Assert.*
import org.junit.*


class BusquedasServiceControllerIntegrationTests {
	
	@Before
	void prepararEscenario(){
		new Persona(nombre:'rosa',edad:79,altura:1.78f,sexo:Persona.MUJER).save()
	}
	
	@Test
    void testEncontrar() {
		def controller=new BusquedasServiceController()
		
		controller.request.method = 'POST'
		def params = [nombre:'luis',edad:79,altura:1.83f,sexo:Persona.HOMBRE]
		controller.params.putAll(params)
		
		controller.buscar()
		
		assert '/busquedasService/encontrado' == controller.modelAndView.viewName
		assert controller.flash.msg.startsWith('Enhorabuena')
		assert 'rosa' == controller.modelAndView.model.ideal.nombre
    }
	
	void testNoEncontrar() {
		def controller=new BusquedasServiceController()
		
		controller.request.method = 'POST'
		def params = [nombre:'luis',edad:39,altura:1.83f,sexo:Persona.HOMBRE]
		controller.params.putAll(params)
		
		
		controller.buscar()
		
		assert '/busquedasService/no_encontrado' == controller.modelAndView.viewName
		assert controller.flash.msg.startsWith('Lastima')
		assert 1 == controller.modelAndView.model.afines.size()
	}

}
