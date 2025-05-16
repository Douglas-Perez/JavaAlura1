import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("10 coisas que eu odeio em você", 1999);
        filme1.setTotalDeAvaliacoes(7);
        filme1.setSomaDasAvaliacoes(70);
        filme1.getRecomendacao();

        Episodio casamento = new Episodio();
        casamento.setTotalVisualizacoes(350);
        FiltroRecomendacao reco = new FiltroRecomendacao();
        System.out.println(reco.filtra(casamento));
        System.out.println(filme1);
    }
}
