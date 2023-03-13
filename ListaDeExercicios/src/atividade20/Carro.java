package atividade20;

public class Carro {

	private double preco;
	private Integer ano;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public boolean isAnoMaiorQue200() {
		boolean anoMaiorQue200;

		if (this.ano <= 2000) {
			anoMaiorQue200 = true;
		} else {
			anoMaiorQue200 = false;
		}

		return anoMaiorQue200;
	}

	public double getDesconto() {

		double desconto;
		if (this.ano <= 2000) {

			desconto = this.preco * 0.12;

		} else {

			desconto = this.preco * 0.07;
		}

		return desconto;
	}

	public double getPrecoComDesconto() {

		double desconto = getDesconto();
		double precoComDesconto = this.preco - desconto;

		return precoComDesconto;
	}

}
