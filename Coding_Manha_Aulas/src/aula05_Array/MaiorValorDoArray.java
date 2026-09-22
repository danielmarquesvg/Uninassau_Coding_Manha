package aula05_Array;

import java.util.Scanner;

public class MaiorValorDoArray {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array: ");
		int tamanho = scanner.nextInt();
		
		int [] listaDeNumeros = new int [tamanho];
		
		for(int i = 0; i < listaDeNumeros.length; i++) {
			System.out.print("listaDeNumeros["+i+"] = ");
			listaDeNumeros[i] = scanner.nextInt();
		}
		
		int maior = listaDeNumeros[0];
		for(int i = 1; i < listaDeNumeros.length; i++) {
			if(listaDeNumeros[i] > maior) {
				maior = listaDeNumeros[i];
			}
		}
		
		System.out.println("O maior valor = "+maior);
	}

}
