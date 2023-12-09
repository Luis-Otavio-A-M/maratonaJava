package maratona.classesUtilitarias.formatacao.teste;

import java.util.Locale;

public class LocaleTeste2 {
	public static void main(String[] args) {
		//Retorna a localidade padrão do sistema
		System.out.println(Locale.getDefault());
		
		//Retorna uma lista de todos países que a ISO suporta
		String[] paises = Locale.getISOCountries();
		
		//Retorna uma lista de todos idiomas que a ISO suporta
		String[] idiomas = Locale.getISOLanguages();
		
		for(String pais: paises) {
			System.out.print(pais + " ");
		}
		System.out.println();
		for(String idioma: idiomas) {
			System.out.print(idioma + " ");
		}
		
	}
}
