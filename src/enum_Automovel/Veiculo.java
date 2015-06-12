package enum_Automovel;

public enum Veiculo
{
	CARRO(0),MOTO(1);
	
	int indice;
	
	private Veiculo(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
