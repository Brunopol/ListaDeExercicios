package atividade12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite o valor do carro novo : ");

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
				System.out.print("Digite o valor do carro novo  : ");
				valorCusto = scanner.nextLine();
			}

		} while (condition);

		double res = valorCustoDouble + ((valorCustoDouble + (valorCustoDouble * 0.45)) * 0.28);

		System.out.println("Valor do carro após os 28% e 45% : " + "R$" + df.format(res));
		scanner.close();

	}

}
