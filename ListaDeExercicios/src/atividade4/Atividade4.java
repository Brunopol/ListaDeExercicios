package atividade4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Pegar o nome do vendedor

		System.out.println("Digite o nome do Vendedor : ");
		String nome = scanner.nextLine();

		// Pegar o salário fixo do vendedor

		System.out.println("Digite o salário fixo do " + nome + " :");
		double salarioFixo = 0;
		boolean conditionSF = false;
		do {
			try {
				salarioFixo = Double.valueOf(scanner.nextLine());
				conditionSF = true;
			} catch (Exception e) {
				System.out.println("Digite Numeros!! : ");
			}
		} while (conditionSF == false);

		// Pegar o total de vendas do vendedor

		System.out.println("Digite o total vendido: ");
		double totalVendido = 0;
		boolean conditionTV = false;
		do {
			try {
				totalVendido = Double.valueOf(scanner.nextLine());
				conditionTV = true;
			} catch (Exception e) {
				System.out.println("Digite Numeros!! : ");
			}
		} while (conditionTV == false);

		// Pegar a porcentagem da commisão

		System.out.println("Digite a porcentagem da commisão (padrão 15%) : ");
		double commisao;
		try {
			commisao = Double.valueOf(scanner.nextLine());
		} catch (Exception e) {
			commisao = 15;
		}

		// Informar o Salário final para o vendedor

		double SalarioFinal = ((commisao * totalVendido) / 100) + salarioFixo;
		System.out.println("------------------RESULTADO------------------");
		System.out.println(nome + ", \nSeu sálario fixo é : " + salarioFixo);
		System.out.println(
				"Sua commisão de " + commisao + "% sobre o total de vendas foi: " + (commisao * totalVendido) / 100);
		System.out.println("Salário final : " + SalarioFinal);

		
		scanner.close();
	}

}
