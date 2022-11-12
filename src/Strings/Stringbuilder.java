package Strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Stringbuilder {

	public static void main(String[] args) throws ParseException {
		
		Scanner ler = new Scanner(System.in);
		//Definir a data a partir do texto estabelecido no exemplo
		
		SimpleDateFormat dataEmTexto = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("\n<<<<<<  POSTS >>>>>");
		Comentarios c01 = new Comentarios("Faça uma boa viagem");
		Comentarios c02 = new Comentarios("Uau isso é incrível");
		
		Post post = new Post(dataEmTexto.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia",
				"Eu amo visitar este país maravilhoso" , 12);
	
		post.addComentario(c01);
		post.addComentario(c02);
		System.out.println();
		System.out.println(post);
		
		Comentarios c03 = new Comentarios("Boa noite pessual");
		Comentarios c04 = new Comentarios("Tenha uma boa noite");
		
		Post post2 = new Post(dataEmTexto.parse("20/06/2022 22:25:04"), "A lua está explendida!!",
				"Eu amo olhar o céu" , 22);
	
		post2.addComentario(c03);
		post2.addComentario(c04);
		System.out.println();
		System.out.println(post2);
		
		
		ler.close();
	
	}
}
