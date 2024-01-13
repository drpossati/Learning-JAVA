package application;

import java.util.Scanner;

import util.AreaCalculator;

public class AreaCirclesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radius;

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o valor do Raio: ");
		radius = sc.nextDouble();

		System.out.printf("\nValor de PI: %.2f%n", AreaCalculator.PI);
		
		System.out.printf("\nCircunferência: %.2f cm %n", AreaCalculator.cicunferenciaCircle(radius));

		System.out.printf("\nÁrea do Círculo: %.2f cm^2 %n", AreaCalculator.areaCircle(radius));

		System.out.printf("\nÁrea da Esfera: %.2f cm^2 %n", AreaCalculator.areaSphere(radius));

		System.out.printf("\nVolume da Esfera: %.2f cm^3 %n", AreaCalculator.volumeSphere(radius));
		
		sc.close();

	}

}
