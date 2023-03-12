package atividade15;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um numero : ");
		String StringNumber = scanner.nextLine();
		boolean condition = true;
		double number = 0;
		do {

			try {
				if (StringNumber.contains(",")) {
					StringNumber = StringNumber.replace(",", ".");
				}
				number = Double.valueOf(StringNumber);
				condition = false;
			} catch (Exception e) {
				System.out.println("Isso não é um número né po?");
				System.out.print("Digite um numero! : ");
				StringNumber = scanner.nextLine();
			}

		} while (condition);

		if (number > 100 && number < 200) {

			System.out.println("Sim seu número está no intervalo entre 100 e 200");

		} else {

			System.out.println("Não seu número não está no intervalo entre 100 e 200");

		}

		scanner.close();

	}

}
