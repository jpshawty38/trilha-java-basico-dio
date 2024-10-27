package lanchonete;


public class Cozinheiro {
	
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionar lanche no balcao");
	}
	
	public void adicionarSucoNoBaldcao() {
		System.out.println("Adicionar suco no balcao");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBaldcao();
	}
	
	public void prepararLanche() {
		System.out.println("Preparar Lanche");
	}
	
	public void prepararVitamina() {
		System.out.println("Preparar Vitamina");
	}
	
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	public void lavarIngredientes() {
		
	}
	
	public void selecionarIngredientesLanche() {
		
	}
	
	public void selecionarIngredientesVitamina() {
	}
	
	public void baterVitaminaLiquidificador() {
	}
	
	public void fritarIngredientesLanche() {
		
	}
	
	public void pedirTrocarGasAtendente(Atendente meuAmigo ) {
		
	}
	
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirIngredientes(Almoxarife meuAmigo) {
		meuAmigo.entregarIngredientes();
	}
}
