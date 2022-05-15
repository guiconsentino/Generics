package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
	
	Pares <Integer, String> resultadoConcurso = new Pares<>();
	
	resultadoConcurso.adicionar(1, "Guilherme");
	resultadoConcurso.adicionar(2, "Karina");
	resultadoConcurso.adicionar(3, "Gabriel");
	resultadoConcurso.adicionar(4, "Giovana");
	resultadoConcurso.adicionar(5, "Daiane");
	resultadoConcurso.adicionar(2, "Felipe");
	
	System.out.println(resultadoConcurso.getValor(1));
	System.out.println(resultadoConcurso.getValor(3));
	System.out.println(resultadoConcurso.getValor(4));
	System.out.println(resultadoConcurso.getValor(2));
	}
}
