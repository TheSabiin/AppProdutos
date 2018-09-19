package com.example.vi_ni.appprodutos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Produto> produtos;
    private EditText edtNome,edtValor,edtQtde;
    private Spinner spnCategoria;
    private ListView listProduto;
    private ArrayAdapter<Produto> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produtos = new ArrayList<>();
        edtNome = findViewById(R.id.edtNome);
        edtQtde = findViewById(R.id.edtQtde);
        edtValor = findViewById(R.id.edtValor);
        spnCategoria = findViewById(R.id.spnCategoria);
        listProduto = findViewById(R.id.listProduto);

        adapter = new ProdutoAdapter(getApplicationContext(),R.layout.produto_item, produtos);
        listProduto.setAdapter(adapter);
    }

    public void salvar(View view){
        String nome = edtNome.getText().toString();
        int qtde = Integer.parseInt(edtQtde.getText().toString());
        double valor = Double.parseDouble(edtValor.getText().toString());
        String categoria = spnCategoria.getSelectedItem().toString();

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setCategoria(categoria);
        produto.setEstoque(qtde);
        produto.setValor(valor);

        produtos.add(produto);
        adapter.notifyDataSetChanged();
    }
}
