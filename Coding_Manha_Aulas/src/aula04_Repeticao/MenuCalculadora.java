package aula04_Repeticao;

import java.util.Scanner;

public class MenuCalculadora {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		
		while(opcao >= 1 && opcao <= 4) {
			System.out.print("====== CALCULADORA ======\n");
			System.out.println();
			System.out.print("Opções\n");
			System.out.print("1 - Soma\n");
			System.out.print("2 - Subtração\n");
			System.out.print("3 - Multiplicação\n");
			System.out.print("4 - Divisão\n");
			System.out.print("5 - Sair do programa\n");
			System.out.println();
			System.out.print("Digite um valor: ");
			opcao = scanner.nextInt();
			
			System.out.println("Digite o primeiro valor: ");
			int primeiroValor = scanner.nextInt();
			System.out.println("Digite o segundo valor: ");
			int segundoValor = scanner.nextInt();
			
			if(opcao == 1) {
				int soma = primeiroValor + segundoValor;
				System.out.println("Soma = "+soma);
			} else if(opcao == 2) {
				int subtracao = primeiroValor - segundoValor;
				System.out.println("Subtração = "+subtracao);
			}
			
		}
	}

}
