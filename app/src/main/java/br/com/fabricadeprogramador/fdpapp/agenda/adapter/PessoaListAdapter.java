package br.com.fabricadeprogramador.fdpapp.agenda.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.fabricadeprogramador.fdpapp.R;
import br.com.fabricadeprogramador.fdpapp.model.Pessoa;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by terenciani on 10/11/15.
 */
public class PessoaListAdapter extends ArrayAdapter <Pessoa> {

    public PessoaListAdapter(Context context, List<Pessoa> pessoaList) {
        super(context, R.layout.item_pessoa_lista, pessoaList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*Holder é um objeto que possui ponteiros que apontam para os componentes da view
          O Holder permite que os dados do objeto pessoa sejam visualizados na view
         */
        final ViewHolder holder;

        if (convertView == null) {
            convertView = View.inflate(getContext(), R.layout.item_pessoa_lista, null);
            holder = new ViewHolder();
            //Apontando o holder para view
            ButterKnife.bind(holder, convertView);

            convertView.setTag(holder);


        } else{
            holder = (ViewHolder) convertView.getTag();
        }

        //Get item busca um dado em uma determinada lista
        Pessoa pessoa = getItem(position);
        if (pessoa != null) {
            holder.nome.setText(pessoa.getNome());
            holder.imagem.setImageResource(pessoa.getImagem());
        }
        return convertView;
    }

    class ViewHolder{
        @Bind(R.id.pessoa_imagem)
        ImageView imagem;

        @Bind(R.id.pessoa_nome)
        TextView nome;

    }
}
