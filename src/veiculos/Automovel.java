package veiculos;

import java.util.HashMap;
import java.util.InputMismatchException;

import enum_Automovel.Motorizacao;
import enum_Automovel.Veiculo;

import main.Interface;

public class Automovel
{
	public HashMap<String, Enum> map;
	public float preco;
	public String chassi;
	
	public Automovel()
	{
		map = new HashMap<String, Enum>();
		try
		{
			map.put("Veiculo", Interface.askVeiculo());
			map.put("Marca", Interface.askMarca());
			map.put("Modelo", Interface.askModelo());
			map.put("Tipo", Interface.askTipo());
			map.put("Cor", Interface.askCor());
			if(map.containsValue(Veiculo.MOTO))
			{
				map.put("Capacidade Tanque", Interface.askCapTanque());
				map.put("Cilindrada", Interface.askCilindrada());
			}else if(map.containsValue(Veiculo.CARRO))
			{
				map.put("Cambio", Interface.askCambio());
				map.put("Motorizacao", Interface.askMotorização());
			}
			chassi = Interface.askChassi();
			preco = Interface.askPreco();
		}catch(InputMismatchException inputMismatchException)
		{
			System.out.println("Erro: Operação cancelada");
		}
		
	}
	public HashMap<String, Enum> getMapa()
	{
		return map;
	}
	


	@Override
	public String toString()
	{
		return "Automovel [Especificações :=" + map.values() + ", preco=" + preco + ", chassi="
				+ chassi + "]";
	}




	@Override
	public boolean equals(Object obj)
	{
		
		if(obj == this)
			return true;
		if(obj instanceof Automovel)
		{
			Automovel other = (Automovel)obj;
			if(this.getMapa().equals(other.getMapa()) && other.preco == this.preco && other.chassi.equals(this.chassi))
				return true;
		}
		return false;
	}


}
