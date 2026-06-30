package lojaDeTenis.model;

public abstract class Produto {

	private int id;

	private int numero;
	private float preco;


	public Produto(int tipo, int numero, float preco, int id) {
		super();
		this.numero = numero;
		this.preco = preco;
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void visualizar();

}
