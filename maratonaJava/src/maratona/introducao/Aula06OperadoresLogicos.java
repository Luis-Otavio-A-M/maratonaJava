package maratona.introducao;

public class Aula06OperadoresLogicos {
	public static void main(String[] args) {
		/* 
		 * O operador && (AND) retorna um valor booleano, onde se todos os operandos forem true, 
		 * o retorno é true, caso pelo menos um seja falso, o retorno é false;
		*/
		
		int idade = 20;
		boolean temCarteira = true;
		char tipoCarteira = 'B';
		boolean isAutorizadoDirigirCaminhao = idade >= 18 && temCarteira && tipoCarteira > 'C';
		System.out.println(isAutorizadoDirigirCaminhao);
		
		/*
		 * O operador lógico || (OR) retorna um valor booleano, onde se pelo menos um operando dor true,
		 * o retorno da operação será true, caso nenhum seja, o retorno é false.
		 */
		
		char sexo = 'F';
		boolean temBebidaCara = false;
		int contribuicao = 0;
		
		boolean isPermitidoEntrarVip = sexo == 'F' || temBebidaCara || contribuicao > 200;
		System.out.println(isPermitidoEntrarVip);
		
	}
}
