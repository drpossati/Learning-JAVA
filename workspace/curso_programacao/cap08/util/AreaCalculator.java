package util;

public class AreaCalculator {

	/*
	 * Classe é Métodos estáticos.
	 * 
	 * Uma classe somente com membros estáticos também é estática.
	 * 
	 * Métodos/Classes estáticos não podem ser instanciados.
	 * 
	 * Métodos estáticos são acionados pelo nome da classe.
	 * 
	 * Geralmente utilizados em classes e métodos de utilitários, não em entidades
	 */

	// declaração de um constante: palavra chave final e LETRAS_MAIUSCULAS
	public static final double PI = 3.14159;

	/*
	 * Circunferência do Círculo 2 * pi * raio
	 * 
	 * Área do Círculo = pi * raio^2
	 * 
	 * Área da Esfera = 4 * pi * raio^2
	 * 
	 * Volume da Esfera = (4 * pi * raio^3) / 3
	 * 
	 */

	public static double cicunferenciaCircle(double radius) {

		return 2 * PI * radius;
	}

	public static double areaCircle(double radius) {

		return PI * radius * radius;
	}

	public static double areaSphere(double radius) {

		return 4 * PI * radius * radius;
	}

	public static double volumeSphere(double radius) {

		return (4 * PI * radius * radius * radius) / 3;
	}

}
