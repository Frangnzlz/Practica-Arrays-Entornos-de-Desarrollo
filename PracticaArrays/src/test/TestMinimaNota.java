package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMinimaNota {


	static int [] arrayNumeroCorrectos;
	static int[] arrayNumeroMenores;
	static int[] arrayNumeroMayores;
	
	
	@BeforeAll
	static void setup() {
		arrayNumeroCorrectos = new int []{8,0,1,1,3,10,6,2};
		arrayNumeroMenores = new int[] {-5};
		arrayNumeroMayores = new int[] {15};
	}
	
	@Test
	void test() {
		int resultadoEsperado = 0;
		int resultadoObtenido = MisArrays.minimaNota(arrayNumeroCorrectos);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testNumeroMenor(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> MisArrays.minimaNota(arrayNumeroMenores));
		
		String esperado = "Nota fuera del rango permitido";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testNumeroMayor(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> MisArrays.minimaNota(arrayNumeroMayores));
		
		String esperado = "Nota fuera del rango permitido";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
}
