package scraperPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileHandler {
	File f= new File("rcrs/paginas.txt");
	FileWriter fw;
	BufferedWriter bw;
	Scanner sc;
	
	public FileHandler() throws IOException {
		if(!f.exists()) {
			new File("rcrs").mkdir();
			f.createNewFile();	
		}	
	}
	
	public void AgregarPagina(String nombre,String html) throws IOException {
		fw= new FileWriter(f, true);
		bw= new BufferedWriter(fw);
		
		bw.write(nombre);
		bw.newLine();
		bw.write(html);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Url agregada\n");
				
	}
	
	public void MostrarDatos(JsoupHandling js) throws FileNotFoundException   {	
		sc= new Scanner(f);		
		Integer i =1;
		while(sc.hasNext()) {
			if(!(i%2==0)) { // Filas par tienen url, filas impar tienen nombre
				js.MostrarPrecio(sc.nextLine(), sc.nextLine());
			}
		}
		
		
	}
	
	
}
