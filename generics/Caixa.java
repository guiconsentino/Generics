package generics;

public class Caixa<TIPO> { //usando generics n�o preciso fazer casting 

	private TIPO coisa;
	
	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}

	public TIPO abrir() {
		return coisa;
	}
}
