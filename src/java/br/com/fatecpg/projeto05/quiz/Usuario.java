/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.projeto05.quiz;

/**
 *
 * @author JOSEANTONIODECAMARGO
 */
public class Usuario {
    private String nomeUsuario;
    private String resultadoDesafio;

    public Usuario(String nomeUsuario, String resultadoDesafio) {
        this.nomeUsuario = nomeUsuario;
        this.resultadoDesafio = resultadoDesafio;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getResultadoDesafio() {
        return resultadoDesafio;
    }

    public void setResultadoDesafio(String resultadoDesafio) {
        this.resultadoDesafio = resultadoDesafio;
    }
}
