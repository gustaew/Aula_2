package JUnit_21_02_2017;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MinhaClasse2Test {

	MinhaClasse2 teste;
	@Before
	public void setUp()
	{
		//Classe a ser testada
		teste = new MinhaClasse2();
	}
	
	@Test
	public void divisaoDeUmInteiroPorUmDeveRetornarOInteiro()
	{
		//Testes
		assertEquals("10 / 1 deve ser 10", teste.divide(10, 1), 10);
		assertEquals("0 / 1 deve ser 0", teste.divide(0, 1), 0);
		assertEquals("1 / 1 deve ser 1", teste.divide(1, 1), 1);
		
		// 500 testes
		for(int i = 1; i <= 500; i++)
		{
			assertEquals(i + " / 1 deve ser " + i,teste.divide(i, 1),i);
		}
	}
	
	@Test(expected = ArithmeticException.class)
	public void dividePorZeroDarErro()
	{
		//Teste de Exceção
		assertEquals("10 / 0 deve dar ArithmeticException", teste.divide(10, 0));
		for(int i = 1; i <= 500; i++)
		{
			assertEquals( i + " / 0 deve ser o erro ArithmeticException",teste.divide(i, 0));
		}
	}
}