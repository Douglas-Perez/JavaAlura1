public class IdadePessoa {
    private int idade;
    private String Nome;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean maiorDeIdade() {
        return idade >= 18;
    }
}