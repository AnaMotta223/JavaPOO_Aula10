package aula;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {
		/*
		Date dataAtual = new Date();
		System.out.println(dataAtual.getDate()); //não é mais usado - pega a data atual
		*/
		
		Calendar hoje = Calendar.getInstance();		
		System.out.println(hoje);
		int ano = hoje.get(Calendar.YEAR);
		System.out.println(ano);
		
		LocalDate entrada = LocalDate.of(2024, 9, 6);
		//soma 10 dias da data informada
		System.out.println(entrada.plusDays(10));
	
		//Pega o fuso horário
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		for (String f : ZoneId.getAvailableZoneIds()) {
			System.out.println(f); //Imprime fusos horários
		}
	}

}
