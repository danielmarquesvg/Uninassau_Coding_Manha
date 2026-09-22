package aula05_Array;

import java.util.Scanner;

public class ArrayDeParesImpares {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contadorImpar = 0;
		int contadorPar = 0;
		
		int [] entrada = new int[15];
		int [] par = new int [5];
		int [] impar = new int [5];
		
		for(int i = 0; i < entrada.length; i++) {
			entrada[i] = scanner.nextInt();
		}
		
		int contadorWhile = 0;
		while(contadorImpar <= 5 || contadorPar <= 5) {
			if(entrada[contadorWhile] % 2 == 0) {
				par[contadorPar] = entrada[contadorWhile];
				contadorPar = contadorPar + 1;
			} else {
				par[contadorImpar] = entrada[contadorWhile];
				contadorImpar = contadorImpar + 1;
			}
			contadorWhile = contadorWhile + 1;
			
			if(contadorPar == 5) {
				for(int i = 0; i < 5; i++) {
					System.out.print("par["+i+"] = "+par[i]);
					par[i] = 0;
				}
				contadorPar = 0;
			}
		}
	}

}
