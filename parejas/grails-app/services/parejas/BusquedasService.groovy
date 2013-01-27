package parejas

class BusquedasService {
	def reglas
	
	def encontrarIdeal(Persona usuario) {
		def ideal
		def candidatos = seleccionarCandidatos(usuario)

		log.debug "buscando ideal para ${usuario.nombre}"
		ideal=candidatos.find{candidato->reglas.esIdeal(usuario,candidato)}
    }

	def encontrarAfines(Persona usuario) {
		def afines=[]
		def candidatos = seleccionarCandidatos(usuario)
		
		log.debug "buscando afines para ${usuario.nombre}"
		afines=candidatos.findAll{candidato->reglas.esAfin(usuario,candidato)}
		
	}
	
	private List seleccionarCandidatos(Persona usuario) {
		def candidatos
		if(usuario.sexo == Persona.HOMBRE){
			candidatos=Persona.findAllBySexo(Persona.MUJER)
		}else{
			candidatos=Persona.findAllBySexo(Persona.HOMBRE)
		}
		return candidatos
	}
}