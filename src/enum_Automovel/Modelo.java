package enum_Automovel;

public enum Modelo
{
	CIVIC(0),HB20(1),GOL(2),CP150(3),CP350(4),CP600(5);
	
	int indice;
	
	private Modelo(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
