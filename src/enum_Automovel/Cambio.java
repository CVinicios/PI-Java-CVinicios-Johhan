package enum_Automovel;

public enum Cambio
{
	AUTOMATICO(0),SEMI_AUTOMATICO(1),MANUAL(2);
	
	int indice;
	
	private Cambio(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
