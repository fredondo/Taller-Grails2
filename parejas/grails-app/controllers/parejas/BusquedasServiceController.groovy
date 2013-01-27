package parejas

class BusquedasServiceController {

    def busquedasService
	def usuario
	
	static scope = 'session'
	
    def index() {
		render view:'busquedas'
	}
	
	def buscar(){
		usuario = new Persona(params)
		
		if(!usuario.validate()) {
			return redirect (action: 'index')
		}
		
		log.debug "buscando ideal para ${usuario.properties}..."
		flash.msg="Enhorabuena ${usuario.nombre} hemos encontrado tu pareja ideal!"
		def vista='encontrado'
		def ideal=busquedasService.encontrarIdeal usuario
		def afines
		
		if(!ideal){
			log.debug "buscando afines para ${usuario.properties}..."
			flash.msg="Lastima ${usuario.nombre} NO hemos encontrado tu pareja ideal!"
			vista='no_encontrado'
			afines=busquedasService.encontrarAfines usuario
		}
		
		render view:vista , model:[ideal:ideal,afines:afines]
	}
}
