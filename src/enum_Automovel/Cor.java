package enum_Automovel;

public enum Cor
{
	ROSA(0),VERMELHO(1),AZUL(2),AMARELO(3),PRETO(4);
	
int indice;
	
	private Cor(int i)
	{
		indice = i;
	}
	
	
	public int getIndice()
	{
		return indice;
	}
}
