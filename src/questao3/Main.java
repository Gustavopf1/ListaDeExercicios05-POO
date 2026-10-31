package questao3;

public class Main {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.ligar("83 99999-0000");
        s.atender();
        s.exibirPagina("https://www.ifpb.edu.br");
        s.adicionarNovaAba();
        s.tocar();
        s.pausar();
    }
}
