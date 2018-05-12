/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.projeto05.quiz;

import java.util.ArrayList;

/**
 *
 * @author JOSEANTONIODECAMARGO
 */
public class Quiz {
    private static ArrayList<Pergunta> desafio;

    public static ArrayList<Pergunta> getDesafio() {
        if(desafio == null){
            desafio = new ArrayList<>();
            desafio.add(new Pergunta("Pergunta1", "resposta1", new String[]{"resposta1", "alt2", "alt3"}));
            desafio.add(new Pergunta("Pergunta2", "resposta2", new String[]{"alt1", "resposta2", "alt3"}));
            desafio.add(new Pergunta("Pergunta3", "resposta3", new String[]{"alt1", "alt2", "resposta3"}));
            desafio.add(new Pergunta("Pergunta4", "resposta4", new String[]{"alt1", "resposta4", "alt3"}));
            desafio.add(new Pergunta("Pergunta5", "resposta5", new String[]{"resposta5", "alt2", "alt3"}));
            desafio.add(new Pergunta("Pergunta6", "resposta6", new String[]{"alt1", "resposta6", "alt3"}));
            desafio.add(new Pergunta("Pergunta7", "resposta7", new String[]{"alt1", "alt2", "resposta7"}));
            desafio.add(new Pergunta("Pergunta8", "resposta8", new String[]{"alt1", "resposta8", "alt3"}));
            desafio.add(new Pergunta("Pergunta9", "resposta9", new String[]{"resposta9", "alt2", "alt3"}));
            desafio.add(new Pergunta("Pergunta10", "resposta10", new String[]{"alt1", "resposta10", "alt3"}));
        }
        return desafio;
    }

}
