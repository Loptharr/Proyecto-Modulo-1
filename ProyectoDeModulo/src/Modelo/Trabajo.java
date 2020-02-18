package Modelo;

public class Trabajo extends Contacto {

	final String CAT_TRABAJO = "TRABAJO";

	public Trabajo(String nombre, String numero) {
		super(nombre, numero);
		this.setCategoria(CAT_TRABAJO);
		
	}

}
