package lojaDeTenis.controller;

import java.util.ArrayList;
import java.util.List;

import lojaDeTenis.Repository.LojaRepository;
import lojaDeTenis.model.Produto;

public class LojaController implements LojaRepository {
	private int proximoId = 1;
	private List<Produto> produtos = new ArrayList<>();

	@Override
	public void listarTodas() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado");
			return;
		}
		for (Produto p : produtos) {
			p.visualizar();

		}

	}

	@Override
	public void procurarPorId(int id) {
		for (Produto p : produtos) {
			if (p.getId() == id) {
				p.visualizar();
				return;
			}
		}
		System.out.println("Produto não encontrado.");

	}

	@Override
	public void cadastrar(Produto produto) {
		produto.setId(proximoId);
	    proximoId++;
		produtos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == produto.getId()) {
				produtos.set(i, produto);
				System.out.println("Produto atualizado com sucesso!");
				return;
			}
		}
		System.out.println("Produto não encontrado.");

	}

	@Override
	public void deletar(int id) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				produtos.remove(i);
				System.out.println("Produto deletado com sucesso!");
				return;
			}
		}
		System.out.println("Produto não encontrado.");

	}

}
