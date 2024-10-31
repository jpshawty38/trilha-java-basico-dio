
public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("54184515");
		
		Moto kawasaki500 = new Moto();
		kawasaki500.setChassi("16232326");
	
		Veiculo coringa = kawasaki500;
		coringa.ligar();
	
	}
	

}
