package maratona.introducao;

public class Aula09EstruturasCondicionais02 {
	public static void main(String[] args) {
		// É possível aninhar a estrutura if else, e utilizar de forma recursiva a estrutura if else dentro de um else
		int idade = 21;
		System.out.print("Categoria: ");
		if(idade < 15) {
			System.out.println("Infantil");
		} else if(idade < 18) {
			System.out.println("Juvenil");
		} else {
			System.out.println("Adulto");
		}
	}
}
