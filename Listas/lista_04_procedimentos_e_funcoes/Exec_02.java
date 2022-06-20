package lista_procedimentos_e_funcoes;

import java.util.Scanner;

public class Exec_02 {

	public static void main(String[] args) {
		
		/*DESENVOLVA UM PROGRAMA QUE LEIA A QUANTIDADE DE PONTOS DE UM ALUNO EM UMA AVALIAÇÃO.
		DESENVOLVA UM MÉTODO SEM RETORNO (“PROCEDIMENTO”) QUE RECEBA ESSA PONTUAÇÃO POR PARÂMETRO 
		E INFORME O CONCEITO DO ALUNO NA AVALIAÇÃO CONFORME A TABELA ABAIXO:
		
		PONTOS CONCEITO
		ATÉ 60 PONTOS INSATISFATÓRIO
		61 A 75 PONTOS SATISFATÓRIO
		76 A 90 PONTOS BOM
		ACIMA DE 90 ÓTIMO*/

		Scanner input = new Scanner(System.in);
		System.out.println("Olá o presente programa lê a quantidade de pontos de um "
						+ "\naluno em uma avaliação e informe sua classificação \n");
		
		System.out.print("Por favor insira a pontuação do aluno: ");
		int idade = input.nextInt();
		indicadorDeConceito(idade);
		input.close();
	}

	static void indicadorDeConceito(int pontuacao) {

		String categoria = "";
		if (pontuacao < 61) {
			categoria = "INSATISFATÓRIO";
		} else {
			if (pontuacao < 76) {
				categoria = "SATISFATÓRIO";
			} else {
				if (pontuacao < 91) {
					categoria = "BOM";
				} else {
					categoria = "ÓTIMO";
				}
			}
		}
		System.out.print("O conceito do aluno na avaliação é : " + categoria);
	}
}
