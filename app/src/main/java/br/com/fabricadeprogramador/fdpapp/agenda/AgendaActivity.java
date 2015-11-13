package br.com.fabricadeprogramador.fdpapp.agenda;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import com.android.camera.CropImageIntentBuilder;

import java.io.File;
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

    private static final int CAMERA_REQUEST = 123;
    private static final int CROP_REQUEST = 456;

    @Bind(R.id.edt_nome)
    EditText edtNome;

    @Bind(R.id.edt_email)
    EditText edtEmail;

    @Bind(R.id.edt_telefone)
    EditText edtTelefone;

    @Bind(R.id.pessoa_imagem_cad)
    ImageView imagemPessoa;

    Uri imagemUri;

    @OnClick (R.id.btn_salvar)
    public  void salvar(){
        Intent irParaAgendaLista = new Intent(AgendaActivity.this, AgendaListaActivity.class);
        Bundle bundle = new Bundle();

        Pessoa pessoa = new Pessoa(edtNome.getText().toString(), edtEmail.getText().toString(), edtTelefone.getText().toString(), R.drawable.logo_facom);

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


    File imagemOriginal;
    @OnClick(R.id.pessoa_imagem_cad)
    public void mudarImagem(){

        imagemOriginal = new File(getExternalCacheDir(),"img");
        imagemUri = Uri.fromFile(imagemOriginal);



        Intent cameraIntent = new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, imagemUri);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        File imagemCortada = new File(getFilesDir(), "img.jpg");



        if(requestCode == CAMERA_REQUEST && resultCode == RESULT_OK){

            Uri imagemCortadaUri = Uri.fromFile(imagemCortada);
            CropImageIntentBuilder crop = new CropImageIntentBuilder(200, 200, imagemCortadaUri);
            crop.setOutlineCircleColor(0xFF03A9F4);
            crop.setSourceImage(imagemUri);
            startActivityForResult(crop.getIntent(AgendaActivity.this), CROP_REQUEST);

        }else if (requestCode == CROP_REQUEST && resultCode == RESULT_OK){
            imagemPessoa.setImageBitmap(BitmapFactory.decodeFile(imagemCortada.getAbsolutePath()));
        }
    }
}
