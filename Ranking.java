
package br.com.fatecpg.projeto05.quiz;

import java.util.ArrayList;


public class Ranking {
     private double dadosRanking;
     private Jogador jogador;

     
     
     
    public double getdadosRanking() {
        return dadosRanking;
    }

    public void setdadosRanking(Double dadosRanking) {
        this.dadosRanking = dadosRanking;
    }
    
      public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    

 public static ArrayList<Ranking> ranking = new ArrayList<>();
    
 
  
    public static ArrayList<Ranking> getRanking(){
        return ranking;
        
        
    }

     public static void setRanking(Ranking dadosRanking) {
        ranking.add(dadosRanking);
    }
    
  
}

