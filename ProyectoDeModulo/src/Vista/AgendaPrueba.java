package Vista;
import Controlador.*;
import Modelo.*;


public class AgendaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		
		agenda.setTamano(15);
		
		Familia a = new Familia("pepito pagadoble","998291291");
		Familia b = new Familia("pepito pagadoble","342342342");
		OtroContacto c = new OtroContacto("Andrea Rubilar","9983423291");
		Trabajo d = new Trabajo("Leo Zunica","33445322");
		
		agenda.AnadirContacto(a);
		agenda.AnadirContacto(b);
		agenda.AnadirContacto(c);
		agenda.AnadirContacto(d);
		agenda.ListarContactos();
		
		agenda.BuscaContacto("leo zunica");
		
		agenda.EliminarContacto("andrea rubilar");
		
		agenda.ListarContactos();
		
		System.out.println("Espacio Libre : "+agenda.EspacioLibre()+" / " + agenda.getTamano());
	}

}
