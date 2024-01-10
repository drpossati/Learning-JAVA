package cap04;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Boa Prática Sempre indique o tipo do valor ponto flutuante. Ex: sendo x um
		 * valor qualquer Double = x.0 float = xf
		 */

		float baseMenor, baseMaior, altura;
		double area;

		baseMenor = 6f;
		baseMaior = 8f;
		altura = 5f;

		area = (baseMaior + baseMenor) * altura / 2.0;

		System.out.println("Área do Trapézio: " + area);

		/*
		 * Casting ou conversão explicita de valores
		 */

		int a = 5, b = 2;

		System.out.println("Divisão: " + (double) a / b);

		double x;
		int y;

		x = 2.1115;
		y = (int) x;

		System.out.println("Casting - (int) double: " + y);

	}

}
