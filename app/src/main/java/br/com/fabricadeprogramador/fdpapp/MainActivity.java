package br.com.fabricadeprogramador.fdpapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button bt =  (Button) findViewById(R.id.btOk);
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText ed1 = (EditText) findViewById(R.id.ed1);
                Toast.makeText(MainActivity.this ,"Oi " + ed1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
