package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_02 {

	public static void main(String[] args) {

	  /*ESCREVA UM PROGRAMA QUE LEIA 10 NÚMEROS E ARMAZENE-OS EM UM ARRAY. APÓS AS LEITURAS O
		PROGRAMA DEVE SOLICITAR AO USUÁRIO UM NOVO NÚMERO. O PROGRAMA DEVE FAZER UMA BUSCA NO ARRAY
		E ESCREVER A MENSAGEM “ACHEI”, SE O NÚMERO ESTIVER ENTRE OS 10 ARMAZENADOS, OU “NÃO ACHEI”
		CASO CONTRÁRIO.*/
		
		System.out.println("Bem vindo; \nO presente programa lê 10 números; Após isso ele solicita um número"
							+ "\na ser procurado, informando se ele se encontra entre os 10.\n");
		
//		Captação de entradas e cálculo	

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		String respostaDaPesquisa = "Não Achei";

		for ( int i = 0; i < numeros.length; ++i ) {
			System.out.println("Por favor insira o " + (i + 1) + "º número:");
			numeros[i] = input.nextDouble();
		}
		
		System.out.println("Por favor insira um número para ser pesquisado entre os demais:");
		double numeroPesquisado = input.nextDouble();

		for ( int i = 0; i < numeros.length; ++i ) {
			if ( numeros[i] == numeroPesquisado ) {
				respostaDaPesquisa = "Achei";		
			}
		}
		
//		Apresentação de resultados

		System.out.println("\n-----------------------------------\n            " + respostaDaPesquisa);

		input.close();
	}
}
