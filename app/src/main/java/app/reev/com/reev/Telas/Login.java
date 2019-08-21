package app.reev.com.reev.Telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import app.reev.com.reev.R;

public class Login extends AppCompatActivity {

    private EditText email;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        getSupportActionBar().hide(); //hide the title bar

    }

    public void selecao(View view) {
        EditText ema = findViewById(R.id.txtEmail);
        EditText sen = findViewById(R.id.txtPass);

        if(ema.getText().toString().equals("admin") && sen.getText().toString().equals("admin")) {
            boolean acesso = true;


            if (acesso) {
                Intent intent = new Intent(this, Selecao.class);
                startActivity(intent);
            }
        }
        else if (sen.getText().toString().equals("") ){
            Toast.makeText(Login.this, "Insira a e-mail e/ou senha", Toast.LENGTH_SHORT).show();
        }


    }
}
