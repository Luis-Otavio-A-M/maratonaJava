package maratona.classesUtilitarias.date.teste;

import java.util.Date;

public class DateTeste {
	public static void main(String[] args) {
		//A classe Date trabalha com milisegundos, onde o marco zero, é às 00:00 do dia 01/01/1970.
		//É uma classe onde a maioria dos seus métodos estão obisoletos.
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		//Um dos maiores problemas dessa classe é o não suporte a internacianalização. 
		//Como é feito para adiantar o horário em uma hora.
		long horaEmMilisegundos = 60 * 60 * 1000;
		date.setTime(date.getTime() + horaEmMilisegundos);
		System.out.println(date);
	}
}
