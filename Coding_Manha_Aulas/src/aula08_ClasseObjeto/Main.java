package aula08_ClasseObjeto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ana", "Rua Floriano Peixoto", 1500, "A", "Centro", 65, 1.70);
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("João");
		pessoa2.setPeso(80);
		
		System.out.println("Nome = "+pessoa1.getNome());
		pessoa1.setNome("Fernanda");
		System.out.println("Nome = "+pessoa1.getNome());
		
		System.out.println("Rua: "+pessoa1.endereco.rua);
	}

}
