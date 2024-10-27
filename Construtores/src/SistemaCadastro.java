public class SistemaCadastro {
	public static void main(String[] args) {
		
		// CRIOU A PESSOA NO SISTEMA
		Pessoa joao = new Pessoa("365.345.481-88", "Shawty");
		
		// DEFININDO O ENDEREÇO
		joao.setEndereco("Rua do Graal");
		
		System.out.println(joao.getCpf() + joao.getEndereco());
		
	}
}
