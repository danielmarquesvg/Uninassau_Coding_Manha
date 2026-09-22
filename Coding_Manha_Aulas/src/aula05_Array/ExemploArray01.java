package aula05_Array;

public class ExemploArray01 {
	
	public static void main(String[] args) {
		
		//instanciação
	
		String [] listaDeNomes; //atual
		String listaDeProfessores []; //antigo
		
		//inicialização
		listaDeNomes = new String [10];
		listaDeProfessores = new String [10];
		int [] listaDeNumeros = {2,4,3,5,4,3,7,2,5,1,4,5,4,3,2,1,2,3,4,5,6,7,8,9,0,1,1,23,43,4,4,5,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		
		//instanciar e inicializar
		double [] listaDeNotas = new double [100];
		
		//verificando
		System.out.println(listaDeNomes[0]);
		System.out.println(listaDeNomes[8]);
		System.out.println(listaDeNotas[99]);
		
		//adiciono valores
		listaDeNomes[2] = "Thiago";
		listaDeNomes[8] = "Chico";
		listaDeNomes[0] = "Jesus";
		
		//percorrendo ou exibindo valores
		System.out.println();
		for(int i = 0; i < listaDeNumeros.length; i++) {
			System.out.println(listaDeNumeros[i]);
		}

	}

}
