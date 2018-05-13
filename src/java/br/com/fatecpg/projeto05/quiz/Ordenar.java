
package br.com.fatecpg.projeto05.quiz;
import java.util.Comparator;




public class Ordenar implements Comparator<Ranking>{ 
    @Override
    public int compare(Ranking result1, Ranking result2) {
        return result2.getdadosRanking().compareTo(result1.getdadosRanking());
    }
    
}
