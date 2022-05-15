package generics;

public class CaixaObject {

	private Object coisa;
	
	void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
	
}
//basicamente um metodo get e setter