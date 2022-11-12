package Retangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Retangulo r = new Retangulo();
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a largura do retângulo");
		r.largura = ler.nextDouble();
		System.out.println("Digite a altuta do retângulo");
		r.altura = ler.nextDouble();
		
		r.area();
		r.perimetro();
		r.diagonal();
		System.out.println("Área é: " + r.area());
		System.out.println("Perimetro é: " + r.perimetro());
		System.out.println("Diagonal é: " + r.diagonal());
		
	}
}
