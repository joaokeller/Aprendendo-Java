package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_04_alternativo {

	public static void main(String[] args) {
		
	  /*DESENVOLVA UM PROGRAMA QUE LEIA 10 NÚMEROS (ACEITAR SOMENTE NÚMEROS POSITIVOS) E
		ARMAZENE EM UM ARRAY. O PROGRAMA DEVE INFORMAR O VALOR DO MAIOR E DO MENOR NÚMERO E AS SUAS
		RESPECTIVAS POSIÇÕES NO ARRAY.*/

		System.out.println("Bem vindo; \nO presente programa lê 10 números positivos; Após isso ele informa o maior, "
				+ "\no menor e suas respectivas posições de inserção.\n");

//		Captação de entradas e cálculo	

		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		double maior = 0;
		double menor = 0;
		int posicaoMaior = 0;
		int posicaoMenor = 0;

		System.out.println("--------------- Só serão aceitos valores positivos -----------------\n");
		
		for (int i = 0; i < numeros.length; ++i) {
			
			System.out.print("Por favor insira o " + (i + 1) + "º número:");
			numeros[i] = input.nextDouble();

			if (numeros[i] >= 0) {
				
				if ( i == 0 ) {
					maior = numeros[0];
					menor = numeros[0];
				}
				
				if (numeros[i] >= maior) {
					maior = numeros[i];
					posicaoMaior = i;
				}

				if (numeros[i] <= menor) {
					menor = numeros[i];
					posicaoMenor = i;
				}
				
			} else {
				System.out.println("\nO número inserido não é positivo; Tente novamente!\n");
// Abaixo decremento o i para formar um loop
				--i;
			}
		}

//		Apresentação de resultados

		System.out.println("\n-------------------------------------------------------------------------------\n"
				+ "\nO maior número inserido é: " + maior + " e sua posição é a de indíce:" + posicaoMaior
				+ "\nO menor número inserido é: " + menor + " e sua posição é a de indíce:" + posicaoMenor);

		input.close();
	}
}
