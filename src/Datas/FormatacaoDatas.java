package Datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatacaoDatas {

	public static void main(String[] args) {

		//Formato 8601 ISO PADRÃO DO JAVA: 
		//Transformar datas em texto padrão/customizadas
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z"); //data/hora global. Quando for instant tem que formatar o fuso horário
		
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; //substitui o ofPattern pela palavra isolada ISO-DATE-TIME
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; //Para datas com fuso horarios utiliza-se a palavra isolada ISO-INSTANT
		
		
		System.out.println("\nData normal, formato ISO: "+ d01);
		System.out.println("Data formatada: "+d01.format(fm1));
		System.out.println("Outra forma de formatar a data: "+fm1.format(d01));
		
		System.out.println("d02 = " + d02.format(fm1));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + d02.format(fmt4));

		System.out.println("d03 = " + fmt3.format(d03));
		System.out.println("d03 = " + d03.toString());
		
	}

}
