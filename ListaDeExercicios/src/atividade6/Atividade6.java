package atividade6;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor da variável A : ");
		String a = scanner.nextLine();

		System.out.println("Digite o valor da variável B : ");
		String b = scanner.nextLine();

		String temp = a;
		a = b;
		b = temp;

		System.out.println("---------------------------");
		System.out.println("Valor do A : " + a);
		System.out.println("Valor do B: " + b);
		
		scanner.close();
	}

}
