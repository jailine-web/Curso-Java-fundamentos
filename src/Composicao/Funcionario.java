package Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Enum.NivelFuncionario;

public class Funcionario {

	//Composi��o: � o tipo de associa��o que permite que um objeto contenhq outro
	//Representa��o UML diamente preto

	private String nome;
	private NivelFuncionario nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	// O v�rios est� sendo representado por uma lista
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	
	public Funcionario(String nome, NivelFuncionario nivel, Double salarioBase, 
			Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public NivelFuncionario getNivel() {
		return nivel;
	}


	public void setNivel(NivelFuncionario nivel) {
		this.nivel = nivel;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public List<Contrato> getContratos() {
		return contratos;
	}

	//Faz a associa��o entre um Funcion�rio e um contrato 
	public void addContract(Contrato c) {
		contratos.add(c);
	}
	
	//desfaz a associa��o entre Funcion�rio e contrato 
	public void removeContract(Contrato c) {
		contratos.remove(c);
	}
	
	public double income(int year, int month) {
		double sum = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (Contrato c : contratos) {
			cal.setTime(c.getData());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
	
}


