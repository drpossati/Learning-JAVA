package cap03;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variavelInteiro = 32;
		Double variavelFlutuante = 10.35789;
		String variavelTexto = "Textos e Frases";
		char teste = 'g';

		System.out.print("Testando "); // Sem quebra de linha
		System.out.println("Java"); // Com quebra de linha
		System.out.println("Testando um programa JAVA");

		System.out.println(variavelInteiro);

		System.out.println(variavelFlutuante);

		/*
		 * Repsentações de variáveis com formatação %n = quebra de linha em qualquer
		 * plataforma %f = ponto flutuante %d = inteiro %s = texto (string)
		 */

		System.out.printf("%.2f%n", variavelFlutuante); // Duas casas decimais e quebra de linha
		System.out.printf("%.4f%n", variavelFlutuante); // Quatro casas decimais e quebra de linha

		System.out.println("Concatenando " + variavelFlutuante + " sem formatação");

		System.out.printf("Concatenando %.2f com formatação %n", variavelFlutuante);

		System.out.printf("Text: %s - Integer: %d - Double: %f - Char: %c %n", 
				variavelTexto, variavelInteiro, variavelFlutuante, teste);

	}

}
