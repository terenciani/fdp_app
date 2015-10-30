package br.com.fabricadeprogramador.fdpapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    private static String TAG = "MainActivity";

    @Bind(R.id.ed1)
    EditText ed1;

    @Bind(R.id.ed2)
    EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i(TAG, "Chamou o OnCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btSoma)
    public void somar() {
        Double numero1 = Double.parseDouble(ed1.getText().toString());
        Double numero2 = Double.parseDouble(ed2.getText().toString());

        Double soma = numero1 + numero2;

        mostrarResultado(soma);
    }

    @OnClick(R.id.btSub)
    public void subtrair() {
        Double numero1 = Double.parseDouble(ed1.getText().toString());
        Double numero2 = Double.parseDouble(ed2.getText().toString());

        Double sub = numero1 - numero2;

        mostrarResultado(sub);

    }

    @OnClick(R.id.btDiv)
    public void dividir() {
        Double numero1 = Double.parseDouble(ed1.getText().toString());
        Double numero2 = Double.parseDouble(ed2.getText().toString());

        Double div = numero1 / numero2;

        mostrarResultado(div);
    }


    @OnClick(R.id.btMult)
    public void multiplicar() {
        Double numero1 = Double.parseDouble(ed1.getText().toString());
        Double numero2 = Double.parseDouble(ed2.getText().toString());

        Double mult = numero1 * numero2;

        mostrarResultado(mult);
    }

    public void mostrarResultado(Double resultado) {
        Bundle bundle = new Bundle();
        bundle.putDouble("calculo", resultado);
        Intent irParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);
        irParaResultado.putExtras(bundle);
        startActivity(irParaResultado, bundle);

    }


    @Override
    protected void onStart() {
        Log.i(TAG, "Chamou o OnStart");

        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Chamou o OnResume");

        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Chamou o OnPause");

        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "Chamou o OnStop");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "Chamou o OnDestroy");

        super.onDestroy();
    }
}
