package br.com.fj21.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

	public static Date getDate(String dataTexto) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(dataTexto);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
