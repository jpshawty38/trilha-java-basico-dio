
public class SistemaIbge {

	public static void main(String[] args) {
		
		// IMPRIMIR LISTA DOS ESTADOS
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			// System.out.println(e.getSigla() + " - " + e.getNome());
		}
		
		// BUSCAR CADA ESTADO
		EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
		
		System.out.println(eb.getNome());
		System.out.println(eb.getNomeMaisculo());
		System.out.println(eb.getSigla());
		System.out.println(eb.getIbge());


		
		
		
	}
}
