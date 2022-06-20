package lista_procedimentos_e_funcoes;

public class Exec_07 {

	public static void main(String[] args) {

//		7 – DESENVOLVA UM PROGRAMA QUE IDENTIFIQUE TODOS OS NÚMEROS PRIMOS MENORES QUE 100.
//		DESENVOLVA UM MÉTODO COM RETORNO (“FUNÇÃO”) QUE RECEBA UM NÚMERO COMO PARÂMETRO E INFORME
//		SE ELE É UM NÚMERO PRIMO. LEMBRANDO QUE O NÚMERO 1 NÃO É PRIMO E QUE TODO NÚMERO PRIMO TEM
//		DOIS DIVISORES (O NÚMERO 1 E ELE MESMO).
	
		System.out.println("Bem vindo; "
							+ "O presente programa identifica todos os números primos menores que 100.\n");
	
		// Captação de dados
		
		System.out.println("São números primos até 100: \n");

		int[] naturaisAteCem = new int[100];
		for ( int i = 0; i < naturaisAteCem.length; ++i) {
				naturaisAteCem[i]= (i+1);
				boolean resposta = identificarPrimo (naturaisAteCem[i]);
				if ( resposta == true ) {
					System.out.print( naturaisAteCem[i] + "  ");
				}
		}
		
	}
	
	static boolean identificarPrimo (int numero) {
		boolean resposta = true;
		if ( numero == 1 ) {
			resposta = false;
			}
		for ( int i = 0; (i+2) < numero ; ++i) {
			if ( numero % (2+i) == 0 && (2+i) != numero ) {
			resposta = false;
			}
			
		}
		return resposta;
	}
	
}
