package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {

		/* 1 – DESENVOLVA UM PROGRAMA QUE LEIA A IDADE DE UM NADADOR. DESENVOLVA UM
		 * MÉTODO SEM RETORNO (“PROCEDIMENTO”) QUE RECEBA ESSA IDADE POR PARÂMETRO E
		 * INFORME A CATEGORIA DO NADADOR CONFORME TABELA ABAIXO:
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Olá o presente programa recebe a idade "
				+ "\nde um nadador e informa a categoria a qual o nadador pertence.\n");
		System.out.print("Por favor insira a idade do nadador: ");
		int idade = input.nextInt();
		indicadorDeCategoria(idade);
		input.close();
	}

	static void indicadorDeCategoria(int idade) {

		String categoria = "";
		if (idade < 11) {
			categoria = "MIRIM";
		} else {
			if (idade < 15) {
				categoria = "INFANTIL";
			} else {
				if (idade < 20) {
					categoria = "JUVENIL";
				} else {
					categoria = "ADULTO";
				}
			}
		}
		System.out.print("A categoria do nadador é: " + categoria);
	}
}
