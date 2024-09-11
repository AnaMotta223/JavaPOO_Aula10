package aula;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExemploInstant {

	public static void main(String[] args) {
		//Trabalha com fuso horário
		Instant dataHora = Instant.now();
		System.out.println(dataHora);
		
		//Pega o fuso do sistema local 
		LocalDateTime dataLocal = LocalDateTime.ofInstant(dataHora, ZoneId.systemDefault());
		System.out.println(dataLocal);
	}

}
