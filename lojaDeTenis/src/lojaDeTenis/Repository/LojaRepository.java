package lojaDeTenis.Repository;

import lojaDeTenis.model.Produto;

public interface LojaRepository {

	//CRUD
	public void listarTodas();
	public void procurarPorId(int id);
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int id);
}
