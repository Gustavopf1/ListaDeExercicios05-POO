# ListaDeExercicios05-POO

## Questão 01

Desde o **Java 8**. (O Java 9 ainda adicionou métodos `private` em interfaces.)

- **`default`**: permite adicionar um método novo a uma interface sem quebrar as classes que já a implementam. Elas herdam o corpo e podem sobrescrevê-lo se quiserem.
- **`static`**: permite colocar métodos utilitários dentro da própria interface, chamados direto por `Interface.metodo()`, sem precisar de instância.

## Questão 02

A interface define **o que** deve ser feito, não **como**. O código cliente depende só do contrato, então dá para trocar, testar ou adicionar implementações sem alterar quem as usa.

**Exemplo prático:** um sistema de pagamentos. Em vez de o checkout usar `Pix` diretamente, ele usa a interface `Pagamento`. Se amanhã entrar cartão ou boleto, basta criar uma nova classe que implemente `Pagamento`, e o checkout não muda. Nos testes, dá para injetar um `PagamentoFake`.

```java
interface Pagamento { void pagar(double valor); }

class Pix implements Pagamento {
    public void pagar(double valor) { System.out.println("Pix: " + valor); }
}

class Cartao implements Pagamento {
    public void pagar(double valor) { System.out.println("Cartão: " + valor); }
}

class Checkout {
    private final Pagamento pagamento;

    Checkout(Pagamento pagamento) { this.pagamento = pagamento; }

    void finalizar(double total) { pagamento.pagar(total); }
}
```
