package principal;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {

		// 2 barras para coment�rio de linha

		/*
		 * barra e asterisco para coment�rio em bloco
		 */

		// Criando vari�vel String

		/*
		 * String texto = "Introdu��o ao Java ";
		 * 
		 * String texto2 = "O n�mero �? ";
		 * 
		 * int numero = 100;
		 * 
		 * int numero2 = 10 * 2;
		 * 
		 * double numeroDecimal = 10.5;
		 * 
		 * boolean codFunciona = true;
		 * 
		 * //Printando refer�ncias de vari�veis no console
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
		 * System.out.println("N�o sou adulto.");
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
		 * if(numero == 10) { System.out.println("o n�mero � igual a 10"); } else
		 * if(numero == 11) { System.out.println("o n�mero � igual a 11"); } else
		 * if(numero == 12) { System.out.println("o n�mero � igual a 12"); } else {
		 * System.out.println("o n�mero n�o � igual a 10, 11, 12"); }
		 */

		// la�os de repeti��o _ while - for

		/*
		 * int contador = 0; boolean condicao = true; while (condicao) { contador =
		 * contador + 1; System.out.println(contador); if (contador >= 10) {
		 * System.out.println("Contador est� no seu limite."); break; } }
		 * 
		 * for(int numero = 0; numero < 10; numero++) { System.out.println(numero); }
		 * 
		 * 
		 * // lista arrays
		 * 
		 * ArrayList<String> lista = new ArrayList<>(); lista.add("Jos�");
		 * lista.add("Jo�o"); lista.add("Joana");
		 * 
		 * for (String objeto : lista) { System.out.println(objeto); if (objeto ==
		 * "Jos�") { System.out.println("O objeto � igual a Jos�"); break; } }
		 */

		// m�todos - private e public _ private static e public static
		// retorno dos m�todos _ void - vari�vel ou classe

		somar();
	}

	public static void somar() {
		int numero = 1;
		int numero2 = 4;

		int soma = numero + numero2;

		System.out.println("Resultado: " + soma);
	}
}
