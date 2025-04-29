package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"João", "Maria", "José", "Ana", "Pedro", "Lucas", "Fernanda", "Carla", "Roberto", "Patrícia"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("Candidato: " + candidato + ", Solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("Candidato " + candidato + " selecionado!");
                candidatosSelecionados++;
            } else {
                System.out.println("Candidato " + candidato + " não selecionado!");
            }
            candidatoAtual++;
            if (candidatoAtual >= candidatos.length) {
                System.out.println("Todos os candidatos foram avaliados!");
                break;
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salariobase = 2000.0;

        if (salarioPretendido < salariobase) {
            System.out.println("Ligar para candidato!");
        } else if (salarioPretendido == salariobase) {
            System.out.println("Ligar para candidato com contra proposta!");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos!");
        }
    }
}
