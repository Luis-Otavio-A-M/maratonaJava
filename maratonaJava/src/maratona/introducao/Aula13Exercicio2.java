package maratona.introducao;

public class Aula13Exercicio2 {
	public static void main(String[] args) {
		byte diaDaSemana = 1;
		switch(diaDaSemana) {
			case 2: 
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Dia útil");
				break;
			case 1:
			case 7:
				System.out.println("Final de semana");
				break;
			default:
				System.out.println("Dia inválido");
		}
	}
}
