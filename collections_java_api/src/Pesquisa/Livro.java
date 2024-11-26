package Pesquisa;

public class Livro {
		
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	// construtor (para quando criar o livro, passar os seguintes parametros)
	public Livro(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	@Override
	public String toString() {
		return "Livro {titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "}";
	}
	
	
	
	
}
