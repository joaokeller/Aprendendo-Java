package lista_procedimentos_e_funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_10 {

	public static void main(String[] args) {

//		10 – FAÇA UM PROGRAMA ONDE O USUÁRIO DEFINA A QUANTIDADE DE NÚMEROS A SEREM LIDOS E EM SEGUIDA
//		LEIA OS NÚMEROS E ARMAZENE-OS EM UM ARRAY. DEPOIS DESENVOLVA MÉTODOS (“PROCEDIMENTOS OU
//		FUNÇÕES”) PARA IDENTIFICAR O MAIOR, O MENOR ELEMENTO DO ARRAY E QUE CALCULE A MÉDIA DOS
//		NÚMEROS. O PROGRAMA DEVE APRESENTAR ESSAS INFORMAÇÕES.

		DecimalFormat formatando = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo; "
							+ "\nO presente programa lê uma série de números."
							+ "\nApós isso ele apresenta o número maior e o menor."
							+ "\nSeguidos da média dos números.\n");
		
		System.out.print("Por favor insira quantos números você deseja digitar: ");
		int tamanhoLista = input.nextInt();
		
		double[] lista = new double[tamanhoLista];
		for ( int i = 0; i < lista.length; ++i) {
			System.out.print("Insira o " + (i+1) + "º número:");
			lista[i] = input.nextDouble();
		}
		
		double menor = retornarMenor(lista);
		double maior = retornarMaior(lista);
		double media = calcularMedia(lista);

		System.out.println("\nO menor número inserido é: " + menor
						+ "\nO maior número inserido é: " + maior
						+ "\nA média dos números inseridos é: " + formatando.format(media));
		input.close();
	}

	static double retornarMenor (double[] lista) {
		double menor = 0;
		for (int i = 0; i < lista.length; ++i ) {
			if (i == 0 || lista[i] < menor ) {
				menor = lista[i];
			}
		}
		return menor;
	}
	
	static double retornarMaior (double[] lista) {
		double maior = 0;
		for (int i = 0; i < lista.length; ++i ) {
			if (i == 0 || lista[i] > maior ) {
				maior = lista[i];
			}
		}
		return maior;
	}
	
	static double calcularMedia (double[] lista) {
		double soma = 0;
		for (int i = 0; i < lista.length; ++i ) {
			soma += lista[i];
		}
		double media = (soma / lista.length) ;
		return media;
	}
	
	
}
