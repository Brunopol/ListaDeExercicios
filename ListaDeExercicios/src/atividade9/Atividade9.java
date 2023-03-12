package atividade9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite o valor depositado : ");

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
				System.out.print("Digite o valor depositado : ");
				valor = scanner.nextLine();
			}

		} while (condition);
		
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Com o juros fixo em 0,70% a.m, você terá " + "R$" + df.format(valorDouble * 0.007) + " de lucro.");
		System.out.println("Total : " + "R$" +  df.format(valorDouble + (valorDouble * 0.007)) );
		
		scanner.close();
	}

}
