package aula06_Funcoes;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double valor1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double valor2 = scanner.nextDouble();
		
		System.out.println("Soma = "+somar(valor1, valor2));
		System.out.println("Subtracao = "+subtrair(valor1, valor2));
		System.out.println("Multiplicao = "+multiplicar(valor1, valor2));
		System.out.println("Divisao = "+dividir(valor1, valor2));
	}
	
	//fim do Main
	public static double somar(double n1, double n2) {
		double resultado = n1 + n2;
		return resultado;
	}
	
	public static double subtrair(double x1, double x2) {
		double resultado = x1 - x2;
		return resultado;
	}
	
	public static double multiplicar(double y1, double y2) {
		double resultado = y1 * y2;
		return resultado;
	}
	
	public static double dividir(double n1, double n2) {
		double resultado = n1 / n2;
		return resultado;
	}

}
