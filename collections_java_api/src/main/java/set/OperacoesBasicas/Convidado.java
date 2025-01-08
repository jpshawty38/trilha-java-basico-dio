package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	
	//atributos principais
	private String nome;
	private int codigoConvite;
	
	// metodo construtor
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true; // Verifica se os objetos são o mesmo
	    if (!(o instanceof Convidado convidado)) return false; // Verifica se o objeto é uma instância de Convidado
	    return getCodigoConvite() == convidado.getCodigoConvite(); // Compara o código do convite
	}

	public int hashCode() {
		return Objects.hash(getCodigoConvite());
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	} 
	
	
	
	

}
