package aula;

import java.util.List;

public class TesteGenerics {

	public static void main(String[] args) {
		//Classe fica flexível para qualquer tipo
		ExemploGenerics<String> var1 = new ExemploGenerics<String>("Oi");
		ExemploGenerics<Double> var2 = new ExemploGenerics<Double>(1000.);
		
		//Lista aceita qualquer coisa (o ideal é ser tipada)
		//List lista;
		
		System.out.println(var1);
		System.out.println(var2);
		
	}

}
