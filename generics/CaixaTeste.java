package generics;

public class CaixaTeste {
	public static void main(String[] args) {

	//RESOLVENDO O TIPO A PARTIR DA INSTANCIACAO
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("ola");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa <Integer> caixaB = new Caixa<>();
		caixaB.guardar(4);
		
		Integer coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
		
	}
}
