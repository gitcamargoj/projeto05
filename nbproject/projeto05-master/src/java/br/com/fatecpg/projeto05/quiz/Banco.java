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
public class Banco {
    private static ArrayList<Jogador> jogadores = new ArrayList<>();

    public static ArrayList<Jogador> getJogador() {
        return jogadores;
    }
}
