package Datas;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.TimeZone;

public class DatasLegadas {

	public static void main(String[] args) throws ParseException {

		//Transformar texto no tipo date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Imprime em GMT
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Como Pegar datas de agora no modelo Date antigo do java
		@SuppressWarnings("deprecation")
		Date x1 = new Date(0);
		Date x2 = new Date(System.currentTimeMillis());
		
		Date x3 = new Date(0L);
		
		//Cinco horas da manhã passa-se o equivalente a 5 horas me milissegundos L = long
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		java.util.Date y1 = sdf1.parse("25/06/2018");
		java.util.Date y2 =  sdf2.parse("25/06/2018 15:42:07");
		
		//Transforma hora GMT(Global em local de acordo com o sistema da máquina 
		java.util.Date y3 =  Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		//Impressão das datas no padrão java
		System.out.println("\nx1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		
		//Datas com formatação
		System.out.println("-------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		//Horários acima em formato UTC/Gmt com fuso horário/time zone
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}

}
