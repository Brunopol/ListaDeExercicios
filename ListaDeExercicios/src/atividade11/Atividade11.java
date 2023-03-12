package atividade11;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite o valor de custo do produto : ");

		String valorCusto = scanner.nextLine();

		double valorCustoDouble = 0;

		boolean condition = true;
		do {
			try {

				if (valorCusto.contains(",")) {
					valorCusto = valorCusto.replace(",", ".");
				}
				valorCustoDouble = Double.valueOf(valorCusto);
				condition = false;

			} catch (NumberFormatException e) {
				System.out.println("Somente numéricos!!");
				System.out.print("Digite o valor de custo do produto  : ");
				valorCusto = scanner.nextLine();
			}

		} while (condition);
		
		System.out.print("Digite o acréscimo da venda (%) : ");

		String valorAcrescimo = scanner.nextLine();

		double valorAcrescimoDouble = 0;

		boolean condition2 = true;
		do {
			try {

				if (valorAcrescimo.contains(",")) {
					valorAcrescimo = valorAcrescimo.replace(",", ".");
				}
				valorAcrescimoDouble = Double.valueOf(valorAcrescimo);
				condition2 = false;

			} catch (NumberFormatException e) {
				System.out.println("Somente numéricos!!");
				System.out.print("Digite o valor de custo do produto : ");
				valorAcrescimo = scanner.nextLine();
			}

		} while (condition2);

		
		System.out.println("----------------------------------------------");
		
		System.out.println("Valor de venda do produto : " + "R$" + df.format(valorCustoDouble * (valorAcrescimoDouble / 100) + valorCustoDouble));
		
		
		scanner.close();

	}

}
