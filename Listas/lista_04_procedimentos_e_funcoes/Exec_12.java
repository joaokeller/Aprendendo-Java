package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_12 {

	public static void main(String[] args) {

//		12 – DESENVOLVA UM PROGRAMA PARA SIMULAR UMA CALCULADORA COM AS OPERAÇÕES DE ADIÇÃO,
//		SUBTRAÇÃO, DIVISÃO E MULTIPLICAÇÃO. AS OPERAÇÕES SÃO APENAS DE DOIS NÚMEROS. DESENVOLVA
//		MÉTODOS PARA AS OPERAÇÕES E O PROGRAMA ALÉM DE MOSTRAR O RESULTADO DA OPERAÇÃO SELECIONADA
//		PELO USUÁRIO DEVE PERMITIR QUE ELE POSSA EXECUTAR QUANTAS OPERAÇÕES ELE DESEJAR ATÉ QUE ELE
//		DECIDA ENCERRAR O PROGRAMA
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; "
							+ "\nO presente programa é uma calculadora."
							+ "\nPossuindo as operações de + , - , / e *.");
		
		//Escolha de operação
		int opcao = 0;
		do {
			System.out.println("\nAs operações disponíveis são: "
							+ "\n1 - Adição;"
							+ "\n2 - Subtração;"
							+ "\n3 - Divisão;"
							+ "\n4 - Multiplicação."
							+ "\nInsira o número específico da operação que deseja fazer: ");
			int operacao = input.nextInt();
			
			// Inserção de valores e invocação de Cálculo
			double resultado = 0;
			if ( operacao == 3 ) {
				
				System.out.print( "\nPor favor insira o número a ser dividido: ");
				double valor1 = input.nextDouble();
				System.out.print( "\nPor favor insira o divisor: ");
				double valor2 = input.nextDouble();
				resultado = divisao( valor1 , valor2 , resultado );
				
			} else {
				
				System.out.print( "\nPor favor insira o 1º valor: ");
				double valor1 = input.nextDouble();
				System.out.print( "\nPor favor insira o 2º valor: ");
				double valor2 = input.nextDouble();
				
				if ( operacao == 1 ) {
					resultado = adicao( valor1 , valor2 , resultado );
				}
				if ( operacao == 2 ) {
					resultado = subtracao( valor1 , valor2 , resultado );
				}
				if ( operacao == 4 ) {
					resultado = multiplicacao( valor1 , valor2 , resultado );
				}
			}
			
			//Apresentação de resultados
			System.out.println("\nO resultado da operação é: " + resultado);
			
			System.out.print("\nDigite '1' para realizar mais uma operação ou '2' para concluir:");
			opcao = input.nextInt();
			while (opcao != 2 && opcao != 1) {
				System.out.print("\nEntrada inválida digite '1' para realizar"
								+ "\nmais uma operação ou '2' para concluir:");
				opcao = input.nextInt();
			}
		} while (opcao == 1);
		
		input.close();
	}
	//
	static double adicao( double valor1 , double valor2 , double resultado ) {
		resultado = valor1 + valor2;
		return resultado;
	}
	
	static double subtracao( double valor1 , double valor2 , double resultado ) {
		resultado = valor1 - valor2;
		return resultado;
	}
	
	static double divisao( double dividendo , double divisor , double resultado ) {
		resultado = dividendo / divisor;
		return resultado;
	}
	
	static double multiplicacao( double valor1 , double valor2 , double resultado ) {
		resultado = valor1 * valor2;
		return resultado;
	}
}
