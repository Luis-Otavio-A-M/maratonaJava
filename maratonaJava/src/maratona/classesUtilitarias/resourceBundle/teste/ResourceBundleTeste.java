package maratona.classesUtilitarias.resourceBundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste {
	public static void main(String[] args) {
		System.out.println(Locale.UK);
		ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "GB"));
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));
		System.out.println(bundle.getString("hi"));
		
		bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
		
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));
		System.out.println(bundle.getString("hi"));
		
		/*
		 * Como funciona a busca (get) do resourceBundle
		 * 1º ele  vai procurar um arquivo com o nome passado + localidade (idioma/pais) informado, caso não ache nada
		 * 2º ele procura um arquivo com o nome passado + idioma informado, caso não ache
		 * 3º ele procura um arquivo com o nome passado + a localidade default do sistema, caso não ache
		 * 4º ele procura um arquivo com o nome passado + o idioma default do distema, caso não ache
		 * 5º por fim, ele procura em um arquivo que tenha o nome passado (no caso messages.properties)
		 */
	}
}
