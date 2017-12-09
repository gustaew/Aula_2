package JUnit_21_02_2017;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumeroTest 
{

	Numero n;
	@Before
	public void setUp()
	{
		int[] numeros = {18, 34, 59, 60, 5, 6, 56};
		n = new Numero(numeros);
		n.ordenarSorteados();
	}
	
	@Test
	public void test() 
	{
		int[] res = {5, 6, 18, 34, 56, 59, 60};
		assertArrayEquals("",n.vetorordenado(),res);
	}
}