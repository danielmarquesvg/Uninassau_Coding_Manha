package aula06_Funcoes;

import java.util.Scanner;

public class Citacao {
	
	/*
	 * Escreva um programa que o usuário irá digitar o nome completo
	 * um título e uma data de acesso. Por fim, crie uma função que receba
	 * estes três parâmetros e printe o resultado de uma referência bibliográfica
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o nome completo: ");
		String nomeCompleto = scanner.nextLine();
		System.out.print("Digite o título: ");
		String titulo = scanner.nextLine();
		System.out.print("Digite a data: ");
		String data = scanner.nextLine();
		
		String referencia = referenciaBibliografica(nomeCompleto, titulo, data);
		System.out.println("Referência = "+referencia);
		
	}
	
	public static String referenciaBibliografica(String nome, String titulo, String data) {
		
		String citacao = "";
		String [] nomes = nome.split(" ");
		String nomeCompleto = "";
		for(int i = nomes.length - 1; i >= 0; i--) {
			if(i == nomes.length - 1) {
				nomeCompleto = nomeCompleto + nomes[i].toUpperCase();
			} else {
				nomeCompleto = nomeCompleto +", "+ nomes[i];
			}
		}
		
		citacao = nomeCompleto+". "+titulo+". "+data;
		return citacao;
	}

}
