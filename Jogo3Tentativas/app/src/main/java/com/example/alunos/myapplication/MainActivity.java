package com.example.alunos.myapplication;

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
    public void Jogar(View view) {
        Scanner input = new Scanner(System.in);
        Random numero = new Random();
        TextView resultado;

        int x = (numero.nextInt()%10)+1;

        int tent;
        tent = 0;
        while (tent < 3) {
            EditText userInput = findViewById(R.id.editText);
            resultado = findViewById(R.id.resultado);
            String teste = userInput.getText().toString();
            int nmr;
            nmr = Integer.parseInt(teste);

            if (nmr == x) {
                resultado.setText(getResources().getString(R.string.lblVenceu));
                break;
            } else {
                resultado.setText(getResources().getString(R.string.lblErrou));
            }
            tent++;
        }

    }
}
