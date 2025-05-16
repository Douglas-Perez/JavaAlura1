package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    public void getRecomendacao() {
        FiltroRecomendacao reco = new FiltroRecomendacao();
        System.out.println(this.getNome() + ": " + reco.filtra(this));
    }

    @Override
    public String toString() {
        return String.format("Filme: %s (%d)",getNome(),getAnoDeLancamento());
    }
}
