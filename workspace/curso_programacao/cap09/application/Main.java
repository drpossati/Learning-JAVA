package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastrando um nova conta");

		System.out.print("Entre com o número da conta: ");
		int numeroConta = sc.nextInt();

		System.out.print("Nome do Titular: ");
		String nomeTitular = sc.nextLine();

		System.out.print("Deseja realizar um deposito inicial S/N: ");
		char realizarDeposito = sc.next().charAt(0);

		if (realizarDeposito == 'S' || realizarDeposito == 's') {

			System.out.print("Valor do deposito:");
			double saldo = sc.nextDouble();
		} else {

			double saldo = 0.0;
		}

		sc.close();

	}

}
