package application;

import java.util.Scanner;

import entities.CriarConta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CriarConta criarConta = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastrando uma conta\n");

		System.out.print("Entre com o número da conta: ");
		int numeroConta = sc.nextInt();

		System.out.print("Nome do Titular: ");
		sc.nextLine(); // Limpar buffer de entrada
		String nomeTitular = sc.nextLine();

		System.out.print("Deseja realizar um deposito inicial S/N: ");
		char realizarDeposito = sc.next().charAt(0);

		if (realizarDeposito == 'S' || realizarDeposito == 's') {

			System.out.print("Valor do deposito: ");
			double depositoInicial = sc.nextDouble();

			criarConta = new CriarConta(numeroConta, nomeTitular, depositoInicial);

		} else

			criarConta = new CriarConta(numeroConta, nomeTitular);

		System.out.println("\nConta Criada");

		System.out.println(criarConta.toString());

		System.out.print("\nRealizar Deposito\nDigite o valor para depositar: ");
		criarConta.deposito(sc.nextDouble());

		System.out.println(criarConta.toString());

		System.out.print("\nRealizar Saque\nDigite o valor para retirar: ");
		criarConta.saque(sc.nextDouble());

		// O método toString não precisa ser chamado
		System.out.println(criarConta);

		sc.close();

	}

}
