package ExercicioContatos;

public class Contatos {
	
	//Atributos
	private String nome;
	private int numContato;
	
	//Construtor
	public Contatos(String nome, int numContato) {
		this.nome = nome;
		this.numContato = numContato;
	}

	//Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumContato() {
		return numContato;
	}

	public void setNumContato(int numContato) {
		this.numContato = numContato;
	}
	
	//Método To-String (Depois vou fazer)
}
