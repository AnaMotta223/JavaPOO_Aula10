package aula;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exemplo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Branco");
		lista.add("Branco");
		lista.add("Preto");
		lista.add("Amarelo");
		lista.add("Azul");
		
		//Set ideal para evitar duplicações
		//Treeset é ordem numérica ou alfabética
		//HashSet tem ordem aleatória
		//LinkedHashSet ordem que os elementos foram inseridos
		//Set<Integer> numeros = new HashSet<>();
		Set<Integer> numeros = new LinkedHashSet<>();
		numeros.add(13);
		numeros.add(13);
		numeros.add(15);
		System.out.println(numeros);
		
	}

}
