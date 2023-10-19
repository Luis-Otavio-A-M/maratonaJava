package maratona.introducao;

public class Aula12EstruturasCondicionais04 {
	public static void main(String[] args) {
		byte diaDaSemana = 8;
		String diaDaSemanaExtenso;
		switch(diaDaSemana) {
			case 1:
				diaDaSemanaExtenso = "Domingo";
				break;
			case 2:
				diaDaSemanaExtenso = "Segunda-feira";
				break;
			case 3:
				diaDaSemanaExtenso = "Terça-feira";
				break;
			case 4:
				diaDaSemanaExtenso = "Quarta-feira";
				break;
			case 5:
				diaDaSemanaExtenso = "Quinta-feira";
				break;
			case 6:
				diaDaSemanaExtenso = "Sexta-feira";
				break;
			case 7:
				diaDaSemanaExtenso = "Sábado";
				break;
			default:
				diaDaSemanaExtenso = "Dia inválido";
		}
		
		System.out.println(diaDaSemanaExtenso);
		
		char sexo = 'M';
		
		switch(sexo) {
			case 'M':{
				System.out.println("Masculino");
				break;
				}
			case 'F':
				System.out.println("Feminino");
				break;
			default:
				System.out.println("Sexo não reconhecido");
		}
	}
}
