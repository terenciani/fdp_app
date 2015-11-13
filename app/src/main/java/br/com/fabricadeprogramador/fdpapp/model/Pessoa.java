package br.com.fabricadeprogramador.fdpapp.model;

import android.graphics.Bitmap;

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
    private Boolean ativa;


    public Pessoa (String nome, String email, String telefone, int imagem){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.imagem = imagem;
        this.ativa  = true;
    }

    public Long getId() {
        return id;
    }



    public String getNome() {
        return nome;
    }





  public int getImagem() {
        return imagem;
    }      public Boolean getAtiva() {
        return ativa;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return nome + " - " + email;
    }
}
