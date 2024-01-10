package cap04;

import java.util.Scanner;

public class funcoes_matematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double a, b, c, raiz1, raiz2, delta;
		float raiz, base, expoente, valorAbsoluto;

		System.out.print("Calcular a raiz: ");
		raiz = sc.nextFloat();

		System.out.print("Calcular a potenciação, entre com a Base e o Expoente: ");
		base = sc.nextFloat();
		expoente = sc.nextFloat();

		System.out.print("Calcular valor absoluto: ");
		valorAbsoluto = sc.nextFloat();

		System.err.println("\nValores Calculados");
		System.out.println("Entrada " + raiz + " Raiz calculada: " + Math.sqrt(raiz));
		System.out.println("Entrada " + base + " e " + expoente + " Potência calculada: " + Math.pow(base, expoente));
		System.out.println("Entrada " + valorAbsoluto + " Valor Absoluto calculado: " + Math.abs(valorAbsoluto));

		System.out.println("");
		System.out.print("Entre com os valores (A B C) da equação de 2º grau: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;
		raiz1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		raiz2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.printf("Delta: %f - Raiz 1: %f - Raiz 2: %f %n", delta, raiz1, raiz2);
	}

}
