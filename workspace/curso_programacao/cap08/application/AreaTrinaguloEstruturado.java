package application;

import java.util.Scanner;

public class AreaTrinaguloEstruturado {

	/*
	 * Calculando a área do triângulo de lados a, b, c com base no semiperímetro
	 * 
	 * Semiperímetro: p = (a + b + c)/2
	 * 
	 * Fómula de Heron: A = srqt(p(p-a)(p-b)(p-c))
	 * 
	 */

	public static double semiperimetro(double ladoA, double ladoB, double ladoC) {

		return (ladoA + ladoB + ladoC) / 2;
	}

	public static double formulaHeron(double ladoA, double ladoB, double ladoC) {

		double p = semiperimetro(ladoA, ladoB, ladoC);

		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
	}

	public static void main(String[] args) {

		double ladoA = 0.0, ladoB = 0.0, ladoC = 0.0, areaTrianguloX = 0.0, areaTrianguloY = 0.0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com os lados do triângulo X: ");

		ladoA = sc.nextDouble();
		ladoB = sc.nextDouble();
		ladoC = sc.nextDouble();

		areaTrianguloX = formulaHeron(ladoA, ladoB, ladoC);

		System.out.print("Entre com os lados do triângulo Y: ");

		ladoA = sc.nextDouble();
		ladoB = sc.nextDouble();
		ladoC = sc.nextDouble();

		areaTrianguloY = formulaHeron(ladoA, ladoB, ladoC);

		System.out.printf("Área triângulo X: %.4f%n", areaTrianguloX);

		System.out.printf("Área triângulo Y: %.4f%n", areaTrianguloY);

		System.out.println("Maior área: " + ((areaTrianguloX > areaTrianguloY) ? "X" : "Y"));
		
		sc.close();
	
	}

}
