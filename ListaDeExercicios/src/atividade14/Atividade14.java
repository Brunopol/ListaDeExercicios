package atividade14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Digite um numero : ");
		String StringNumber1 = scanner.nextLine();
		boolean condition = true;
		double number1 = 0;
		do {

			try {
				if (StringNumber1.contains(",")) {
					StringNumber1 = StringNumber1.replace(",", ".");
				}
				number1 = Double.valueOf(StringNumber1);
				condition = false;
			} catch (Exception e) {
				System.out.println("Isso não é um número né po?");
				System.out.print("Digite um numero! : ");
				StringNumber1 = scanner.nextLine();
			}

		} while (condition);
		
		System.out.print("Digite outro numero : ");
		String StringNumber2 = scanner.nextLine();
		boolean condition2 = true;
		double number2 = 0;
		do {

			try {
				if (StringNumber2.contains(",")) {
					StringNumber2 = StringNumber2.replace(",", ".");
				}
				number2 = Double.valueOf(StringNumber2);
				condition2 = false;
			} catch (Exception e) {
				System.out.println("Isso não é um número né po?");
				System.out.print("Digite um numero! : ");
				StringNumber2 = scanner.nextLine();
			}

		} while (condition2);

		
		System.out.println("---------------------------------------------------");
		
		if (number1 == number2) {
			System.out.println(df.format(number1) + " é IGUAL que " + df.format(number2));
		}
		else if (number1 > number2) {
			System.out.println(df.format(number1) + " é MAIOR que " + df.format(number2));
		} 
		else {
			System.out.println(df.format(number2) + " é MAIOR que " + df.format(number1));
		}
		
		scanner.close();
		
	}

}
