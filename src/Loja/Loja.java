package Loja;

import java.util.ArrayList;

import veiculos.*;
import enum_Automovel.Veiculo;

public class Loja
{
	String endereço;
	String nome;
	ArrayList<Carro> carros;
	ArrayList<Moto> motos;
	
	public void adicionarVeiculo(Veiculo tipo_Veiculo)
	{
		
	}
	public void removerVeiculo(Veiculo tipo_Veiculo, String chassi)
	{
		
	}
	public ArrayList<Automovel> pesquisarVeiculo(Veiculo tipo_Veiculo)
	{
		ArrayList<Automovel> retorno = new ArrayList<Automovel>();
		
		
		return retorno;
	}
	public Automovel buscarAutomovel (Veiculo tipo_Veiculo, String chassi)
	{
		if(tipo_Veiculo == Veiculo.CARRO)
		{
			for(Carro elemento: carros)
			{
				if(elemento.chassi == chassi)
					System.out.println(elemento.toString());
					return (Automovel)elemento;
			}
		}else
		{
			for(Moto elemento: motos)
			{
				if(elemento.chassi == chassi)
					System.out.println(elemento.toString());
					return (Automovel)elemento;
			}
		}
		System.out.println("O veiculo não foi encontrado");
		return null;
	}
	public ArrayList<Automovel> listarAutomovel(Veiculo tipo_Veiculo)
	{
		ArrayList<Automovel> retorno = new ArrayList<Automovel>();
		if(tipo_Veiculo == Veiculo.CARRO)
		{
			for(Carro elemento: carros)
			{
				System.out.println(elemento);
			}
		}else
		{
			for(Moto elemento: motos)
			{
				System.out.println(elemento);
			}
		}
		
		
		return retorno;
	}
}
