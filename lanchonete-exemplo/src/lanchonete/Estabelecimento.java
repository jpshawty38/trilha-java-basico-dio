package lanchonete;

public class Estabelecimento {
	
	public static void main(String[] args) {
		
		Cozinheiro cozinheiro = new Cozinheiro();
		// ACOES QUE NAO PRECISA ESTAR DISPONIVEL PARA TODA APLICAÇÃO
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararLanche();
		
		// ACOES QUE O ESTABELECIMENTO PRECISA TER CIENCIA
		cozinheiro.adicionarSucoNoBaldcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		
		Almoxarife almoxarife = new Almoxarife();
		// ACOES QUE NAO PRECISA ESTAR DISPONIVEL PARA TODA APLICAÇÃO
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		
		// ACAO QUE SOMENTE O SEU PACKAGE PRECISA CONHECER
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servirMesa();
	
		// ACAO QUE SOMENTE O SEU PACKAGE PRECISA CONHECER
		atendente.trocarGas();
		
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		// ACOES QUE NAO PRECISA ESTAR DISPONIVEL PARA TODA APLICAÇÃO
		cliente.consultarSaldoAplicativo();
		
	
		
	 }

}
