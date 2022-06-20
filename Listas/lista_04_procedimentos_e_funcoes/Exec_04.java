package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_04 {

	public static void main(String[] args) {
		
//		 FAÇA UM PROGRAMA QUE LEIA UMA MATRIZ A DE TAMANHO 3X4. EM SEGUIDA DESENVOLVA UM MÉTODO 
//		 COM RETORNO (“FUNÇÃO”) QUE RECEBA COMO PARÂMETRO A MATRIZ A E CONTABILIZE OS NÚMEROS PARES. O
//		 PROGRAMA DEVE APRESENTAR QUANTOS NÚMEROS PARES A MATRIZ A POSSUI.

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo, o presente programa lê uma matriz 3X4."
							+ "\nApós isso ele conta e apresenta o número de números pares.\n");
		
		double[][] matriz = new double[3][4];
		for ( int i = 0; i < matriz.length; ++i) {
			for ( int j = 0; j < matriz[i].length; ++j) {
				System.out.print("\nPor favor insira o número da posição " + i + "X" + j + " : ");
				matriz[i][j]= input.nextDouble();
			}
		}
		int quantiaPares = funcaoContaPares(matriz);
		System.out.print("\n A matriz possui " + quantiaPares + " números pares.");
		input.close();
	}
		
	static int funcaoContaPares (double[][] matrizNaFuncao) {
		
		int pares = 0;
		for ( int i = 0; i < matrizNaFuncao.length; ++i) {
			for ( int j = 0; j < matrizNaFuncao[i].length; ++j) {
				if ((matrizNaFuncao[i][j] % 2) == 0 ) {
					pares++;
				}
			}
		}
		return pares;
	}
}
