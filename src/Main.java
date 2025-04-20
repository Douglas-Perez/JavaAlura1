import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme levaJato = new Filme();
        levaJato.setNome("Operação Leva Jato");
        levaJato.setTotalDeAvaliacoes(7);
        levaJato.setSomaDasAvaliacoes(70);
        levaJato.getRecomendacao();

        Episodio fireInYourFingertips = new Episodio();
        fireInYourFingertips.setTotalVisualizacoes(350);
        FiltroRecomendacao reco = new FiltroRecomendacao();
        System.out.println(reco.filtra(fireInYourFingertips));
    }
}
