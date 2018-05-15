/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.projeto05.quiz;

import java.util.ArrayList;


public class Jogador {
    private String name;
    public static ArrayList<Jogador> jogadores;

    public Jogador(String nome){
        this.setName(nome);
    }

    public static ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public static void setJogadores(Jogador p) {
        jogadores.add(p);
    }

    //métodos getters e setters
    public String getNome() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }    
}