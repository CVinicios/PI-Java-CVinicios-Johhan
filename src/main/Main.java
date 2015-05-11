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
			System.out.println("1 = Adicionar Carro");
			System.out.println("2 = Adicionar Moto");
			System.out.println("3 = Buscar Carro");
			System.out.println("4 = Buscar Moto");
			System.out.println("5 = Listar Carros");
			System.out.println("6 = Listar Motos");
			System.out.println("7 = Pesquisar Carro");
			System.out.println("8 = Pesquisar Moto");
			System.out.println("0 = EXIT");
			
			opcao = scan.nextInt();
			
		switch(opcao)
		{
		case 1:
			avc.adicionarCarro();break;
		case 2:
			avc.adicionarMoto();break;
		case 3:
			avc.buscarCarro();break;
		case 4:
			avc.buscarMotocicleta();break;
		case 5:
			avc.listarEstoquedeCarros();break;
		case 6:
			avc.listarEstoquedeMotos();break;
		case 7:
			avc.pesquisarCarro();break;
		case 8:
			avc.pesquisarMotos();break;
		default:
			System.out.println("Opção inválida. Escolha uma das opções listadas.");
			break;
		}
			
		} while (opcao!=0);
	}
}