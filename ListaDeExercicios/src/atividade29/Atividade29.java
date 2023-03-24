package atividade29;

import java.util.Scanner;

import methods.ReceberSomenteNumero;

public class Atividade29 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ReceberSomenteNumero RSN = new ReceberSomenteNumero();
		
		System.out.print("Digite o numero do mês : ");
		String mes = scanner.next();
		int mesInt = RSN.ReceberIntFiltrado("Digite o numero do mês : ", mes);
		
		switch (mesInt) {
		case 1: {
			mes = "Janeiro";
			break;
		}
		case 2: {
			mes = "Fevereiro";
			break;
		}
		case 3: {
			mes = "Março";
			break;
		}
		case 4: {
			mes = "Abril";
			break;
		}
		case 5: {
			mes = "Maio";
			break;
		}
		case 6: {
			mes = "Junho";
			break;
		}
		case 7: {
			mes = "Julho";
			break;
		}
		case 8: {
			mes = "Agosto";
			break;
		}
		case 9: {
			mes = "Setembro";
			break;
		}
		case 10: {
			mes = "Outubro";
			break;
		}
		case 11: {
			mes = "Novembro";
			break;
		}
		case 12: {
			mes = "Dezembro";
			break;
		}
		
		default:
			mes = "Não existe esse mês";
		}
		
		System.out.println(mes);
		scanner.close();

	}

}
