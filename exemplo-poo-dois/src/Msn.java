
public class Msn {
	
	// valida a conexão, envia a mensagem e salva o historico
	public void enviarMensagem() {
		validarConectividadw();
		System.out.println("Enviar Mensagem");
		salvarHistorico();
	}

	
	public void receberMensagem() {
		System.out.println("Receber Mensagem");
	}
	
	private void validarConectividadw() {
		System.out.println("Conectado");
	}
	
	private void salvarHistorico() {
		System.out.println("Historico Salvo");
	}
}
