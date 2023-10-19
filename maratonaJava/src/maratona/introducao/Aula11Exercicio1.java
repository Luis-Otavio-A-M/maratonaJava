package maratona.introducao;

public class Aula11Exercicio1 {
	static final float TAXA1 = 9.7f/100f;
	static final float TAXA2 = 37.55f/100f;
	static final float TAXA3 = 49.50f/100f;
	
	static final float FAIXA1 = 34712;
	static final float FAIXA2 = 68507;
	
	public static void main(String[] args) {
		float salario = 100000f;
		float imposto = 0;
		if(salario <= FAIXA1){
			imposto = salario * TAXA1;
		} else if(salario <= FAIXA2) {
			imposto = salario * TAXA2;
		} else {
			imposto = salario * TAXA3;
		}
		System.out.println("O valor a ser pago em imposto é " + imposto);
		
	}
}
