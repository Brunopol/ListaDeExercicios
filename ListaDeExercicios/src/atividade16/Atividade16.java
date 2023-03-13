package atividade16;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//eu criei esse method para facilitar.
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		DecimalFormat df = new DecimalFormat("0.00");

		//pegando o nome do aluno
		System.out.print("Digite o nome do aluno: ");
		String nome = scanner.nextLine();

		//pegando as notas
		String nota = "";
		List<Double> notas = new ArrayList<Double>();
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Digitar a nota " + (i + 1) + " do aluno " + nome + " : ");
			nota = scanner.nextLine();

			notas.add(RSN.ReceberDoubleFiltrado("Digitar a nota " + (i + 1) + " do aluno " + nome + " : ", nota));
		}
		
		//calculando a média
		double media = 0;
		for (Double double1 : notas) {
			
			media += double1;
			
		}
		media /= notas.size();
		
		//if else para  ver se foi aprovado ou reprovado
		System.out.println("-------------------------------------------------------");
		System.out.println("Média : " + df.format(media));
		
		if (media >=7) {
			System.out.println("Aluno "+ nome +  " APROVADO");
		} else if (media <=5){
			System.out.println("Aluno "+ nome +  " REPROVADO");
		} else {
			System.out.println("Aluno "+ nome +  " EM RECUPERAÇÃO");
		}
		
		scanner.close();
	}

}
