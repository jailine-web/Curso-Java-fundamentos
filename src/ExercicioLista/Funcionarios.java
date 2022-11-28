package ExercicioLista;

public class Funcionarios {
	
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionarios(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public Double getSalario() {
		return salario;
	}
	
	public double incrementaSalario(double valor) {
		salario += (salario * valor)/100;
		return salario;
	}
	
	@Override //Não é obrigatório, mas te ajuda a não errar
	public String toString() {
		return getId()+ " " + " "+getNome() +" "
				+ String.format("%.2f", salario)+ "\n";
	}

	
}
