package pe.edu.upc.view;

import java.util.List; //Packequete donde se encuentra la estructura de colecciones
import java.util.Scanner;

import pe.edu.upc.model.dao.ListaGrupos;
import pe.edu.upc.model.dao.ListaPersonas;
import pe.edu.upc.model.entity.Grupo;
import pe.edu.upc.model.entity.Persona;
import pe.edu.upc.service.IGenerico;
import pe.edu.upc.service.IGrupo;
import pe.edu.upc.service.IPersona;

/**
 * Henry A. Mendoza Puerta
 *
 */
public class AppOnpe {

	public static void main(String[] args) {
		// TODO code application logic here

		// Declaracion de objetos tipo IGrupo - IPersona

		
		// Interfaz nombreobjeto=new ConstructoClaseImplementaInterfaz();
		// IGenerico<Grupo> lgrupo1=new ListaGrupos();

		IGrupo lGrupo = new ListaGrupos();
		IPersona lPersona = new ListaPersonas();

		int Opcion = 0;

		while (true) {

			System.out.println(" 1. Registrar Grupo  ");
			System.out.println(" 2. Listar Grupos  ");
			System.out.println(" 3. Registrar Persona ");
			System.out.println(" 4. Listar Personas ");
			System.out.println(" 5. Salir ");
			System.out.print(" Ingrese su Opcion : ");

			Scanner oScanner = new Scanner(System.in);
			Opcion = oScanner.nextInt();
			switch (Opcion) {
			case 1:
				regGrupo(lGrupo);
				break;
			case 2:
				lisGrupo(lGrupo);
				break;
			case 3:
				regPersona(lPersona, lGrupo);
				break;
			case 4:
				lisPersonas(lPersona);
				break;
			case 5:
				return;

			}

		}
	}

	public static void regGrupo(IGrupo lGrupo) {
		Scanner oScanner = new Scanner(System.in);

		Grupo oGrupo = new Grupo();

		System.out.print("Ingrese el Nro Grupo: ");
		oGrupo.setNroGrupo(oScanner.nextLine());
		System.out.print("Ingrese el Ubigeo: ");
		oGrupo.setCodUbigeo(oScanner.nextLine());
		System.out.print("Ingrese el Colegio: ");
		oGrupo.setColegio(oScanner.nextLine());

		// TODO
		System.out.println(lGrupo.insertar(oGrupo));

		System.out.print("Presione una Tecla ");
		oScanner.nextLine();
	}

	public static void lisGrupo(IGrupo lGrupo) {

		Scanner oScanner = new Scanner(System.in);
		// System.out.println(oGrupo.getNroGrupo() + " - " +
		// oGrupo.getCodUbigeo() + " - " + oGrupo.getColegio());
		// TODO
		for (int i = 0; i < lGrupo.contar(); i++) {
			Grupo oGrupo = lGrupo.obtenerElemento(i);
			System.out.println(oGrupo.getNroGrupo() + " - " + oGrupo.getCodUbigeo() + " - " + oGrupo.getColegio());
		}

		System.out.print("Presione una Tecla ");
		oScanner.nextLine();
	}

	public static void regPersona(IPersona lPersona, IGrupo lGrupo) {
		Scanner oScanner = new Scanner(System.in);

		// TODO

		Persona oPersona = new Persona();

		// Buscar un grupo y asignar el grupo encontrado a la persona
		while (true) {
			System.out.print("Ingrese el Nro Grupo: ");
			// Obtener el grupo por nro grupo
			Grupo oGrupo = lGrupo.buscarPorNroGrupo(oScanner.nextLine());

			if (oGrupo != null) {
				// asignar el grupo a la persona
				oPersona.setoGrupo(oGrupo);
				break;
			} else {
				System.out.print("Ingrese un grupo que exista ");
			}
		}

		// Solicitar los datos de la persona
		System.out.print("Ingrese el DNI: ");
		oPersona.setDNI(oScanner.nextLine());
		System.out.print("Ingrese el Genero: ");
		oPersona.setGenero(oScanner.nextLine());
		System.out.print("Ingrese el Nombre: ");
		oPersona.setNombre(oScanner.nextLine());
		// TODO
		System.out.println(lPersona.insertar(oPersona));

		System.out.print("Presione una Tecla ");
		oScanner.nextLine();
	}

	public static void lisPersonas(IPersona lPersona) {
		Scanner oScanner = new Scanner(System.in);

		for (int i = 0; i < lPersona.contar(); i++) {
			Persona oPersona = lPersona.obtenerElemento(i);
			System.out.println(
					oPersona.getDNI() + " - " + oPersona.getNombre() + " - Nombre Grupo:" + oPersona.getoGrupo().getColegio());
		}
		System.out.print("Presione una Tecla ");
		oScanner.nextLine();
	}
}