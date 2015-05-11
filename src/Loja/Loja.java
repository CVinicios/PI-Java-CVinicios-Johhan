package loja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import veiculos.Automovel;
import veiculos.Carro;
import veiculos.Moto;
import enum_Automovel.Cambio;
import enum_Automovel.Cor;
import enum_Automovel.Marca;
import enum_Automovel.Modelo;
import enum_Automovel.Motorizacao;
import enum_Automovel.Tipo;
import enum_Automovel.Veiculo;

public class Loja
{
	String endereço;
	String nome;
	ArrayList<Carro> carros;
	ArrayList<Moto> motos;
	
	public void adicionarVeiculo(Veiculo tipo_Veiculo)
	{
		Veiculo _carroOuMoto = null;
		Cambio _cambio = null;
		Cor _cor = null;
		Modelo _modelo=null;
		Marca _montadora = null;
		Tipo _tipo = null;
		Motorizacao _motorizacao = null; 
		String _chassi = "";
		float _preco = 0;
		boolean loop = false;
		
		Scanner scan = new Scanner(System.in);
		
		
		while(!loop)
		{
			try{
				System.out.println("Deseja adicionar Moto(0) ou Carro?(1)");
				_carroOuMoto = Veiculo.values()[scan.nextInt()];
				loop=true;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Erro, favor digitar 0 ou 1");
			}
		}loop=false;
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao modelo: (0)CIVIC, (1)S2000, (2)GOL");
				_modelo = Modelo.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente ao cambio:AUTOMÁTICO(0), SEMI_AUTOMÁTICO(1), MANUAL(2)");
				_cambio = Cambio.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente à cor: PRETO(3), BRANCO(4), PRATA(5)");
				_cor = Cores.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero correspondente à montadora: WOLKSWAG(0), FIAT(1), CHEVROLET(2), HONDA(3)");
				_montadora = Montadoras.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero do tipo: SEDAN(0), HATCH(1), ESPORTIVO(2)");
				_tipo = Tipos.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		while(!loop)
		{
			try{
				System.out.println("Digite numero do motor: M10(0), M12(1), M14(2), M16(3), M18(4), M20(5), M22(6)");
				_motorizacao = Motorizacao.values()[scan.nextInt()];
				loop = true;}
			catch(ArrayIndexOutOfBoundsException aiobe){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		System.out.println("Digite o chassi");
		_chassi = scan.next();
		
		while(!loop)
		{
			try{
				System.out.println("Digite o preço do carro");
				_preco = scan.nextFloat();
				loop = true;}
			catch(InputMismatchException ime){
				System.out.println("Erro, favor digitar un dos numeros especificados");
			}
		}loop = false;
		
		
		Carro aux = new Carro(_chassi, _preco, _montadora, _modelo, _motorizacao, _cambio, _tipo, _cor);
		estoqueCarros.add(aux);
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
