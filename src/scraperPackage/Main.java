package scraperPackage;

import java.awt.Desktop;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static JsoupHandling js;
	static FileHandler f;

	public static void main(String[] args) throws IOException {
		 in = new Scanner(System.in);
		 js = new JsoupHandling();
		 f = new FileHandler();
		 Menu();
		
	}
	
	static void Menu() throws IOException {
		
		System.out.println("1-Revisar ofertas\n"
				+ "2-Agregar url\n"
				+ "3-Abrir archivo de urls con editor por defecto\n"
				+ "q-Terminar programa");
		
		switch (in.nextLine()) {
		case "1": {
			f.MostrarDatos(js);
			in.nextLine();
			Menu();
			break;
		}
		case "2":{
			System.out.println("Ingresar nombre seguido de url\n");
			f.AgregarPagina(in.nextLine(), in.nextLine());
			in.nextLine();
			Menu();
			break;
		}
		case "3":{
			Desktop.getDesktop().open(f.f);
			Menu();
			break;
		}
		case "q":{
			System.exit(0);
		}
		default:
			System.out.println("Opción inválida\n");
			in.nextLine();
			Menu();

		}
		
		
	}

}
