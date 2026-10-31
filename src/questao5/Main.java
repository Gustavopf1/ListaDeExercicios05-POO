package questao5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        Contrato contrato = new Contrato();

        List<Imprimivel> paraImprimir = List.of(relatorio, contrato);
        List<EnviavelPorEmail> paraEnviar = List.of(relatorio);

        paraImprimir.forEach(Imprimivel::imprimir);
        paraEnviar.forEach(d -> d.enviar("cliente@email.com"));
    }
}
