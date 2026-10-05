package revisao;

import java.util.Scanner;

public class TemperaturaMedia {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a quantidade de temperaturas: ");
		int quantidade = scanner.nextInt();
		
		double [] temperaturas = new double [quantidade];
		
		double soma = 0;
		for(int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = scanner.nextDouble();
			soma = soma + temperaturas[i];
		}
		
		double media = soma / quantidade;
		System.out.println();
		for(int i = 0; i < temperaturas.length; i++) {
			double diferenca = temperaturas[i] - media;
			System.out.printf("%.2f  %.2f\n", temperaturas[i], diferenca);
		}
	}

}
