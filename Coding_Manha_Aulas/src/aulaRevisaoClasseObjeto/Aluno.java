package aulaRevisaoClasseObjeto;

public class Aluno {
	
	//atributo
	private String nome;
	private int matricula;
	private String curso;
	
	//Construtor
	public Aluno(String novoNome, int novaMatricula, String novoCurso) {
		this.nome = novoNome;
		this.matricula = novaMatricula;
		this.curso = novoCurso;
	}
	
	//Métodos
	public void exibirInformacoes() {
		System.out.println("Nome = "+this.nome);
		System.out.println("Matricula = "+this.matricula);
		System.out.println("Curso = "+this.curso);
		System.out.println();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
