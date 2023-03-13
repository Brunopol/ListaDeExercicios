package atividade18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();

		System.out.println("Programa irá ler a idade de 75 pessoas.");
		System.out.println("Mostrará se for maior ou menor de idade");
		System.out.println("-----------------------------------");

		List<Double> idades = new ArrayList<Double>();
		String idade = "";

		// pegando as idadeds com ajuda da class que criei.
		for (int i = 0; i < 75; i++) {
			System.out.print("Digite a idade da  " + (i + 1) + " pessoa : ");
			idade = scanner.nextLine();
			idades.add(RSN.ReceberDoubleFiltrado("Digite a idade da  " + (i + 1) + " pessoa : ", idade));
		}

		// mostrando qual pessoa é maior de idade
		System.out.println("------------------------------------------------------");
		int count = 0;
		for (Double double1 : idades) {
			count++;
			if (double1 >= 18) {
				System.out.println("Pessoa " + count + " é MAIOR de idade");
			} else {
				System.out.println("Pessoa " + count + " é MENOR de idade");
			}

		}

		scanner.close();

	}

}
