package main;

import java.util.Scanner;

import loja.Loja;


public class Main 
{
	public static void main(String[] args) 
	{	
		Loja loja = new Loja("Mon Senhor","MFX Veiculos");
		Scanner input = new Scanner(System.in);
		int opcao = -1;
		
		do
		{
			System.out.println("Digite o numero correspondente a opção desejada");
			System.out.println("1 = Adicionar veiculo");
			System.out.println("2 = Remover veiculo");
			System.out.println("3 = Pesquisar veiculos");
			System.out.println("4 = Procurar veiculo por chassi");
			System.out.println("5 = Listar estoque");
			System.out.println("0 = Sair");
			
			opcao = input.nextInt();
			
			switch(opcao)
			{
				case 1:
					loja.AdicionarVeiculo();
					break;
				case 2:
					loja.RemoverVeiculo();
					break;
				case 3:
					loja.PesquisarVeiculo();
					break;
				case 4:
					loja.BuscarVeiculo();
					break;
				case 5:
					loja.ListarVeiculos();
					break;
				default:
					System.out.println("Saindo do sitema");
					break;
			}
				
		}while(opcao >0);
		
		input.close();
		
	}
}