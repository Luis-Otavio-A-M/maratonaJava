package maratona.javacore.enumeracao.teste;

import maratona.javacore.enumeracao.dominio.Cliente3;
import maratona.javacore.enumeracao.dominio.TipoCliente;

public class ClienteTeste2 {
	public static void main(String[] args) {
		Cliente3 cliente3 = new Cliente3("Pedro", TipoCliente.PESSOA_FISICA, Cliente3.TipoPagamento.CREDITO);
		System.out.println(cliente3);
		System.out.println(cliente3.calcularPagamento(1000));
		System.out.println(TipoCliente.getTipoClienteByValor(2));
	}
}
