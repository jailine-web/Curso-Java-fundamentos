package mediaAluno;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void resultado() {
		double media = (nota1 + nota2 + nota3);
		if (media >=60) {
			System.out.println("aluno aprovado com "+ media);
		} 
		else {
			double faltou = 60 - media;
			System.out.printf("Aluno reprovado, faltou %.2f", faltou, " pontos");
		}
	}
	
}
