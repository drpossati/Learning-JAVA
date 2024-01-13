package application;

import java.util.Scanner;

import entities.Triangle;

public class AreaTrianguloPoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objetos
		Triangle areaTrianguloX, areaTrianguloY;

		// Instanciação dos Objetos
		areaTrianguloX = new Triangle();
		areaTrianguloY = new Triangle();

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com os lados do triângulo X: ");

		areaTrianguloX.ladoA = sc.nextDouble();
		areaTrianguloX.ladoB = sc.nextDouble();
		areaTrianguloX.ladoC = sc.nextDouble();

		System.out.print("Entre com os lados do triângulo Y: ");

		areaTrianguloY.ladoA = sc.nextDouble();
		areaTrianguloY.ladoB = sc.nextDouble();
		areaTrianguloY.ladoC = sc.nextDouble();

		System.out.printf("Área triângulo X: %.4f%n", areaTrianguloX.formulaHeron());

		System.out.printf("Área triângulo Y: %.4f%n", areaTrianguloY.formulaHeron());

		System.out.println(
				"Maior área: " + ((areaTrianguloX.formulaHeron() > areaTrianguloY.formulaHeron()) ? "X" : "Y"));

		sc.close();
	}

}
