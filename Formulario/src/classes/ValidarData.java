package classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidarData {

	public static boolean isValid(String date) {
		
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		df.setLenient (false); // aqui o pulo do gato
		try {
		    df.parse (date);
		    return true;
		} catch (ParseException ex) {
		   // data inválida
		}  
		return false;
	   }
}
