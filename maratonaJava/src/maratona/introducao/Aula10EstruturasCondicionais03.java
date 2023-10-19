package maratona.introducao;

public class Aula10EstruturasCondicionais03 {
	public static final float SALARIO_MINIMO = 1250f;
	
	public static void main(String[] args) {
		float salario = 500f;
		String mensagem = salario > SALARIO_MINIMO ? "Recebo mais que o mínimo" : "Recebo poha nenhuma quase";
		System.out.println(mensagem);
	}
}
