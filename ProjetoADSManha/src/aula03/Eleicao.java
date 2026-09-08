package aula03;

import java.util.Scanner;

public class Eleicao {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		boolean votoFacultativo = ((idade >= 16) && (idade < 18)) || (idade >= 70);   ;
		
		System.out.println("Voto facultativo? "+votoFacultativo);
	}

}
