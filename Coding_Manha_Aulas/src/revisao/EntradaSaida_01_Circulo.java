package revisao;

import java.util.Scanner;

public class EntradaSaida_01_Circulo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o raio do círculo: ");
		float raio = scanner.nextFloat();
		
		double area = Math.PI * (raio * raio);
		double comprimento = 2 * Math.PI * raio;
		
		System.out.println("Área = "+area);
		System.out.println("Comprimento = "+comprimento);
		
		scanner.close();
		
	}

}
