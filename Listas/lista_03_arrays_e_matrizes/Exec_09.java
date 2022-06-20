package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_09 {

	public static void main(String[] args) {

	  /*FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 4X4. O PROGRAMA DEVE 
		IDENTIFICAR QUAL O MENOR ELEMENTO E A SUA POSIÇÃO NA MATRIZ*/
		
		System.out.println("Bem vindo; \nO presente programa lê os dados de uma matriz A (4x4). "
							+ "\nApós isso informa qual é o menor elemento e sua posição na matriz A.");
		
//		Captação de entradas e cálculo	

		Scanner input = new Scanner(System.in);
		double[][] matrizA = new double[4][4];
		double menor = 0;
		String posicaoMenor = "";
		
		
		for ( int i = 0 ; i < matrizA.length ; ++i ) {
			for ( int j = 0 ; j < matrizA[i].length ; ++j) {
				System.out.print("\nPor favor insira o valor do elemento de posição "
								+ "[" + i + "][" + j + "] da matriz A: ");
				matrizA[i][j] = input.nextDouble();
				
				if ( matrizA[i][j] < menor || ( i == 0 && j == 0 )) {
					menor = matrizA[i][j];
					posicaoMenor =  "[" + i + "] [" + j + "]";
				}
			}
		}
		
//		Apresentação de resultados
		
		System.out.println("\n-------------------------------------------------------------------------------\n"
							+ "\nO menor elemento inserido é: " + menor 
							+ "\nSua posição é a de indíces: " + posicaoMenor);
		
		input.close();
	}
}
