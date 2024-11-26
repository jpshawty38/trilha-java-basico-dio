package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> LivrosList;

	public CatalogoLivros() {
		this.LivrosList = new ArrayList<Livro>();

	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		LivrosList.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<Livro>();
		if (!LivrosList.isEmpty()) {
			for (Livro l : LivrosList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!LivrosList.isEmpty()){
			for(Livro l : LivrosList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal);
				livrosPorIntervaloAnos.add(l);
			}
		}
		return livrosPorIntervaloAnos;
		
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!LivrosList.isEmpty()) {
			for(Livro l: LivrosList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

}
