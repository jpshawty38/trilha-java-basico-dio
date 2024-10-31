package Apps;

public class Facebook extends ServicoMensagem {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Facebokk");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarHistorico() {
		// TODO Auto-generated method stub
		
	}

}
