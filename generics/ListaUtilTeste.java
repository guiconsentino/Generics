package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String>langs = Arrays.asList("Phyton", "Java", "JS", "c++");
		List<Integer>nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimaLinguagem1 = (String)ListaUtil.getUtimo1(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimoNum1 = (Integer)ListaUtil.getUtimo1(nums);
		System.out.println(ultimoNum1);

	               //USANDO GENERIC
				
				//SEM ESPECIFICAR
		String ultimaLinguagem2 = ListaUtil.getUtimo2(langs);
		System.out.println(ultimaLinguagem2);
		
				 //ESPECIFICANDO O       TIPO
		Integer ultimoNum2 = ListaUtil.<Integer>getUtimo2(nums);
		System.out.println(ultimoNum2);
	}
}
