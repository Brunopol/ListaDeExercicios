package atividade23;

import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		double numero;
		
		System.out.println("Digite um numero que vou verificar se é: ");
		System.out.println("Maior que 80, Menor que 25 ou Igual a 40");
		System.out.print(" : ");
		numero = RSN.ReceberDoubleFiltrado(" : ", scanner.next());
		
		System.out.println("------------Resultado------------");
		if (numero > 80) {
			System.out.println("Seu numero é Maior que 80");
		} else if (numero < 25) {
			System.out.println("Seu numero é Menor que 25");
		} else if (numero == 40) {
			System.out.println("Seu numero é 40");
		} else {
			System.out.println("Seu numero não se encaixa em nenhuma das opções");
		}
		
		scanner.close();
	}

}
