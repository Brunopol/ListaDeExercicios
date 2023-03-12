package atividade13;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um numero! : ");
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

		if (number > 10) {
			System.out.println("-------------------------------");
			System.out.println("Boa, seu número é maior que 10");
			System.out.println("Mostrando uma mensagem!!");
		}
		
		scanner.close();
		
	}

}
