package aula04_Repeticao;

import java.util.*;

public class SomaCumulativaDeNumeros {
	
	public static void main(String[] args) {
		//entrada de dados - digitar dois numeros inteiros
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor inicial: ");
		int valorInicial = scanner.nextInt();
		
		System.out.print("Digite um valor final: ");
		int valorFinal = scanner.nextInt();
		
		//processamento - calculo
		int soma = 0;
		System.out.print("Soma inicial = "+soma+"\n");
		
		for(int i = valorInicial; i <= valorFinal; i++) {
			soma = soma + i;
			System.out.println("Soma parcial = "+soma);
		}
		
		//saida - exibicao do resultado
		System.out.print("\nSoma total = "+soma);
	}

}
