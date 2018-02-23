import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class ParametrizadoDepositoCombustible {
	
	double nivelinicial;
	double nivelmaximo;
	double cantidad;
	double resultadoLlenar;
	double resultadoConsumir;
	
	public ParametrizadoDepositoCombustible(double nivel, double capacidad, double cantidadVariacion, double result1, double result2) {
		nivelinicial = nivel;
		nivelmaximo = capacidad;
		cantidad = cantidadVariacion; 
		resultadoConsumir = result1;
		resultadoLlenar = result2;
		}	
	
	@Parameters
	public static Collection<Object[]> numeros(){
	return Arrays.asList (new Object[][]{ 
	{20,120,20,0,40},
	{120,120,20,100,140},
	{0,60,0,0,0},
	{100,100,80,20,180},
	{100,120,20,80,120}
	});}
	
	@Test
	public void testParemetrosConsumir() {
	DepositoCombustible tank = new DepositoCombustible(nivelinicial,nivelmaximo);
	tank.consumir(cantidad);
	assertEquals(resultadoConsumir,tank.getDepositoNivel(),0);
	}	
	
	@Test
	public void testParemetrosLlenar() {
	DepositoCombustible tank = new DepositoCombustible(nivelinicial,nivelmaximo);
	tank.fill(cantidad);
	assertEquals(resultadoLlenar,tank.getDepositoNivel(),0);
	}
	
}
