package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_06 {

	public static void main(String[] args) {
		
//		6 – FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X3. EM SEGUIDA DESENVOLVA UM MÉTODO SEM
//		RETORNO (“PROCEDIMENTO”) QUE RECEBA COMO PARÂMETRO A MATRIZ A E IDENTIFIQUE A POSIÇÃO DO MENOR
//		NÚMERO DA MATRIZ. O PROGRAMA DEVE APRESENTAR A POSIÇÃO E O MENOR ELEMENTO DA MATRIZ A.

	
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; O presente programa lê uma matriz 3X3."
							+ "\nApós isso ele apresenta qual o menor número "
							+ "\ne sua posição na matriz.\n");
		
		// Captação de dados
		double[][] matrizA = new double[3][3];
		for ( int i = 0; i < matrizA.length; ++i) {
			for ( int j = 0; j < matrizA[i].length; ++j) {
				System.out.print("\nPor favor insira o número da posição " + i + "X" + j + " : ");
				matrizA[i][j]= input.nextDouble();
			}
		}
		
		// Invocação para cálculo
		menorElemento(matrizA);
		input.close();
	}

	// Cálculo
	static void menorElemento (double[][] matrizA) {
		double menor = 0;
		int linha = 0;
		int coluna = 0;
		
		for ( int i = 0; i < matrizA.length; ++i) {
			for ( int j = 0; j < matrizA[i].length; ++j) {
				if ( (i+j) == 0 ) {
					menor = matrizA[i][j];
				}
				if ( matrizA[i][j] < menor ) {
					menor = matrizA[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		// Apresentação de resultados
		System.out.print("\nO menor elemento da matriz é: " + menor
							+ "\nSua posição é: " + linha + "X" + coluna + "." );
		
		
	}
}
