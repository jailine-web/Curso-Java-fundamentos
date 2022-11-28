package Datas;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class CalculosDatas {

	public static void main(String[] args) {

		//Instancia��o da data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		java.util.Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		//instancia��o do calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//Escolhe a unidade minutos
		int minutes = cal.get(Calendar.MINUTE);
		
		//Extrai o m�s o mais 1 � pq o calendar come�a com o m�s 0
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

}
}