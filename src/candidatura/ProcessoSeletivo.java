package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidato(1500.0);
        analisarCandidato(2000.0);
        analisarCandidato(3000.0);
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
