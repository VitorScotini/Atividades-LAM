package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    Random numero = new Random();
    int x = (numero.nextInt(1000))+1;
    int tent = 0;
    int nmr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Jogar(View view) {
        Scanner input = new Scanner(System.in);
        TextView resultado;
        TextView tentativas;
        resultado = findViewById(R.id.resultado);
        tentativas = findViewById(R.id.tentativas);

        EditText userInput = findViewById(R.id.editText);
        String teste = userInput.getText().toString();
        nmr = Integer.parseInt(teste);

        if (nmr > x) {
            resultado.setText("O número é menor");
        }else if (nmr < x) {
            resultado.setText("O número é maior!");
        }else{
            resultado.setText("Ganhou!!!");
        }
        tent = tent + 1;
        tentativas.setText(Integer.toString(tent));
    }
}
