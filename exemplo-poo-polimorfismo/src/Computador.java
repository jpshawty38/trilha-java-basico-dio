import Apps.Facebook;
import Apps.MsnMessenger;
import Apps.ServicoMensagem;
import Apps.Telegram;

public class Computador {
	
	public static void main(String[] args) {
		
		ServicoMensagem sm = null;
		
		/*
		  	NAO SE SABE QUAL APP
		  	MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGEM
		*/
		
		String appEscolhido = "msn";
		
		if (appEscolhido.equals("msn")) {
			sm = new MsnMessenger();
		} 
		
		else if (appEscolhido.equals("fcb")) {
			sm = new Facebook();
		}
		
		else if (appEscolhido.equals("tlg")){
			sm = new Telegram();
		

			sm.enviarMensagem();
			sm.receberMensagem();
		}
		
	}

}
