package questao5;

public class RelatorioFinanceiro implements Imprimivel, EnviavelPorEmail {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo relatório financeiro...");
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando relatório financeiro para " + email);
    }
}
