package Modelo;

public abstract class Contacto {

	private String nombre;
	private String numero;
	private String categoria;
	
	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Contacto() {
		
	}
	
	public Contacto(String nombre2, String numero2, String categoria2) {
		super();
	}
	
	
	public Contacto(String nombre, String numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Contacto [nombre= " + nombre + ", numero= " + numero + ", categoria= " + categoria + "]";
	}


	
	
	
	
}
