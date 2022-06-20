package lista_procedimentos_e_funcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_03 {

	public static void main(String[] args) {

		/* DESENVOLVA UM PROGRAMA QUE LEIA E ARMAZENE 3 NOTAS DE UM ALUNO EM UM ARRAY.
		 * DESENVOLVA UM MÉTODO SEM RETORNO (“PROCEDIMENTO”) QUE RECEBA O ARRAY DE NOTAS
		 * DE UM ALUNO E O TIPO DE CÁLCULO A SER EXECUTADO POR PARÂMETRO. O PARÂMETRO
		 * TIPO DE CÁLCULO SERÁ UM INTEIRO (1 OU 2) E DEVE REALIZAR O CÁLCULO CONFORME
		 * ESPECIFICADO ABAIXO: 1 – O MÉTODO CALCULA E APRESENTA A MÉDIA ARITMÉTICA DAS
		 * NOTAS DO ALUNO; 2 – O MÉTODO CALCULA E APRESENTA A MÉDIA PONDERADA (PESOS: 5,
		 * 3 E 2)*/

		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo, o presente programa recebe três notas"
							+ "\nde um aluno e calcula a média aritimética ou ponderada " 
							+ "\na depender da escolha do usuário.\n");

		double[] notas = new double[3];
		for (int i = 0; i < notas.length; ++i) {
			System.out.print("Por favor insira a " + (i + 1) + "º nota do aluno: ");
			notas[i] = input.nextDouble();
		}
		System.out.print("\nDigite  '1' para cálculo de média aritmética "
							+ "\nou '2' para cálculo de média ponderada.");
		int opcao = input.nextInt();
		calculadorDeMedia(notas, opcao);
		input.close();
	}

	static void calculadorDeMedia(double[] notas, int opcao) {
		
		DecimalFormat formatando = new DecimalFormat("0.00");
		double soma = 0;
		if (opcao == 1) {
			for (int i = 0; i < notas.length; ++i) {
				soma += notas[i];
			}
		} else {
			for (int i = 0; i < notas.length; ++i) {
				double numero = notas[i];
				int[] pesos = { 5, 3, 2 };
				soma += pesos[i]*numero;
			}
		}

		double media = soma / notas.length;
		System.out.println("\nA média é: " + formatando.format(media));
	}
}
