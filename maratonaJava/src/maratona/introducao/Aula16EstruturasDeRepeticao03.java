package maratona.introducao;

public class Aula16EstruturasDeRepeticao03 {
	public static void main(String[] args) {
		int cont = 0;
		while(cont < 10) {
			System.out.println(cont++);
			if(cont == 5) {
				break;
			}
		}
		
		float valorCarro = 43250f;
		for(int parcela = 1; parcela <= valorCarro; parcela++) {
			if(valorCarro / parcela >= 1000f) {
				System.out.println(parcela + " parcelas de R$ " + valorCarro/parcela);
			} else {
				break;
			}
		}
	
		System.out.println();
		for(int parcela = (int) valorCarro; parcela >= 1; parcela--) {
			if(valorCarro / parcela < 1000f) {
				continue;
			} 
			System.out.println(parcela + " parcelas de R$ " + valorCarro/parcela);
		}
		
	}
	
}
