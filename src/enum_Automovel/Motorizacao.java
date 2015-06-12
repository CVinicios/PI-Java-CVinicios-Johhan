package enum_Automovel;

public enum Motorizacao
{
	M10(0),M12(1),M20(2);
	
	int indice;
	
	private Motorizacao(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
