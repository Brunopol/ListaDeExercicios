package atividade17;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Programa irá ler 80 numeros. Falará quantos estão no intervalo de 10 - 150");
		System.out.println("-----------------------------------");

		List<Double> numeros = new ArrayList<Double>();
		String numero = "";

		// pegando o numeros com ajuda da class que criei.
		for (int i = 0; i < 80; i++) {
			System.out.print("Digite o " + (i + 1) + " numero : ");
			numero = scanner.nextLine();
			numeros.add(RSN.ReceberDoubleFiltrado("Digite o " + (i + 1) + " numero : ", numero));
		}

		// contando quantos desses numeros estão no intervalo entre 10 e 150 tmb pegando eles
		int count = 0;
		List<Double> peguei = new ArrayList<Double>();
		for (Double double1 : numeros) {

			if (double1 >= 10 && double1 <= 150) {
				count++;
				peguei.add(double1);
			}

		}
		
		//mostrando o resultado na tela
		System.out.println("-------------------------------------------------------");
		System.out.println("Tem " + count + " Entre 10 e 150 (inclusive eles mesmos)");
		System.out.println("São eles: ");
		for (Double double1 : peguei) {
			System.out.println(df.format(double1));
		}
		
		scanner.close();

	}

}
