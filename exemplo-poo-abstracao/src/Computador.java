
public class Computador {
	
	public static void main(String[] args) {
		
		// Abrindo o msn
		MsnMessenger msn = new MsnMessenger();
		
		msn.enviarMensagem();
		msn.receberMensagem();
		
		Facebook fcb = new Facebook();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}
