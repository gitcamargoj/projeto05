/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.projeto05.quiz;

import java.util.ArrayList;

/**
 *
 * @author Fabricinho
 */
public class Ranking {
     private double dadosRanking;

     
     
     
    public double getdadosRanking() {
        return dadosRanking;
    }

    public void setdadosRanking(Double dadosRanking) {
        this.dadosRanking = dadosRanking;
    }

 public static ArrayList<Ranking> ranking = new ArrayList<>();
    
 
  
    public static ArrayList<Ranking> getRanking(){
        return ranking;
        
        
    }

     public static void setRanking(Ranking dadosRanking) {
        ranking.add(dadosRanking);
    }
    
  
}

