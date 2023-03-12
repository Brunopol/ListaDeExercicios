package atividade10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite o valor da compra : ");

		String valor = scanner.nextLine();

		double valorDouble = 0;

		boolean condition = true;
		do {
			try {

				if (valor.contains(",")) {
					valor = valor.replace(",", ".");
				}
				valorDouble = Double.valueOf(valor);
				condition = false;

			} catch (NumberFormatException e) {
				System.out.println("Somente numéricos!!");
				System.out.print("Digite o valor da compra : ");
				valor = scanner.nextLine();
			}

		} while (condition);

		valorDouble = valorDouble / 5;

		System.out.println("-----------------------------------------");
		for (int i = 0; i < 5; i++) {

			System.out.println("Valor da prestação " + (i+1) + " : " + "R$" + df.format(valorDouble));

		}
		scanner.close();

	}

}
