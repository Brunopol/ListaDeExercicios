package atividade7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a temperatura em graus Celsius : ");

		String celsius = scanner.nextLine();

		double fahrenheit = 0;
		double celsiusDouble = 0;

		boolean condition = true;

		do {
			try {

				if (celsius.contains(",")) {
					celsius = celsius.replace(",", ".");
				}
				celsiusDouble = Double.valueOf(celsius);
				condition = false;

			} catch (NumberFormatException e) {
				System.out.println("Somente numéricos!!");
				System.out.print("Digite a temperatura em graus Celsius : ");
				celsius = scanner.nextLine();
			}

		} while (condition);

		DecimalFormat df = new DecimalFormat("0.00");
		fahrenheit = ((9 * celsiusDouble) + 160) / 5;

		System.out.println("------------------------------------------------------------------");
		System.out.print("Temperatura em Fahrenheit: " + df.format(fahrenheit));

		scanner.close();
	}

}
