package lojaDeTenis.model;

public class Meias extends Produto{

	public Meias(int id, int numero, float preco) {
		super(id, numero, preco, numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void visualizar() 
	{
		System.out.println("***********************************");
		System.out.println("Tipo: Meia");
		System.out.println("ID: " + getId());
		System.out.println("Tamanho: " + getNumero());
		System.out.println("Preço: " + getPreco());
	}

}
