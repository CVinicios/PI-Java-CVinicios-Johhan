package enum_Automovel;

public enum Cilindrada
{
	C125(0),C250(1);
	
int indice;
	
	private Cilindrada(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
