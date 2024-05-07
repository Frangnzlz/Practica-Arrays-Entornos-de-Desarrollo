package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestMedianaNotas {

	static int [] arrayNumerosImpar;
	static int[] arrayNumerosPar;
	static int[] arrayNumeroMenores;
	static int[] arrayNumeroMayores;
	
	
	@BeforeAll
	static void setup() {
		arrayNumerosPar = new int []{10,1,5,6};
		arrayNumerosImpar = new int [] {10,5,6,2,10};
		arrayNumeroMenores = new int[] {-5};
		arrayNumeroMayores = new int[] {15};
	}
	
	@Test
	void testPar() {
		float resultadoEsperado = 5.5f;
		float resultadoObtenido = MisArrays.medianaNotas(arrayNumerosPar);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	void testImpar() {
		float resultadoEsperado = 6f;
		float resultadoObtenido = MisArrays.medianaNotas(arrayNumerosImpar);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testNumeroMenor(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> MisArrays.medianaNotas(arrayNumeroMenores));
		
		String esperado = "Nota fuera del rango permitido";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testNumeroMayor(){
		Exception  excepcion = assertThrows(IllegalArgumentException.class,
				() -> MisArrays.medianaNotas(arrayNumeroMayores));
		
		String esperado = "Nota fuera del rango permitido";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado,obtenido);
	}

}
