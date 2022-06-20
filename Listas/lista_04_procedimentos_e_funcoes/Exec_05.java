package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_05 {

	public static void main(String[] args) {

//		5 – FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 4X4. EM SEGUIDA DESENVOLVA UM MÉTODO
//		COM RETORNO (“FUNÇÃO”) QUE RECEBA COMO PARÂMETRO A MATRIZ A E SOME OS VALORES DA DIAGONAL
//		PRINCIPAL. O PROGRAMA DEVE APRESENTAR A SOMA DA DIAGONAL PRINCIPAL DA MATRIZ A.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; O presente programa lê uma matriz 4X4."
							+ "\nApós isso ele apresenta a soma dos valores "
							+ "\nda diagonal principal.\n");
		
		// Captação de dados
		double[][] matriz = new double[4][4];
		for ( int i = 0; i < matriz.length; ++i) {
			for ( int j = 0; j < matriz[i].length; ++j) {
				System.out.print("\nPor favor insira o número da posição " + i + "X" + j + " : ");
				matriz[i][j]= input.nextDouble();
			}
		}
		
		// Invocação de cálculo
		double somaDiagonal = somarDiagonalPrincipal(matriz);
		
		// Apresentação de resultados
		System.out.print("\nA soma dos elementos da diagonal principal da "
						+ "\nmatriz é: " + somaDiagonal );
		input.close();
	}

	// Cálculo
	static double somarDiagonalPrincipal (double[][] matrizA) {
		double soma = 0;
		for ( int i = 0; i < matrizA.length; ++i) {
			for ( int j = 0; j < matrizA[i].length; ++j) {
				if ( i == j ) {
					soma += matrizA[i][j];
				}
			}
		}
		return soma;
	}
}
