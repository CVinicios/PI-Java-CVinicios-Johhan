package enum_Automovel;

public enum Capacidade_tanque
{
	CV150(0), CV100(1), CV200(2);
	
	int indice;
	
	private Capacidade_tanque(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
