
public class Iphone {
	
	public static void main(String[] args) {
		
		Navegador navegador = new Navegador();
		navegador.adicionarPagina();
		navegador.atualizarPagina();
		navegador.exibirPagina("https://open.spotify.com/intl-pt/artist/1pPmIToKXyGdsCF6LmqLmI");
		
		
		Telefone telefone = new Telefone();
		telefone.ligar(null);
		telefone.atender();
		telefone.iniciarCorreioVoz();
		
		ReprodutorMusical rm = new ReprodutorMusical();
		rm.selecionarMusica(null);
		rm.tocar();
		rm.pausar();		
	}

}
