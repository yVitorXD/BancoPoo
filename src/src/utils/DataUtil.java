package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	// Dentro de utils utilizamos varios métodos que podem ser usados em qualquer parte do site
	// sao metodos que nao precisam ser instanciados, é só chamar a classe.nomedometodo diretamente.
	
	// Static = este metodo pode ser usado mesmo sem instanciar essa classe
	public static String converterDateParaDataEHora(Date data) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
		return formatador.format(data);
		// 08/08/2021 12:52hrs
	}
	// metodo estatico
	public static String converterDateParaData(Date data) {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
		return formatador.format(data);
		// 08/08/2021 12:52hrs
	}
	// metodo estatico
	public static String converterDateParaHora(Date data) {
		SimpleDateFormat formatador = new SimpleDateFormat("hh:mm:ss");
		return formatador.format(data);
		// 08/08/2021 12:52hrs
	}
}
