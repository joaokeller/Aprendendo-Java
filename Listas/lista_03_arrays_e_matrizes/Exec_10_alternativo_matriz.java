package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_10_alternativo_matriz {

	public static void main(String[] args) {

		/*FAÇA UM PROGRAMA QUE LEIA E ARMAZENE 10 NÚMEROS EM UM ARRAY. APÓS ISTO, O
		 PROGRAMA DEVE ORDENAR OS NÚMEROS E APRESENTAR O ARRAY ORDENADO DE FORMA
		 CRESCENTE.*/

		System.out.println("Bem vindo; \nO presente programa lê 10 números;"
				+ " Após isso ele organiza e apresenta os números em oredem crescente.\n");

//		Captação de entradas
		
		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		double[][] matriz = new double[numeros.length][2];
		
		for (int i = 0; i < numeros.length; ++i) {
			System.out.print("Por favor insira o " + (i + 1) + "º número:");
			numeros[i] = input.nextDouble();
			
//		Cópia de dados do array para a 1º coluna
			
			matriz[i][0] = numeros[i];
		}
		
//		Pontua os valores da matriz na segunda coluna 
		
		for (int i = 0; i < numeros.length ; ++i) {
			for (int j = 0 ; j < numeros.length; ++j) {
				if ( matriz[i][0] > matriz[j][0] ) {
					matriz[i][1] += 1;
				}				
			}
		}
		
//		Reordena o array usando potuação da matriz

		for (int i = 0; i < numeros.length; ++i) {
			int pontuacao = (int) matriz[i][1];
			numeros[pontuacao]=matriz[i][0];
		}
		
//		Apresentação de resultados

		System.out.println("\n------------------------------\nNa ordem crescente:\n");
		for ( int i = 0; i < numeros.length; ++i ) {
			System.out.println("O " + (i+1) + "º número é: " + numeros[i]);
		}
		
		input.close();
	}
}
