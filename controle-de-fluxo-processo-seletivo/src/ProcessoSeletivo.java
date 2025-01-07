import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "João", "Pedro", "Augusto", "Dener", "Juninho" };
        System.out.println("Imprimindo a lista de candidatos");

        for (int indice = 0; indice < candidatos.length; indice++)
            ;
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "João", "Pedro", "Augusto", "Dener", "Juninho", "Rodrigo", "Vinicius" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 30000.0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double pretencaoSalarial = pretencaoSalarial();

            System.out.println("O candidato " + candidato + "solicitou este valor de salario" + pretencaoSalarial);
            if (salarioBase >= pretencaoSalarial) {
                System.out.println("o candidato " + candidato + "foi selecionado");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double pretencaoSalarial() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double pretencaoSalarial) {
        double salarioBase = 3000.0;

        if (salarioBase > pretencaoSalarial) {
            System.out.println("LIGUE PARA O CANDIDATO");
        } else if (salarioBase == pretencaoSalarial) {
            System.out.println("LIGUE PARA O CANDIDATO E APRESENTE UMA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO OUTROS CANDIDATOS");
        }

    }
}
