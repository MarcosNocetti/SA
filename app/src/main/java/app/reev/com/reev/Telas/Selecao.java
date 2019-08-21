package app.reev.com.reev.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.reev.com.reev.R;
import app.reev.com.reev.Telas.Localizacao;

public class Selecao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao);
        getSupportActionBar().hide(); //hide the title bar
    }

    public void local(View view) {
        Intent intent = new Intent(this, Localizacao.class);
        startActivity(intent);
    }
}
