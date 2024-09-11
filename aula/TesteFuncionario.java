package aula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Implementar o comparable para poder usar o sort e ordenar os funcionarios
public class TesteFuncionario{

	public static void main(String[] args) {
		List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Ana", 35), 
				new Funcionario("Igor",18), new Funcionario("Carlos", 33));
		
		Collections.sort(funcionarios);
		for (Funcionario f : funcionarios) {
			System.out.println(f);
		}
		
		
	}

}
