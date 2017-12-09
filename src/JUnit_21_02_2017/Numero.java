package JUnit_21_02_2017;

public class Numero 
{	
	 private int numeros[];
    
    /*public Numero(int posi)
    {
      numeros = new int[posi];
      getSorteio();
      ordenarSorteados();
      dezenaRepetida();  
    }*/
    
    public Numero(int[] n)
    {
    	this.numeros = n;
    }
    
    public int[] vetorordenado()
    {
    	return numeros;
    }
	
	//Sorteia os números da mega-sena
	 public void getSorteio()
	{
      for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] = (int) (Math.random() * 60 + 1);  
		}
	}
   
   public void ordenarSorteados()
   {
      for(int i = numeros.length - 1;i > 0; i--)
      {
         for(int j = 0;j <= i - 1;j++)
         {
            if(numeros[j] > numeros[j + 1])
            {
               int aux = numeros[j + 1];
               numeros[j + 1] = numeros[j];
               numeros[j] = aux;
            }
         }
      }
   }  
   
   //Retira as dezenas repetidas
   public void dezenaRepetida()
   {
      int i = numeros.length - 1;
      int j = 0;
      
         while(i > 0)
         {
            while(j <= i - 1)
            {
               if(numeros[j] == numeros[j + 1])
               {
                  numeros[j] = (int) (Math.random() * 60 + 1);
               }
            j++;
            }
         i--;   
         }
      ordenarSorteados();      
   }
   	
	//Mostra as dezenas sorteadas 
	public String verResultado()
	{
		String saida = "";
		
		for(int i = 0; i < numeros.length; i++)
		{
			if(i != (numeros.length - 1))
         {
            saida = saida + numeros[i] + " ,";
         }else
         {
            saida = saida + numeros[i];   
         }   
		}
		
		return saida;
	}
}