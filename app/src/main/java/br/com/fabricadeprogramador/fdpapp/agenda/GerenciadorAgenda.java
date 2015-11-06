package br.com.fabricadeprogramador.fdpapp.agenda;

import java.util.ArrayList;
import java.util.List;

import br.com.fabricadeprogramador.fdpapp.model.Pessoa;

/**
 * Created by terenciani on 05/11/15.
 */
public class GerenciadorAgenda {

    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void adicionar (Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public static List<Pessoa> getPessoas() {
        return pessoas;
    }
}
