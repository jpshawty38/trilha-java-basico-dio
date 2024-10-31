// EXTENDS - HERANÇA 
 
public class Carro extends Veiculo{
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro Ligado");
	}
	

	// ENCAPSULAMENTO (ESCONDER METODO)
	private void confereCambio() {
		System.out.println("Conferindo Cambio");
	}

	private void confereCombustivel() {
		System.out.println("Conferindo Combustivel");
	}

}
