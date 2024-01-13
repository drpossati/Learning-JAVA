package application;

import java.util.Scanner;

import entities.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();

		System.out.print("Preço: ");
		product.price = sc.nextDouble();

		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();

		System.out.print("Dados do produto: ");
		System.out.println(product.toString());

		System.out.print("Entre com o número de produtos adicionais: ");
		product.addProducts(sc.nextInt());

		System.out.print("Produto atualizado: ");
		// Método toString() subentendido
		System.out.println(product);

		System.out.print("Entre com o número de produtos removidos: ");
		product.removeProducts(sc.nextInt());

		System.out.print("Produto atualizado: ");
		// Método toString() subentendido
		System.out.println(product);

		sc.close();
	}

}
