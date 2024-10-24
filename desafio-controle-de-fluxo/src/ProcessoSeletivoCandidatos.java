import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivoCandidatos {
    public static void main(String[] args) {

        String[] candidatos = { "Roberta", "Maria", "Josefa", "Gabriela", "José" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado");

        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        System.out.println("Conseguimos contato com o " + candidato + " Na " + "tentativa n° " + tentativasRealizadas);
        else 
        System.out.println("Não conseguimos contato com o " + candidato + " Numero maximo de tentativas " + tentativasRealizadas);
    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Roberta", "Maria", "Josefa", "Gabriela", "José" };
        System.out.println("Imprimindo a lista de candidatos informando o indice");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + "é" + candidatos[indice]);
        }

        // forma abreviada
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi : " + candidatos);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Mário", "Roberta", "Maria", "Josefa", "Gabriela", "José", "João", "Daniel", "Pedro",
                "Roger" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar e fazer uma contra proposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
