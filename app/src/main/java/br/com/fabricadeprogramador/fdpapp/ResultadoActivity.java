package br.com.fabricadeprogramador.fdpapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by terenciani on 22/10/15.
 */
public class ResultadoActivity extends Activity{

    private final String TAG = "ResultadoActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Double calculo = bundle.getDouble("calculo");


        Log.i(TAG, "Chamou o On Create " + TAG);
        Toast.makeText(this, calculo.toString(), Toast.LENGTH_SHORT).show();
    }
}
