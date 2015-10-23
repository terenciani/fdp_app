package br.com.fabricadeprogramador.fdpapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.BufferUnderflowException;

public class MainActivity extends Activity{

    private static  String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i(TAG, "Chamou o OnCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ed1 = (EditText) findViewById(R.id.ed1);
        final EditText ed2 = (EditText) findViewById(R.id.ed2);


        Button soma =  (Button) findViewById(R.id.btSoma);
        soma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Double numero1 = Double.parseDouble(ed1.getText().toString());
                Double numero2 = Double.parseDouble(ed2.getText().toString());

                Double soma = numero1 + numero2;

                Bundle bundle = new Bundle();
                bundle.putDouble("calculo", soma);

                Intent irParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);

                irParaResultado.putExtras(bundle);

                startActivity(irParaResultado, bundle);
            }
        });

        Button sub =  (Button) findViewById(R.id.btSub);
        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Double numero1 = Double.parseDouble(ed1.getText().toString());
                Double numero2 = Double.parseDouble(ed2.getText().toString());

                Double sub = numero1 - numero2;

            }
        });

        Button div =  (Button) findViewById(R.id.btDiv);
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Double numero1 = Double.parseDouble(ed1.getText().toString());
                Double numero2 = Double.parseDouble(ed2.getText().toString());

                Double div = numero1 / numero2;

            }
        });

        Button mult =  (Button) findViewById(R.id.btMult);
        mult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Double numero1 = Double.parseDouble(ed1.getText().toString());
                Double numero2 = Double.parseDouble(ed2.getText().toString());

                Double mult = numero1 * numero2;


            }
        });
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
