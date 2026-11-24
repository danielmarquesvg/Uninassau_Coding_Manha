package aulaRevisaoClasseObjeto;

public class Main {
	
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Pâmela", 34567, "Medicina");
		Aluno meuAluno = new Aluno("Rivaldo", 78901, "Matemática");
		Aluno alunoDorminhoco = new Aluno("Felipe", 11235, "Letras");
		
		aluno01.exibirInformacoes();
		alunoDorminhoco.exibirInformacoes();
	}

}
