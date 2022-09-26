package principal;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {

		// 2 barras para comentário de linha

		/*
		 * barra e asterisco para comentário em bloco
		 */

		// Criando variável String

		/*
		 * String texto = "Introdução ao Java ";
		 * 
		 * String texto2 = "O número é? ";
		 * 
		 * int numero = 100;
		 * 
		 * int numero2 = 10 * 2;
		 * 
		 * double numeroDecimal = 10.5;
		 * 
		 * boolean codFunciona = true;
		 * 
		 * //Printando referências de variáveis no console
		 * 
		 * System.out.println(texto);
		 * 
		 * System.out.println(numero);
		 * 
		 * System.out.println(numero/2);
		 * 
		 * System.out.println(numero2);
		 * 
		 * System.out.println(texto + "50");
		 * 
		 * System.out.println(texto + numero);
		 * 
		 * System.out.println(numeroDecimal);
		 * 
		 * System.out.println(codFunciona);
		 * 
		 */
		// Estrutura Condicional

		// 2 condicionais _ 1 forma

		/*
		 * if(codFunciona == false) {
		 * 
		 * System.out.println("Não sou adulto.");
		 * 
		 * } else {
		 * 
		 * System.out.println("Sou adulto.");
		 * 
		 * }
		 */

		// 2 forma

		/*
		 * if(!codFunciona) {
		 * 
		 * System.out.println("sou adulto.");
		 * 
		 * } else {
		 * 
		 * System.out.println("nao Sou adulto.");
		 * 
		 * }
		 */

		// 3 condicionais

		/*
		 * if(numero == 10) { System.out.println("o número é igual a 10"); } else
		 * if(numero == 11) { System.out.println("o número é igual a 11"); } else
		 * if(numero == 12) { System.out.println("o número é igual a 12"); } else {
		 * System.out.println("o número não é igual a 10, 11, 12"); }
		 */

		// laços de repetição _ while - for

		/*
		 * int contador = 0; boolean condicao = true; while (condicao) { contador =
		 * contador + 1; System.out.println(contador); if (contador >= 10) {
		 * System.out.println("Contador está no seu limite."); break; } }
		 * 
		 * for(int numero = 0; numero < 10; numero++) { System.out.println(numero); }
		 * 
		 * 
		 * // lista arrays
		 * 
		 * ArrayList<String> lista = new ArrayList<>(); lista.add("José");
		 * lista.add("João"); lista.add("Joana");
		 * 
		 * for (String objeto : lista) { System.out.println(objeto); if (objeto ==
		 * "José") { System.out.println("O objeto é igual a José"); break; } }
		 */

		// métodos - private e public _ private static e public static
		// retorno dos métodos _ void - variável ou classe

		somar();
	}

	public static void somar() {
		int numero = 1;
		int numero2 = 4;

		int soma = numero + numero2;

		System.out.println("Resultado: " + soma);
	}
}
