package atividade31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atividade31 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 3 valores inteiros distintos");

		List<Integer> valores = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {

			while (true) {

				int value = 0;
				try {
					System.out.print("Digite o valor " + (i + 1) + " : ");
					value = Integer.valueOf(scanner.next());
					valores.add(value);
					break;
				} catch (Exception e) {
					System.out.println("Valor inválido, Digite somente numeros inteiros.");
				}

			}

		}

		Collections.sort(valores);
		System.out.println("Seus valores em ordem cresente: " + valores);

		scanner.close();
	}

}
