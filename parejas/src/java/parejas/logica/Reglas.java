package parejas.logica;

import parejas.Persona;
import static java.lang.Math.*;

public class Reglas {

	private int limiteEdad;
	private float limiteAltura;
	
	public Reglas() {
	}

	public Reglas(int limiteEdad, float limiteAltura) {
		super();
		this.limiteEdad = limiteEdad;
		this.limiteAltura = limiteAltura;
	}


	public boolean esIdeal(Persona usuario, Persona candidato) {
		return abs(usuario.getEdad() - candidato.getEdad()) < limiteEdad
				&& abs(usuario.getAltura() - candidato.getAltura()) < limiteAltura;
	}

	public boolean esAfin(Persona usuario, Persona candidato) {
		return abs(usuario.getEdad() - candidato.getEdad()) < limiteEdad
				|| abs(usuario.getAltura() - candidato.getAltura()) < limiteAltura;
	}

	public int getLimiteEdad() {
		return limiteEdad;
	}

	public void setLimiteEdad(int limiteEdad) {
		this.limiteEdad = limiteEdad;
	}

	public float getLimiteAltura() {
		return limiteAltura;
	}

	public void setLimiteAltura(float limiteAltura) {
		this.limiteAltura = limiteAltura;
	}

}