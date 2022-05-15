package generics;

public class Caixa<TIPO> { //usando generics não preciso fazer casting 

	private TIPO coisa;
	
	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}

	public TIPO abrir() {
		return coisa;
	}
}
