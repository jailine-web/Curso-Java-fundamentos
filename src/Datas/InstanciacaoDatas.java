package Datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciacaoDatas {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Cria um objeto do tipo localDate por meio do sistema e atribui esse horário
		//objeto d1 
		LocalDate d1 = LocalDate.now();
		//data com e hora
		LocalDateTime d2 = LocalDateTime.now();
		//Criando objetoo data-hora através de mensagens
		Instant d3 = Instant.now();
		LocalDate d4 = LocalDate.parse("2022-07-20");
		LocalDateTime d5 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d6 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d7 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d8 = LocalDate.parse("20/07/2022", fmt1);
		//outra forma --> LocalDate d8 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		LocalDateTime d9 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println("Datas!\n");
		
		System.out.println("Apenas data: "+d1);
		System.out.println("Data e hora: "+d2);
		System.out.println("Com fuso horário: "+d3);
		System.out.println("\nD4 Data passada por msg: "+d4);
		System.out.println("D5 Data e hora passada por msg: "+d5);
		System.out.println("D6 Data e hora em GMT-Londres: "+d6);
		System.out.println("\nD7 Transformar/Salvar hora local em GMT: "+d7);
		System.out.println("D8: Data formatada "+d8);
		System.out.println("D9: Data e hora formatada "+d9);
		System.out.println("Data passada por parâmetro(dados isolados): "+d10);
		System.out.println("Data e hora passada por parâmetro(dados isolados): "+d11);
		
		
	}

}
