package atividade5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Atividade5 {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);

		// Pegando o nome do aluno
		System.out.println("Digite o nome do nome do aluno: ");
		String nomeAluno = reader.readLine();

		// criando uma lista para guardar as notas
		List<Double> notas = new ArrayList<Double>();

		// loop para pegar as 3 notas e somar elas
		double total = 0;
		for (int i = 0; i < 3; i++) {

			boolean condition = true;
			do {
				try {
					System.out.println("Digite nota " + (i + 1) + " :");
					notas.add(Double.valueOf(reader.readLine()));

					condition = false;
				} catch (Exception e) {
					System.out.println("Digite somente numeros!!");
					System.out.println();
					condition = true;
				}
			} while (condition);

			total += notas.get(i);

		}
		
		//formatando o total 0.00
		
		DecimalFormat df = new DecimalFormat("0.00");

		// mostrando a média
		System.out.println("--------------------------------------");
		System.out.println(nomeAluno + " sua média é : " + df.format(total / 3));

	}

}
