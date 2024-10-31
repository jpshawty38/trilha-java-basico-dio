package Apps;

public class Telegram extends ServicoMensagem{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("Enviando Mensagem pelo Facebook");
		
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo Mensagem pelo Facebook");

	}

	@Override
	public void salvarHistorico() {
		// TODO Auto-generated method stub
		
	}

}
