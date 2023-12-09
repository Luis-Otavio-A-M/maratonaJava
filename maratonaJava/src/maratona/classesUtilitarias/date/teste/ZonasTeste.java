package maratona.classesUtilitarias.date.teste;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZonasTeste {
	public static void main(String[] args) {
		Map<String, String> zone = ZoneId.SHORT_IDS; // constante contendo todas as zonas que o Java suporta
		System.out.println(zone); 
		
		System.out.println(ZoneId.systemDefault());
		
		//Utilizando outras zonas de tempo
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		ZoneId buenosAires = ZoneId.of("America/Argentina/Buenos_Aires");
		
		//Associando um dateTime a uma zona
		LocalDateTime now = LocalDateTime.now();
		ZonedDateTime zonedDateTimeTokyo = now.atZone(tokyo); 
		ZonedDateTime zonedDateTimeBA = now.atZone(buenosAires);
		
		//No caso, mesmo associando a zona diferente, o valor impresso da data e horário será o da zona da máquina, mas com associada impressa
		System.out.println(zonedDateTimeTokyo);
		System.out.println(zonedDateTimeBA);
		
		//Usando o Zoneid com Instant
		Instant instantNow = Instant.now();
		ZonedDateTime instantZonedBA = instantNow.atZone(buenosAires);
		ZonedDateTime instantZonedTokyo = instantNow.atZone(tokyo);
		
		//Nesse caso, o valor impresso vai ser referente ao horário na zona que foi associada.
		System.out.println(instantZonedBA);
		System.out.println(instantZonedTokyo);
		
		// A classe ZoneOffSet é utilizada para associar um valor de zona em locais que não existem nas zonas padrões do Java.
		// Como assim? Pense em Aracaju, ela não está listada na Zonaid.SHORTS_IDS, logo, teriam que associar ela a um dos
		//ids existentes, tipo São Paulo, que funcionaria, mas perderia o sentido semântico. Para isso existe a ZoneOffSet
		//Para criar zonas baseadas na diferença em horas para o meridiano de Greenwich.
		
		ZoneOffset offsetAracaju = ZoneOffset.of("-03:00"); //seguir padrão hh:mm
		
		OffsetDateTime offsetDateTime = now.atOffset(offsetAracaju);
		OffsetDateTime offsetDateTime2 = instantNow.atOffset(offsetAracaju);
		System.out.println(offsetDateTime);
		System.out.println(offsetDateTime2);
		
		//Curiosidade
		JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
		System.out.println(japaneseDate);
	}
}
