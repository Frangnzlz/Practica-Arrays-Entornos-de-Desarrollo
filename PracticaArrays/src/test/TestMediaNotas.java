package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMediaNotas {
	static int [] arrayNumeroCorrectos;
	static int[] arrayNumeroMenores;
	static int[] arrayNumeroMayores;
	
	
	@BeforeAll
	static void setup() {
		arrayNumeroCorrectos = new int []{10,10,1,1};
		arrayNumeroMenores = new int[] {-5};
		arrayNumeroMayores = new int[] {15};
	}
	
	@Test
	void test() {
		float resultadoEsperado = 5.5f;
		float resultadoObtenido = MisArrays.mediaNotas(arrayNumeroCorrectos);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testNumeroMenor(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> MisArrays.mediaNotas(arrayNumeroMenores));
		
		String esperado = "Nota fuera del rango permitido";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testNumeroMayor(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> MisArrays.mediaNotas(arrayNumeroMayores));
		
		String esperado = "Nota fuera del rango permitido";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}

}
