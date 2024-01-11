package cap05;

import java.util.Scanner;

public class DiaSemanaSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int valor;
		String dia;

		System.out.print("Entre com um valor inteiro: ");
		valor = sc.nextInt();

		switch (valor) {

		case 1:
			dia = "Domingo";
			System.out.println("teste");
			break;

		case 2:
			dia = "Segunda-Feira";
			break;

		case 3:
			dia = "Terça-Feira";
			break;

		case 4:
			dia = "Quarta-Feira";
			break;

		case 5:
			dia = "Quinta-Feira";
			break;

		case 6:
			dia = "Sexta-Feira";
			break;

		case 7:
			dia = "Sábado";
			break;

		default:
			dia = "Valor Inválido";
			break;
		}

		System.out.println("Dia da Semana: " + dia);
		
		sc.close();
	}

}
