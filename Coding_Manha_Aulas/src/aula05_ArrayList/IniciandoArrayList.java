package aula05_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class IniciandoArrayList {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList <String> lista = new ArrayList <String>();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite um valor: ");
			String nome = scanner.next();
			lista.add(nome);
			System.out.println("Tamanho = "+lista.size()+"\n");
		}
		
		lista.set(1, "TESTE");
		lista.remove(2);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.print("Lista["+i+"] = "+lista.get(i)+"\n");
		}
	
	}

}
