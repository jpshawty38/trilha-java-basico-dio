
public class ServicoMensagem {
	// valida a conexão, envia a mensagem e
	public void enviarMensagem() {
		validarConectividadw();
		System.out.println("Enviar Mensagem");
		 // salva o historico
		salvarHistorico();
	}

	
	public void receberMensagem() {
		System.out.println("Receber Mensagem");
	}
	
	// METODOS PRIVADOS, VISIVEIS SOMENTE NA CLASSE
	
	private void validarConectividadw() {
		System.out.println("Conectado");
	}
	
	private void salvarHistorico() {
		System.out.println("Historico Salvo");
	}
	

}
