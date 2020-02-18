package Modelo;

public class Familia extends Contacto{

final String CAT_FAMILIA = "FAMILIA";
	
	public Familia(String nombre, String numero) {
		super(nombre, numero);
		this.setCategoria(CAT_FAMILIA);
		
	}
	
}
