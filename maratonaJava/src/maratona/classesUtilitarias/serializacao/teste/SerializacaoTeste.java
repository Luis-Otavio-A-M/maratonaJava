package maratona.classesUtilitarias.serializacao.teste;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import maratona.classesUtilitarias.serializacao.dominio.ObjetoSerializado;

public class SerializacaoTeste {
	public static void main(String[] args) {
		ObjetoSerializado objeto = new ObjetoSerializado(1L, "objeto", "1234");
		serializar(objeto);
		ObjetoSerializado objetoDeserealizado = deserializar();
		System.out.println(objetoDeserealizado);
	}
	
	private static void serializar(ObjetoSerializado objeto) {
		Path destino = Paths.get(".\\objetoSerializado.txt");
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(destino))){
			objectOutputStream.writeObject(objeto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static ObjetoSerializado deserializar() {
		Path origem = Paths.get(".\\objetoSerializado.txt");
		try(ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(origem))){
			try {
				return (ObjetoSerializado) inputStream.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
