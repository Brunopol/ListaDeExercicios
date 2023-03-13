package atividade19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import methods.ConsoleColors;

public class Atividade19 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String sexo = "";
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		for (int i = 0; i < 56; i++) {

			Pessoa pessoa = new Pessoa();
			System.out.print("Digite seu nome : ");
			pessoa.setNome(scanner.next());
			System.out.print("Digite seu sexo (M)(F) : ");
			sexo = scanner.next();
			sexo = sexo.toUpperCase();
			boolean condition = true;

			do {
				switch (sexo) {
				case "M": {
					pessoa.setSexo('M');
					condition = false;
					break;
				}
				case "F": {
					pessoa.setSexo('F');
					condition = false;
					break;
				}
				default:
					System.out.println(ConsoleColors.RED + "Digite somente M ou F" +
							ConsoleColors.RESET);
					System.out.print("Digite seu sexo " + ConsoleColors.BLUE_BOLD + pessoa.getNome() + "," + ConsoleColors.RESET + " (M)(F) : ");
					sexo = scanner.next();
					sexo = sexo.toUpperCase();
					condition = true;
				}

			} while (condition);

			pessoas.add(pessoa);

		}

		int homem = 0;
		int mulher = 0;

		for (Pessoa pessoa : pessoas) {

			if (pessoa.getSexo() == 'M') {
				homem++;
			} else {
				mulher++;
			}

		}

		System.out.println("---------------------------------------------");

		System.out.println("quantidade de homens : " + homem + " são eles: ");
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getSexo() == 'M') {
				System.out.println(pessoa.getNome());
			}
		}

		System.out.println("quantidade de mulheres : " + mulher + " são elas: ");
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getSexo() == 'F') {
				System.out.println(pessoa.getNome());
			}
		}

		scanner.close();
	}

}
