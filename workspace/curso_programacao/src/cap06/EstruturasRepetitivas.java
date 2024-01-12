package cap06;

import java.util.Scanner;

public class EstruturasRepetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numeroInteiro, somaInteiros = 0;

		System.err.println("Estrutura repetiva WHILE");

		System.out.print("Digite um valor inteiro diferente de Zero: ");
		numeroInteiro = sc.nextInt();

		while (numeroInteiro != 0) {

			System.out.print("Digite um valor inteiro diferente de Zero: ");

			somaInteiros += numeroInteiro;

			numeroInteiro = sc.nextInt();
		}

		System.out.println("Soma dos valores digitados WHILE: " + somaInteiros);

		System.err.println("\nEstrutura repetiva FOR");

		somaInteiros = 0;

		System.out.print("Digite o valor da repetição: ");
		numeroInteiro = sc.nextInt();

		for (int i = 0; i < numeroInteiro; i++) {

			System.out.print("Digite um valor inteiro do inidice " + i + ": ");

			int temp = sc.nextInt();

			somaInteiros += temp;
		}

		System.out.println("Soma dos valores digitados FOR: " + somaInteiros);

		System.err.println("\nEstrutura repetiva DO..WHILE");

		char escolha;

		System.out.print("Deseja converter temperaturas de Cº para Fº? s/n: ");
		escolha = sc.next().charAt(0);

		if (escolha == 's')

			do {

				System.out.print("Digite o valor da temperatura em Cº: ");
				float temp = sc.nextFloat();

				System.out.println("Temperatura em Fº: " + ((9 * temp) / 5 + 32));

				System.out.print("Digite s para continuar: ");
				escolha = sc.next().charAt(0);

			} while (escolha == 's');

		System.err.println("\nPrograma Finalizado");

		sc.close();
	}

}
