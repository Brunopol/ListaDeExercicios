package atividade28;

public class Funcionario {

	private String nome;
	private double salario;
	private double salarioMinimo;

	public Funcionario(double salarioMinimo) {

		this.salarioMinimo = salarioMinimo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double novoSalario) {
		this.salario = novoSalario;
	}

	public double getAumentoSalarial() {

		if (this.salario < (salarioMinimo * 3)) {
			return (this.salario * 0.5) + this.salario;
		} else if (this.salario < (salarioMinimo * 10)) {
			return (this.salario * 0.2) + this.salario;
		} else if (this.salario < (salarioMinimo * 20)) {
			return (this.salario * 0.15) + this.salario;
		}
		return (this.salario * 0.1) + this.salario;

	}

}
