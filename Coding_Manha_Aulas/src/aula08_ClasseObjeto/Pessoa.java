package aula08_ClasseObjeto;

public class Pessoa {
	
	//atributos
	private String nome;
	Endereco endereco;
	private double peso;
	private double altura;
	
	//Construtor
	public Pessoa(String novoNome, String rua, int numero, String complemento, String bairro, double novoPeso, double novaAltura) {
		Endereco novoEndereco = new Endereco(rua, numero, complemento, bairro);
		this.endereco = novoEndereco;
		this.nome = novoNome;
		this.peso = novoPeso;
		this.altura = novaAltura;
	}
	
	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	//métodos
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	
	public void verDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
	}
	
	public void verEndereco() {
		System.out.println("Endereço: "+endereco);
	}

}
