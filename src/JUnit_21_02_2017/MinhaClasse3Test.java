package JUnit_21_02_2017;

import static org.junit.Assert.*;
import org.junit.Test;


public class MinhaClasse3Test 
{
	@Test
	public void tresInteirosEmQualquerOrdemSaoOrdenadosEmOrdemCrescente()
	{
	//Classe a ser testada
	MinhaClasse3 teste = new MinhaClasse3();
	//Testes
	// testar as 6 permutacoes possiveis
	int[] res = { 1, 2, 3 };
	int[] v1 = { 1, 2, 3 };
	int[] v2 = { 1, 3, 2 };
	int[] v3 = { 2, 1, 3 };
	int[] v4 = { 2, 3, 1 };
	int[] v5 = { 3, 1, 2 };
	int[] v6 = { 3, 2, 1 };
	// testar as 6 permutacoes possiveis
	assertArrayEquals("Entrada 1, 2, 3", teste.crescente(v1), res);
	assertArrayEquals("Entrada 1, 3, 2", teste.crescente(v2), res);
	assertArrayEquals("Entrada 2, 1, 3", teste.crescente(v3), res);
	assertArrayEquals("Entrada 2, 3, 1", teste.crescente(v4), res);
	assertArrayEquals("Entrada 3, 1, 2", teste.crescente(v5), res);
	assertArrayEquals("Entrada 3, 2, 1", teste.crescente(v6), res);
	}
}
