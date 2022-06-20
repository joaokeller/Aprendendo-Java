package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {
		
	  /*ESCREVA UM PROGRAMA QUE LEIA E ARMAZENE 10 NÚMEROS EM UM ARRAY. APÓS ISSO O PROGRAMA DEVE
		SOLICITAR QUE O USUÁRIO INFORME MAIS UM NÚMERO. O PROGRAMA DEVE INFORMAR QUANTAS VEZES ESSE
		NÚMERO APARECE NO ARRAY.*/

		System.out.println("Bem vindo; \nO presente programa lê 10 números; Após isso ele solicita um número"
						+ "\na ser procurado informando quantas vezes ele se encontra entre os 10.\n");

//		Captação de entradas e cálculo	

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		int contadorAparecimento = 0;

		for (int i = 0; i < numeros.length; ++i) {
			System.out.println("Por favor insira o " + (i + 1) + "º número:");
			numeros[i] = input.nextDouble();
		}

		System.out.println("Por favor insira um número para ser pesquisado entre os demais:");
		double numeroPesquisado = input.nextDouble();

		for (int i = 0; i < numeros.length; ++i) {
			if (numeros[i] == numeroPesquisado) {
				++contadorAparecimento;
			}
		}

//		Apresentação de resultados

		System.out.println("\n-------------------------------------------------------------------------------"
						+ "\nO número " + numeroPesquisado + " apareceu " 
						+ contadorAparecimento + " vezes entre os 10 números inseridos.");

		input.close();
	}
}
