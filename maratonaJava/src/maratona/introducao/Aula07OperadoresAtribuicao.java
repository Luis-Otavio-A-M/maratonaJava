package maratona.introducao;

public class Aula07OperadoresAtribuicao {
	public static void main(String[] args) {
		int atribuicao = 1000; //atribuição simples
		System.out.println(atribuicao);
		
		atribuicao += 500; //atribuição aditiva
		System.out.println(atribuicao);
		
		atribuicao -= 300; //atribuição diminutiva
		System.out.println(atribuicao);
		
		atribuicao *= 2; //atribuição multiplicativa
		System.out.println(atribuicao);
		
		atribuicao /= 3; //atribuição divisiva
		System.out.println(atribuicao);
		
		atribuicao %= 700; //atribuição resto da divisao
		System.out.println(atribuicao);
		
		int incremento = 10;
		incremento++; // neste caso o operador de incremento tem uma menor precedência em relação a outros operadores
		System.out.println(incremento);
		
		++incremento; // neste caso é o contrário do anterior, o operador possui maior precedência em comparação a outros operadores
		System.out.println(incremento);
		
		int inc1 = 5, inc2 = 5;
		System.out.println(inc1 == inc2); //true
 
		System.out.println(inc1++ == ++inc2); //false
		
		// Similar ao incremento, onde o --decremento tem maior precedencia do que o decremento++
		int decremento = 10;
		decremento--;
		System.out.println(decremento);

		--decremento;
		System.out.println(decremento);
	}
}
