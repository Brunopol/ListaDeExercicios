package atividade30;

import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade30 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();

		System.out.print("Digite o nome do funcionário: ");
		String nome = scanner.next();

		System.out.print("Digite a idade do funcionário " + nome + ": ");
		int idade = RSN.ReceberIntFiltrado("Digite a idade do funcionário " + nome + ": ", scanner.next());

		System.out.print("Digite o sexo (M) ou (F) :");
		String sexo = scanner.next();
		sexo = sexo.toUpperCase();
		boolean condition = true;
		while (condition) {
			if (sexo.equals("M")) {
				condition = false;
			} else if (sexo.equals("F")) {
				condition = false;
			} else {
				System.out.println("Digite somente (M) ou (F)");
				System.out.print("Digite o sexo (M) ou (F) :");
				sexo = scanner.next();
				sexo = sexo.toUpperCase();
			}
		}

		System.out.print("Digite o salário do funcionário " + nome + " : ");
		double salario = RSN.ReceberDoubleFiltrado("Digite o salário do funcionário " + nome + " : ", scanner.next());

		if (sexo.equals("M")) {
			if (idade >= 30) {
				salario += 100;
			} else {
				salario += 50;
			}
			System.out.println("O salário do funcionário " + nome + " foi alterado para : " + salario);
		} else if (sexo.equals("F")) {
			if (idade >= 30) {
				salario += 200;
			} else {
				salario += 80;
			}
			System.out.println("O salário d funcionário " + nome + " foi alterado para : " + salario);
		}

	
		scanner.close();
	}

}
