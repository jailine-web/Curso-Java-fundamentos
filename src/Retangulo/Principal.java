package Retangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Retangulo r = new Retangulo();
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a largura do ret�ngulo");
		r.largura = ler.nextDouble();
		System.out.println("Digite a altuta do ret�ngulo");
		r.altura = ler.nextDouble();
		
		r.area();
		r.perimetro();
		r.diagonal();
		System.out.println("�rea �: " + r.area());
		System.out.println("Perimetro �: " + r.perimetro());
		System.out.println("Diagonal �: " + r.diagonal());
		
	}
}
