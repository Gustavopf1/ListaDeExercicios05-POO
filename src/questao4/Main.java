package questao4;

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisão por zero");
            return a / b;
        };

        double x = 10, y = 4;
        System.out.println("Soma: " + soma.executar(x, y));
        System.out.println("Subtração: " + subtracao.executar(x, y));
        System.out.println("Multiplicação: " + multiplicacao.executar(x, y));
        System.out.println("Divisão: " + divisao.executar(x, y));
    }
}
