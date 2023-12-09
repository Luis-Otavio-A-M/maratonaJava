package maratona.classesUtilitarias.wrappers.teste;

public class WrappersTeste {
	public static void main(String[] args) {
		// Wrappers são classe criadas para representar como objetos os tipos
		// primitivos.
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 1;
		long longPrimitivo = 1L;
		float floatPrimitivo = 1.0f;
		double doublePrimitivo = 1.0D;
		char charPrimitivo = '1';
		boolean booleanPrimitivo = true;

		// Wrappers em ação:
		/*
		 * Como visto, não foi necessário instaciar um objeto, mesmo passando um valor
		 * de tipo primitivo, o compilador "empacota" este tipo primitivo em uma
		 * instaciação da classe (boxing).
		 */
		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer integerWrapper = 1;
		Long longWrapper = 1L; // essa variável não poderia receber apenas o valor 1
		Float floatWrapper = 1.0F; // essa variável não poderia receber apenas o valor 1
		Double doubleWrapper = 1.0D; // essa variável não poderia receber apenas o valor 1
		/*
		 * Porque estas 3 variáveis não podem receber apenas o valor 1 (que é um
		 * inteiro)?
		 * Por ser um valor int, esse valor 1 será empacotado em um objeto de
		 * Integer, e como as classes Long, Float e Double não estão na linha de herança
		 * de Integer, as variáveis não poderão receber o objeto instanciado.
		 */
		Character characterWrapper = '1';
		Boolean booleanWrapper = true;

		/*
		 * Também podemos realizar o processo inverso do boxing, o unboxing, onde, a
		 * partir de uma classe Wrapper, é gerado um valor do tipo primitivo;
		 * 
		 */
		byte byteBoxing = byteWrapper;
		short shortBoxing = shortWrapper;
		int intBoxing = integerWrapper;
		long longBoxing = longWrapper;
		float floatBoxing = floatWrapper;
		double doubleBoxing = doubleWrapper;
		char chacarterBoxing = characterWrapper;
		boolean booleanBoxing = booleanWrapper;
		
		
		boolean teste = Boolean.parseBoolean("teste");
		System.out.println(teste);
		
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetterOrDigit('a'));
		System.out.println(Character.isLetterOrDigit('1'));
		System.out.println(Character.toUpperCase('A'));
	}
}
