public class Metodo {

    public static void main(String[] args) {

        String primeiroNome = "João";
        String segundoNome = "Oliveira";

        // Metodo possui um parametro apos o nome ();
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
