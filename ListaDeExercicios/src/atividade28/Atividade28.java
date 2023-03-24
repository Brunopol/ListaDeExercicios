package atividade28;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade28 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		DecimalFormat df = new DecimalFormat("0.00");

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		int count = 1;
		boolean condition = true;
		String resposta;
		String salario = "";
		double salarioMinimoDouble;

		System.out.print("Digite o salário mínimo: ");
		String salarioMinimo = scanner.next();
		salarioMinimoDouble = RSN.ReceberDoubleFiltrado("Digite o salário mínimo: ", salarioMinimo);

		do {

			Funcionario funcionario = new Funcionario(salarioMinimoDouble);

			System.out.print("Digite o nome do " + count + " Funcionário : ");
			funcionario.setNome(scanner.next());
			System.out.print("Digite o salario do funcionário " + funcionario.getNome() + " : ");
			salario = scanner.next();
			funcionario.setSalario(RSN.ReceberDoubleFiltrado(
					"Digite o novo sálario do funcionário " + funcionario.getNome() + " : ", salario));
			System.out.print("Deseja continuar ? (S)(N) : ");
			resposta = scanner.next();
			resposta = resposta.toUpperCase();

			boolean condition2 = true;
			do {
				switch (resposta) {
				case "S": {
					condition2 = false;
					condition = true;
					break;
				}
				case "N": {
					condition2 = false;
					condition = false;
					break;
				}
				default:
					condition2 = true;

					System.out.println("Digite somente Sim(S) ou Não(N)");
					System.out.print("Deseja continuar ? (S)(N) : ");
					resposta = scanner.next();
					resposta = resposta.toUpperCase();
				}
			} while (condition2);

			funcionarios.add(funcionario);
			count++;

		} while (condition);

		double somaInicial = 0;
		double somaFinal = 0;

		for (Funcionario funcionario : funcionarios) {

			somaInicial += funcionario.getSalario();

			somaFinal += funcionario.getAumentoSalarial();

		}
		
		for (Funcionario funcionario : funcionarios) {
			
			System.out.println("-------------------------" + funcionario.getNome() + "-------------------------");
			System.out.println("Salário inicial: " + df.format(funcionario.getSalario()));
			System.out.println("Salário com aumento: " + df.format(funcionario.getAumentoSalarial()));
			
		}
		
		System.out.println("-----");
		System.out.println("Folha de pagamento inicial : " + df.format(somaInicial));
		System.out.println("Folha de pagamento final : " + df.format(somaFinal));

		scanner.close();
	}
}
