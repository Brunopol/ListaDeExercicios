package atividade8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite o valor em US$ : ");

		String Dolar = scanner.nextLine();

		double DolarDouble = 0;

		boolean condition = true;
		do {
			try {

				if (Dolar.contains(",")) {
					Dolar = Dolar.replace(",", ".");
				}
				DolarDouble = Double.valueOf(Dolar);
				condition = false;

			} catch (NumberFormatException e) {
				System.out.println("Somente numéricos!!");
				System.out.print("Digite o valor em US$ : ");
				Dolar = scanner.nextLine();
			}

		} while (condition);

		System.out.print("Digite o valor da cotação do dólar : ");

		String cotacaoDolar = scanner.nextLine();
		double cotacaoDolarDouble = 0;

		boolean condition2 = true;
		do {
			try {

				if (cotacaoDolar.contains(",")) {
					cotacaoDolar = cotacaoDolar.replace(",", ".");
				}
				cotacaoDolarDouble = Double.valueOf(cotacaoDolar);
				condition2 = false;

			} catch (NumberFormatException e) {
				System.out.println("Somente numéricos!!");
				System.out.print("Digite o valor da cotação do dólar : ");
				cotacaoDolar = scanner.nextLine();
			}

		} while (condition2);

		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Valor em REAL : " + "R$" + df.format((DolarDouble * cotacaoDolarDouble)));
		
		scanner.close();
	}

}
