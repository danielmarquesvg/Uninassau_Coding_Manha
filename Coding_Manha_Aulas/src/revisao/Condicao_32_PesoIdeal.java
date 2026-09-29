package revisao;

import java.util.Scanner;

public class Condicao_32_PesoIdeal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o sexo: ");
		String sexo = scanner.next();
		
		System.out.print("Digite altura: ");
		double altura = scanner.nextDouble();
		
		double pesoIdeal;
		if(sexo.equals("m")) {
			pesoIdeal = 72.7 * altura - 58;
		} else {
			pesoIdeal = 62.1 * altura - 44.7;
		}
		System.out.print("Peso ideal = "+pesoIdeal);
	}

}
