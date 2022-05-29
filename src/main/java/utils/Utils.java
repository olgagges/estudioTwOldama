package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public static Date convetirFecha(String fecha) {
		if (fecha == null) {
			return null;
		}
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date nuevaFecha = null;
		try {
			nuevaFecha = formato.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formato.applyPattern("yyyy/MM/dd");
		return nuevaFecha;
	}

	public static String convertirFechaVista(Date fecha) {
		if (fecha == null) {
			return null;
		}
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(fecha);

	}
}
