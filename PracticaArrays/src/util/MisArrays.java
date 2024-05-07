package util;

import java.util.Arrays;

public abstract class MisArrays {
	
	
	
	/**
	 * 
	 * Metodo para calcular medias
	 * 
	 * @param notas array de notas del que queramos saber la media
	 * @return media del array
	 */
	public static float mediaNotas(int [] notas) {
		float mediaNotas = 0;
		
		for(int i = 0; i < notas.length ; i++) {
			if(notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Nota fuera del rango permitido");
			}
			
			mediaNotas  += notas[i];
		}
		
		mediaNotas /= notas.length;
		
		return mediaNotas;
	}
	
	public static float medianaNotas(int [] notas) {
		float medianaNotas = 0;
		
		Arrays.sort(notas);
		
		for(int i = 0; i < notas.length ; i++) {
			if(notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Nota fuera del rango permitido");
			}
			
		}
		
		int num = notas.length;
		
		if(num % 2 ==0) {
			int indexMedio = num/2;
			float sumaMedia = notas[indexMedio -1 ] + notas[indexMedio];
			
			medianaNotas =  sumaMedia / 2;

		}else {
			
			medianaNotas = notas[num/2];
		}
		
		
		return medianaNotas;
	}
	
	
	
}
