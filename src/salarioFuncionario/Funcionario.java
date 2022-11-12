package salarioFuncionario;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	public double desconto;
	public double salarioLi;
	
	public double salariosemAcrescimo() {
		double salarioLi = salarioBruto - taxa;
		return salarioLi;
	}
	
	public double salarioLiquido() {
		double sl = salariosemAcrescimo();
		return sl + (salarioBruto * desconto)/100;
	}
	
	
}
