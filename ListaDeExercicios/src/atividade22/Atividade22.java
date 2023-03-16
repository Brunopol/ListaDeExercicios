package atividade22;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		DecimalFormat df = new DecimalFormat("0.00");
		List<Produto> produtos = new ArrayList<Produto>();

		for (int i = 0; i < 40; i++) {

			Produto produto = new Produto();

			System.out.print("Digite o preço de custo do produto " + (i + 1) + " : ");
			produto.setPrecoCusto(
					RSN.ReceberDoubleFiltrado("Digite o preço de custo do produto " + (i + 1) + " : ", scanner.next()));
			System.out.print("Digite o preço de venda do produto " + (i + 1) + " : ");
			produto.setPrecoVenda(
					RSN.ReceberDoubleFiltrado("Digite o preço de venda do produto " + (i + 1) + " : ", scanner.next()));

			produtos.add(produto);

		}

		System.out.println("Resultados:");
		int count = 1;
		for (Produto produto : produtos) {

			System.out.println("------------------ Produto " + count + " ------------------");
			System.out.println(
					"Produto teve um " + produto.getResult() + " com o valor de R$" + df.format(produto.getLucro()));
			count++;

		}

		scanner.close();
	}

}
