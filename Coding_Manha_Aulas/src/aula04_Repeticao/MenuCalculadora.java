package aula04_Repeticao;

import java.util.Scanner;

public class MenuCalculadora {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 1;
		
		while(opcao != 5) {
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
			
			if(opcao == 1) {
				System.out.println("Digite o primeiro valor: ");
				int primeiroValor = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int segundoValor = scanner.nextInt();
				
				int soma = primeiroValor + segundoValor;
				System.out.println("Soma = "+soma);
				
			} else if(opcao == 2) {
				System.out.println("Digite o primeiro valor: ");
				int primeiroValor = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int segundoValor = scanner.nextInt();
				
				int subtracao = primeiroValor - segundoValor;
				System.out.println("Subtração = "+subtracao);
			} else if(opcao == 3) {
				System.out.println("Digite o primeiro valor: ");
				int primeiroValor = scanner.nextInt();
				System.out.println("Digite o segundo valor: ");
				int segundoValor = scanner.nextInt();
				
				int multiplicacao = primeiroValor * segundoValor;
				System.out.println("Multiplicação = "+multiplicacao);
			} else if (opcao == 4) {
				System.out.println("Digite o primeiro valor: ");
				double primeiroValor = scanner.nextDouble();
				System.out.println("Digite o segundo valor: ");
				double segundoValor = scanner.nextDouble();
				
				if(segundoValor == 0) {
					System.out.println("Não é possível dividir por zero");
				} else {
					double divisao = (double)(primeiroValor / segundoValor);
					System.out.println("Divisão = "+divisao);
				}
			} else if(opcao == 5){
				System.out.println("Encerrando o programa");
			} else {
				System.out.println();
			}
		}
	}

}
