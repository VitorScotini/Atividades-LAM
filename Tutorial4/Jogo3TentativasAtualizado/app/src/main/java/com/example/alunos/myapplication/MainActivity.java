package com.example.alunos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import java.util.*;

import com.example.alunos.myapplication.Ver_placar;

public class MainActivity extends AppCompatActivity {
    Random numero = new Random();
    int x = (numero.nextInt(1000))+1;
    int i,tent = 0;
    int nmr;
    TextView tentativas,resultado;
    int vetor[] = new int[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Jogar(View view) {
        Scanner input = new Scanner(System.in);
        tentativas = findViewById(R.id.tentativas);
        resultado = findViewById(R.id.resultado);

        EditText userInput = findViewById(R.id.editText);
        String teste = userInput.getText().toString();
        nmr = Integer.parseInt(teste);

        if (nmr > 1000 ) {
            resultado.setText("O número é menor que 1000");
        }else if (nmr < x) {
            resultado.setText("O número é maior!");
        }else if(nmr > x){
            resultado.setText("O número é menor");
        }else{
            resultado.setText("Gaanhouuuuuuuuuuuuuuuuuuuuuu !!!!!!!!! ");
            for(i=0;i < 4;i++){
                vetor[i] = vetor[i+1];
            }
            vetor[4] = tent + 1;
        }
        tent = tent + 1;
        tentativas.setText(Integer.toString(tent));

    }

    public void Ver(View v){
        Intent intent = new Intent(this,Ver_placar.class);
        Bundle b = new Bundle();
        b.putInt("vet",vetor[4]);
        b.putInt("vet2",vetor[3]);
        b.putInt("vet3",vetor[2]);
        b.putInt("vet4",vetor[1]);
        b.putInt("vet5",vetor[0]);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void Ganhou(View v){
        if(resultado.getText() == "Gaanhouuuuuuuuuuuuuuuuuuuuuu !!!!!!!!! ") {
            EditText userInput2 = findViewById(R.id.editText);
            x = (numero.nextInt(1000)) + 1;
            tent = 0;
            tentativas.setText(Integer.toString(tent));
            resultado.setText("");
            userInput2.setText("");
        }else{
            resultado.setText("Você não ganhou para pode jogar de novo");
        }

    }
}
