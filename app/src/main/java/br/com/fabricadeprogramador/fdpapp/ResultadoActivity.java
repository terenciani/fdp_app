package br.com.fabricadeprogramador.fdpapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by terenciani on 22/10/15.
 */
public class ResultadoActivity extends Activity{

    private final String TAG = "ResultadoActivity";

    @Bind(R.id.tv_resultado)
    TextView tvResultado;

    @OnClick(R.id.bt_fechar)
    public void fechar(){
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_activity);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double calculo = bundle.getDouble("calculo");

        tvResultado.setText(calculo.toString());


        Log.i(TAG, "Chamou o On Create " + TAG);
        //Toast.makeText(this, calculo.toString(), Toast.LENGTH_SHORT).show();
    }

}
