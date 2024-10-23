public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23565235");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep está incorreto");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8 )
        throw new CepInvalidoException();


        return "32.352-555";
    } 
}
