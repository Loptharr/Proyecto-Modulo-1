package Modelo;

public class Amigo extends Contacto {

	final String CAT_AMIGO = "AMIGO";

	public Amigo(String nombre, String numero) {
		super(nombre, numero);
		this.setCategoria(CAT_AMIGO);
						
	}

}


