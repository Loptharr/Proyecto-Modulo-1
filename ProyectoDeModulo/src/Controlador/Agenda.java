package Controlador;
import java.util.*;
import Modelo.*;


public class Agenda {
	//ARRAY DE 15 CONTACTOS
	//Contacto[] contacts = new Contacto[15];
	
	//ARRAYLIST INFINITOS CONTACTOS
	ArrayList <Contacto> listaContactos = new ArrayList<Contacto>();
	
	public void AnadirContacto(Contacto a){
		if (!ExisteContacto(a)) {
			if (this.listaContactos.size()<=15){
				listaContactos.add(a);
				//System.out.println(listaContactos);
			} else {System.out.println("Agenda llena");}
		}
		else {
			System.out.println("Contacto existe");
		}
	}

	public boolean ExisteContacto(Contacto a){
		boolean existe=false;
		// FOR EACH
		for (Contacto contacto : listaContactos) {
			if (contacto.getNombre() == a.getNombre()){
				existe=true;
			} 
		} return existe;
	}
		// FOR
		/*for (int i = 0; i < listaContactos.size(); i++) {
			if (a.getNombre()==listaContactos.get(i).getNombre()) {
				existe=true;
		    } return existe;
	    }*/

	public void ListarContactos() {
		for (Contacto contacto : listaContactos) {
			System.out.println(contacto.toString());
		}
		
	}
	
	public void BuscaContacto(String nombre) {
		for (Contacto contacto : listaContactos) {
			if (contacto.getNombre().equalsIgnoreCase(nombre)){
				System.out.println(contacto.getNumero());
			} 
		}
	}

	/*public void EliminarContacto(Contacto a) {
		if (this.ExisteContacto(a)) {
			listaContactos.remove(a);
			System.out.println("Contacto Eliminado");
		} else {System.out.println("Contacto no existe");}
	}*/
	
	public void EliminarContacto(String nombre) {
		for (Contacto contacto : listaContactos) {
			if (contacto.getNombre().equalsIgnoreCase(nombre)){
				listaContactos.remove(contacto);
				System.out.println("Contacto Eliminado");
			} else {
				System.out.println("Contacto no existe");
			}
		}
		
	}
	
	public void AgendaLlena() {
		
	}
	
	public void EspacioLibre() {
		
	}
}