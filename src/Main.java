import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("10 coisas que eu odeio em você", 1999);
        filme1.setTotalDeAvaliacoes(7);
        filme1.setSomaDasAvaliacoes(70);

        Filme filme2 = new Filme("Questão de tempo", 2013);
        filme2.setTotalDeAvaliacoes(100);
        filme2.setSomaDasAvaliacoes(1000);

        Serie serie1 = new Serie("Supernatural", 2005, 15);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(serie1);
        for (Titulo titulo : lista) {
            System.out.println(titulo);
            if (titulo instanceof Filme filme) {
                System.out.println("Classificação: "+filme.getClassificacao()+"\n");
            }
        }


        Episodio casamento = new Episodio();
        casamento.setTotalVisualizacoes(350);
        FiltroRecomendacao reco = new FiltroRecomendacao();
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Wagner Moura");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Fernada Monte Negro");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

    }
}
