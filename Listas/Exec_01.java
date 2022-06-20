package lista_arrays_e_matrizes;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {
		
	  /*DESENVOLVA UM PROGRAMA QUE LEIA E ARMAZENE 10 NOMES EM UM ARRAY. APRESENTE OS NOMES NA
		ORDEM DE LEITURA E DEPOIS NA ORDEM INVERSA DA LEITURA.*/


		System.out.println("Bem vindo; \nO presente programa lê 10 nomes; Após isso ele "
				+ "\napresenta os nomes na ordem de leitura e na ordem inversa da leitura.\n");
		
//		Captação de entradas e cálculo	

		Scanner input = new Scanner(System.in);
		String[] nomes = new String[10];

		for ( int i = 0; i < nomes.length; ++i ) {
			System.out.print("Por favor insira o " + (i + 1) + "º nome:");
			nomes[i] = input.nextLine();
		}
		
//		Apresentação de resultados

		System.out.println("\n------------------------------\nNa ordem de leitura:\n");
		for ( int i = 0; i < nomes.length; ++i ) {
			System.out.println("O " + (i+1) + "º nome é: " + nomes[i]);
		}
		
		System.out.println("\n------------------------------\nNa ordem inversa a de leitura:\n");
		for ( int i = (nomes.length-1) ; i >= 0 ; --i ) {
			System.out.println("O " + (i+1) + "º nome é: " + nomes[i]);
		}

		input.close();
	}
}
