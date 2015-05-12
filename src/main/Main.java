package main;

import java.util.Scanner;

import loja.Loja;


public class Main 
{
	public static void main(String[] args) 
	{	
		Loja avc = new Loja();
		int opcao;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite o numero correspondente a opção desejada");
			System.out.println("1 = Adicionar Veiculo");
			System.out.println("2 = Remover Veiculo");
			System.out.println("3 = Pesquisar Veiculo");
			System.out.println("4 = Buscar Veiculo");
			System.out.println("5 = Listar Veiculos");
			System.out.println("0 = EXIT");
			
			opcao = scan.nextInt();
			
		switch(opcao)
		{
			case 1:
				avc.AdicionarVeiculo();
				break;
			case 2:
				avc.RemoverVeiculo();
				break;
			case 3:
				avc.PesquisarVeiculo();
				break;
			case 4:
				avc.BuscarAutomovel();
				break;
			case 5:
				avc.ListarAutomovel();
				break;
			default:
				System.out.println("Opção inválida. Escolha uma das opções listadas.");
				break;
		}
			
		} while (opcao!=0);
	}
}