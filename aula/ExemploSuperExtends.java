package aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploSuperExtends {

	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(10,20,40,9,50);
		List<String> listaStrings = Arrays.asList("Samsung","Apple","LG");
		List<Object> listaObjetos = new ArrayList<>();
		
		copiarListas(listaNumeros, listaObjetos);
		imprimirListas(listaObjetos);
		//imprimirListas(listaStrings);
	}

	//? representa a classe Object
	public static void imprimirListas(List<?> lista) {
		for (Object object : lista) {
			System.out.println(object);
		}
	}
	//parâmetros: qualquer coisa que seja filha de Number; qualquer coisa superior a Number;
	public static void copiarListas(List<? extends Number> origem, List<? super Number> destino) {
		for (Number num : origem) {
			destino.add(num);
		}
	}
}
