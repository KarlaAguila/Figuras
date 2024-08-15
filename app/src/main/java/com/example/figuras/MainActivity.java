package com.example.figuras;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCirculo = findViewById(R.id.circulo);
        buttonCirculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad Circulo.java
                Intent intent = new Intent(MainActivity.this, Circulo.class);
                startActivity(intent);
            }
        });

        Button buttonCuadrado = findViewById(R.id.cuadrado);
        buttonCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad Cuadrado.java
                Intent intent = new Intent(MainActivity.this, Cuadrado.class);
                startActivity(intent);
            }
        });

        Button buttonRectangulo = findViewById(R.id.rectangulo);
        buttonRectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad Circulo.java
                Intent intent = new Intent(MainActivity.this, Rectangulo.class);
                startActivity(intent);
            }
        });

        Button buttonRombo = findViewById(R.id.rombo);
        buttonRombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad Circulo.java
                Intent intent = new Intent(MainActivity.this, Rombo.class);
                startActivity(intent);
            }
        });

        Button buttonTrapecio = findViewById(R.id.trapecio);
        buttonTrapecio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad Circulo.java
                Intent intent = new Intent(MainActivity.this, Trapecio.class);
                startActivity(intent);
            }
        });

        Button buttonTriangulo = findViewById(R.id.triangulo);
        buttonTriangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abrir la actividad Circulo.java
                Intent intent = new Intent(MainActivity.this, Triangulo.class);
                startActivity(intent);
            }
        });
    }



}