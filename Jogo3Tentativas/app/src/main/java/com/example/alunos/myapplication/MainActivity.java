package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    Random numero = new Random();
    int x = (numero.nextInt()%10)+1;
    int tent = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Jogar(View view) {
        Scanner input = new Scanner(System.in);
        TextView resultado;
        resultado = findViewById(R.id.resultado);

        if (tent > 3) {
            resultado.setText(getResources().getString(R.string.lblTent));
        } else {
            EditText userInput = findViewById(R.id.editText);
            String teste = userInput.getText().toString();
            int nmr;
            nmr = Integer.parseInt(teste);

            if (nmr == x) {
                resultado.setText(getResources().getString(R.string.lblVenceu));
            } else {
                resultado.setText(getResources().getString(R.string.lblErrou));
            }
            tent = tent + 1 ;
        }

    }
}
