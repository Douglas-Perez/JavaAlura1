public class Produto {
    private double preco;
    private String nome;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void aplicarDesconto(double desconto) {
        preco *= (1 - desconto / 100);
    }
}
