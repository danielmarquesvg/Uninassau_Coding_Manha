package aulaRevisaoArray;

public class MeuArray {
	
	static String [] lista = new String [5];
	static int posicao = 0;
	
	public static void main(String[] args) {
		add("Pedro");
		add("Chico");
		add("Laís");
		add("Luísmar");
		add("Carol");
		mostrarElementos();
		remove("Chico");
		remove("Pedro");
		remove("Hermanoteu");
		mostrarElementos();
		int valor = somar(2,5);
		
	}
	
	public static int somar(int x, int y) {
		return x+y;
	}
	
	public static void add(String valorAdicionado) {
		lista[posicao] = valorAdicionado;
		posicao = posicao + 1;
	}
	
	public static void mostrarElementos() {
		for(int i = 0; i < lista.length; i++) {
			System.out.println("lista["+i+"] = "+lista[i]);
		}
		
		System.out.println();
	}
	
	public static void remove(String valorRemovido) {
		int indice = 0;
		while(!lista[indice].equals(valorRemovido) && indice < lista.length-1) {
			indice = indice + 1;
		}
		
		lista[indice] = null;
	}

}
