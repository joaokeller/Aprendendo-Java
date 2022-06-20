package lista_arrays_e_matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec_06 {

	public static void main(String[] args) {

	  /*FAÇA UM PROGRAMA PARA LER A ARMAZENAR EM UM ARRAY A TEMPERATURA MÉDIA DOS MESES DO ANO. O
		PROGRAMA DEVE CALCULAR:
		- MENOR TEMPERATURA MÉDIA;
		- MAIOR TEMPERATURA MÉDIA;
		- MÉDIA DA TEMPERATURA DO ANO;
		- A QUANTIDADE DE MESES EM QUE A TEMPERATURA FOI INFERIOR À MÉDIA ANUAL;*/
		
		System.out.println("Bem vindo; \nO presente programa lê as temperaturas médias dos meses do ano"
							+ "\nApós isso ele informa a menor, a maior, a média anual e em quantos meses "
							+ "\na temperatura foi menor que a média anual.\n");

//		Captação de entradas e soma das entra	

		DecimalFormat formatando = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		double[] temperaturas = new double[12];
		double maior = 0;
		double menor = 0;
		double soma = 0;

		for (int i = 0; i < temperaturas.length; ++i) {
			System.out.println("Por favor insira a temperatura média do " 
								+ (i + 1) + "º mês:");
			temperaturas[i] = input.nextDouble();
			soma += temperaturas[i];
			
//			Obtenção do maior e do menor;
			
			if (temperaturas[i] > maior || i == 0) {
				maior = temperaturas[i];
			}
			if (temperaturas[i] < menor || i == 0) {
				menor = temperaturas[i];
			}
		}

//		Contador temperaturas abaixo da média
		
		double mediaAnual = (soma / temperaturas.length);
		int contadorMesesAbaixoDaMedia = 0;
		
		for (int i = 0; i < temperaturas.length; ++i) {
			if (temperaturas[i] < mediaAnual) {
				contadorMesesAbaixoDaMedia++;
			}
		}

//		Apresentação de resultados

		System.out.println("\n-----------------------------------------\n"
							+ "A menor temperatura média é: " + menor
							+ "\nA maior temperatura média é: " + maior
							+ "\nA média anual das temperaturas inseridas é: " + formatando.format(mediaAnual)
							+ "\nA quantidade de meses com temperaturas abaixo dessa média é: " + contadorMesesAbaixoDaMedia);

		input.close();
	}
}
