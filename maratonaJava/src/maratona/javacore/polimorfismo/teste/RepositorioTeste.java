package maratona.javacore.polimorfismo.teste;

import maratona.javacore.polimorfismo.repositorio.Repositorio;
import maratona.javacore.polimorfismo.servicos.RepositorioBandoDeDados;

public class RepositorioTeste {
	public static void main(String[] args) {
		RepositorioBandoDeDados repositorioBandoDeDados = new RepositorioBandoDeDados();
		repositorioBandoDeDados.salvar();
		/*
		 * Discussão: 
		 * A implementação acima está errada? A princípio não, você necessita salvar algo no banco de dados e cria um
		 * repositório ligado a ele e salva depois, perfeito! Entretanto, isso "amarra" a implementação ao banco de dados,
		 * se for necessário alterar a implementação para salvar em memória agora, vai ser necessário mudar o tipo da variável
		 * e como o código é geralmente escrito por várias pessoas, essa mudança de tipo da variável pode quebrar alguma coisa,
		 * por isso é preferível fazer do jeito abaixo
		 */
		
		Repositorio repositorio = new RepositorioBandoDeDados();
		repositorio.salvar();
		
		/*
		 * Assim é melhor, pois se quisermos mudar a implementação, só precisamos alterar o construtor e pronto, junto a isso temos
		 * um alto grau de certeza que essa mudança não impactará outras partes do código, pois "obrigamos" que os outros desenvolve
		 * dores fizessem a implementação baseado na interface.
		 */
		
	}
}
