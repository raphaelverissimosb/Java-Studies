package executavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {

	
	public static void main(String[] args) {
		
		String text = " alex, curso java, 80, 90, 89 ";
		String[] valoresArrayTexto = text.split(",");
		
		for(int i = 0 ; i < valoresArrayTexto.length; i++) {
			System.out.println("Value position " + i + " = " + valoresArrayTexto[i]);
		}
		
		/*Convertendo Array em lista*/
		
		List<String> list = Arrays.asList(valoresArrayTexto);
		
		for(String valorString : list) {
			System.err.println(valorString);
		}
		
		
		/*Converter uma lista para um Array*/
		
		String[] conversaoArray = list.toArray(new String[valoresArrayTexto.length]);
		
		for(int k = 0 ; k < conversaoArray.length; k++) {
			System.out.println(conversaoArray[k]);
		}
		
	}
	
}
