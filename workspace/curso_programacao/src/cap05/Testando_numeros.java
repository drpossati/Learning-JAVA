package cap05;

import java.util.Scanner;

public class Testando_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroInteiro;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um valor inteiro: ");
		numeroInteiro = sc.nextInt();

		System.out.print(numeroInteiro + " - ");

		// Expressão condicional ternária
		System.out.print((numeroInteiro < 0) ? "Número Negativo" : "Número Positivo");

		System.out.println((numeroInteiro % 2 == 0) ? " e Par." : " e Impar.");

		System.out.println("\nValores Múltiplos");
		System.out.print("Entre com dois valores inteiros: ");

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x == 0 || y == 0) {
			
			System.out.println("Indeterminação, divisão por Zero");
		}
		else if (x >= y && x % y == 0) {

			System.out.println(x + " e " + y + " são múltiplos entre si");

		} else if (y > x && y % x == 0) {

			System.out.println(y + " e " + x + " são múltiplos entre si");

		} else
			System.out.println("Os valores não são múltiplos entre si");

		sc.close();

	}

}
