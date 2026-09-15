package aula04_Repeticao;

import java.util.Scanner;

public class SomaCumulativaIndeterminadaV2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int soma =  1231123123;
		int numeroDigitado = 1231123123;
		
		while(numeroDigitado != 0 || soma != 0) {
			System.out.print("Digite um valor: ");
			numeroDigitado = scanner.nextInt();
			soma = soma + numeroDigitado;
			System.out.println("Soma parcial = "+soma);
		}
	}

}
