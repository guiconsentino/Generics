package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
	CaixaNumero<Integer>caixaA = new CaixaNumero<>();
	
	caixaA.guardar(4);
	Integer coisaA = caixaA.abrir();
	
	System.out.println(coisaA);
	
	CaixaNumero<Double>caixaB = new CaixaNumero<>();
	
	caixaB.guardar(4.4);
	Double coisaB = caixaB.abrir();
	
	System.out.println(coisaB);
	
	
	
	}
}
