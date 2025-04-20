package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public String filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4)
            return "Está entre os preferidos do momento";

        if (classificavel.getClassificacao() >= 2)
            return "Muito bem avaliado no momento!";

        return "Coloque na sua lista para assistir depois";
    }
}
