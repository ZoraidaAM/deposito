import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DepositoCombustibleTest {
	 DepositoCombustible tank;
	 
	@Before
	public void Inicio() {
		tank=new DepositoCombustible(40,0);
	}
	
	@After
	public void Final() {
		tank=null;
	}
	 
//Obtener el nivel de dep�sito.
	@Test
	public void testNivel() {
		assertEquals(0.0,tank.getDepositoNivel(),0);
	}
	
//Obtener el valor m�ximo del dep�sito.
	@Test
	public void testNivelMax() {
		assertEquals(40,tank.getDepositoMax(),0);
	}
	
//Obtener si el dep�sito est� vacio.
	@Test
	public void testVacio() {
		assertTrue(tank.estaVacio());
	}
	
//Obtener si el dep�sito est� lleno por la mitad.	
	@Test
	public void testMitad() {
		assertEquals(20,tank.getDepositoMax()/2,0);
	}

	
}
