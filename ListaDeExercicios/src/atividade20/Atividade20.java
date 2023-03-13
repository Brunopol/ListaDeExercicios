package atividade20;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade20 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		DecimalFormat df = new DecimalFormat("0.00");

		List<Carro> carros = new ArrayList<Carro>();

		int count = 1;
		boolean condition = true;
		String resposta;
		String valorCarro = "";
		String anoCarro = "";
		do {

			Carro carro = new Carro();

			System.out.print("Digite o valor do " + count + " Carro : ");
			valorCarro = scanner.next();
			carro.setPreco(RSN.ReceberDoubleFiltrado("Digite o valor do " + count + " Carro : ", valorCarro));
			System.out.print("Digite o ano do " + count + " Carro : ");
			anoCarro = scanner.next();
			carro.setAno(RSN.ReceberIntFiltrado("Digite o ano do " + count + " Carro : ", anoCarro));
			System.out.print("Deseja continuar ? (S)(N) : ");
			resposta = scanner.next();
			resposta = resposta.toUpperCase();

			boolean condition2 = true;
			do {
				switch (resposta) {
				case "S": {
					condition2 = false;
					condition = true;
					break;
				}
				case "N": {
					condition2 = false;
					condition = false;
					break;
				}
				default:
					condition2 = true;

					System.out.println("Digite somente Sim(S) ou Não(N)");
					System.out.print("Deseja continuar ? (S)(N) : ");
					resposta = scanner.next();
					resposta = resposta.toUpperCase();
				}
			} while (condition2);

			carros.add(carro);
			count++;

		} while (condition);

		System.out.println("------------------RESPOSTA---------------------");
		int count1 = 1;
		String checkPorcentage = "";
		for (Carro carro : carros) {
			if (carro.isAnoMaiorQue200()) {
				checkPorcentage = "(12%)";
			} else {
				checkPorcentage = "(7%)";
			}

			System.out.println("-------------Carro " + count1 + "-------------");
			System.out.println("Preço do carro " + count1 + " : " + df.format(carro.getPreco()));
			System.out.println(
					"Desconto do carro " + count1 + " : " + df.format(carro.getDesconto()) + " " + checkPorcentage);
			System.out.println("Preço com o desconto aplicado do carro " + count1 + " : "
					+ df.format(carro.getPrecoComDesconto()));

			count1++;
		}

		
		scanner.close();
	}

}
