package br.com.fabricadeprogramador.fdpapp.model;

import java.io.Serializable;

/**
 * Created by Marcelo Terenciani on 05/11/15.
 */
public class Pessoa implements Serializable {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private int imagem;


    public Pessoa (String nome, String email, String telefone, int imagem){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.imagem = imagem;
    }

    public Long getId() {
        return id;
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

    public int getImagem() {
        return imagem;
    }


    public void setId(Long id) {
        this.id = id;
    }    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return nome + " - " + email;
    }
}
