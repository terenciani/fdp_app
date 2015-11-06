package br.com.fabricadeprogramador.fdpapp.calculo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import br.com.fabricadeprogramador.fdpapp.R;
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
        setContentView(R.layout.calc_resultado);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        //Double calculo = bundle.getDouble("calculo");

        Resultado resultado = (Resultado) bundle.getSerializable("calculo");

        tvResultado.setText(resultado.getR().toString());


        Log.i(TAG, "Chamou o On Create " + TAG);
        //Toast.makeText(this, calculo.toString(), Toast.LENGTH_SHORT).show();
    }

}
