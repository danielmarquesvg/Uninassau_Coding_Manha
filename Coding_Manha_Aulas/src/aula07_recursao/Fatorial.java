package aula07_recursao;

public class Fatorial {
	
	public static void main(String[] args) {
		
		int n = 5;
		int fatorial = 1;
		for(int i = n; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
		
	}

}
