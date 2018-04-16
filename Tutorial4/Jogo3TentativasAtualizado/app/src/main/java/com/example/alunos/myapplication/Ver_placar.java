package com.example.alunos.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import java.util.*;


public class Ver_placar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_placar);
        TextView t1, t2, t3, t4, t5, tchefe;

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        tchefe = findViewById(R.id.tchefe);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        Integer menor;

        Integer t = b.getInt("vet5");
        Integer te = b.getInt("vet4");
        Integer ten = b.getInt("vet3");
        Integer tent = b.getInt("vet2");
        Integer tentat = b.getInt("vet");

        t1.setText(t.toString());
        t2.setText(te.toString());
        t3.setText(ten.toString());
        t4.setText(tent.toString());
        t5.setText(tentat.toString());

        int[] a = new int[5];
        a[0] = t;
        a[1] = te;
        a[2] = ten;
        a[3] = tent;
        a[4] = tentat;
        menor = t;
        for (int i = 0; i < 5; i++) {
            if (a[i] < menor) {
                menor = a[i];
            }
        }
        tchefe.setText(menor.toString()); ;

    }

    public void Voltar(View view) {
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }

}
