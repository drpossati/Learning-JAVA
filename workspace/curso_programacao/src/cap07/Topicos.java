package cap07;

import java.util.Scanner;

public class Topicos {

	/*
	 * Padrão Camel Case: nomeVariaveis, nomeMetodos, nomeAtributos, nomePacotes,
	 * nomeArgumentos Padrão Pascal Case: TipoClasse
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Operadores bitwise Operadores lógico para números inteiros. Compara os
		 * valores em binário bit a bit
		 * 
		 * & operador E | operador OU ^ operador OU-exclusivo
		 * 
		 * Usado em programação de baixo nível.
		 */

		Scanner sc = new Scanner(System.in);

		int n1 = 89, n2 = 60;

		System.err.println("Operadores Bitwise");
		System.out.println(n1 + " & " + n2 + " : " + (n1 & n2));
		System.out.println(n1 + " | " + n2 + " : " + (n1 | n2));
		System.out.println(n1 + " ^ " + n2 + " : " + (n1 ^ n2));

		/*
		 * Testando o 6ª bit de um número Valores em binários precisam começar com
		 * '0b'xxxxxxxx
		 */
		System.err.println("\nTestando o sexto bit de um número qualquer");
		System.out.print("Entre com um valor: ");
		int numeroN = sc.nextInt();

		int mask = 0b00100000; // Valor 36 em binário

		/*
		 * Ao testar bit a bit o operador & retorna 0 ou 1 comparando os bits do 36 com
		 * os bits do número digitado
		 */
		if ((numeroN & mask) != 0)
			System.out.println("The 6th is bit is true");
		else
			System.out.println("The 6th is bit is false");

		sc.close();

	}

}
