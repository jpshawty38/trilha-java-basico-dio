
public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", 44),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 45),
	PIAUI ("PI", "Piaui", 46),
	MARANHAO("MA", "Maranhao", 48),
	BAHIA ("BA", "Bahia", 49);
	
	// CRIANDO ATRIBUTOS
	private String nome;
	private String sigla;
	private int ibge;
	
	
	private EstadoBrasileiro(String nome, String sigla, int ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	
	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
	
	public int getIbge() {
		return ibge;
	}
	
	public String getNomeMaisculo() {
		return nome.toUpperCase();
	}
	
}
