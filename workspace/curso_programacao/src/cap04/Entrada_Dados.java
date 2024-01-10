package cap04;

import java.util.Scanner;

public class Entrada_Dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objeto Scanner responsável pela leitura dos dados
		Scanner leitorScanner = new Scanner(System.in);

		int inteiro;
		double flutuante;
		String palavra;
		char caracter;

		System.out.print("Entre com um valor Inteiro: ");
		inteiro = leitorScanner.nextInt();

		System.out.print("Entre com um ponto flutuante: ");
		flutuante = leitorScanner.nextDouble();

		System.out.print("Entre com uma palavra: ");
		palavra = leitorScanner.next();

		System.out.print("Entre com um caracter: ");
		caracter = leitorScanner.next().charAt(0);

		System.err.println("Valores digitados");
		System.out.println(inteiro);
		System.out.println(flutuante);
		System.out.println(palavra);
		System.out.println(caracter);

		System.out.println("");
		System.out.print("Digite os dados na mesma linha - String Inteiro Double: ");

		String t = leitorScanner.next();
		int i = leitorScanner.nextInt();
		double d = leitorScanner.nextDouble();

		System.err.println("Dados digitados");
		System.out.println(t);
		System.out.println(i);
		System.out.println(d);

		System.out.println("");
		System.out.print("Ler um texto até a quebra de linha: ");
		leitorScanner.nextLine(); // Limpar o buffer de leitura dos 'ENTERs' anteriores
		String texto = leitorScanner.nextLine();

		System.out.println(texto);

		leitorScanner.close();

	}

}
