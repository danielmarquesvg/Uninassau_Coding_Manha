package aula05_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	
	/*
	 * Escreva um programa que peça para o usuário digitar
	 * vários valores do tipo String e os adicione dentro
	 * de um arraylist.
	 * 
	 * Quando o usuário digitar o valor "FIM", será encerrada
	 * a inserção de valores e deverá ser exibido
	 * os nomes que começam por vogais
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList <String> lista = new ArrayList<String>();
		
		String nome = "";
		while(!(nome.equals("FIM"))) {
			System.out.print("Digite um nome: ");
			nome = scanner.nextLine();
			lista.add(nome);
		}
		char [] vogais = {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i < lista.size(); i++) {
			String palavra = lista.get(i);
			char letra = palavra.charAt(0);
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				System.out.println("Palavra = "+palavra);
			}
			
			
		}
	}

}
