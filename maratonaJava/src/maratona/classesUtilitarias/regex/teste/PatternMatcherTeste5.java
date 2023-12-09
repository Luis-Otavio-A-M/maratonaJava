package maratona.classesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste5 {
	public static void main(String[] args) {
		String emails = "luffy@hotmail.com 123jotaro@gmail.com !@#zoro@mail.br teste@gmail.com.br sakura@mail";
		String regex = "[\\w.-]+@[a-zA-Z]+(\\.[\\w-]+)+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emails);
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}
}
