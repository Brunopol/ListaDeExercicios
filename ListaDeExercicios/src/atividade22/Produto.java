package atividade22;

public class Produto {

	private double precoCusto;
	private double precoVenda;

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getLucro() {

		return precoVenda - precoCusto;

	}

	public String getResult() {

		if (getLucro() > 0) {
			return "Lucro";
		} else if (getLucro() < 0) {
			return "Prejuizo";
		} else {
			return "Empate";
		}

	}

}
