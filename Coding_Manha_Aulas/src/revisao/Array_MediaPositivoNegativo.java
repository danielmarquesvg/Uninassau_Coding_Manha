package revisao;

import java.util.Scanner;

public class Array_MediaPositivoNegativo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//digitei o tamanho do meu array
		System.out.print("Digite o tamanho do array: ");
		int tamanho = scanner.nextInt();
		
		//criei um array com o tamanho digitado
		double [] lista = new double[tamanho];
		
		//Fiz algumas repetições de acordo com o tamanho do array
		//Pedi para o usuário digitar um valor e salvei dentro do array
		for(int i = 0; i < lista.length; i++) {
			System.out.print("lista ["+i+"] = ");
			lista[i] = scanner.nextDouble();
		}
		
		int quantidadePositivos = 0;
		int quantidadeNegativos = 0;
		double somaPositivos = 0;
		double somaNegativos = 0;
		
		//percorri o array
		for(int i = 0; i < lista.length; i++) {
			
			//verifiquei se o valor do número salvo no índice era negativo
			if(lista[i] < 0) {
				somaNegativos = somaNegativos + lista[i];
				quantidadeNegativos = quantidadeNegativos + 1;
			}
			
			//verifiquei se o valor do número salvo no índice era positivo
			if(lista[i] > 0) {
				somaPositivos = somaPositivos + lista[i];
				quantidadePositivos = quantidadePositivos + 1;
			}
		}
		
		//calculo das médias dos positivos e dos negativos
		double mediaPositivos = somaPositivos / quantidadePositivos;
		double mediaNegativos = somaNegativos / quantidadeNegativos;
		
		System.out.print("Media Positivo = "+mediaPositivos);
		System.out.print("\nMedia Negativo = "+mediaNegativos);
		
	}

}
