package loja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import veiculos.Automovel;
import veiculos.Carro;
import veiculos.Moto;
import enum_Automovel.Cambio;
import enum_Automovel.Capacidade_tanque;
import enum_Automovel.Cilindrada;
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
	ArrayList<Carro> carros = new ArrayList<Carro>();;
	ArrayList<Moto> motos = new ArrayList<Moto>();;
	Scanner scan = new Scanner(System.in);
	
	
	public void AdicionarVeiculo()
	{
		Veiculo carroOuMoto = null;
		Cambio cambio = null;
		Cor cor = null;
		Modelo modelo=null;
		Marca montadora = null;
		Tipo tipo = null;
		Motorizacao motorizacao = null; 
		Cilindrada cilindrada=null;
		Capacidade_tanque cpTanque=null;
		String chassi = "";
		float preco = 0;
		boolean loop = false;
				
		
		while(!loop)
		{
			try
			{
				System.out.println("Deseja adicionar (0)Carro ou Moto(1)?");
				carroOuMoto = Veiculo.values()[scan.nextInt()];
				loop=true;
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Erro, favor digitar 0 ou 1");
			}
		}loop=false;
		
		while(!loop)
		{
			if(carroOuMoto == Veiculo.CARRO)
			{
				try
				{
					System.out.println("Digite numero correspondente ao modelo: (0)CIVIC (1)HB20 (2)GOL");
					modelo = Modelo.values()[scan.nextInt()];
					loop = true;
				}catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 0, 1 ou 2");
				}
			}
			else
			{
				System.out.println("Digite numero correspondente ao modelo: (3)CP150 (4)CP300 (5)CP600");
				modelo = Modelo.values()[scan.nextInt()];
				loop = true;
			}
		}loop = false;
		
		if(carroOuMoto == Veiculo.CARRO)
		{
			while(!loop)
			{
				try
				{
					System.out.println("Digite numero correspondente ao cambio:(0)AUTOMATICO (1)SEMI-AUTOMÀTICO (2)MANUAL");
					cambio = Cambio.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 0, 1 ou 2");
				}
			}loop = false;
		}
		
		while(!loop)
		{
			try
			{
				System.out.println("Digite numero correspondente à cor: (0)ROSA (1)VERMELHO (2)AZUL (3)AMARELO (4)PRETO");
				cor = Cor.values()[scan.nextInt()];
				loop = true;
			}
			catch(ArrayIndexOutOfBoundsException aiobe)
			{
				System.out.println("Erro, favor digitar 0, 1, 2, 3 ou 4");
			}
		}loop = false;
		
		while(!loop)
		{
			if(carroOuMoto == Veiculo.CARRO)
			{
				try
				{
					System.out.println("Digite numero correspondente à montadora: (0)HONDA, (1)HYUNDAI, (2)MITSUBISHI");
					montadora = Marca.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 0, 1 ou 2");
				}
			}else
			{
				try
				{
					System.out.println("Digite numero correspondente à montadora: (4)COBRA, (5)YAMAHA");
					montadora = Marca.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 5 ou 6");
				}
			}
		}loop = false;
		
		while(!loop)
		{
			if(carroOuMoto == Veiculo.CARRO)
			{
				try
				{
					System.out.println("Digite numero do tipo: SEDAN(0), HATCH(1)");
					tipo = Tipo.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 0 ou 1");
				}
			}
			else
			{
				try
				{
					System.out.println("Digite numero do tipo: (2)ESPORTIVA (3)CHOPPER");
					tipo = Tipo.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro,favor digitar 2 ou 3");
				}
			}
		}loop = false;
		
		if(carroOuMoto == Veiculo.CARRO)
		{
			while(!loop)
			{
				try
				{
					System.out.println("Digite numero do motor: (0)1.0 (1)1.4 (2)2.0");
					motorizacao = Motorizacao.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 0, 1 ou 2");
				}
			}loop = false;
		} 
		if(carroOuMoto == Veiculo.MOTO)
		{
			while(!loop)
			{
				try
				{
					System.out.println("Digite numero do motor: (0)C125 (1)C250");
					cilindrada = Cilindrada.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 0 ou 1");
				}
			}loop = false;
			
			
			while(!loop)
			{
				try
				{
					System.out.println("Digite a capacidade do tanque do motor: (0)CV150, (1)CV100, (2)CV200;");
					cpTanque = Capacidade_tanque.values()[scan.nextInt()];
					loop = true;
				}
				catch(ArrayIndexOutOfBoundsException aiobe)
				{
					System.out.println("Erro, favor digitar 0, 1 ou 2");
				}
			}loop = false;
		}
		
		System.out.println("Digite o chassi");
		chassi = scan.next();
		
		while(!loop)
		{
			try
			{
				System.out.println("Digite o preço do Veiculo");
				preco = scan.nextFloat();
				loop = true;
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Erro, favor digitar um valor inteiro");
			}
		}loop = false;
		
		if(carroOuMoto == Veiculo.CARRO)
		{

			Carro aux = new Carro(chassi, preco, montadora, modelo, motorizacao, cambio, tipo, cor);
			carros.add(aux);
		}else
		{
			Moto aux = new Moto(chassi, preco, montadora, modelo, cilindrada, cpTanque, tipo, cor);
			motos.add(aux);
		}
		
	}
	public void RemoverVeiculo()
	{
		Veiculo carroOuMoto=null;
		String  chassi = "";
		int carroFound =-1;
		while(carroOuMoto == null)
		{
			try{
				System.out.println("Deseja remover um (0)Carro ou (1)Moto?");
				carroOuMoto = Veiculo.values()[scan.nextInt()];
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Erro, favor digitar 0 ou 1");
			}

		}
		System.out.println("Digite o chassi do veiculo");
		chassi = scan.next();
		
		if(carroOuMoto == Veiculo.CARRO)
		{
			for(Carro elemento: carros)
			{
				if(elemento.chassi == chassi)
				{
					elemento=null;
					carroFound++;
				}
			}
		}else
		{
			for(Moto elemento: motos)
			{
				if(elemento.chassi == chassi)
				{
					elemento=null;
					carroFound++;
				}
			}
		}
		
		if(carroFound==-1)
			System.out.println("O veiculo não foi encontrado");
		else
			System.out.println("Veiculo excluido com sucesso");
	}
	public ArrayList<Automovel> PesquisarVeiculo()
	{
		ArrayList<Automovel> retorno = new ArrayList<Automovel>();
		
		
		return retorno;
	}
	public void BuscarAutomovel ()
	{
		Veiculo carroOuMoto=null;
		String  chassi = "";
		int carroFound =-1;
		while(carroOuMoto == null)
		{
			try{
				System.out.println("Deseja buscar um (0)Carro ou (1)Moto?");
				carroOuMoto = Veiculo.values()[scan.nextInt()];
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Erro, favor digitar 0 ou 1");
			}

		}
		System.out.println("Digite o chassi do veiculo");
		chassi = scan.next();
		
		if(carroOuMoto == Veiculo.CARRO)
		{
			for(Carro elemento: carros)
			{
				if(elemento.chassi == chassi)
				{
					System.out.println(elemento.toString());
					carroFound++;
				}
			}
		}else
		{
			for(Moto elemento: motos)
			{
				if(elemento.chassi == chassi)
				{
					System.out.println(elemento.toString());
					carroFound++;
				}
			}
		}
		if(carroFound==-1)
		System.out.println("O veiculo não foi encontrado");
	}
	public void ListarAutomovel()
	{
		Veiculo carroOuMoto=null;
		
		
		while(carroOuMoto == null)
		{
			try{
				System.out.println("Deseja listar (0)Carros ou (1)Motos?");
				carroOuMoto = Veiculo.values()[scan.nextInt()];
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Erro, favor digitar 0 ou 1");
			}

		}
		
		
		if(carroOuMoto == Veiculo.CARRO)
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
		
		

	}
}
