package ExercicioContatos;

import java.util.Scanner;

public class GerenciadorContatos {
	
	//Atributos
	Scanner input;
	Contatos contatos[];
	
	//Construtor
	public GerenciadorContatos(int t) {
		contatos = new Contatos[t];
	}
	
	//Métodos
	public Contatos criarContato() {
		input = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println("Telefone: ");
		int telefone = input.nextInt();
		Contatos c = new Contatos(nome, telefone);
		return c;
	} 
	
	public void preencherContato() {
		input = new Scanner(System.in);
		for(int i = 0; i < contatos.length; i++) {
			contatos[i] = criarContato();
		}
	}
	
	public void mostrarContato() {
		for(int i = 0; i < contatos.length; i++) {
			System.out.println("Nome: " + contatos[i].getNome());
			System.out.println("Telefone: " + contatos[i].getNumContato());
		}
	}
	
}
