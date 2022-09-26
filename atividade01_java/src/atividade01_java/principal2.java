package atividade01_java;

public class principal2 {

	public static void main(String[] args) {
		System.out.println("Testando mundo");
		somar();
		multip();
	}
	
	public static void somar() {
		int numA = 20;
		int numB = 30;
		int soma = numA + numB;
		System.out.println("O resultado é: " + soma);
	}
	
	public static void multip() {
		int numX = 10;
		int numZ = 5;
		int mult = numX * numZ;
		System.out.println("O resultado é: " + mult);
	}
}
