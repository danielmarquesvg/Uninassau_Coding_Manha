package aula01;

import java.util.Scanner;

public class MeuPrimeiroPrograma {
	
	public static void main(String[] args) {
		//Biblioteca para leitura de dados
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String meuNome = scanner.nextLine();
		System.out.println("Nome digitado: "+meuNome);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Idade digitada: "+idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		System.out.println("Altura digitada: "+altura);
		
		System.out.println("Você gosta de animais?");
		boolean decisaoAnimais = scanner.nextBoolean();
		System.out.println("Resposta: "+decisaoAnimais);
		
		scanner.close();
		
	}

}
