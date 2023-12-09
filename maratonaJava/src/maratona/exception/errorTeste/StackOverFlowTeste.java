package maratona.exception.errorTeste;

public class StackOverFlowTeste {
	public static void main(String[] args) {
		testarOverflowDaStack();
	}
	
	public static void testarOverflowDaStack() {
		testarOverflowDaStack();
	}
}
