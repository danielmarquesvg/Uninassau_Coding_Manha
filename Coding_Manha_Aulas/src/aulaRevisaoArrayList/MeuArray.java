package aulaRevisaoArrayList;

import java.util.ArrayList;

public class MeuArray {
	
	public static void main(String[] args) {
		ArrayList <String> listaNomes = new ArrayList<String>();
		
		//adicionar
		listaNomes.add("Zé");
		listaNomes.add("Zélia");
		listaNomes.add("Biu");
		
		//mostrar os elementos
		for(int i = 0; i < listaNomes.size(); i++) {
			System.out.println("Nome = "+listaNomes.get(i));
		}
		
		//remover elementos
		listaNomes.remove(1);
		listaNomes.remove("Zé");
		listaNomes.remove("Gerson");
		
		System.out.println();
		
		//mostrar os elementos
		for(int i = 0; i < listaNomes.size(); i++) {
			System.out.println("Nome = "+listaNomes.get(i));
		}
	}
	
	

}
