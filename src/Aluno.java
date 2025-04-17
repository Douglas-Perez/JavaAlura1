import java.util.Arrays;

public class Aluno {
    private double[] notas;
    private String nome;

    public double[] getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return Arrays.stream(notas).average().orElseThrow();
    }
}
