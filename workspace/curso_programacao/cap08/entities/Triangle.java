package entities;

public class Triangle {

	// Atributos
	public double ladoA;
	public double ladoB;
	public double ladoC;

	// Métodos
	public double semiperimetro() {

		return (ladoA + ladoB + ladoC) / 2;
	}

	public double formulaHeron() {

		double p = semiperimetro();

		return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
	}

}
