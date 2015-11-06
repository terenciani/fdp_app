package br.com.fabricadeprogramador.fdpapp.model;

import java.io.Serializable;

/**
 * Created by terenciani on 05/11/15.
 */
public class Pessoa implements Serializable {

    private String nome;
    private String email;
    private String telefone;


    public  Pessoa (){

    }

    public Pessoa (String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + " - " + email;
    }
}
