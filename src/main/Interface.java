package main;
import java.util.InputMismatchException;
import java.util.Scanner;

import enum_Automovel.*;


public class Interface 
{
	static Scanner input = new Scanner(System.in);
	
	
	public static Enum<Veiculo> askVeiculo() throws InputMismatchException
	{
		int escolha=-1;
		System.out.println("Moto(0) ou Carro?(1)");
		
		while(escolha < 0 || escolha > 1 )
		{
			System.out.println("Moto(0) ou Carro?(1)");
			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 1 )
			{
				for (Veiculo v: Veiculo.values())
				{
					if (v.getIndice() == escolha)
						return v;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Marca> askMarca() throws InputMismatchException
	{
		int escolha=-1;
		System.out.println("Honda(0),HYUNDAI(1),MITSUBISHI(2),COBRA(3),YAMAHA(4)");
		
		while(escolha < 0 || escolha > 4 )
		{
			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 4)
			{
				for (Marca m: Marca.values())
				{
					if (m.getIndice() == escolha)
						return m;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Tipo> askTipo() throws InputMismatchException
	{
		int escolha=-1;
		
		while(escolha < 0 || escolha > 3 )
		{
			System.out.println("HATCH(0),SEDAN(1),ESPORTIVA(2),CHOPPER(3)");

			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 3)
			{
				for (Tipo t: Tipo.values())
				{
					if (t.getIndice() == escolha)
						return t;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Modelo> askModelo() throws InputMismatchException
	{
		int escolha=-1;
		
		while(escolha < 0 || escolha > 5 )
		{
			System.out.println("CIVIC(0),HB20(1),GOL(2),CP150(3),CP350(4),CP600(5)");

			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 5)
			{
				for (Modelo m: Modelo.values())
				{
					if (m.getIndice() == escolha)
						return m;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Cor> askCor() throws InputMismatchException
	{
		int escolha=-1;
		
		while(escolha < 0 || escolha > 4 )
		{
			System.out.println("ROSA(0),VERMELHO(1),AZUL(2),AMARELO(3),PRETO(4)");

			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 4)
			{
				for (Cor c: Cor.values())
				{
					if (c.getIndice() == escolha)
						return c;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Cambio> askCambio() throws InputMismatchException
	{
		int escolha=-1;
		
		while(escolha < 0 || escolha > 2 )
		{
			System.out.println("AUTOMATICO(0),SEMI_AUTOMATICO(1),MANUAL(2)");

			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 2)
			{
				for (Cambio c: Cambio.values())
				{
					if (c.getIndice() == escolha)
						return c;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Capacidade_tanque> askCapTanque() throws InputMismatchException
	{
		int escolha=-1;
		
		while(escolha < 0 || escolha > 2 )
		{
			System.out.println("CV150(0), CV100(1), CV200(2)");

			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 2)
			{
				for (Capacidade_tanque ct: Capacidade_tanque.values())
				{
					if (ct.getIndice() == escolha)
						return ct;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Cilindrada> askCilindrada() throws InputMismatchException
	{
		int escolha=-1;
		
		while(escolha < 0 || escolha > 1 )
		{
			System.out.println("C125(0),C250(1)");

			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 1)
			{
				for (Cilindrada cl: Cilindrada.values())
				{
					if (cl.getIndice() == escolha)
						return cl;
				}
			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static Enum<Motorizacao> askMotorização() throws InputMismatchException
	{
		int escolha=-1;
		
		while(escolha < 0 || escolha > 1 )
		{
			System.out.println("C125(0),C250(1)");

			try
			{
				escolha = input.nextInt();
			}
			finally
			{
				
			}
			if(escolha >= 0 && escolha <= 1)
			{
				for (Motorizacao mt: Motorizacao.values())
				{
					if (mt.getIndice() == escolha)
						return mt;
				}
 			}
			System.out.println("Opção inválida");
		}
		return null;
	}
	public static String askChassi() throws InputMismatchException
	{
		String chassi = null;
		
		while(chassi ==null )
		{
			System.out.println("Digite o Chassi");

			try
			{
				chassi = input.next();
			}
			finally
			{
				
			}
			return chassi;
		}
		return null;
	}
	public static float askPreco() throws InputMismatchException
	{
		float preco =0;
		
		while(preco < 1 )
		{
			System.out.println("Digite o preço");

			try
			{
				preco = input.nextFloat();
			}
			finally
			{
				
			}
			return preco;
		}
		return preco;
	}
}
