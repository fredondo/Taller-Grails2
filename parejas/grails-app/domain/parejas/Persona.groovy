package parejas

class Persona {
	final static Character HOMBRE='H'
	final static Character MUJER='M'
	
	String nombre
	Integer edad
	Float altura
	Character sexo
	String avatar

    static constraints = {
		nombre blank:false,size:2..15
		edad range:18..99
		altura min:0.0f
		avatar(nullable:true)
    }
	
	static mapping = {
		table 'candidatos'
		id column:'id_candatos'
	}
}
