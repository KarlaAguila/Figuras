package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        EditText editTextLado = findViewById(R.id.editTextNumber2);
        Button buttonCalcular = findViewById(R.id.calcularCuadrado);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener(){
              public void onClick(View v){
                  // Obtener el lado del EditText y convertirlo a double
                  String ladoStr = editTextLado.getText().toString();
                  if (!ladoStr.isEmpty()) {
                      double lado = Double.parseDouble(ladoStr);

                      // Calcular el área del cuadrado
                      double area = lado * lado;

                      // Mostrar el resultado en el TextView
                      textViewResultado.setText("Área del cuadrado: " + area);
                  } else {
                      // Manejar el caso de entrada vacía
                      textViewResultado.setText("Por favor ingresa el lado del cuadrado.");
                  }
              }
          }
        );

        Button buttonRegresar = findViewById(R.id.inicio);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para regresar a la actividad principal (MainActivity)
                Intent intent = new Intent(Cuadrado.this, MainActivity.class);
                // Iniciar la actividad MainActivity
                startActivity(intent);
                // Finalizar la actividad actual (Circulo)
                finish();
            }
        });
    }
}