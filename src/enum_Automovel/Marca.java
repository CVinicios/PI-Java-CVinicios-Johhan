package enum_Automovel;

public enum Marca
{
	HONDA(0),HYUNDAI(1),MITSUBISHI(2),COBRA(3),YAMAHA(4);
	
	
	int indice;
	private Marca(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
