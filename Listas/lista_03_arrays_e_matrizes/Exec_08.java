package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_08 {

	public static void main(String[] args) {

	  /*FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A E UMA MATRIZ B, AMBAS DE TAMANHO 3X3. O PROGRAMA
		DEVE GERAR UMA MATRIZ RESULTADO QUE É A SOMA DA MATRIZ A COM A MATRIZ B. APRESENTE A MATRIZ A, B
		E RESULTADO*/
		
		System.out.println("Bem vindo; \nO presente programa lê os dados de uma matriz A (3x3) e de uma matrix B (3x3). "
				+ "\nApós isso ele imprime a matriz A, a matriz B e uma matriz C, resultado da soma delas.");
		
//		Captação de entradas e cálculo	

		Scanner input = new Scanner(System.in);
		double[][] matrizA = new double[3][3];
		double[][] matrizB= new double [3][3];
		double[][] matrizC = new double [matrizA.length][matrizA[0].length];

		for ( int i = 0 ; i < matrizA.length ; ++i ) {
			for ( int j = 0 ; j < matrizA[i].length ; ++j) {
				System.out.print("\nPor favor insira o valor da posição [" + i + "][" + j + "] da matriz A: ");
				matrizA[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("\n");
		
		for ( int i = 0 ; i < matrizB.length ; ++i ) {
			for ( int j = 0 ; j < matrizB[i].length ; ++j) {
				System.out.print("\nPor favor insira o valor da posição [" + i + "][" + j + "] da matriz B: ");
				matrizB[i][j] = input.nextDouble();
			}
		}
		
		for ( int i = 0 ; i < matrizC.length ; ++i ) {
			for ( int j = 0 ; j < matrizC[i].length ; ++j) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
//		Apresentação de resultados
		
		System.out.println("\nA matriz A inserida é:\n");
		for ( int i = 0 ; i < matrizA.length ; ++i ) {
			for ( int j = 0 ; j < matrizA[i].length ; ++j) {
				System.out.print( " " + matrizA[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("\nA matriz B inserida é:\n");
		for ( int i = 0 ; i < matrizB.length ; ++i ) {
			for ( int j = 0 ; j < matrizB[i].length ; ++j) {
				System.out.print( " " + matrizB[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.println("\nA matriz C gerada como soma das matrizes A e B é:\n");
		for ( int i = 0 ; i < matrizC.length ; ++i ) {
			for ( int j = 0 ; j < matrizC[i].length ; ++j) {
				System.out.print( " " + matrizC[i][j] + " ");
				
			}
			System.out.println();
		}
		
		input.close();
	}
}
