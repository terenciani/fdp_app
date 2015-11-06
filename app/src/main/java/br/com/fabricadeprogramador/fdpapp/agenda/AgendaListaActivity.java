package br.com.fabricadeprogramador.fdpapp.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fabricadeprogramador.fdpapp.R;
import br.com.fabricadeprogramador.fdpapp.model.Pessoa;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by terenciani on 05/11/15.
 */
public class AgendaListaActivity extends AppCompatActivity {

    @Bind(R.id.lv_agenda)
    ListView lista;


    @OnClick (R.id.btn_fechar)
    public void fechar(){
        finish();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.agenda_lista);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Pessoa pessoa = (Pessoa) bundle.getSerializable("pessoa");




        /*
        Bundle bundle = intent.getExtras();

        String nome = bundle.getString("nome");*/

        GerenciadorAgenda.adicionar(pessoa);


        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GerenciadorAgenda.getPessoas());

        lista.setAdapter(adapter);
    }
}
