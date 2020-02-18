package Modelo;

public class OtroContacto extends Contacto{

	final String CAT_OTRO_CONT = "OTROS CONTACTO";
	
	public OtroContacto(String nombre, String numero) {
		super(nombre, numero);
		this.setCategoria(CAT_OTRO_CONT);
		// TODO Auto-generated constructor stub
	}

	
	
}
