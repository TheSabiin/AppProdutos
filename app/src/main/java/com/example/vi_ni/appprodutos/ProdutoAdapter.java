package com.example.vi_ni.appprodutos;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ProdutoAdapter extends ArrayAdapter<Produto>{
    private int rId;

    public ProdutoAdapter(Context context, int resource, List<Produto> objects) {
        super(context, resource, objects);

        rId = resource;
    }

    @Override
    public View getView(int position, View mView, ViewGroup parent){
        View view = mView;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(rId,null);
        }

        TextView txtNome = view.findViewById(R.id.txtNome);
        TextView txtValor = view.findViewById(R.id.txtValor);
        TextView txtQtde = view.findViewById(R.id.txtQtde);
        TextView txtCategoria = view.findViewById(R.id.txtCategoria);

        Produto prod = getItem(position);

        txtNome.setText(prod.getNome());

        txtValor.setText(String.valueOf(prod.getValor()));

        if (prod.getEstoque() < 5)
            txtQtde.setTextColor(Color.RED);
        else
            txtQtde.setTextColor(Color.BLUE);

        txtQtde.setText(String.valueOf(prod.getEstoque()));
        txtCategoria.setText(prod.getCategoria());

        return view;
    }
}
