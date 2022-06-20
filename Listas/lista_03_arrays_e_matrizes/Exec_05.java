package lista_arrays_e_matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_05 {

	public static void main(String[] args) {
		
	  /*ESCREVA UM PROGRAMA QUE PERMITA A LEITURA DAS NOTAS DE UMA TURMA DE 10 ALUNOS. ARMAZENE AS
		NOTAS EM UM ARRAY. O PROGRAMA DEVE CALCULAR A MÉDIA DA TURMA E CONTAR QUANTOS ALUNOS
		OBTIVERAM NOTA ACIMA DESTA MÉDIA CALCULADA. ESCREVA A MÉDIA DA TURMA E O RESULTADO DA CONTAGEM.*/

		
		System.out.println("Bem vindo; \nO presente programa lê as notas de 10 alunos de uma turma."
							+ "\nApós isso ele informa a média da turma e quantos alunos obtiveram nota acima dessa média\n");

//		Captação de entradas e cálculo	

		DecimalFormat formatando = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		double[] notas = new double[10];
		double soma = 0;

		for (int i = 0; i < notas.length; ++i) {
			System.out.println("Por favor insira a nota do " + (i + 1) + "º aluno:");
			notas[i] = input.nextDouble();
			soma += notas[i];
		}

		double mediaDaTurma = (soma / notas.length);

		int contadorAlunosAcimaDaMedia = 0;
		
		for (int i = 0; i < notas.length; ++i) {
			if (notas[i] > mediaDaTurma) {
				contadorAlunosAcimaDaMedia++;
			}
		}

//		Apresentação de resultados

		System.out.println("\n-----------------------------------------\n" 
							+ "A média das notas da turma é: " + formatando.format(mediaDaTurma)
							+ "\nA quantidade de notas acima dessa média é: " + contadorAlunosAcimaDaMedia);

		input.close();
	}
}
