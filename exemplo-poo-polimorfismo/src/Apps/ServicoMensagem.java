package Apps;

public abstract class  ServicoMensagem {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	// METODOS GENERICOS QUE SERA ESPECIFICADO EM CADA CLASSE
	// CADA CLASSE DEFINIRA COMO SERA SEU METODO, VERIFICAÇÃO 
	// CADA CLASSE FARÁ DE UMA MANEIRA DIFERENTE
	

	// METODO QUE AS CLASSES FILHO DEVERÃO IMPLEMENTAR
	public abstract void salvarHistorico();
	
	// SOMENTE OS FILHOS CONHECEM O METODO
	protected void validarConectadoInternet() {
		System.out.println("Validando se esta conecetado a internet");
		
	}

}
