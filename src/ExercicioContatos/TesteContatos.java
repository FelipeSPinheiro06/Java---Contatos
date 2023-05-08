package ExercicioContatos;

public class TesteContatos {

	public static void main(String[] args) {
		GerenciadorContatos gc = new GerenciadorContatos(2);
		gc.preencherContato();
		System.out.println("");
		gc.mostrarContato();
	}

}
