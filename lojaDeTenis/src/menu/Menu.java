package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao;
		boolean finalizar = false;

		while (finalizar == false) {

			System.out.println("******************************************************");
			System.out.println("  \n 		LOJA DE TENIS NIKO						\n");
			System.out.println("******************************************************");
			System.out.println("******************************************************");
			System.out.println("								 				   	  ");
			System.out.println("  1 - Cadastrar Produto		     					  ");
			System.out.println("  2 - Listar todos os Produtos	 				  	  ");
			System.out.println("  3 - Listar Produtos pelo ID	 					  ");
			System.out.println("  4 - Atualizar Produto								  ");
			System.out.println("  5 - Deletar Produto			  					  ");
			System.out.println("  								  					  ");
			System.out.println("  0 - Sair						 					  ");
			System.out.println("******************************************************");
			System.out.println("Entre com a opção desejada:		  					  ");

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				opcao = -1;
				System.out.println("Digite um número inteiro entre 0 e 8");
				leia.nextLine();
			}
			
			switch (opcao){
				
			case 1:
				System.out.println("Cadastrar");
				break;
				
			case 2:
				System.out.println("Listar Todos");
				break;
				
			case 3:
				System.out.println("Listar prod");
				break;
				
			case 4:
				System.out.println("Atualizar");
				break;
				
			case 5:
				System.out.println("Deletar");
				break;
				
			case 0:
				System.out.println("Sair");
				break;
				
			}
		}

	}
}
