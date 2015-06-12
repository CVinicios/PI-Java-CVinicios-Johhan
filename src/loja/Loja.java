package loja;

import java.util.ArrayList;

import main.Interface;

import veiculos.Automovel;

public class Loja
{
	String endereco;
	String nome;
	ArrayList<Automovel> veiculos;
	//Construtor
	public Loja(String endereco, String nome)

	{
		this.endereco = endereco;
		this.nome = nome;
		veiculos = new ArrayList<Automovel>();
	}
	//Metodos da Loja
	public void AdicionarVeiculo()
	{
		System.out.println("Digite os dados do veiculo que quer adicionar");
		Automovel novo = new Automovel();
		veiculos.add(novo);
		System.out.println("Veiculo adicionado com sucesso");
		
	}
	public void RemoverVeiculo()
	{
		System.out.println("Digite os dados do veiculo que quer excluir");
		Automovel remove = new Automovel();
		
		for(Automovel a: veiculos)
		{
			if(remove.equals(a))
			{
				
				veiculos.remove(a);
				System.out.println("Veiculo removido com sucesso");
				return;
			}			
		}
		System.out.println("Veiculo nao foi encontrado");
	}
	public void PesquisarVeiculo()
	{
		System.out.println("Quais os dados que quer procurar em veiculos?");
		Automovel procura = new Automovel();
		ArrayList<Automovel> lista = new ArrayList<Automovel>();
		
		for(Automovel a: veiculos)
		{
			if(a.map.containsValue(procura.map.get("Veiculo")))
			{
				if(!lista.contains(a) && procura.map.get("Veiculo") == a.map.get("Veiculo") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Marca") == a.map.get("Marca") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Modelo") == a.map.get("Modelo") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Tipo") == a.map.get("Tipo") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Cor") == a.map.get("Cor") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Capacidade Tanque") == a.map.get("Capacidade Tanque") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Cilindrada") == a.map.get("Cilindrada") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Cambio") == a.map.get("Cambio") )
				{
					lista.add(a);
				}
				if(!lista.contains(a) && procura.map.get("Motorizacao") == a.map.get("Motorizacao") )
				{
					lista.add(a);
				}
			}
		}
	}
	public void BuscarVeiculo ()
	{
		System.out.println("Buscar veiculo pelo Chassi");
		String busca = Interface.askChassi();
		
		for(Automovel a: veiculos)
		{
			if(busca.equals(a.chassi))
			{
				System.out.println("Carro encontrado");
				System.out.println(a.toString());
				return;
			}
		}
		System.out.println("Carro nao encontrado");
		
	}
	public void ListarVeiculos()
	{
		for(Automovel a: veiculos)
		{
			System.out.println(a.toString());
		}
	}
}
