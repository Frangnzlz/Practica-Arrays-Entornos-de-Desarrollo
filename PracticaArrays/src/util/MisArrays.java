package util;



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
	
	
	
}
