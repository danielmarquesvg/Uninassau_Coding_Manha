package revisao;

import java.util.Scanner;

public class EntradaSaida_21_BaldeTinta {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o tamanho da largura: ");
		double largura = scanner.nextDouble();
		System.out.print("Digite o tamanho da altura: ");
		double altura = scanner.nextDouble();
		
		double litrosPorMetroQuadrado = 3.6 / 50;
		double areaDaParede = largura * altura;
		double litros = areaDaParede * litrosPorMetroQuadrado;
		
		System.out.printf("%.2f l", litros);
		 
	}

}
