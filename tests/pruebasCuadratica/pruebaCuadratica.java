package pruebasCuadratica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import logica.Parcial;
import uniandes.dpoo.hamburguesas.mundo.Combo;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class pruebaCuadratica {
	private Prueba prueba1;
	private double a;
	private double b;
	private double c;
	
	
	
	@BeforeEach
	void setUp() {
		a = 1;
		b = 4;
		c = 4;
	}
	
	@AfterEach
	void tearDown() {
	}
	
	@Test
	void testGetNombre() {
		assertEquals("x=-2", prueba1.cuadratica(a, b, c), "El resultado no es el esperado");
	}
}
