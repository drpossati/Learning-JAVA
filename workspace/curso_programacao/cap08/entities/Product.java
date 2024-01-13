package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {

		return price * quantity;
	}

	public void addProducts(int quantity) {

		// this referencia o atributo da classe.
		this.quantity += quantity;

		System.out.println("Produtos adicionados!");
	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;

		System.out.println("Produtos removidos!");
	}

	public String toString() {

		return  this.name + ", $ " 
				+ String.format("%.2f", this.price) + ", " 
				+ this.quantity + " unidades, Total: "
				+ String.format("%.2f", this.totalValueInStock());
	}

}
