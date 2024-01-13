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
		
		return (ladoA + ladoB + ladoC)/2;
	}
	
	public static double formulaHeron(double ladoA, double ladoB, double ladoC) {
				
		double p = semiperimetro(ladoA, ladoB, ladoC);
		
		return Math.sqrt( p * (p - ladoA) * (p - ladoB) * (p - ladoC));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		


	}

}
