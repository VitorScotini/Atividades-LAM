package com.example.alunos.jogo3tentativas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void confirma() {
        Scanner input = new Scanner(System.in);
        Random numero = new Random();
        int x = numero.nextInt(10) + 1;

        int tent;
        tent = 0;
        while (t < 3) {
            EditText userInput = findViewById(R.id.editText);
            String teste = userInput.getText().toString();
            int nmr;
            nmr = Integer.parseInt(teste);

            if (nmr == x) {
                TextView etiqueta = (TextView) findViewById(R.id.Resultado);
                etiqueta.setText(getResources().getString(R.string.lblResultado2));
                break;
            } else {
                TextView etiqueta = (TextView) findViewById(R.id.Resultado);
                etiqueta.setText(getResources().getString(R.string.lblResultado3));
            }
            tent++;

        }
        TextView etiqueta = (TextView) findViewById(R.id.Resultado);
        etiqueta.setText(getResources().getString(R.string.lblResultado4));
    }
}
