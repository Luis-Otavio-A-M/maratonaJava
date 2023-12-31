package maratona.javacore.modificadoresEstaticos.teste;

import maratona.javacore.modificadoresEstaticos.dominio.Carro2;
import maratona.javacore.modificadoresEstaticos.dominio.Carro3;
import maratona.javacore.modificadoresEstaticos.dominio.Carro4;

public class CarroTeste2 {
	public static void main(String[] args) {
		// Neste exemplo é necessário que haja um limite de velocidade que afeta todos
		// os carros
		Carro2 c1 = new Carro2("Uno", 230);
		Carro2 c2 = new Carro2("Pálio 1", 200);
		Carro2 c3 = new Carro2("Gol", 180);

		c1.setVelocidadeLimite1(200);

		c1.imprimirInfos();
		c2.imprimirInfos();
		c3.imprimirInfos();

		/*
		 * Note como o limite de velocidade de c1 foi alterado, fazendo que fosse gerada
		 * uma inconsistencia no limite de velocidade entre os carros.
		 */

		/*
		 * Para resolver isso, deve ser usado atributos estáticos, que "pertencem" a
		 * classe em si, não ao objeto, assim, todos os objetos instanciados da classe
		 * terão acesso ao mesmo valor.
		 */

		Carro3 c4 = new Carro3("Corrola", 250);
		Carro3 c5 = new Carro3("HB20", 220);
		Carro3 c6 = new Carro3("Hillux", 260);

		c4.setVelocidadeLimite2(200);

		System.out.println("\n\n\n");
		c4.imprimirInfos();
		c5.imprimirInfos();
		c6.imprimirInfos();

		/*
		 * Note que o valor foi alterado em um objeto, mas isso afetou todos, o que
		 * atendem o que foi estabelecido. Entretanto, semanticamente, esta não é uma
		 * solução válida, pois, quando alteramos um objeto o impacto da alteração deve
		 * ser visível localmente, e neste caso, ao alterar um objeto, houve o colateral
		 * de todos os objetos daquela classe serem afetados. E para manutenção do
		 * código, ao ler o trecho da alteração, não é intuitivo que aquela alteração
		 * modifique um atributo estático. Para realizar essa alteração, deve ser alterado o atributo direto na classe.
		 */
		Carro3.setVelocidadeLimite2(180);
		
		System.out.println("\n\n\n");
		c4.imprimirInfos();
		c5.imprimirInfos();
		c6.imprimirInfos();
		
		
		System.out.println("\n\n\n");
		Carro4 carro4 = new Carro4(null, 0);
		Carro4 carro5 = new Carro4(null, 0);
		Carro4 carro6 = new Carro4(null, 0);
	}
}
