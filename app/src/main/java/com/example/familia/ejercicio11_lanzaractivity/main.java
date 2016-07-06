package com.example.familia.ejercicio11_lanzaractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void acercade(View v) {
        Intent nuev = new Intent(this, acerca_de.class);
        startActivity(nuev);
    }
}
