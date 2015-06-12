package enum_Automovel;

public enum Tipo
{
	HATCH(0),SEDAN(1),ESPORTIVA(2),CHOPPER(3);
	
	int indice;
	private Tipo(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
