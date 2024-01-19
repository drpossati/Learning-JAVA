package entities;

public class CriarConta {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public CriarConta(int numeroConta, String nomeTitular) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.0;
	}

	public CriarConta(int numeroConta, String nomeTitular, double depositoInicial) {

		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.0;
		/*
		 *  Encapsulando a regra de negócio Deposito, 
		 *  
		 *  Chama o método deposito ao invés de atribuir diretamente o valor
		 */
		this.deposito(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public void deposito(double valor) {

		this.saldo += valor;

		System.out.println(valor + " depositado com sucesso!");
	}
	
	public void saque(double valor) {

		this.saldo -= (valor + 5.0);

		System.out.println(valor + " retirado com sucesso!");
	}

	@Override
	public String toString() {
		return "\nNúmero da Conta: " + numeroConta + 
				"\nTitular da Conta: " + nomeTitular + 
				"\nSaldo: " + saldo;
	}

}
