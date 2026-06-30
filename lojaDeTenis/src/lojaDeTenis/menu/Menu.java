package lojaDeTenis.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import lojaDeTenis.controller.LojaController;
import lojaDeTenis.model.Meias;
import lojaDeTenis.model.Produto;
import lojaDeTenis.model.Tenis;

public class Menu {

	private static Scanner leia = new Scanner(System.in);
	private static LojaController controller = new LojaController();

	public static void main(String[] args) {

		int opcao;
		boolean finalizar = false;
		while (finalizar == false) {
			System.out.println("******************************************************");
			System.out.println("  \n 		LOJA DE TENIS NIKO						\n");
			System.out.println("******************************************************");
			System.out.println("  1 - Cadastrar Produto		     					  ");
			System.out.println("  2 - Listar todos os Produtos	 				  	  ");
			System.out.println("  3 - Listar Produtos pelo ID	 					  ");
			System.out.println("  4 - Atualizar Produto								  ");
			System.out.println("  5 - Deletar Produto			  					  ");
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

			switch (opcao) {

			case 1:
				try {
					
					System.out.println("Digite o tamanho:");
					int numero = leia.nextInt();
					leia.nextLine();

					System.out.println("Digite o preço:");
					String precoTexto = leia.nextLine();
					float preco = Float.parseFloat(precoTexto.replace(",", "."));

					System.out.println("Escolha o tipo: 1-Tênis  2-Meia");
					int tipoEscolhido = leia.nextInt();
					leia.nextLine();

					Produto produto;
					if (tipoEscolhido == 1) {
						produto = new Tenis(0, numero, preco);
					} else {
						produto = new Meias(0, numero, preco);
					}

					controller.cadastrar(produto);

				} catch (InputMismatchException e) {
					System.out.println("Erro: digite valores válidos.");
					leia.nextLine();
				}
				KeyPress();
				break;

			case 2:
				controller.listarTodas();
				KeyPress();
				break;

			case 3:
				try {
					System.out.println("Digite o ID do produto:");
					int id = leia.nextInt();
					leia.nextLine();
					controller.procurarPorId(id);
				} catch (InputMismatchException e) {
					System.out.println("ID inválido.");
					leia.nextLine();
				}
				KeyPress();
				break;

			case 4:
				try {

					System.out.println("Digite o ID do produto a atualizar:");
			        int id = leia.nextInt();
			        leia.nextLine();
			        
					System.out.println("Digite o novo tamanho:");
					int numero = leia.nextInt();
					leia.nextLine();

					System.out.println("Digite o preço:");
					String precoTexto = leia.nextLine();
					float preco = Float.parseFloat(precoTexto.replace(",", "."));

					System.out.println("Escolha o tipo: 1-Tênis  2-Meia");
					int tipoEscolhido = leia.nextInt();
					leia.nextLine();

					Produto produto;
					if (tipoEscolhido == 1) {
						produto = new Tenis(id, numero, preco);
					} else {
						produto = new Meias(id, numero, preco);
					}

					controller.atualizar(produto);

				} catch (InputMismatchException e) {
					System.out.println("Erro: digite valores válidos.");
					leia.nextLine();
				}
				KeyPress();
				break;

			case 5:
				try {
					System.out.println("Digite o ID do produto a deletar:");
					int id = leia.nextInt();
					leia.nextLine();
					controller.deletar(id);
				} catch (InputMismatchException e) {
					System.out.println("ID inválido.");
					leia.nextLine();
				}
				KeyPress();
				break;

			case 0:
				System.out.println("Sistema finalizado");
				finalizar = true;
				break;

			}
		}

	}

	public static void KeyPress() {
		System.out.println("\n\nPressione Enter para continuar...");
		leia.nextLine();
	}
}