import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCandidatos {
    public static void main(String[] args) {
        selecaoCandidatos();

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Mário", "Roberta", "Maria", "Josefa", "Gabriela","José", "João", "Daniel", "Pedro", "Roger"};
       
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        } 
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar e fazer uma contra proposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
