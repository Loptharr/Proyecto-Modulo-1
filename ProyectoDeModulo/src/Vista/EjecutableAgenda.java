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
	                	 System.out.println("Desea continuar? s/n : ");
	                     String alternativa1 = teclado.next();
	                     if (continua(alternativa1)) {
	                    	 continuar=true;
	                     } else{continuar=false;}
	                	 break;
	            case 2:
	            	System.out.println ("Ingrese nombre del contacto que desea buscar");
	            	String nombreExiste = teclado.next();
	            	
	            	 if(agenda.DevuelveContacto(nombreExiste)!=null) {
	            		 if (agenda.ExisteContacto(agenda.DevuelveContacto(nombreExiste))){
	            			 System.out.println ("El contacto: "+ agenda.DevuelveContacto(nombreExiste).getNombre() +", existe");            			
	            		 };
	            	 } else {System.out.println ("El contacto no existe");}
	            	 System.out.println("Desea continuar? s/n : ");
                     String alternativa2 = teclado.next();
                     if (continua(alternativa2)) {
                    	 continuar=true;
                     } else{continuar=false;}
	            	break;
	            case 3:
	            	if (!agenda.AgendaLlena()) {
	            		agenda.ListarContactos();
					} else {System.out.println ("Agenda vacía.");}
	            	System.out.println("Desea continuar? s/n : ");
                    String alternativa3 = teclado.next();
                    if (continua(alternativa3)) {
                   	 continuar=true;
                    } else{continuar=false;}
	            	break;
	            case 4:
	            	System.out.println ("Ingrese nombre del contacto que desea buscar");
	            	String nombreAEncontrar = teclado.next();
	            	if (!agenda.BuscaContacto(nombreAEncontrar)) {
						System.out.println ("El contacto no existe");
					}
	            	System.out.println("Desea continuar? s/n : ");
                    String alternativa4 = teclado.next();
                    if (continua(alternativa4)) {
                   	 continuar=true;
                    } else{continuar=false;}
	            	break;
	            case 5:	
	            	System.out.println ("Ingrese nombre del contacto que desea eliminar");
	            	String nombreElim = teclado.next();
	            	agenda.EliminarContacto(nombreElim);
	            	System.out.println("Desea continuar? s/n : ");
                    String alternativa5 = teclado.next();
                    if (continua(alternativa5)) {
                   	 continuar=true;
                    } else{continuar=false;}
	            	break;
	            case 6:
	            	if (!agenda.AgendaLlena()) {
	            		System.out.println ("Agenda no está llena");				
					} else {System.out.println ("Agenda sí está llena");}
	            	System.out.println("Desea continuar? s/n : ");
                    String alternativa6 = teclado.next();
                    if (continua(alternativa6)) {
                   	 continuar=true;
                    } else{continuar=false;}
	            	break;
	            case 7:
	            	System.out.println ("Espacio Libre : " + agenda.EspacioLibre() + " / " + agenda.getTamano());
	            	System.out.println("Desea continuar? s/n : ");
                    String alternativa7 = teclado.next();
                    if (continua(alternativa7)) {
                   	 continuar=true;
                    } else{continuar=false;}
	            	break;
	            default:
        	 		System.out.println ("Opcion ingresada no es valida");
        	 		System.out.println("Desea continuar? s/n : ");
                    String alternativa8 = teclado.next();
                    if (continua(alternativa8)) {
                   	 continuar=true;
                    } else{continuar=false;}
        	 		break;
        	 }
        	 
	
                
        }
        
        System.out.println("Aplicación finalizada.");
        System.out.println("----------------------");
	}
	
	public static boolean continua(String alternativa) {
	if (alternativa.equalsIgnoreCase("s")) {
    	return true;
	} else {return false;}
	}
}
