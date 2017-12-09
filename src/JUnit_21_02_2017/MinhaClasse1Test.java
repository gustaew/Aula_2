package JUnit_21_02_2017;

import static org.junit.Assert.*;
import org.junit.Test;

public class MinhaClasse1Test 
{
	@Test
	public void multiplicacaoDeUmInteiroPorZeroDeveRetornarZero()
	{
		//Classe a ser testada
		MinhaClasse1 teste = new MinhaClasse1();
		
		//Testes
		assertEquals("10 X 0 deve ser 0",teste.multiplica(10, 0),0);
		assertEquals("0 X 10 deve ser 0", teste.multiplica(0, 10), 0);
		assertEquals("0 X 0 deve ser 0", teste.multiplica(0, 0), 0);
		
		//500 testes
		for(int i = 0; i <= 500; i++)
		{
			assertEquals(i + " X 0 deve ser 0", teste.multiplica(i, 0),0);
		}		
	}
}