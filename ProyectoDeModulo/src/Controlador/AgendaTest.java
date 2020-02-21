package Controlador;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import Modelo.Familia;

class AgendaTest {

	@Test
	void testAnadirContacto() {
		Agenda agenda = new Agenda(15);
		String nombre = "Luis";
		String numero = "5698768765";
		Familia contacto = new Familia(nombre,numero);
		agenda.AnadirContacto(contacto);
		String nombre2 = "blaada";
		String numero2 = "569876";
		Familia contacto2 = new Familia(nombre2,numero2);
		agenda.AnadirContacto(contacto2);
		assertEquals("Probando agregar 2 elemento a agenda", 2, agenda.sizeAgenda());
		
	}

	@Test
	void testExisteContacto() {
		String nombre = "Luis";
		String numero = "5698768765";
		Agenda agenda = new Agenda(15);
		Familia contacto = new Familia(nombre,numero);
		agenda.AnadirContacto(contacto);
		boolean expBool = true;
		boolean result = agenda.ExisteContacto(contacto);
		assertEquals(expBool, result);
	}

	@Test
	void testListarContactos() {
		String nombre = "Luis";
		String numero = "123456";
		Agenda agenda = new Agenda(15);
		Familia contacto = new Familia(nombre,numero);
		ArrayList queQueremos = new ArrayList(); 
		queQueremos.add(contacto);
		agenda.ListarContactos();
		assertEquals(queQueremos, agenda.ListarContactos());
		
	}

	@Test
	void testBuscaContacto() {
		String nombre = "Luis";
		String numero = "5698768765";
		Agenda agenda = new Agenda(15);
		Familia contacto = new Familia(nombre,numero);
		agenda.AnadirContacto(contacto);
		boolean expBool = true;
		boolean result = agenda.BuscaContacto(nombre);
		assertEquals(expBool,result);
	}

	@Test
	void testEliminarContacto() {
		String nombre = "Luis";
		String numero = "5698768765";
		Agenda agenda = new Agenda(15);
		Familia contacto = new Familia(nombre,numero);
		agenda.AnadirContacto(contacto);
		agenda.EliminarContacto(nombre);
		int result = agenda.sizeAgenda();
		assertEquals(0,result);
	}

	@Test
	void testAgendaLlena() {
		String nombre = "Luis";
		String numero = "5698768765";
		Agenda agenda = new Agenda(1);
		Familia contacto = new Familia(nombre,numero);
		agenda.AnadirContacto(contacto);
		boolean expBool = true;
		boolean result = agenda.AgendaLlena();
		assertEquals(expBool,result);
	}

	@Test
	void testEspacioLibre() {
		String nombre = "Luis";
		String numero = "5698768765";
		Agenda agenda = new Agenda(3);
		Familia contacto = new Familia(nombre,numero);
		agenda.AnadirContacto(contacto);
		assertEquals(2,agenda.EspacioLibre());
	}

	@Test
	void testDevuelveContacto() {
		String nombre = "Luis";
		String numero = "5698768765";
		Agenda agenda = new Agenda(3);
		Familia contacto = new Familia(nombre,numero);
		agenda.AnadirContacto(contacto);
		assertEquals(contacto,agenda.DevuelveContacto("Luis"));
	}

}
