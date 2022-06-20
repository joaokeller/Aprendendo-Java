package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_10 {

	public static void main(String[] args) {

		/*FAÇA UM PROGRAMA QUE LEIA E ARMAZENE 10 NÚMEROS EM UM ARRAY. APÓS ISTO, O
		 PROGRAMA DEVE ORDENAR OS NÚMEROS E APRESENTAR O ARRAY ORDENADO DE FORMA
		 CRESCENTE.*/

		System.out.println("Bem vindo; \nO presente programa lê 10 números;"
				+ " Após isso ele organiza e apresenta os números em oredem crescente.\n");

//		Captação de entradas e cálculo	

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		
		for (int i = 0; i < numeros.length; ++i) {
			System.out.print("Por favor insira o " + (i + 1) + "º número:");
			numeros[i] = input.nextDouble();
		}
		
//		Orgniza lista  
		
		for (int i = 0; i < numeros.length; ++i) {
			for (int j = (i+1); j < numeros.length; ++j) {
				if ( numeros[i] > numeros[j]) {
					double memoriaTrocaDePosicao = 0;
					memoriaTrocaDePosicao = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = memoriaTrocaDePosicao;
				}
			}
		}
		
//		Apresentação de resultados

		System.out.println("\n------------------------------\nNa ordem crescente:\n");
		for ( int i = 0; i < numeros.length; ++i ) {
			System.out.println("O " + (i+1) + "º número é: " + numeros[i]);
		}
		
		input.close();
	}
}
