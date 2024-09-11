package aula;

import java.util.Map;
import java.util.TreeMap;

public class ExemploMap2 {

	public static void main(String[] args) {
		//Treemap ordena, linkedhashmap mantém a ordem de inserção
		TreeMap<Integer, String> classificados = new TreeMap<>();
		classificados.put(1,"Ana");
		classificados.put(3, "Débora");
		classificados.put(2, "Roberta");
		
		for (Map.Entry<Integer, String> info : classificados.entrySet()) {
			System.out.println(info.getKey() + " - " + info.getValue());
		}
		
	}

}
