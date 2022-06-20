package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_08 {

	public static void main(String[] args) {
		
//		8 – DESENVOLVA UM PROGRAMA ONDE O USUÁRIO INFORMA TRÊS NÚMEROS. DESENVOLVA UM MÉTODO COM
//		RETORNO (“FUNÇÃO”) QUE VERIFIQUE SE ESSES VALORES (PASSADOS POR PARÂMETROS) FORMAM UM
//		TRIÂNGULO. CASO FORMEM UM TRIÂNGULO O SISTEMA DEVE TER UM MÉTODO SEM RETORNO
//		(“PROCEDIMENTO”) QUE RECEBA ESSES VALORES COMO PARÂMETROS E CLASSIFIQUE ESSE TRIÂNGULO.
//		DEFINIÇÕES:
//		 PARA SER UM TRIÂNGULO O COMPRIMENTO DE CADA LADO DE UM TRIÂNGULO DEVE SER MENOR QUE A
//		SOMA DO COMPRIMENTO DOS OUTROS DOIS LADOS. CADA NÚMERO INFORMADO PELO USUÁRIO
//		CONSISTE EM UM LADO.
//		UM TRIÂNGULO EQUILÁTERO TEM TODOS OS LADOS IGUAIS, JÁ O TRIÂNGULO ISÓSCELES TEM DOIS
//		LADOS IGUAIS E O TRIÂNGULO ESCALENO TEM OS TRÊS LADOS DIFERENTES.
//		O SISTEMA DEVE INFORMAR SE OS NÚMEROS FORMAM OU NÃO UM TRIÂNGULO E QUAL A SUA CLASSIFICAÇÃO.

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; O presente programa lê 3 números."
							+ "\nApós isso ele informa se eles formam um triângulo."
							+ "\nE se sim classifica o triângulo.");
		
		// Captação de dados
		System.out.print("\nPor favor insira o 1º número: ");
		double ladoA= input.nextDouble();
		System.out.print("\nPor favor insira o 2º número: ");
		double ladoB= input.nextDouble();
		System.out.print("\nPor favor insira o 3º número: ");
		double ladoC= input.nextDouble();
		

		boolean triangulo = verificarTriangulo(ladoA, ladoB, ladoC);
		if ( triangulo == true ) {
			System.out.println("\nOs números inseridos constituem um triângulo.");
			classificacaoTriangulo(ladoA, ladoB, ladoC);	
		} else {
			System.out.println("\nOs números inseridos não constituem um triângulo.");
		}
		
		input.close();
	}

	static boolean verificarTriangulo ( double ladoA, double ladoB, double ladoC) {
		boolean resposta = true;
		double somaAB = ladoA + ladoB;
		double somaAC = ladoA + ladoC;
		double somaCB = ladoC + ladoB;

		if (somaAB <= ladoC || somaAC <= ladoB || somaCB <= ladoA ) {
			resposta = false;
		}
		return resposta;
	}
	
	static void classificacaoTriangulo ( double ladoA, double ladoB, double ladoC) {
	String tipo = "";
		
		if (ladoA == ladoB && ladoA == ladoC) {
			tipo = "equilátero";
		}
	
		if ((ladoA == ladoB && ladoA != ladoC) 
			|| (ladoA == ladoC && ladoA != ladoB ) 
			|| (ladoB == ladoC && ladoA != ladoB )) {
			tipo = "isóceles";
		}
		
		if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
			tipo = "escaleno";
		}
		
		System.out.println("\nO tipo de triângulo é o " + tipo +".");
	}

}
