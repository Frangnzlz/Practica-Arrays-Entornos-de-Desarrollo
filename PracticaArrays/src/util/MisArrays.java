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
	/**
	 * 
	 * Metodo para calcular medianas
	 * 
	 * @param notas array de notas del que queramos saber la mediana
	 * @return mediana del array
	 */
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
	/**
	 * 
	 * Metodo para calcular medias
	 * 
	 * @param notas array de notas del que queramos saber la maxima nota
	 * @return Maxima nota
	 */
	public static int maximaNota(int [] notas) {
		
		int max = notas[0];
		
		for(int i = 0; i < notas.length ; i++) {
			if(notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Nota fuera del rango permitido");
			}
			if(max< notas[i]) {
				max = notas[i];
			}
			
		}
		
		return max;
	}
	
	/**
	 * 
	 * Metodo para calcular medias
	 * 
	 * @param notas array de notas del que queramos saber la minima nota
	 * @return Minima nota
	 */
	public static int minimaNota(int [] notas) {
		
		int min = notas[0];
		
		for(int i = 0; i < notas.length ; i++) {
			if(notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Nota fuera del rango permitido");
			}
			if(min> notas[i]) {
				min = notas[i];
			}
			
		}
		
		return min;
	}
	
	
	
}
