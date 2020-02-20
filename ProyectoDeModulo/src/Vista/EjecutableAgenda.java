package Vista;

import java.util.*;

import Controlador.Agenda;
import Modelo.*;

public class EjecutableAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamAgenda=15;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Agenda por defecto es de 15, desea cambiar el tamaño? : ");
        String cambiarTamAgenda = teclado.nextLine();
        
        if (cambiarTamAgenda.equalsIgnoreCase("s")) {
        	System.out.println("Cuantos contactos deseas ingresar? : ");
            tamAgenda = teclado.nextInt();
		} else {tamAgenda=15;}
        
        //CREAMOS LA AGENDA       
        Agenda agenda = new Agenda(tamAgenda);
        
        
        //CREAMOS BOOLEAN DE SALIDA PARA EL WHILE      
        boolean continuar = true;
        while (continuar == true) {

            System.out.println("----------------");
            System.out.println("      MENU    ");
            System.out.println("----------------");
            System.out.println("1) Añadir Contacto");
            System.out.println("2) Existe Contacto");
            System.out.println("3) Listar Contactos");
            System.out.println("4) Buscar Contacto");
            System.out.println("5) Eliminar Contacto");
            System.out.println("6) Agenda llena?");
            System.out.println("7) Espacio libre");
            System.out.println("----------------");
            System.out.println("Seleccionar opción : ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                	 System.out.println("Ingrese nombre: ");
                	 String nombre = teclado.next();
                	 System.out.println("Ingrese numero telefónico: ");
                	 String numero = teclado.next();
                	 System.out.println("Seleccione Categoría : ");
                	 System.out.println("1) Amigos  2) Trabajo  3) Familia  4) Otros Contactos ");
                	 int categoria = teclado.nextInt();
	                	 switch (categoria) {
	                	 	case 1:
	                	 		Amigo a = new Amigo(nombre,numero);
	                	 		agenda.AnadirContacto(a);	
	                	 		break;
	                	 	case 2:
	                	 		Trabajo b = new Trabajo(nombre,numero);
	                	 		agenda.AnadirContacto(b);	
	                	 		break;
	                	 	case 3:
	                	 		Familia c = new Familia(nombre,numero);
	                	 		agenda.AnadirContacto(c);	
	                	 		break;
	                	 	case 4:
	                	 		OtroContacto d = new OtroContacto(nombre,numero);
	                	 		agenda.AnadirContacto(d);	
	                	 		break;
	                	 default:
	                	 		System.out.println ("Opcion ingresada no es valida");
	                	 }
	                	 break;
	            case 2:
	            	System.out.println ("Ingrese nombre del contacto que desea buscar");
	            	String nombreExiste = teclado.next();
	            	
	            	 if(agenda.DevuelveContacto(nombreExiste)!=null) {
	            		 
	            	 }
	            	
	            	break;
	            case 3:
	            	agenda.ListarContactos();
	            	break;
	            case 4:
	            	System.out.println ("Ingrese nombre del contacto que desea buscar");
	            	String nombreAEncontrar = teclado.next();
	            	if (!agenda.BuscaContacto(nombreAEncontrar)) {
						System.out.println ("El contacto no existe");
					} else {
						System.out.println ("El contacto existe");
					}
	            	
	            	break;
	            case 5:	
		
	
            }       
        }
	}
	
}
