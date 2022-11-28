package Datas;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class Calendarr {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		java.util.Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//adiciona a unidade desejada --> acrescenta-se 4 horas a mais
		cal.add(Calendar.HOUR_OF_DAY, 4);
		// data atualizada
		d = cal.getTime();
		System.out.println(sdf.format(d));
	}
}
