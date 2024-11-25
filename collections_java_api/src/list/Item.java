package list;

public class Item {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		nome = nome;
		preco = preco;
		quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	
	
}
