package scraperPackage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class JsoupHandling {

	public void MostrarPrecio(String nombre, String html) {
		
		try {
			Document doc=Jsoup.connect(html).get();//Representa una p�gina html
			Elements elements= doc.getElementsByClass("gh-po__price"); //Obtiene de la p�gina una lista de elementos determinada por el nombre de su clase.Espec�fica de cada p�gina.
			System.out.println("Oferta actual de "+ nombre+ " es "+ elements.get(1).text()); //Muestra el segundo elemento con esa clase ya que es el que interesa obtener en esta p�gina.			
			} catch (Exception e) {
				System.out.println("Error obteniendo datos");
		
		}
		
	}
}
