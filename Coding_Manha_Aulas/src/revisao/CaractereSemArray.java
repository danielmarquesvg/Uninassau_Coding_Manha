package revisao;

import java.util.Scanner;

public class CaractereSemArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = -1;
		
		while(numero != 0) {
			numero = scanner.nextInt();
			String palavra = scanner.next();
			for(int i = palavra.length() - 1; i >= 0; i--) {
				System.out.print(palavra.charAt(i));
			}
			System.out.println();
		}
	}

}
