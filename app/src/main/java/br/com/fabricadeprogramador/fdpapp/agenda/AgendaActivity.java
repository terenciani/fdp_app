package br.com.fabricadeprogramador.fdpapp.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import java.nio.BufferUnderflowException;

import br.com.fabricadeprogramador.fdpapp.R;
import br.com.fabricadeprogramador.fdpapp.calculo.CalcActivity;
import br.com.fabricadeprogramador.fdpapp.model.Pessoa;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by terenciani on 05/11/15.
 */
public class AgendaActivity extends AppCompatActivity {


    @Bind(R.id.edt_nome)
    EditText edtNome;

    @Bind(R.id.edt_email)
    EditText edtEmail;

    @Bind(R.id.edt_telefone)
    EditText edtTelefone;


    @OnClick (R.id.btn_salvar)
    public  void salvar(){
        Intent irParaAgendaLista = new Intent(AgendaActivity.this, AgendaListaActivity.class);
        Bundle bundle = new Bundle();

        Pessoa pessoa = new Pessoa(edtNome.getText().toString(), edtEmail.getText().toString(), edtTelefone.getText().toString());

        bundle.putSerializable("pessoa", pessoa);

        irParaAgendaLista.putExtras(bundle);
        startActivity(irParaAgendaLista);
    }

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agenda);


        ButterKnife.bind(this);

    }

}
