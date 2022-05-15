package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUtimo1(List<?> lista) {
		 return lista.get(lista.size() -1);
	}
	//usando tipo GENERIC EM METODOS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//forma GENERIC, dessa maneira evito casting
	public static <T> T getUtimo2(List<T> lista) {
		//COLOCADO TIPO GENERICO ANTES DO TIPO DE RETORNO
		return lista.get(lista.size() -1);
	}
	
}
